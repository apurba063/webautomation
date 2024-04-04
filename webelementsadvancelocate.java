package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class webelementsadvancelocate extends browsersetup{
    @Test

    public void test() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        //using cssselector to find the second or third option
        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(2000);
        //using xpath to find the second or third option
        browser.findElement(By.xpath("//input[@value='radio3']")).click();
        Thread.sleep(2000);
        //custom CSSSELECTOR by adding # with id attribute value
        browser.findElement(By.cssSelector("#checkBoxOption1")).click();
        //custom CSSSELECTOR by adding . with class attribute value
        browser.findElement(By.cssSelector(".radioButton")).click();
        //tag name with cssselector
        String h1test_cssselector = browser.findElement(By.cssSelector("h1")).getText();
        System.out.println("GET BY CSSSELECTOR : "+h1test_cssselector);
        //tag name by xpath
        String h1test_XPATH = browser.findElement(By.xpath("//h1")).getText();
        System.out.println(("GE BY XPATH : "+h1test_XPATH));
        //without using tag name in xpath
        browser.findElement(By.xpath("//*[@value='radio2']")).click();
        Thread.sleep(2000);

        //parents child relation by using cssselector
        String text = browser.findElement(By.cssSelector("div[id='checkbox-example'] > fieldset >legend")).getText();
        System.out.println("get by cssselector: "+text);

        //parents child relation by using xpath
        String text2 = browser.findElement(By.xpath("//div[@id='checkbox-example'] / fieldset / legend")).getText();
        System.out.println("get by xpath: "+text2);

        //if we need to use two attribute in xpath
        browser.findElement(By.xpath("//input[@name='radioButton' and @value='radio2']")).click();
        Thread.sleep(2000);
        //if we need to use two attribute in cssselector
        browser.findElement(By.cssSelector("input[name='radioButton'][value='radio3']")).click();
        Thread.sleep(2000);

        //if there are any dynamic attribute (match with first part)
        browser.findElement(By.cssSelector("input[placeholder^=\"Enter Your\"]")).sendKeys("Apurba ");
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[starts-with(@placeholder,\"Enter Your\")]")).sendKeys(" Roy");
        Thread.sleep(2000);
        //if there are any dynamic attribute (match with any text)
        browser.findElement(By.xpath("//input[contains (@placeholder,\" Your\")]")).sendKeys(" Ajay ");
        Thread.sleep(2000);
        browser.findElement(By.cssSelector("input[placeholder*=\" Your\"]")).sendKeys("hello ");
        Thread.sleep(2000);

        //parents child relation or test/data from table where attribute is not found
        text = browser.findElement(By.xpath("//table[@name=\"courses\"] //tr /th[2]")).getText();
        System.out.println(text);
        text = browser.findElement(By.xpath("//table[@name=\"courses\"] //tr /th[last()]")).getText();
        System.out.println(text);

        text = browser.findElement(By.cssSelector("table[name=\"courses\"] >tbody>tr>th:first-child")).getText();
        System.out.println(text);
        text = browser.findElement(By.cssSelector("table[name=\"courses\"] >tbody>tr>th:nth-child(2)")).getText();
        System.out.println(text);
    }


}
