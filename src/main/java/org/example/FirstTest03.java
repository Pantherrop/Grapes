package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest03 {
    protected static WebDriver driver;

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
 //setting up for Chrome browser to run
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Maximise the screen
        driver.manage().window().fullscreen();
// Open URL
        driver.get("https://demo.nopcommerce.com/");

        // Click on registration button
        driver.findElement(By.linkText("Register")).click();
        //Select the gender
        driver.findElement(By.id("gender-male")).click();
        // Enter First Name
        driver.findElement(By.name("FirstName")).sendKeys("Orange");
        // Enter Last Name
        driver.findElement(By.name("LastName")).sendKeys("Mango");
        // Enter Day of your Date of Birth
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("20");
        // Enter Month of your Date of Birth
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("July");
       // Enter Year of your Date of Birth
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("2011");
        // Enter your email
        driver.findElement(By.id("Email")).sendKeys("pantherro@gmail.com");
        // Enter company name
        driver.findElement(By.id("Company")).sendKeys("Fruit"+" "+"pvt"+" "+"ltd");
        // Tick newsletter box
        driver.findElement(By.id("Newsletter")).click();
        // Enter password
        driver.findElement(By.id("Password")).sendKeys("Applle");
        // Reenter your password to confirm
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Applle");
        // Click on Registration To save
        driver.findElement(By.id("register-button")).click();

        driver.close();





    }

}
