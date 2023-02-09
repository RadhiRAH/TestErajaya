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

WebUI.callTestCase(findTestCase('1.2 Login with valid data'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Make Appointment/input_Visit Date (Required)_visit_date'), 0)

WebUI.click(findTestObject('Make Appointment/input_Visit Date (Required)_visit_date'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Make Appointment/input_Visit Date (Required)_visit_date'), '28/02/2023')

WebUI.setText(findTestObject('Make Appointment/textarea_Comment_comment'), 'Radhi Abdul Hakim')

WebUI.click(findTestObject('Make Appointment/button_Book Appointment'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/h2_Appointment Confirmation'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('28/02/2023', false)

WebUI.verifyTextPresent('Radhi Abdul Hakim', false)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

