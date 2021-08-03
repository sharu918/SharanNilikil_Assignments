package assignment4;

import org.springframework.stereotype.Service;

@Service
public class UserModel {
	String user = "";
	String pass = "";
	String email = "";

	public void User(String user, String pass, String email) {
		this.user = user;
		this.pass = pass;
		this.email = email;
	}

	public boolean valid(String user, String pass) {
		if (user.equals(this.user) && pass.equals(this.pass)) {
			return true;
		} else {
			return false;
		}
	}

}