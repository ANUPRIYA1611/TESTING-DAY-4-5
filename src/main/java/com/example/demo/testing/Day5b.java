package com.example.demo.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5b {
       public static void main(String args[])
       {
    	   WebDriverManager.edgedriver().setup();
    	   WebDriver driver=new EdgeDriver();
    	   driver.get("https://jqueryui.com/droppable/");
    	   driver.switchTo().frame(0);
    	   WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
    	   WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
    	   driver.switchTo().defaultContent();
    	   Actions act=new Actions(driver);
    	   act.dragAndDrop(drag, drop).build().perform();
    	   
       }
}
