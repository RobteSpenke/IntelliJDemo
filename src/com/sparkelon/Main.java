package com.sparkelon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws Exception  {
	// write your code here

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Gebruiker\\Documents\\SeleniumTraining\\Selenium\\TrainingFiles\\JARs\\GoogleChromeDriver\\chromedriver.exe");

        WebDriver driver  = new ChromeDriver();
        //Open indeed homepage
        driver.get("http://www.indeed.nl");
        //Find what field and enter selenium
        //driver.findElement(By.id("what")).sendKeys("Selenium");
        //driver.findElement(By.id("what")).sendKeys(data01);
        driver.findElement(By.id("what")).sendKeys("Selenium");
        // Find location field and enter Rotterdam
        Thread.sleep(2000);
        driver.findElement(By.id("where")).clear();

        driver.findElement(By.id("where")).sendKeys("Groningen");
        //FindJobs button and click on it
        Thread.sleep(2000);
        driver.findElement(By.id("fj")).click();
        //Find job search results page, get title and jobs count message

        Thread.sleep(2000);
        System.out.println(driver.getTitle());
     // youtube instruction clip: https://www.youtube.com/watch?v=uUzRMOCBorg
        driver.close();
        driver.quit();
    }
}
