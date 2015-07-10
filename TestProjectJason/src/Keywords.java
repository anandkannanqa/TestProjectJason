import java.io.FileInputStream;
import java.util.Properties;



public class Keywords {

	Properties OR=null;
	String Username;
	String Password;
	
	
	
	public Keywords() {

		try{

			OR = new Properties();
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//OR.properties");
			OR.load(fs);
		
		}catch(Exception e){

			System.out.println("the exception is " +e.getLocalizedMessage());

		}

		
	}

	public String getUsername() {
		Username = OR.getProperty("Username");
		return Username;
	}

	public String getPassword() {
		Password = OR.getProperty("Password");
		return Password;
	}
	
	
	
}
