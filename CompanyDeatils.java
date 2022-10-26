package orhhfnnf;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompanyDeatils {
	public static void main(String[] args) throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "C:\\java\\Newcompandyd\\driver\\chromedriver.exe");
		WebDriver rain=new ChromeDriver();
		rain.get("https://www.facebook.com/login/");
		rain.manage().window().maximize();
		WebElement btnclick = rain.findElement(By.xpath("//a[@rel='nofollow']"));
		btnclick.click();
		System.out.println("sucessfully clicked the create new account  ");

		Thread.sleep(300);	
	
		WebElement firname = rain.findElement(By.name("firstname"));
		firname.sendKeys("surya");
		System.out.println("Sucessfully enter the Firstname");

		WebElement Lastname = rain.findElement(By.name("lastname"));
		Lastname.sendKeys("jagafedk");	
		System.out.println("Sucessfully enter the lastname ");

		WebElement date = rain.findElement(By.id("day"));	

		Select d=new Select(date);
		d.selectByIndex(23);
		System.out.println("sucessfully clicked the date 23 ");

		WebElement month = rain.findElement(By.name("birthday_month"));
		Select m=new Select(month);
		m.selectByVisibleText("Feb");
		System.out.println("Sucessfully clicked the feb month");

		WebElement year = rain.findElement(By.name("birthday_year"));
		Select y=new Select(year); 
		y.selectByIndex(24);
		System.out.println("sucessfully clicked the year 1998");

		WebElement signup = rain.findElement(By.name("websubmit"));
		signup.click();
		Thread.sleep(300);
		Robot T=new Robot();
		for (int i = 1; i <26; i++) {
			T.keyPress(KeyEvent.VK_TAB);
			T.keyRelease(KeyEvent.VK_TAB);
			i=i+1;
		}
		T.keyPress(KeyEvent.VK_ENTER);
		T.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("sucessfully clicked already have a account");
		//Username wrong ,password wrong 
		WebElement username = rain.findElement(By.id("email"));
		username.sendKeys("facebookusernadfme");
		WebElement password = rain.findElement(By.name("pass"));
		password.sendKeys("nopassword");
		WebElement login = rain.findElement(By.name("login"));
		login.click();
		System.out.println("Validated succesfully Username wrong ,password wrong");
		Thread.sleep(300);
		//Username wrong ,password Empty 
		WebElement username1 = rain.findElement(By.id("email"));
		username1.sendKeys("facebookusernadfme2");
		WebElement password2 = rain.findElement(By.name("pass"));
		password2.sendKeys(" ");
		WebElement login2 = rain.findElement(By.name("login"));
		login2.click();
		System.out.println("Validated succesfully Username wrong ,password Empty");
		Thread.sleep(300);
		//Username Empty ,password wrong
		WebElement username2 = rain.findElement(By.id("email"));
		username2.sendKeys(" ");
		WebElement password3 = rain.findElement(By.name("pass"));
		password3.sendKeys("nopassword3");
		WebElement login3 = rain.findElement(By.name("login"));
		login3.click();
		System.out.println("Validated succesfully Username Empty ,password wrong");
		Thread.sleep(300);
		//Username Empty ,password Empty
		WebElement username4 = rain.findElement(By.id("email"));
		username4.sendKeys(" ");
		WebElement password4 = rain.findElement(By.name("pass"));
		password4.sendKeys(" ");
		WebElement login4 = rain.findElement(By.name("login"));
		login4.click();
		System.out.println("Validated succesfully Username Empty ,password Empty");
		Thread.sleep(300);
		// both username and password empty clicking login button
		WebElement login5 = rain.findElement(By.name("login"));
		login5.click();
		System.out.println("Validated succesfully both username and password empty clicking login button");
		
		











	}

}
