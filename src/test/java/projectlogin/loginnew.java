package projectlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginnew {
WebDriver driver=null;
@Given("browser is open")
public void browser_is_open() {
System.out.println("Inside step browser");
System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\projectlogin\\src\\test\\resource\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
}
@And("user is on login page")
public void user_is_on_login_page() throws Exception {
    driver.navigate().to("https://cerulean-snickerdoodle-dae51c.netlify.app/");
    
    
}
@When("user enter username and password")
public void user_enter_username_and_password() throws Exception {
  
    driver.findElement(By.id("username")).sendKeys("rojin");
    driver.findElement(By.id("password")).sendKeys("12345");
    
    
}
@And("user clicks on login")
public void user_clicks_on_login() throws Exception {
    
      driver.findElement(By.id("submit")).click();
}
@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() throws Exception {
    
      driver.findElement(By.className("post-title")).isDisplayed();
      Thread.sleep(2000);
      driver.close();
      driver.quit();
    
       }  

}