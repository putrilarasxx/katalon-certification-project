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

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_Admin'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_PIM'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_Leave'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_Time'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_Recruitment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_My Info'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_Performance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_Dashboard'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_Directory'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_Maintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_Claim'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/a_Buzz'))

WebUI.closeBrowser()

