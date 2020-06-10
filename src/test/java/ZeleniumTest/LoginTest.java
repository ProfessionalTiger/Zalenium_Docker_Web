package ZeleniumTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

	

	@Test
	public void test() throws Exception {

		driver.findElementByXPath("/html/body/section[1]/header/div/div[1]/div/div/div[2]/div/p/a[1]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@id=\"inputEmail\"]").sendKeys("aamirsaleem.sqa@gmail.com");
		driver.findElementByXPath("//*[@id=\"inputPassword\"]").sendKeys("vTouch-12");
		driver.findElementByXPath("//*[@id=\"login\"]").click();
		Thread.sleep(7000);

		Assert.assertEquals(driver.getTitle(), "Client Area - CloudAccess.net");
		

	}

	
}
