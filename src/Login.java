
public class Login {
	public void login(String username, String password) {
		if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
			System.out.println("Error: Username and password are required.");
			return;
		}

		// Proceed with authentication logic
		System.out.println("Authenticating user...");
		// Additional authentication logic goes here
	}

}
