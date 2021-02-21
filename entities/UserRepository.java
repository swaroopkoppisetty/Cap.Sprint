package jpasprint;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class UserRepository {

	/* Create EntityManagerFactory */
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("capdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	
	//Add User
	public void addUser(User user) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(user);
		tx.commit();
	}
	
	// Update User
	public void updateUser(int i, String title) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		// mapping existing user to booking
		User u = em.find(User.class, i);
		u.setUser_name(title);
		tx.commit();
		
	}

	// Delete User
	public void deleteUser(int i) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		// mapping existing user to booking
		User u = em.find(User.class, i);
		em.remove(u);
		tx.commit();
		
	}
	
	// List of all Users
	public List<User> findAllUsers(){
		TypedQuery<User> query = em.createQuery("select u from User u where u.user_id > 0", User.class);
	//	query.setParameter("x", 40000.0);
		List<User> users = query.getResultList();
		return users;
	}
		


	// Find User using ID
	public User findUser(int id) {
		return em.find(User.class, id);
	}


	public static void main(String[] args) {
	
		UserRepository repo = new UserRepository();
		
		//Add User
//		User u = new User("Punjab","testr@tester.com","8675875","passing","Guest","User1");
//		repo.addUser(u);
		
		//Update User (User Name)
		repo.updateUser(3, "China");
		
		//Delete User
//		repo.deleteUser(3);
		
		//Display List of all Users
//		List<User> foundUsers = repo.findAllUsers();
//		System.out.println(foundUsers);
		
		//Display User by ID		
//		System.out.println(repo.findUser(2));
		
}
}
	
