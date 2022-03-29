package learn.JPA.Basic_JPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import learn.JPA.Basic_JPA.dao.UserRepository;
import learn.JPA.Basic_JPA.model.User;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("api/")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("users")
	public List<User> getUsers(){
		log.info("Get Users Called");
		return this.userRepo.findAll();
	}

	@GetMapping("user")
	public Optional<User> getUser(@RequestParam long id){
		log.info("Get User Called");
		return this.userRepo.findById(id);
	}

	@PostMapping("addUser")
	public User setUser(@RequestParam String name, @RequestParam String email){
		log.info("Post User Called");
		User user =new User(name,email);
		User inS = userRepo.save(user);
		log.info("Logging user   :"+user+inS );
		return user;
	}
	
	@PostMapping("addUserBody")
	public User setUserBody(@RequestBody User user ){
		log.info("Post User Called");
//		User tempUser=new User();
//		BeanUtils.copyProperties(user,tempUser);
		User inS =  userRepo.save(user);
		log.info("Logging user   :"+inS );
		return inS;
	}
}
