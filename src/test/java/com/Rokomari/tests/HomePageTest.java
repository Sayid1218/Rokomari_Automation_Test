package com.Rokomari.tests;

import org.testng.annotations.Test;

import com.Rokomari.drivers.BaseDriver;
import com.Rokomari.pages.HomePage;


public class HomePageTest extends BaseDriver{

	
	@Test
	public void LekhokButton(){
		
		HomePage HomePage = new HomePage();
		HomePage.LekhokButton();
		
	}
	

}
