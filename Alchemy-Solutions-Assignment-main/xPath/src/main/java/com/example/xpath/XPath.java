package com.example.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		//System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\user59\\eclipse-workspace\\xPath\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user59\\\\eclipse-workspace\\\\xPath\\\\chromedriver.exe");
		WebDriver test = new ChromeDriver();
		test.get("https://www.facebook.com/");
		test.findElement(By.xpath("//input[@id='email']")).sendKeys("sumit@gmail.com");
		test.findElement(By.xpath("//input[@id='pass']")).sendKeys("sumitsingh");
	    test.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
	}

}
