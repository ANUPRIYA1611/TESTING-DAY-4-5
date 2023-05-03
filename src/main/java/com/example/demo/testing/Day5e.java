package com.example.demo.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5e {
	public static void main(String[] args)throws 
	InterruptedException
	{
	    WebDriverManager.edgedriver().setup();
	    WebDriver driver=new EdgeDriver();
	    driver.get("https://www.abhibus.com/bus-ticket-booking");
	    driver.findElement(By.xpath("//*[@id=\"source\"/hhhhhhhhhhhhhhh]")).sendKeys("ERODE");
	    driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("BANGALORE");
	    driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
	}
}
