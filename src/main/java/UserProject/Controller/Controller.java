package UserProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UserProject.Entity.User;
import UserProject.Interfaces.SerViceImpl;

@RestController
public class Controller {
	@Autowired
	SerViceImpl serviceImpl;
	
	@RequestMapping("/test")
	public String Show()
	{
		return "Hello World!";
	}
	@GetMapping("/User")
	public List<User> GetUserById()
	{
		return serviceImpl.getUser();
	}
	@GetMapping("/User/{UserId}")
	public User GetUser(@PathVariable long UserId)
	{
		return this.serviceImpl.GetUserId(UserId);
	}	
	@PostMapping("/User")
	public User addUser(@RequestBody User user)
	{
		return this.serviceImpl.addUser(user);
	}
	@PutMapping("/User/{UserId}")
	
		public User updUser(@RequestBody User user) {
		return this.serviceImpl.updateUser(user);
	}
	@DeleteMapping("/User/{UserId}")
	public ResponseEntity<HttpStatus> delUserId(@PathVariable long UserId)
	{
		try {
		this.serviceImpl.delUser(UserId);
		return new ResponseEntity<>(HttpStatus.OK);
	    }catch(Exception e)
		{
	    	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
