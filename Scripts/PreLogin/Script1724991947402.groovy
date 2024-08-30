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

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/01_VerifyText - Data Disclosure'), 'Data Disclosure')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/001_PreLogin/02_TapOnAgree'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/03_VerifyText - Your MAE App is downloaded from an unknown source'), 
    'Your MAE App is downloaded from an unknown source.')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/001_PreLogin/04_TapOnProceedAnyway'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/05_VerifyText - Are you sure you want to proceed'), 
    'Are you sure you want to proceed?')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/001_PreLogin/06_TapOn - Agree  Proceed'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/07_VerifyText - Your enhanced experienceis here'), 
    'Your enhanced experience\nis here')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/001_PreLogin/08_TapOnNext-1'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/09_VerifyText - Your Maybank accounts at a glance'), 
    'Your Maybank accounts at a glance')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/001_PreLogin/10_TapOnNext2'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/11_VerifyText - Pay  transfer on the go'), 'Pay & transfer on the go')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/001_PreLogin/12_TapOnNext3'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/13_VerifyText - Customise your apps first screen'), 
    'Customise your app’s first screen')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/001_PreLogin/14_TapOnNext4'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/15_VerifyText - Customise your Quick Actions'), 
    'Customise your Quick Actions')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/001_PreLogin/16_TapOnGot_it'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/17_VerifyText - Quick Actions'), 'Quick Actions')

Mobile.takeScreenshot()


