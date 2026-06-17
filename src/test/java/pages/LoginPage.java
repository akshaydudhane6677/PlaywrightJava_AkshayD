package pages;

import com.microsoft.playwright.Page;

public class LoginPage  {
	private Page page;
	// Locators
	private final String usernamelnput = "input[name='username']";
	private final String passwordinput = "input[name='password']";
	private final String loginButton = "button[type='submit']";

	// Constructor
	public LoginPage(Page page) {
		this.page = page;
	}

	// Page actions
	public void navigate() {
		page.navigate("https://opensource-demo.orangehrmlive.com/");
	}

	public void login(String username, String password) {
		page.fill(usernamelnput, username);
		page.fill(passwordinput, password);
		page.click(loginButton);
	}
}
