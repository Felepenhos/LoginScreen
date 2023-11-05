
import java.util.HashMap;
import java.util.Map;

/**
 * @author Luís Felipe
 * A simple class used for user authentication, simulating a user database.
 */
public class LoginScreen {
   private Map <String, String> userDatabase; // Simulando um banco de dados de usuário, (username, password)

/**
 * Here we have the construction/initialization of a database simulation, with some examples already
  * inserted.
 */
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
	/**
	* Here we have a method that authenticates the user based on their username and password.
	*
	* @param username this username field would be the user field to be logged in.
	* @param password This field is the user's password for login.
	* @return {@code true} if authentication is successful, {@code false} otherwise.
	*/
	public boolean login(String username, String password) {
		if (userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true; // Authentication Successful!
			}
		}
		return false; // Authentication Failed!
	}
	/**
	* This method adds new users to the database, please note that this method is not,
	* recommended for use in production environment, regarding security measures.
	*
	*
	* @param username The username(name/login) of the User.
	* @param password The User's password.
	*/
	
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
	}
}
