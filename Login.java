package Preparation;

public class Login {
	public String checkPassword(String password) throws PasswordException {
	try {	if(password.length()>8) {
			return "Login Successfully";
		}
		else {
			throw new PasswordException("Characters must be above 8");
		}
	}
	catch(PasswordException pe){
		return("Password Length should be more then 8");

	}

	}

}
