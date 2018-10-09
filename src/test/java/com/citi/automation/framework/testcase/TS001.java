package com.citi.automation.framework.testcase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.citi.automation.framework.po.HomePage;
import com.citi.automation.framework.po.LoginPage;
import com.citi.automation.framework.po.RegisterPage;
import com.citi.automation.framework.reusable.WebDriverHelper;

public class TS001 {

	@Test
	public void register() throws FileNotFoundException, IOException {
		WebDriverHelper.initialize();
		WebDriverHelper.click(HomePage.usr_icn);
		WebDriverHelper.click(LoginPage.reg_btn);
		WebDriverHelper.type(RegisterPage.fname, "Natarajan");
		WebDriverHelper.type(RegisterPage.lname, "Ramanathan");
		WebDriverHelper.type(RegisterPage.email, "natarajan@gmail.com");
		WebDriverHelper.quit();
	}
}
