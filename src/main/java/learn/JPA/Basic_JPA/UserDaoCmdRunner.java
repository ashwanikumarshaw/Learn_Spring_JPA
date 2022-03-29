package learn.JPA.Basic_JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import learn.JPA.Basic_JPA.dao.UserDAO;
import learn.JPA.Basic_JPA.model.User;
import lombok.extern.slf4j.Slf4j;


@Slf4j @Component("Bean1")
public class UserDaoCmdRunner implements CommandLineRunner{

	
	@Autowired
	private UserDAO userDao;
	
	@Override
	public void run(String... args) throws Exception {

//		User user=new User("Ashu","ashu2@hehe.com");
//		long inS = userDao.insert(user);
//		log.info("Logging user   :"+user+inS );
	}

}
