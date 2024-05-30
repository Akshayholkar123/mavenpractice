package mavenpractice;

import org.testng.annotations.Test;

public class Java2Test {
  @Test
  public void f() {
	  System.out.println("batch maven practice");
	  String Browser=System.getProperty("browser");
	  String Url=System.getProperty("url");
	  String Username=System.getProperty("username");

	  String Password=System.getProperty("password");
	  
	  System.out.println(Browser);
	  System.out.println(Url);
	  System.out.println(Username);
	  System.out.println(Password);




	  
  }
}
