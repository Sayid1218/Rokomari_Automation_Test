package com.Rokomari.tests;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Rokomari.drivers.BaseDriver;
import com.Rokomari.drivers.PageDriver;
import com.Rokomari.pages.SignInWithGoogle;

public class SignInWithGoogleTest extends BaseDriver{
	@BeforeClass
	 public void openUrl() {
		  PageDriver.getCurrentDriver().manage().window().maximize(); 
		  PageDriver.getCurrentDriver().get(url);   
	}
	
	@Test
	 public void SignInButton() {
		 SignInWithGoogle SignInWithGoogle= new SignInWithGoogle();
		 SignInWithGoogle.SignInButtonEnable();
		 
	 }
	@Test
	public void SignIn() {
		SignInWithGoogle SignInWithGoogle= new SignInWithGoogle();
		SignInWithGoogle.signIn();
		
	}
	@Test
	public void SignInWithGoogleButton() {
		SignInWithGoogle SignInWithGoogle= new SignInWithGoogle();
		SignInWithGoogle.SignInWithGoogleButton();
		
	}

	@Test
 public void SignInWithGooglePOpUp() {
	 SignInWithGoogle SignInWithGoogle= new SignInWithGoogle();
	 SignInWithGoogle.SignInWithGooglePopUP();
	
	
 }
	


	
}
