package p5;

import java.io.Serializable;
import java.util.LinkedList;

public class User implements Serializable{
	private String username;
	private String password;
	private LinkedList<Post> userPosts;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
		userPosts = new LinkedList<Post>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LinkedList getUserPosts() {
		return userPosts;
	}

	public void setUserPosts(LinkedList userPosts) {
		this.userPosts = userPosts;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	

}
