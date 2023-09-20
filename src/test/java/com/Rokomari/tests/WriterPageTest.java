package com.Rokomari.tests;

import org.testng.annotations.Test;

import com.Rokomari.drivers.BaseDriver;

import com.Rokomari.pages.WriterPage;

public class WriterPageTest extends BaseDriver{
	@Test(priority = -1)
	public void Checbox(){
		
		WriterPage WriterPage = new WriterPage();
		WriterPage.Checbox();
		
	}
	@Test(priority = -1)
	public void NextPage(){
		
		WriterPage WriterPage = new WriterPage();
		WriterPage.NextPage();
		
	}
	@Test
	public void AddCart(){
		
		WriterPage WriterPage = new WriterPage();
		WriterPage.AddCart();
		
	}
	@Test
	public void Cart(){
		
		WriterPage WriterPage = new WriterPage();
		WriterPage.Cart();
		
	}
	
}
