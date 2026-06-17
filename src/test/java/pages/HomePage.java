package pages;

import com.microsoft.playwright.Page;

public class HomePage {
	
	private final Page page;
	private final String timeLink="//*[text()=\"Time\"]";
	private final String  employeeName="";
	
	public HomePage(Page page) {
		this.page = page;
		}
	
	public void clickTimeLink() {
//		page.click(timeLink);
		page.locator(timeLink).click();
	}
	
	public void enterEmployeeName() {
		page.fill(employeeName, "Akshay");
	}

}
