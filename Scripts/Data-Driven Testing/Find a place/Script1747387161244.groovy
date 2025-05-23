import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyCheckpoint(findCheckpoint(null), false)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.airbnb.com/')

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Search/button_Got it'))

WebUI.setText(findTestObject('Object Repository/Airbnb Pages/Page_Search/input_Where_query'), city)

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Search/div_Bandung'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Search/button_16'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Search/button_17'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Search/div_Search'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_SearchResult/div_Search results Over 1,000 places in Ban_c0102f'))

WebUI.verifyTextPresent(expectedResult, false)

WebUI.closeBrowser()

