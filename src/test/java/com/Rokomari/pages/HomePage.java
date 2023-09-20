package com.Rokomari.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


import com.Rokomari.drivers.PageDriver;
import com.Rokomari.utilities.CommonMethod;

public class HomePage extends CommonMethod {


	
	 public HomePage() {
		 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		 
	 }

		@FindBys({
			@FindBy(xpath="//a[@id='js--authors']"),
			@FindBy(xpath="/html[1]/body[1]/header[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
		})
		
		WebElement LekhokButton;
	@FindBys({
		
			@FindBy(xpath="//a[@href='/book/author/1?ref=mm_p0']")
		})
		
		WebElement HumayunAhammedButton;
	



public void LekhokButton() {
	Actions action = new Actions(PageDriver.getCurrentDriver());
	try {
		if(LekhokButton.isEnabled()) {
			System.out.println("লেখক button is enabled");
			timeout(3000);
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	try {
		if(LekhokButton.isDisplayed()) {
		  action.clickAndHold(LekhokButton).perform();
			timeout(3000);
			if(HumayunAhammedButton.isDisplayed()){
				System.out.println("Dropdawn manu opening after hovering over \"লেখক\" button");
			}
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	try {
		if(HumayunAhammedButton.isDisplayed()) {
		  HumayunAhammedButton.click();
			timeout(3000);

		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	
}





		
		

			
			
		
			
			
	

		
	
	
}
