package fafafa;

import java.io.Serializable;

public class UserInfo implements Serializable {
	String name;
	String password;
	int age;

	public UserInfo() {
		// TODO Auto-generated constructor stub
		this("Unknown", "1111", 0);
	}

	public UserInfo(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "("+ name + ", " + password + ", " + age + ")";
	}
	
	
}
