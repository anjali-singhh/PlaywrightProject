package tests;

import org.testng.annotations.Test;

import base.BaseTest;

@Test
public class FirstTest extends BaseTest {
	public void verifyTitle()  {
		page.navigate("https://smartcode.cmsuat.co.in/esamudra/login/ncr");
		if(page.isVisible("button:has-text('Accept all')")) {
			page.click("button:has-text('Accept all')");
		}
		System.out.println("Page title is : " + page.title());
	}
	

//	public static void main(String[] args) {
//
//		try (Playwright playwright = Playwright.create()) {
//			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//			Page page = browser.newPage();
//			page.navigate("https://smartcode.cmsuat.co.in/esamudra/login");
//
//			System.out.println("Page title is : " + page.title());
//			browser.close();
//
//		}
	}


