package UserProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long UserId;
	
	private String UserName;
	private long Mob;
	
public User() {
		
	}
public User(long userId, String userName, long mob) {
	UserId = userId;
	UserName = userName;
	Mob = mob;
}
public long getUserId() {
	return UserId;
}
public void setUserId(long userId) {
	UserId = userId;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public long getMob() {
	return Mob;
}
public void setMob(long mob) {
	Mob = mob;
}
@Override
public String toString() {
	return "User [UserId=" + UserId + ", UserName=" + UserName + ", Mob=" + Mob + "]";
}


}
