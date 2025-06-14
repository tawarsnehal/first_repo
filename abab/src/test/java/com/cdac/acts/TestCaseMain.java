package com.cdac.acts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCaseMain {

    public static void main(String[] args) {
        
        
        WebDriver driver = new ChromeDriver();
        
        try {
            // Navigate to the test site
            driver.get("https://artoftesting.com/samplesiteforselenium");
            Thread.sleep(1000);
            
            // 1. Handling Textbox using ID locator
            WebElement textBox = driver.findElement(By.id("fname"));
            textBox.sendKeys("Selenium Test User");
            Thread.sleep(1000);
            
            // 2. Handling Button using ID locator
            WebElement button = driver.findElement(By.id("idOfButton"));
            button.click();
            Thread.sleep(1000);
            
            // 3. Handling Radio Buttons using different locators
            // Using ID for male radio button
            WebElement maleRadio = driver.findElement(By.id("male"));
            maleRadio.click();
            Thread.sleep(500);
            
            // Using CSS selector for female radio button
            WebElement femaleRadio = driver.findElement(By.cssSelector("input[value='female']"));
            femaleRadio.click();
            Thread.sleep(1000);
            
            // 4. Handling Checkboxes using XPath
            WebElement automationCheckbox = driver.findElement(By.xpath("//input[@value='Automation']"));
            automationCheckbox.click();
            Thread.sleep(500);
            
            WebElement performanceCheckbox = driver.findElement(By.xpath("//input[@value='Performance']"));
            performanceCheckbox.click();
            Thread.sleep(1000);
            
            // 5. Handling Dropdown using Select class
            WebElement dropdown = driver.findElement(By.id("testingDropdown"));
            Select select = new Select(dropdown);
            
            // Select by visible text
            select.selectByVisibleText("Database Testing");
            Thread.sleep(1000);
            
            // Select by value
            select.selectByValue("Performance");
            Thread.sleep(1000);
            
            // Select by index
            select.selectByIndex(0);
            Thread.sleep(1000);
            
            // 6. Handling Double-click button using XPath
            WebElement dblClickButton = driver.findElement(By.xpath("//button[contains(text(),'Double-click')]"));
            
            // Using Actions class for double click
            Actions actions = new Actions(driver);
            actions.doubleClick(dblClickButton).perform();
            Thread.sleep(2000);
            
            // Switch to alert and accept
            driver.switchTo().alert().accept();
            Thread.sleep(1000);
            
            // 7. Handling drag and drop (if needed)
            // WebElement source = driver.findElement(By.id("sourceImage"));
            // WebElement target = driver.findElement(By.id("targetDiv"));
            // actions.dragAndDrop(source, target).build().perform();
            // Thread.sleep(2000);
            
            System.out.println("All test interactions completed successfully!");
            
        } catch(Exception e) {
            System.err.println("Test failed: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}

/*
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseMain {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("https://www.saucedemo.com");
			Thread.sleep(1000);
			
			//Assigning elements
			WebElement email = driver.findElement(By.id("user-name"));
			WebElement password = driver.findElement(By.id("password"));
			WebElement loginButton = driver.findElement(By.id("login-button"));
			Thread.sleep(1000);
			
			email.sendKeys("problem_user");
			password.sendKeys("secret_sauce");
			Thread.sleep(1000);
			
			//Login click
			loginButton.click();
			Thread.sleep(2000);
			
			if(driver.getCurrentUrl().contains("inventory.html")) {
				System.out.println("Login successfull!");
			} else {
				System.out.println("Login Failed");
			}
			
		} catch(Exception e) {
			e.getMessage();
		} finally {
			driver.quit();
		}

	}

}
 */
