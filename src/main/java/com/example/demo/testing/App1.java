package com.example.demo.testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App1 {
	public static void main(String args[]) throws InterruptedException
	{

	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
	driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("ANU");
	driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("727721euai004@skcet.ac.in");
	driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("PRIYA");
	driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("anu@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[1]/label")).click();
	driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("haiiiiiiiiiii this is anu");
	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/label")).click();
	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
	}
}
