package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class webelementslocate extends browsersetup {

@Test
    public void test() throws InterruptedException {

    //to get browser without extends Webdriver browser =new FirefoxDriver();

    browser.get("https://rahulshettyacademy.com/AutomationPractice/");

    //locate by id attribute
    WebElement autocompletext = browser.findElement(By.id("autocomplete"));
    autocompletext.sendKeys("Apurba");

    //locate by name attribute
    WebElement Option1= browser.findElement(By.name("checkBoxOption1"));
    Option1.click();
    /*alternative way
     browser.findElement(By.name("checkBoxOption1")).click();
    */

    //locate by classname attribute
    WebElement radiobutton= browser.findElement(By.className("radioButton"));
    radiobutton.click();

    //locate by tag name and want to see the text
    WebElement title= browser.findElement(By.tagName("h1"));
    System.out.println(title.getText());

    Thread.sleep(5000); //after given input it will close 5 sec later

    /*locate by exact text and
    browser.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
    Thread.sleep(5000);
    /*locate by partial text
    browser.findElement(By.partialLinkText("Access to InterviewQues/Material")).click();
    Thread.sleep(5000);
     */
    //using cssselector to find the second option
    browser.findElement(By.cssSelector("input[value='radio2']")).click();
    Thread.sleep(5000);
    //using xpath to find the second or third option
    browser.findElement(By.xpath("//input[@value='radio3']")).click();
    Thread.sleep(5000);
    //for closing the browser after test
    browser.quit();
}
}
