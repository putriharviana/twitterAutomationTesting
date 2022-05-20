package twitterPageAutomateTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	String urlHome = "https://twitter.com/home";
	
	public login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void invokeBrowser() {
		String url = "https://www.twitter.com/";
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	public void buttonLogin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@data-testid='loginButton']")).click();
	}
	
	public void inputEmail(String username) {
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys(username);
	}
	
	public void nextButton() {
		driver.findElement(By.xpath("//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")).click();
	}
	
	public void inputPassword(String password) {
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
	}
	
	public void homeSuccess() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[@data-testid='AppTabBar_Home_Link']")).click();
		String getUrlHome = driver.getCurrentUrl();
//		System.out.println(getUrlHome);
		
		if (getUrlHome.equals(urlHome)) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login Unsuccess");
		}
	}

}
