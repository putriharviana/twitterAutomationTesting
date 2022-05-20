package twitterPageAutomateTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class delete {
	WebDriver driver;
	
	public delete(WebDriver driver) {
		this.driver = driver;
	}
	
	public void gotoProfile() {
		try {
    	    Thread.sleep(4000);
    	} catch(InterruptedException e) {
    	    System.out.println("Got interrupted!");
    	}
		
		driver.findElement(By.xpath("//a[@data-testid='AppTabBar_Profile_Link']")).click();
	}
	
	public void deleteTweet(String text) {
		try {
    	    Thread.sleep(3000);
    	} catch(InterruptedException e) {
    	    System.out.println("Got interrupted!");
    	}
		
		if(!driver.findElements(By.xpath("//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0' and text()='" + text +"']")).isEmpty()){
			driver.findElement(By.xpath("//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0' and text()='" + text +"']")).click();
			
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k4xj1c r-18u37iz r-1wtj0ep']//div[@class='css-1dbjc4n r-1awozwy r-6koalj r-18u37iz']")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-16y2uox r-1wbh5a2']//span[text()='Hapus']")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//div[@data-testid='confirmationSheetConfirm']")).click();
	    }else{
	    	System.out.println("Delete tweet got interrupted!");
	    }
	}
	
	public void findPostAsText(String text) {
		if(driver.findElements(By.xpath("//span[text()='"+ text +"']")).isEmpty()){
			System.out.println("Delete Success");
	    }else{
	    	System.out.println("Delete Failed");
	    }
	}
}
