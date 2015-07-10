import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ReactTry {

	@Test
	public void loginPage(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.syncano.com/reactjs-reasons-why-part-1/");
		driver.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul[2]/li[1]/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]")).click();
		
	}
}
