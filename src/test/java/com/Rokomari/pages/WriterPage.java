package com.Rokomari.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Rokomari.drivers.PageDriver;
import com.Rokomari.utilities.CommonMethod;

public class WriterPage extends CommonMethod {
	public  WriterPage() {
		 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	@FindBys({
		@FindBy(xpath="//label[contains(text(),'সমকালীন উপন্যাস')]"),
	})
	
	WebElement FilterButton;
	@FindBys({
		@FindBy(xpath="//a[contains(text(),'Next')]"),
	})
	
	WebElement NextButton;
	@FindBys({
		@FindBy(xpath="//div[@class='books-wrapper__item'][2]"),
	})
	
	WebElement Book;
	@FindBys({
		@FindBy(xpath="//button[@product-id='886']"),
	})
	
	WebElement AddCartButton;
	
	@FindBys({
	      @FindBy(xpath="//*[@id='cart-icon']"),
	})
    WebElement CartIcon;
	@FindBys({
		@FindBy(xpath="//span[contains(text(),' Place Order ')]"),
	})
	WebElement PlaceOrderButton;

	public void Checbox() {
		try {
			if(FilterButton.isEnabled()) {
				System.out.println("সমকালীন উপন্যাস button is enabled");
				FilterButton.click();
				timeout(3000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void NextPage() {
		JavascriptExecutor js = (JavascriptExecutor)PageDriver.getCurrentDriver();
		try {
			if(NextButton.isEnabled()) {
				js.executeScript("arguments[0].scrollIntoView();",NextButton );
				timeout(3000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			if(NextButton.isEnabled()) {
				System.out.println("Pagination button is enabled");
				NextButton.click();
				timeout(3000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void AddCart() {
	
		Actions action = new Actions(PageDriver.getCurrentDriver());
		try {
			if(Book.isEnabled()) {
				action.moveToElement(Book).perform();
				
				}
				
			}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			if(AddCartButton.isDisplayed()) {
				System.out.println("Add Cart button is enabled");
			
				AddCartButton.click();
				timeout();
			}}
			catch(Exception e) {
				System.out.println(e);
			}
	}
	public void Cart() {
		try {
			if(CartIcon.isDisplayed()) {
			
				CartIcon.click();
				System.out.println("Cart is Enabled");
				timeout();
			}}
			catch(Exception e) {
				System.out.println(e);
			}
		try {
			if(PlaceOrderButton.isDisplayed()) {
				System.out.println("Place Order Button is Enabled");
				PlaceOrderButton.click();
				
				timeout();
			}}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
