package projecttracker.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projecttracker.core.CustomEntity;
import projecttracker.model.Role;
import projecttracker.model.User;

@Repository
public interface UserRepositoryDAO extends JpaRepository<User, Integer>{

	void registerUser(CustomEntity user);
	
	public User findUserById(long id);

	   
    public List<User> findByLastname(String lastname);

    
    public List<User> findByRole( Role role);
    

}
