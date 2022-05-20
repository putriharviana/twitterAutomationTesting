package twitterPageAutomateTesting;

import java.time.Duration;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class post {
	WebDriver driver;

    public post(WebDriver driver) {
        this.driver = driver;
    }
    
    public void postTweetAsText(String postText) {
    	driver.findElement(By.xpath("//div[@data-testid='tweetTextarea_0']")).sendKeys(postText);
    }
    
    public void postTweetAsImage() {
    	for(int i=1;i<3;i++) {
    		String imagePath = "/Users/heqiqiehaiqiucaoshi/Documents/Eclipse Workspace/twitterAutomationTesting/image/" + "test" +i +".jpeg";
    		driver.findElement(By.xpath("//input[@data-testid='fileInput']")).sendKeys(imagePath);
    	}
    }
    
    public void buttonSubmitPost() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.findElement(By.xpath("//div[@data-testid='tweetButtonInline']")).click();
    	
    	try {
    	    Thread.sleep(3000);
    	} catch(InterruptedException e) {
    	    System.out.println("Got interrupted!");
    	}
    }
    
    public void findPostAsText(String text) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
		
		String stringVerif = driver.findElement(By.xpath("//span[text()='"+ text +"']")).getAttribute("innerHTML");
//		System.out.println(stringVerif);
		
		if(stringVerif.equals(text)) {
			System.out.println("Post Success");
		} else {
			System.out.println("Post Failed");
		}
	}

}
