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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.callTestCase(findTestCase('TC2- Login with Valid Credentials'), [('Password') : 'ThisIsNotAPassword', ('Username') : 'John Doe'], 
    FailureHandling.STOP_ON_FAILURE)

if (true) {
    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Medicaid'))
} else if (true) {
    WebUI.click(findTestObject('Page_CURA Healthcare Service/p_Medicare'))
} else {
    WebUI.click(findTestObject('Page_CURA Healthcare Service/p_None'))

    WebUI.closeBrowser()
}

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/span_Demo account_glyphicon glyphicon-user'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/span_Demo account_demo_password_label'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Home'))

WebUI.closeBrowser()

