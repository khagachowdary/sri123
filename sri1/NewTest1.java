package sri1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest1 {
	
	
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
      driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
     	
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin1");
		
		 //Launching the Site.		
	        driver.get("https://opensource-demo.orangehrmlive.com/");			
	      

			Select dropdown1 = new Select(driver.findElement(By.id("location_country")));
			//dropdown1.selectByVisibleText("India");
			
			//dropdown1.selectByIndex(2);
			dropdown1.selectByValue("IS"); //for every visible text developer will give value
			
			List<WebElement> options=dropdown1.getOptions();
			int count=options.size();
			System.out.println("Number of dropdown Values :"+count);
			
			
			
			
	        WebElement username=driver.findElement(By.id("txtUsername"));
	        WebElement password=driver.findElement(By.name("txtPassword"));
	        WebElement loginbutton =driver.findElement(By.id("btnLogin"));
	        
	        
	        JavascriptExecutor js = (JavascriptExecutor)driver;	
	        
	        js.executeScript("arguments[0].style.border='3px solid red'", username);
	        js.executeScript("arguments[0].style.border='3px solid blue'", password);
	        js.executeScript("arguments[0].style.border='3px solid green'", loginbutton);
	       

	        js.executeScript("arguments[0].setAttribute('value','Admin')", username);
	        js.executeScript("arguments[0].setAttribute('value','admin123')", password);
	        js.executeScript("arguments[0].click();", loginbutton);
	  
	        

	        //How to do scrolling	
	       	
	        js.executeScript("arguments[0].scrollIntoView();", Connect_with_Us);

	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
to highlet the web element border

	        public  WebElement findElement(By by) throws Exception 
	       	{
	       				
	       		 WebElement elem = driver.findElement(by);    	    
	       		
	       		 
	       		if (driver instanceof JavascriptExecutor) 
	       		{
	       		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	       	 
	       		}
	       		
	       		return elem;
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
