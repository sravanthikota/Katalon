import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
/*
WebUI.acceptAlert()*/ //  WebUI.delay(3)
//WebUI.waitForElementPresent(null, 0)
// WebUI.delay(10)
//WebUI.waitForElementPresent(findTestObject('Login/Page_Home  Salesforce/TextBox1'),10)	
// WebUI.scrollToPosition(700, 400, FailureHandling.STOP_ON_FAILURE)
// WebUI.delay(5)
//WebUI.scrollToPosition(700, 400, FailureHandling.STOP_ON_FAILURE)
// WebUI.scrollToPosition(700, 400, FailureHandling.STOP_ON_FAILURE)
/*
    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/Details/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/PageLayouts/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/PageLayouts/00h410000067dULAAY/view')

    WebUI.delay(3)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_1_Edit'), 5)

    WebUI.delay(3)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'), 5)

    WebUI.delay(3)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_1_MobileBtn'))

    try {
    if (WebUI.verifyElementPresent('Login/Page_Home  Salesforce/Edit_dragdrop', 5)) {
        WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Edit'), findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'))
    }
}
catch (Exception e) {
} 

try {
    if (WebUI.verifyElementPresent('Login/Page_Home  Salesforce/Edit_already_Layout', 5)) {
        WebUI.click(findTestObject('Login/Page_Home  Salesforce/button_save'))
    }
}
catch (Exception e) {
} 
    WebUI.delay(3)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/PageLayouts/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/PageLayouts/00h410000067dUaAAI/view')

    WebUI.delay(3)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_2_Edit'), 5)

    WebUI.delay(3)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'), 5)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_2_MobileBtn'))

    WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Edit'), findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/button_save'))

    WebUI.delay(3)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/PageLayouts/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/PageLayouts/00h410000067dUbAAI/view')

    WebUI.delay(3)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_3_Edit'), 5)

    WebUI.delay(3)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'), 5)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_2_MobileBtn'))

    WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Edit'), findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/button_save'))

    WebUI.delay(3)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/PageLayouts/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/PageLayouts/00h410000067dUcAAI/view')

    WebUI.delay(3)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_4_Edit'), 5)

    WebUI.delay(3)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'), 5)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_2_MobileBtn'))

    WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Edit'), findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Save'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/button_save'))

    WebUI.delay(3)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/PageLayouts/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/PageLayouts/00h410000067dUdAAI/view')

    WebUI.delay(3)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_5_Edit'), 5)

    WebUI.delay(3)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'), 5)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_2_MobileBtn'))

    WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Edit'), findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9O/Details/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9O/PageLayouts/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9O/PageLayouts/00h410000067dUGAAY/view')

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Product_Order_1_Edit'), 5)

    WebUI.delay(3)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_SF'), 5)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_MobileBtn'))

    WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_EditBtn'), findTestObject('Login/Page_Home  Salesforce/Product_Order_1_SF'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Product_Order_Save'))

    WebUI.delay(3)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9O/PageLayouts/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9O/PageLayouts/00h410000067dUZAAY/view')

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Product_Order_1_Edit'), 5)

    WebUI.delay(3)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_SF'), 5)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_MobileBtn'))

    WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_EditBtn'), findTestObject('Login/Page_Home  Salesforce/Product_Order_1_SF'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Product_Order_Save'))

    WebUI.delay(5)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/SecuritySharing/home')

    WebUI.delay(3)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Sharing_Settings'), 5)

    WebUI.delay(5)

    WebUI.sendKeys(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases_SK'), 'cases')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases1_Delete'))

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases2_Delete'))

    WebUI.acceptAlert()

    WebUI.delay(5)

    WebUI.sendKeys(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases_SK'), 'Enrollment')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases1_Delete'))

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases2_Delete'))

    WebUI.acceptAlert()

    WebUI.delay(5)

    WebUI.sendKeys(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases_SK'), 'patient')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases1_Delete'))

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases2_Delete'))

    WebUI.acceptAlert()

    WebUI.delay(5)

    WebUI.sendKeys(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases_SK'), 'product order')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases1_Delete'))

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases2_Delete'))

    WebUI.acceptAlert()

    WebUI.delay(3)

    WebUI.sendKeys(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases_SK'), 'Treatment')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases1_Delete'))

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Sharing_Settings_Cases2_Delete'))

    WebUI.acceptAlert()
*/ import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.salesforce.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Username'))

