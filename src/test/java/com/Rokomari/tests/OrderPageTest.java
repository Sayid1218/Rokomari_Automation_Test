package com.Rokomari.tests;

import org.testng.annotations.Test;

import com.Rokomari.drivers.BaseDriver;
import com.Rokomari.pages.OrderPage;

public class OrderPageTest extends BaseDriver {

	@Test
	public void FilterCheckbox() {
		OrderPage  OrderPage = new OrderPage();
		OrderPage.OrderForm();
	}
	
	@Test
	public void SingOut() {
		OrderPage  OrderPage = new OrderPage();
		OrderPage.SingOut();
	}
	
}
