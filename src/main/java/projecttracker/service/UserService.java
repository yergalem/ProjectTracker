package projecttracker.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projecttracker.dao.UserRepositoryDAO;
import projecttracker.model.Role;
import projecttracker.model.User;

@Service
public class UserService  {
    @Autowired
    UserRepositoryDAO userDao;
    
    public void registerUser(User user ){}
    
    public List<User> listVolunteers( Role role ){
    	
    	return userDao.findByRole(role);
    }
    
	
	
	public User findByUserId(long userID) {
		
	      return userDao.findUserById(userID);
	}

	public List<User> findByLastName( String lastName ) {
		
		  return userDao.findByLastname(lastName);
	}
	
	
   
}
