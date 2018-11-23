import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

for (def index : (200..681)) {
    WebUI.openBrowser('')

    WebUI.deleteAllCookies()

    WebUI.navigateToUrl('https://www.sharklasers.com/inbox')

    WebUI.click(findTestObject('Object Repository/Page_ SharkLasers.com/Alias checkbox'))

    email = WebUI.getText(findTestObject('Object Repository/Page_ SharkLasers.com/email_span'))

    WebUI.navigateToUrl('https://vy.tc/gPll628')

    WebUI.click(findTestObject('Page_CRUNCHPREPS INCREDIBLE BLACK F/a_COUNT ME IN'))

    WebUI.setText(findTestObject('Page_CRUNCHPREPS INCREDIBLE BLACK F/email entry'), email)

    WebUI.setText(findTestObject('Page_CRUNCHPREPS INCREDIBLE BLACK F/Name entry'), findTestData('cvr_names').getValue(1, 
            index))

    WebUI.click(findTestObject('Page_CRUNCHPREPS INCREDIBLE BLACK F/sign up button'))

    WebUI.navigateToUrl('https://www.sharklasers.com/inbox')

    elementFound = WebUI.waitForElementPresent(findTestObject('Page_ SharkLasers.com/td_hellocrunchprep.com'), 8)

    if (!(elementFound)) {
        continue
    }
    
    WebUI.click(findTestObject('Object Repository/Page_ SharkLasers.com/td_hellocrunchprep.com'))

    WebUI.click(findTestObject('Object Repository/Page_ SharkLasers.com/a_Click here'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Page_ SharkLasers.com/a_Forget Me'))

    log.logInfo(((' ' + index) + ' ') + email)

    WebUI.closeBrowser()
}

