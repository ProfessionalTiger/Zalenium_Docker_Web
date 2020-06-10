package ZeleniumTest;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	static RemoteWebDriver  driver;

	@Parameters("browser")
	@BeforeTest
	public void setUp(String br) throws IOException, InterruptedException {
		
		DesiredCapabilities cp = new DesiredCapabilities();
		
		System.out.println("Zelennium Envieroment/t"+ br);
		
		if (br.equals("chrome"))
		{
		Runtime.getRuntime().exec("cmd /c start StartZeleniumWin");
		Thread.sleep(20000);
		
		//cp.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		//cp.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
		//cp.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
		
		
		cp.setPlatform(Platform.MAC);
		ChromeOptions options = new ChromeOptions();
		options.merge(cp);
		
		
		
		}else if(br.equals("firefox"))
		{
			Runtime.getRuntime().exec("cmd /c start StartZeleniumWin.bat");
			Thread.sleep(20000);
			
			cp.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
			cp.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
		}

		

		URL url = new URL("http://localhost:4444/wd/hub");

		driver = new RemoteWebDriver(url, cp);

		driver.get("https://www.cloudaccess.net/");
	}
	
	
	@AfterTest
	public void tearDown() throws IOException, InterruptedException {
		
		driver.quit();
		
		Runtime.getRuntime().exec("cmd /c start StopZelenium.bat");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}

	

}
