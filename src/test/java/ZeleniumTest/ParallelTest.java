package ZeleniumTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest extends BaseClass {

	
	

	@Test(priority = 0)
	public void test1() throws Exception {

		driver.findElementByXPath("/html/body/section[1]/header/div/div[1]/div/div/div[2]/div/p/a[1]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@id=\"inputEmail\"]").sendKeys("aamirsaleem.sqa@gmail.com");
		driver.findElementByXPath("//*[@id=\"inputPassword\"]").sendKeys("vTouch-12");
		driver.findElementByXPath("//*[@id=\"login\"]").click();
		Thread.sleep(7000);

		Assert.assertEquals(driver.getTitle(), "Client Area - CloudAccess.net");

	}

	@Test(priority = 1)
	public void test2() throws Exception {
		
		driver.getCurrentUrl();
		
		driver.findElementByXPath("/html/body/div[1]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div/table/tbody/tr/td[8]/div/a[1]").click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElementByXPath("/html/body/div[1]/div[2]/div[2]/div[3]/div/div/div[1]/div[1]/a/b").click();
		driver.findElementByXPath("/html/body/div[1]/div[2]/div[2]/div[3]/div/div/div[1]/div[2]/div/ul/li[1]/a")
				.click();

	}


}
