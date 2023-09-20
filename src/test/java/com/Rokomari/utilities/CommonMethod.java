package com.Rokomari.utilities;

import com.Rokomari.drivers.BaseDriver;

public class CommonMethod extends BaseDriver{
 public static void timeout() throws InterruptedException{
	 Thread.sleep(3000);
 }
 public static void timeout(int time) throws InterruptedException{
	 Thread.sleep(time);
 }
}
