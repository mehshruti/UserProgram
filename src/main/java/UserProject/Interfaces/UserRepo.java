package UserProject.Interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import UserProject.Entity.User;
@Service
public class UserRepo implements SerViceImpl{
	@Autowired
	UserService userService;
	public UserRepo() {
	}
	
	
	@Override
	public List<User> getUser()
	{
	return userService.findAll();
	}

	@Override
	public User GetUserId(long UserId) {
		return userService.getOne(UserId);
	}

	@Override
	public User addUser(User user) {
		
		return userService.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userService.save(user);
	}
	@Override
	public void delUser(long UserId) {
 		User entity = userService.getOne(UserId);
 		userService.delete(entity);
	}
	
	
}
