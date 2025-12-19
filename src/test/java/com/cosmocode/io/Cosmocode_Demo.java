package com.cosmocode.io;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cosmocode_Demo extends BaseClass {

	@BeforeMethod
	public void setURL() {
		getDriver().get("https://cosmocode.io/automation-practice-webtable/");

	}

	//@Test
	public void tableCheckBoxAlterNativClickDemo() {

		List<WebElement> checkbox = getDriver().findElements(By.xpath("//input[@type='checkbox']"));
		int size = checkbox.size();
		System.out.println(size);

		for (int i = 0; i < checkbox.size(); i += 2) {
			WebElement ch = checkbox.get(i);
			ch.click();
		}

	}
	@Test
	public void selectIndiaCheckBox() {
	  
	    List<WebElement> allData = getDriver().findElements(By.xpath("//table[@id='countries']/tbody/tr[position()>1]"));
	    
	    System.out.println("Total rows: " + allData.size());

	  
	    for (WebElement element : allData) {
	     
	        String country = element.findElement(By.xpath("td[2]")).getText();
	        System.out.println(country);

	     
	        if (country.equalsIgnoreCase("Afghanistan")) {
	            
	            WebElement checkbox = element.findElement(By.xpath("td[1]//input[@type='checkbox']"));

	         
	            if (!checkbox.isSelected()) {
	                checkbox.click();  
	                System.out.println("Clicked checkbox for India.");
	            }
	            break;  
	        }
	    }   
	}



}
