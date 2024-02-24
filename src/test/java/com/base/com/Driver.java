package com.base.com;

import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {
	
	public static WebDriver driver;
	
	public WebDriver setup()
	{
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Choose your Browser");
		 * System.out.println("1. Chrome Browser");
		 * System.out.println("2. Edge Browser");
		 * System.out.print("Enter your choice : "); String c=sc.nextLine(); sc.close();
		 * if(c.equalsIgnoreCase("1")) {
		 */
			driver=new ChromeDriver();
			/*
			 * } else { driver=new EdgeDriver(); }
			 */
		driver.get("https://policybazaar.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}	
	public static void CloseBrowser() 
	{
		//driver.quit();
		driver.close();
	}
	

}
