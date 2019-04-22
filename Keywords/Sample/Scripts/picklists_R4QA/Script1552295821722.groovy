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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.salesforce.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Username'))

WebUI.sendKeys(findTestObject('Login/Page_Home  Salesforce/Username'), 'kimpreet.kaur@juno.jist.r4qa')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Password'))

WebUI.sendKeys(findTestObject('Login/Page_Home  Salesforce/Password'), '#Deloitte4')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Login'))

WebUI.waitForPageLoad(20)

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/Details/view')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/FieldsAndRelationships/view')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/FieldsAndRelationships/setHistoryTracking')

//WebElement checkbox = driver.findElement(By.id('00N4100000dkZDg_fht'))
WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_Picklist'), 10)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/treatment_Checkbox'))

//If the checkbox is unchecked then isSelected() will return false
//and NOT of false is true, hence we can click on checkbox
//if (!(checkbox.isSelected())) {
//  checkbox.click()
WebUI.click(findTestObject('Login/Page_Home  Salesforce/save_picklist'))

WebUI.delay(5)

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9P/Details/view')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9P/FieldsAndRelationships/view')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9P/FieldsAndRelationships/setHistoryTracking')

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_ProductVersion_Picklist'), 10)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/productversion_checkbox'))

WebUI.click(findTestObject('Login/Page_Home  Salesforce/save_picklist'))

WebUI.delay(5)

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9L/Details/view')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9L/FieldsAndRelationships/view')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9L/FieldsAndRelationships/setHistoryTracking')

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Patient_Picklist'), 10)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Patient_Checkbox'))

WebUI.click(findTestObject('Login/Page_Home  Salesforce/save_picklist'))

WebUI.delay(5)

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9H/Details/view')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9H/FieldsAndRelationships/view')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9H/FieldsAndRelationships/setHistoryTracking')

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Manufacturing_Picklist'), 10)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/manufacturing_Checkbox'))

WebUI.delay(5)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Manufacturing_2_Checkbox'))

WebUI.delay(5)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Manufacturing_3_Checkbox'))

WebUI.click(findTestObject('Login/Page_Home  Salesforce/save_picklist'))

WebUI.delay(5)

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9M/Details/view')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9M/FieldsAndRelationships/view')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9M/FieldsAndRelationships/setHistoryTracking')

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Process_Step_Template_Picklist'), 10)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Process_Picklist_1'))

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Process_Picklist_2'))

WebUI.click(findTestObject('Login/Page_Home  Salesforce/save_picklist'))

WebUI.delay(5)

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/SetupOneHome/home')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/EnhancedProfiles/home')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/EnhancedProfiles/page?address=%2F00e41000001g5ST')

WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/EnhancedProfiles/page?address=%2F00e41000001g5ST%2Fe%3FretURL%3D%252F00e41000001g5ST%253FappLayout%253Dsetup%2526tour%253D%2526isdtp%253Dp1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4qa.lightning.force.com%2526sfdcIFrameHost%253Dweb%2526nonce%253Db7661cb562f40e7db069bed34de02680fcc0d27c9834c380b718abaad52f52f9%2526ltn_app_id%253D06m41000001UkBgAAK%2526clc%253D1')

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_SysAdmin_Profile'), 10)

WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Tab_Hidden_profiles'), 8)

WebUI.selectOptionByIndex(findTestObject('Login/Page_Home  Salesforce/DD_AccountandprotocolAssignments'), 0)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Profiles_Save'))

