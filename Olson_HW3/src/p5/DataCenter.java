package p5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class DataCenter implements Serializable{
	private static DataCenter dc = null;
	private UserBase userBase;
	private User loggedInUser;
	private Post displayPost;
	private LinkedList<Post> newsfeed;

	
	public DataCenter () {
		userBase = new UserBase();
		loggedInUser = null;
		displayPost = null;
		newsfeed = new LinkedList<Post>();
	}
	public void save() {
        try (ObjectOutputStream oos = new ObjectOutputStream (
                new FileOutputStream(new File("DataCenter.dat"))))
        {
            
            oos.writeObject(dc);
            System.out.println("saved");
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
	
	public User getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(User loggedInUser) {
		this.loggedInUser = loggedInUser;
	}
	
	

	public Post getDisplayPost() {
		return displayPost;
	}
	public void setDisplayPost(Post displayPost) {
		this.displayPost = displayPost;
	}

	public LinkedList<Post> getNewsfeed() {
		return newsfeed;
	}
	public void setNewsfeed(LinkedList<Post> newsfeed) {
		this.newsfeed = newsfeed;
	}
	public static DataCenter getInstance() {
        if (dc == null) {

            try (ObjectInputStream ois = new ObjectInputStream (
                    new FileInputStream(new File("DataCenter.dat"))))
            {
                dc = (DataCenter)ois.readObject();
                
                
            } catch (IOException | ClassNotFoundException e) {
                dc = new DataCenter();
            }
        }
        
        return dc;
    }
	
	public UserBase getUserBase() {
		return userBase;
	}
	
	
}