WebUI.sendKeys(findTestObject('Login/Page_Home  Salesforce/Username'), 'kimpreet.kaur@juno.jist.r4ci')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Password'))

WebUI.sendKeys(findTestObject('Login/Page_Home  Salesforce/Password'), 'Deloitte.1')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Login'))

WebUI.waitForPageLoad(20)

try {
    if (WebUI.verifyElementClickable(findTestObject('Login/Page_Home  Salesforce/SwitchToLightning'))) {
        WebUI.click(findTestObject('Login/Page_Home  Salesforce/SwitchToLightning'))
    }
}
catch (Exception e) {
    WebUI.waitForElementPresent(findTestObject('Login/Page_Home  Salesforce/Btn_Settings_Setup'), 10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Btn_Settings_Setup'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Link_Setup'))

    WebUI.switchToWindowIndex(1)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Object manager'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/objectmanager_SearchBox'), 'case')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/Case/view')

    WebUI.click(findTestObject('Page_Case  Salesforce/a_Buttons Links and Actions'))

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/00b41000002XH6ZAAW/edit')

    WebUI.waitForElementPresent(findTestObject('Login/Page_Home  Salesforce/Iframe_NewPatient'), 10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_NewPatient'), 5)

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TextBox1'), 10)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/TextBox1'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox1'), 'https://juno--r4ci.cs24.my.salesforce.com/500/e?retURL=%2F500%2Fo&RecordType=01241000001QOcyAAG&ent=Case')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save1'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Page_Case  Salesforce/a_Buttons Links and Actions'))

    WebUI.click(findTestObject('Page_Case  Salesforce/a_Show More'))

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/00b41000002XH6aAAG/edit')

    WebUI.waitForElementPresent(findTestObject('Login/Page_Home  Salesforce/Iframe_NewProductOrder'), 10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_NewProductOrder'), 10)

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TextBox2'), 10)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/TextBox2'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox2'), 'https://juno--r4ci.cs24.my.salesforce.com/500/e?retURL=%2F500%2Fo&RecordType=01241000001QOczAAG&ent=Case')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save1'))

    WebUI.delay(8)

    WebUI.click(findTestObject('Page_Case  Salesforce/a_Buttons Links and Actions'))

    WebUI.click(findTestObject('Page_Case  Salesforce/a_Show More'))

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/00b41000002XH6bAAG/edit')

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_New_Treatment'), 10)

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TextBox3'), 10)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/TextBox3'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox3'), 'https://juno--r4ci.cs24.my.salesforce.com/500/e?retURL=%2F500%2Fo&RecordType=01241000001QOd0AAG&ent=Case')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save1'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Btn_Settings_Setup'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Link_Setup'))

    WebUI.switchToWindowIndex(2)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Setup_search'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/Setup_search'), 'custom label')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ExternalStrings/home')

    WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101%3FappLayout%3Dsetup%26ltn_app_id%3D06m41000001UkBgAAK%26sfdcIFrameHost%3Dweb%26clc%3D1%26sfdcIFrameOrigin%3Dhttps%253A%252F%252Fjuno--r4ci.lightning.force.com%26nonce%3D7365014ac0ccd6a8946f2a668d345d8fccb38bbb885d86cb473e634935bb533e%26tour%3D%26lsc%3D9%26retURL%3D%252Fsetup%252Fhome')

    WebUI.delay(5)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F10119000001ByXY%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4ci.lightning.force.com%2526nonce%253D7365014ac0ccd6a8946f2a668d345d8fccb38bbb885d86cb473e634935bb533e%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_CL_Celegene'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://juno--r4ci--c.cs24.content.force.com/servlet/servlet.ImageServer?id=01519000000Wvpp&oid=00D190000009Li0&lastMod=1546945353000')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F10119000001ByXq%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4ci.lightning.force.com%2526nonce%253D7365014ac0ccd6a8946f2a668d345d8fccb38bbb885d86cb473e634935bb533e%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_CL_Jn_Community_Apheresis'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://r4ci-r4ci.cs24.force.com/s/patient-detail-screen?')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F10119000001ByXr%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4ci.lightning.force.com%2526nonce%253Dad96157cc95043f3b7fa5b1e8bc938e01e4165be42b6bce4fa984f7bd538d62c%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_CL_Jn_Community'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://r4ci-r4ci.cs24.force.com/s/jn-aphpatientdetail?')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F1014100000NzMU8%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4ci.lightning.force.com%2526nonce%253Dad96157cc95043f3b7fa5b1e8bc938e01e4165be42b6bce4fa984f7bd538d62c%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Dataloader_UserID'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), '00541000006392EAAQ')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F1014100000NzMV6%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4ci.lightning.force.com%2526nonce%253Dad96157cc95043f3b7fa5b1e8bc938e01e4165be42b6bce4fa984f7bd538d62c%2526lsc%253D9%2526tour%253D%2526lsr%253D200%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Integration_UserID'), 10)

    WebUI.delay(5)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), '00541000005Gm7GAAS')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F1014100000NzMVH%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4ci.lightning.force.com%2526nonce%253Dad96157cc95043f3b7fa5b1e8bc938e01e4165be42b6bce4fa984f7bd538d62c%2526lsc%253D9%2526tour%253D%2526lsr%253D200%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Jn_LightningBaseURL'), 10)

    WebUI.delay(5)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://juno--r4ci.lightning.force.com')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F10119000001ByZC%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4ci.lightning.force.com%2526nonce%253Dad96157cc95043f3b7fa5b1e8bc938e01e4165be42b6bce4fa984f7bd538d62c%2526lsc%253D9%2526tour%253D%2526lsr%253D200%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Jn_MNCQueryId'), 10)

    WebUI.delay(5)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'a3x190000005GBlAAM')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F10119000001ByZP%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4ci.lightning.force.com%2526nonce%253Dad96157cc95043f3b7fa5b1e8bc938e01e4165be42b6bce4fa984f7bd538d62c%2526lsc%253D9%2526tour%253D%2526lsr%253D200%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Jn_OrgLink'), 10)

    WebUI.delay(5)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://r4ci-r4ci.cs24.force.com')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(5)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/home')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00X%3FappLayout%3Dsetup%26ltn_app_id%3D06m41000001UkBgAAK%26setupid%3DCommunicationTemplatesEmail%26sfdcIFrameHost%3Dweb%26clc%3D1%26sfdcIFrameOrigin%3Dhttps%253A%252F%252Fjuno--r4ci.lightning.force.com%26nonce%3Dad96157cc95043f3b7fa5b1e8bc938e01e4165be42b6bce4fa984f7bd538d62c%26tour%3D%26lsc%3D9%26retURL%3D%252Fsetup%252Fhome')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00X19000000XBsO%3Fsetupid%3DCommunicationTemplatesEmail')

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_JN_New_Member_Welcome_Email'), 10)

    WebUI.delay(5)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/New_Member_Welcome_Email_Edit'))

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Email_Jn_New_Member'), 5)

    WebUI.delay(5)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Txtbox_New_Member_welcome'), 5)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/Txtbox_New_Member_welcome'), findTestData('New Test Data_R4QA_1').getValue(
            1, 2))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save_New_Member_Welcome'))

    WebUI.delay(5)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/home')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00X%3FappLayout%3Dsetup%26ltn_app_id%3D06m41000001UkBgAAK%26setupid%3DCommunicationTemplatesEmail%26sfdcIFrameHost%3Dweb%26clc%3D1%26sfdcIFrameOrigin%3Dhttps%253A%252F%252Fjuno--r4ci.lightning.force.com%26nonce%3Dad96157cc95043f3b7fa5b1e8bc938e01e4165be42b6bce4fa984f7bd538d62c%26tour%3D%26lsc%3D9%26retURL%3D%252Fsetup%252Fhome')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00X19000000XBsN%3Fsetupid%3DCommunicationTemplatesEmail')

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_ForgotUserName'), 10)

    WebUI.delay(5)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/ForgotUserName_EditBtn'))

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_ForgotUserName_TxtBox'), 5)

    WebUI.delay(5)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TextBox_ForgotUserName'), 5)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox_ForgotUserName'), findTestData('New Test Data_R4QA_2').getValue(
            1, 2))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save_ForgotUserName'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9D/Details/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9D/FieldsAndRelationships/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9D/FieldsAndRelationships/page?address=%2F00N19000002omZr%2Fe%3FretURL%3D%252Fsetup%252FObjectManager%252F01I41000003ag9D%252FFieldsAndRelationships%252Fview')

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_FormAndLabel'), 10)

    WebUI.delay(5)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TxtBox_FormAndLabel'), 5)

    WebUI.delay(3)

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TxtBox_FormAndLabel'), '\'https://r4ci-r4ci.cs24.force.com/sfc/servlet.shepherd/document/download/\'+RIGHT(JN_Document_Link__c,18)+\'?operationContext=S1\'')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save_FormAndLabel'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/Details/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/FieldsAndRelationships/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9T/FieldsAndRelationships/setHistoryTracking')

    //WebElement checkbox = driver.findElement(By.id('00N4100000dkZDg_fht'))
    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_Picklist'), 10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/treatment_Checkbox'))

    //If the checkbox is unchecked then isSelected() will return false
    //and NOT of false is true, hence we can click on checkbox
    //if (!(checkbox.isSelected())) {
    //  checkbox.click()
    WebUI.click(findTestObject('Login/Page_Home  Salesforce/save_picklist'))

    WebUI.delay(5)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9P/Details/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9P/FieldsAndRelationships/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9P/FieldsAndRelationships/setHistoryTracking')

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_ProductVersion_Picklist'), 10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/productversion_checkbox'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/save_picklist'))

    WebUI.delay(5)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9L/Details/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9L/FieldsAndRelationships/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9L/FieldsAndRelationships/setHistoryTracking')

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Patient_Picklist'), 10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Patient_Checkbox'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/save_picklist'))

    WebUI.delay(5)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9H/Details/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9H/FieldsAndRelationships/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9H/FieldsAndRelationships/setHistoryTracking')

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Manufacturing_Picklist'), 10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/manufacturing_Checkbox'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Manufacturing_2_Checkbox'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Manufacturing_3_Checkbox'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/save_picklist'))

    WebUI.delay(5)

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9M/Details/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9M/FieldsAndRelationships/view')

    WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9M/FieldsAndRelationships/setHistoryTracking')

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Process_Step_Template_Picklist'), 10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Process_Picklist_1'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Process_Picklist_2'))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/save_picklist'))

   /* WebUI.navigateToUrl('https://juno--r4ci.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9M/FieldsAndRelationships/00N4100000dkZAV/view')

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_ExecutionStatus_Picklist'), 10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Ibtrans_Deactivate_Picklist'))

    WebUI.acceptAlert()

    WebUI.delay(10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Ibtrans_Deactivate_Picklist'))

    WebUI.acceptAlert()
*/
    WebUI.closeBrowser()
} 

