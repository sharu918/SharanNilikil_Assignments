package assignment3;

import org.springframework.stereotype.Service;

@Service
public class UserModel {
	String user = "sharan";
	String pass = "sharan";
	String email = "sharan@gmail.com";

	public boolean User(String user, String pass, String email) {
		if (user.equals(this.user) && pass.equals(this.pass) && email.equals(this.email)) {
			return true;
		} else {
			return false;
		}
	}

}