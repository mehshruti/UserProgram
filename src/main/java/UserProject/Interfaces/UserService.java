package UserProject.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import UserProject.Entity.User;
@Repository
public interface UserService extends JpaRepository<User, Long> {

}
