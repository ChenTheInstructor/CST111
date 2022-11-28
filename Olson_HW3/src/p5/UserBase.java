package p5;

import java.io.Serializable;
import java.util.ArrayList;

public class UserBase implements Serializable{
	private ArrayList<User> userBase;
	
	public UserBase() {
		userBase = new ArrayList<User>();
	}
	
	//get user by username
	
	public User getUserByCredentials(String username, String password) {
		for(int i = 0; i < userBase.size(); i++) {
			User user = userBase.get(i);
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		
		return null;
		
	}
	
	public User getUserByUsername(String username) {
		for(int i = 0; i < userBase.size(); i++) {
			User user = userBase.get(i);
			if(user.getUsername().equals(username)) {
				return user;
			}
		}
		
		return null;
		
	}

	public ArrayList<User> getUsers() {
		return userBase;
	}
	
	public void addUser (User user) {
			userBase.add(user);
	}

	@Override
	public String toString() {
		return "UserBase [userBase=" + userBase + "]";
	}
	
	

}
