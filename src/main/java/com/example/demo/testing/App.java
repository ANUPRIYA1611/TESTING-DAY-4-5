package com.example.demo.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver=new EdgeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/fieldset[1]/div[2]/div/input")).sendKeys("ANUPRIYA");
        driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/fieldset[1]/div[3]/div/input")).sendKeys("CHANDRAMOHAN");
        driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/fieldset[1]/div[4]/div/input")).sendKeys("727721euai004@skcet.ac.in");
        driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/fieldset[2]/div/div/input")).sendKeys("ANU@123");
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/label")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
        
    }
}
