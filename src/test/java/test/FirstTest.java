package test;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import base.BaseTest;

public class FirstTest extends BaseTest {
	@Test
	public void verifyTitle() {
		page.navigate("https://www.naukri.com");
		System.out.println("Page Title : " + page.title());
	}

}
