package twitterPageAutomateTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class register {
	WebDriver driver;
    
    public register(WebDriver driver) {
        this.driver = driver;
    }
    
    public void buttonRegister() {
    	driver.findElement(By.xpath("//a[@data-testid='signupButton']")).click();
    }
    
    public void registerWithEmail() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.findElement(By.xpath("//div[@class='css-18t94o4 css-901oao r-1cvl2hr r-37j5jr r-a023e6 r-16dba41 r-rjixqe r-bcqeeo r-1ff274t r-qvutc0']")).click();
    }
    
    public void sendKeysInput() {
    	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Testing");
    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("putriharviana11@gmail.com");
    	
    	driver.findElement(By.xpath("//select[@id='SELECTOR_1']")).click();
    	driver.findElement(By.xpath("//option[@class='r-14lw9ot' and @value='12']")).click();
    	
    	driver.findElement(By.xpath("//select[@id='SELECTOR_2']")).click();
    	driver.findElement(By.xpath("//option[@class='r-14lw9ot' and @value='16']")).click();
    	
    	driver.findElement(By.xpath("//select[@id='SELECTOR_3']")).click();
    	driver.findElement(By.xpath("//option[@class='r-14lw9ot' and @value='1998']")).click();
    	
    	driver.findElement(By.xpath("//div[@data-testid='ocfSignupNextLink']")).click();
    }
    
    public void buttonNextStep2() {
    	driver.findElement(By.xpath("//div[@data-testid='ocfSettingsListNextButton']")).click();
    }
    
    public void buttonNextStep34() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.findElement(By.xpath("//div[@data-testid='ocfSignupReviewNextLink']")).click();
    }
    
    public void verificationStep5() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	
    	driver.findElement(By.xpath("//input[@name='verfication_code']")).sendKeys("258252");
    }
    
    public void buttonLastStep5() {
    	driver.findElement(By.xpath("//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")).click();
    }
    
    
}
