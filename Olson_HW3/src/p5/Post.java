package p5;

import java.io.Serializable;
import java.util.LinkedList;

public class Post implements Serializable{
	private User author;
	private String content;
	private LinkedList<Post> responseList;
	
	public Post(User author, String content) {
		this.author = author;
		this.content = content;
		responseList = new LinkedList<Post>();
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LinkedList<Post> getResponseList() {
		return responseList;
	}

	public void setResponseList(LinkedList<Post> responseList) {
		this.responseList = responseList;
	}

	@Override
	public String toString() {
		return "Author: " + author.getUsername() + "\n" + content + "\n responseList=" + responseList;
	}
	
	

}
