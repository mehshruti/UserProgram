package UserProject.Interfaces;

import java.util.List;

import UserProject.Entity.User;

public interface SerViceImpl{
	public List<User> getUser();
	public User GetUserId(long UserId);
	public User addUser(User user);
	public User updateUser(User user);
	public void delUser(long UserId);

}
