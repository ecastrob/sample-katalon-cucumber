package com.sample
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class GoogleSearchStepDefinitions {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I go to google URL")
	public void I_go_to_google_URL() {
		WebUI.openBrowser("https://google.com");
	}

	@When("I enter Katalon studio Docs in the search box")
	public void I_enter_Katalon_studio_Docs_in_the_search_box() {
		WebUI.setText(findTestObject('Object Repository/Sample/Page_Google/input__q'),"Katalon Studio Docs");
	}

	@And("I click on the Search button")
	public void I_click_on_the_Search_button() {
		WebUI.click(findTestObject('Object Repository/Sample/Page_Google/input_Remove_btnK'), FailureHandling.STOP_ON_FAILURE);
	}

	@Then("I verify Katalon website is displayed")
	public void I_verify_Katalon_website_is_displayed() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Sample/Page_katalon studio docs - Google Search/h3_Welcome to Katalon Docs  Katalon Docs'), 0, FailureHandling.STOP_ON_FAILURE);
		WebUI.closeBrowser();
	}
}