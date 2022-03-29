package learn.JPA.Basic_JPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import learn.JPA.Basic_JPA.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
