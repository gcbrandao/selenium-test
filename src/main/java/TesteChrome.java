import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TesteChrome {

	
	
    public static void main(String[] args) {
    	
    	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\gcb1119\\Documents\\chromedriver_win32\\chromedriver.exe");

    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gcb1119\\Documents\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver;
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions());
			driver.get("https://os.sulamerica.com.br/SASHubEmp/IntegraSASPainel.jsf");
	        
	        WebElement campoDeTexto = driver.findElement(By.name("q"));
	        campoDeTexto.sendKeys("Caelum");        
	        campoDeTexto.submit();
	        
	        
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
//    	WebDriver driver = new RemoteWebDriver( new URL("http://localhost:9515"),new ChromeOptions());
//
//    	driver.get("http://www.google.com");
//    	
//    	
//        //chrome
//        WebDriver chDriver = new ChromeDriver();
//        chDriver.get("https://os.sulamerica.com.br/SASHubEmp/IntegraSASPainel.jsf");

        

              
        
    }
}