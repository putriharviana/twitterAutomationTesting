package twitterPageAutomateTesting;

import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		String username = "username";
		String password = "password";
		
		String stringRandom = UUID.randomUUID().toString();
		
		login loginPage = new login(driver);
		register registerPage = new register(driver);
		post postPage = new post(driver);
		delete deletePage = new delete(driver);
		loginPage.invokeBrowser();
		
		loginPage.buttonLogin();
		loginPage.inputEmail(username);
		loginPage.nextButton();
		loginPage.inputPassword(password);
		loginPage.nextButton();
		loginPage.homeSuccess();
		
//		registerPage.buttonRegister();
//		registerPage.registerWithEmail();
//		registerPage.sendKeysInput();
//		registerPage.buttonNextStep2();
//		registerPage.buttonNextStep34();
//		registerPage.verificationStep5();
//		registerPage.buttonLastStep5();
		
		postPage.postTweetAsText(stringRandom);
		postPage.postTweetAsImage();
		postPage.buttonSubmitPost();
		postPage.findPostAsText(stringRandom);
		
		deletePage.gotoProfile();
		deletePage.deleteTweet(stringRandom);
		deletePage.findPostAsText(stringRandom);
		
	}

}
