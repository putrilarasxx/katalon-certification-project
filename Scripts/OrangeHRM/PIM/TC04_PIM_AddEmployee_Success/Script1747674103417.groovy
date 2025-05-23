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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('OrangeHRM/Authentication/TC01_Login_ValidCredentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Add Employee'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Full Name_firstName'), 'John')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Full Name_middleName'), 'Alex')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Full Name_lastName'), 'Doe')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_Add Employee_oxd-icon bi-plus'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Save'))

WebUI.rightClick(findTestObject('Object Repository/Page_OrangeHRM/div_SuccessSuccessfully Saved'))

WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/div_SuccessSuccessfully Saved'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/h6_John Doe'), 'John Doe')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/img_John Doe_employee-image'))

WebUI.closeBrowser()

