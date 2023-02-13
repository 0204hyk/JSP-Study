package chap04.quiz;

import java.util.List;

public class MemberModel {
	String id;
	String password;
	
	public MemberModel(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return String.format("ID : %s\nPW : %s", id, password);
	}
	
}
