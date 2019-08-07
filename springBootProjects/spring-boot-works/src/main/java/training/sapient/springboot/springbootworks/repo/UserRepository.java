package training.sapient.springboot.springbootworks.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import training.sapient.springboot.springbootworks.beans.User;

/*userId -> findByUserId
 * 
 * 
 */

public interface UserRepository extends MongoRepository<User,Integer>{
	public User findByUserName(String userName);
	
	@Query(value="{'userAge':{$gt:?0}}", fields = "{'userName':1,'address.country':1}")
	List<User> findByUserAge(int age);
}
