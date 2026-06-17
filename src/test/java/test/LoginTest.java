package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest1() {

		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		
		test.info("Navigating to Login Page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding username & password");
		loginpage.login("Admin", "admin123");

		homepage.clickTimeLink();

//	    page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
//	    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
//	    assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("client brand banner"))).isVisible();
//	    assertThat(page.getByLabel("Sidepanel").getByRole(AriaRole.LIST)).containsText("Admin");
	}
	
	
	@Test
	public void loginTest2() {

		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		
		test.info("Navigating to Login Page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test.info("Adding username & password");
		loginpage.login("Admin", "admin123");

		homepage.clickTimeLink();
		test.info("Adding Employee Name");
		homepage.enterEmployeeName();

//	    page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
//	    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
//	    assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("client brand banner"))).isVisible();
//	    assertThat(page.getByLabel("Sidepanel").getByRole(AriaRole.LIST)).containsText("Admin");
	}

}
