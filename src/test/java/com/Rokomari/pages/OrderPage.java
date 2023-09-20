package com.Rokomari.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Rokomari.drivers.PageDriver;
import com.Rokomari.utilities.CommonMethod;

public class OrderPage extends CommonMethod {
	
	 public OrderPage() {
		 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		 
	 }
	
	@FindBys({
		@FindBy(xpath="//input[@name='phone']")
	})
	WebElement Phone;

	@FindBys({
		@FindBy(xpath="//input[@name='phone2']")
	})
	WebElement Phone2;
	@FindBys({
		@FindBy(xpath="//fieldset//select[@id='js--country']")
	})
	WebElement Country;
	@FindBys({
		@FindBy(xpath="//fieldset//select[@id='js--city']")
	})
	WebElement City;


	@FindBys({
		@FindBy(xpath="//fieldset//select[@id='js--area']")
	})
	WebElement Area;
	@FindBys({
		@FindBy(xpath="//fieldset//textarea")
	})
	WebElement Address;
	@FindBys({
		@FindBy(xpath="//select[@id='js--courier']")
	})
	WebElement Courier;
	@FindBys({
		@FindBy(xpath="//a[@id='dropdownMenu2']")
	})
	WebElement DropdawnManu;
	@FindBys({
		@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	})
	WebElement SignOutButton;

public void OrderForm() {
		

		try {
			if(Phone.isEnabled()) {
				System.out.println("Phone filed taking text inputs");	
				Phone.sendKeys("01580394350");
				timeout(1000);
				
			
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			if(Phone2.isEnabled()) {
				System.out.println("Alternative Phone Number filed taking text inputs");	
				Phone2.sendKeys("01845328932");
				timeout(2000);
				
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			if(Country.isDisplayed()) {
			    Select select = new Select(Country);
			    select.selectByIndex(0);
				System.out.println("Country Selected");
				timeout(3000);
				
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			if(City.isDisplayed()) {
				Select select = new Select(City);
				select.selectByIndex(1);
				System.out.println("City Selected");
				timeout(1000);
				
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			if(Area.isDisplayed()) {
				Select select = new Select(Area);
				select.selectByIndex(5);
				System.out.println("Area Selected");
				timeout(1000);
				
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			if(Address.isEnabled()) {
				Address.sendKeys("KAdirbad housing, MohammmodPur");
				System.out.println("Address inputed");
				timeout(1000);
				
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

public void SingOut() {
	try {
		if(DropdawnManu.isEnabled()) {
			DropdawnManu.click();
			System.out.println("Accounts Dropdawn is working");
			timeout(1000);
			
			
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	try {
		if(SignOutButton.isEnabled()) {
			SignOutButton.click();
			System.out.println("Sign-Out button is working");
			timeout(3000);
			
			
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
