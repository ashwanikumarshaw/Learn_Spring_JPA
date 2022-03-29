package learn.JPA.Basic_JPA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "USERS")
public class User {

	
	@Id
	@GeneratedValue
	private long id;
	@Column(name = "First_Name")
	private String name;
	private String email;
	
	public User() {}
	
	public User(String name, String email) {
		this.name=name;
		this.email=email;
	}
	
	@Override
	public String toString() {
		return "  [id=" + id + ", First_Name=" + name + ", Contact=" + email + "]";
	}
	
}
