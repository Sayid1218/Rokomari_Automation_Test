package com.Rokomari.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Rokomari.drivers.PageDriver;
import com.Rokomari.utilities.CommonMethod;

public class SignInWithGoogle extends CommonMethod {

	 public SignInWithGoogle() {
		 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		
	 }
	 

		@FindBys({
			@FindBy(xpath="//a[contains(text(),'Sign in')]"),
			@FindBy(xpath="//a[@href='/login']")
		})
		WebElement SignInButton;

	 @FindBys({
			@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[2]"),
			@FindBy(xpath="//button[@class='btn btn-social-google']")
		})
		WebElement SignInWithGoogleButton;
	 @FindBys({
			@FindBy(xpath="//input[@type='email']"),
		
		})
		WebElement Email;	
	 @FindBys({
			@FindBy(xpath="//span[contains(text(),'Next')]"),
		
		})
		WebElement NextBtn;	 
	 @FindBys({
			@FindBy(xpath="//input[@type='password']"),
		
		})
		WebElement Password;
	 public void SignInButtonEnable() {
		 try {
				if(SignInButton.isEnabled()) {
					System.out.println("SignIn button is enabled");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 
	 }
	 public void signIn(){
		 try {
				if(SignInButton.isDisplayed()) {
					SignInButton.click();
					timeout();
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
	 }
	 public void SignInWithGoogleButton() {
		 try {
				if(SignInWithGoogleButton.isDisplayed()) {
					System.out.println("Google button is here");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 try {
				if(SignInWithGoogleButton.isEnabled()) {
					System.out.println("Google button is enabled");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
	 }

	 public void SignInWithGooglePopUP() {
         
		
		 try {
				if(SignInWithGoogleButton.isDisplayed()) {
					SignInWithGoogleButton.click();
					timeout(1000);
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 try {
				if(Email.isDisplayed()) {
					Email.sendKeys("abdullahsayid1218@gmail.com");
					timeout(1000);
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 try {
				if(NextBtn.isEnabled()) {
					NextBtn.click();
					timeout(2000);
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 
		 try {
				if(Password.isDisplayed()) {
					Password.sendKeys("SI..12ing");
					timeout(1000);
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 try {
				if(NextBtn.isEnabled()) {
					NextBtn.click();
					timeout(2000);
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 
		}
	 
   
    
		
    
	 
}
