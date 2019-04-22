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

/*
WebUI.acceptAlert()*/
try {
    if (WebUI.verifyElementClickable(findTestObject('Login/Page_Home  Salesforce/SwitchToLightning'))) {
        WebUI.click(findTestObject('Login/Page_Home  Salesforce/SwitchToLightning'))
    }
}
catch (Exception e) {
    WebUI.waitForElementPresent(findTestObject('Login/Page_Home  Salesforce/Btn_Settings_Setup'), 10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Btn_Settings_Setup'))

    //  WebUI.delay(3)
    //WebUI.waitForElementPresent(null, 0)
    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Link_Setup'))

    WebUI.switchToWindowIndex(1)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Object manager'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/objectmanager_SearchBox'), 'case')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/Case/view')

    WebUI.click(findTestObject('Page_Case  Salesforce/a_Buttons Links and Actions'))

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/00b41000002XH6ZAAW/edit')

    // WebUI.delay(10)
    WebUI.waitForElementPresent(findTestObject('Login/Page_Home  Salesforce/Iframe_NewPatient'), 10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_NewPatient'), 5)

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TextBox1'), 10)

    //WebUI.waitForElementPresent(findTestObject('Login/Page_Home  Salesforce/TextBox1'),10)	
    // WebUI.scrollToPosition(700, 400, FailureHandling.STOP_ON_FAILURE)
    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/TextBox1'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox1'), 'https://juno--r4qa.lightning.force.com/500/e?retURL=%2F500%2Fo&RecordType=01241000001QOcyAAG&ent=Case')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save1'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Page_Case  Salesforce/a_Buttons Links and Actions'))

    WebUI.click(findTestObject('Page_Case  Salesforce/a_Show More'))

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/00b41000002XH6aAAG/edit')

    // WebUI.delay(5)
    WebUI.waitForElementPresent(findTestObject('Login/Page_Home  Salesforce/Iframe_NewProductOrder'), 10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_NewProductOrder'), 10)

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TextBox2'), 10)

    //WebUI.scrollToPosition(700, 400, FailureHandling.STOP_ON_FAILURE)
    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/TextBox2'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox2'), 'https://juno--r4qa.lightning.force.com/500/e?retURL=%2F500%2Fo&RecordType=01241000001QOczAAG&ent=Case')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save1'))

    WebUI.delay(8)

    WebUI.click(findTestObject('Page_Case  Salesforce/a_Buttons Links and Actions'))

    WebUI.click(findTestObject('Page_Case  Salesforce/a_Show More'))

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/00b41000002XH6bAAG/edit')

    WebUI.delay(8)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_New_Treatment'), 10)

    WebUI.delay(10)

    // WebUI.scrollToPosition(700, 400, FailureHandling.STOP_ON_FAILURE)
    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TextBox3'), 10)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/TextBox3'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox3'), 'https://juno--r4qa.lightning.force.com/500/e?retURL=%2F500%2Fo&RecordType=01241000001QOd0AAG&ent=Case')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save1'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Btn_Settings_Setup'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Link_Setup'))

    WebUI.switchToWindowIndex(2)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Setup_search'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/Setup_search'), 'custom label')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ExternalStrings/home')

    WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101%3FappLayout%3Dsetup%26ltn_app_id%3D06m41000001UkBgAAK%26sfdcIFrameHost%3Dweb%26clc%3D1%26sfdcIFrameOrigin%3Dhttps%253A%252F%252Fjuno--r4qa.lightning.force.com%26nonce%3Dc7a662a5ca0d7e925eb7ced091993b7d28d980d911bf1d4a6664ee2221eed25d%26tour%3D%26lsc%3D9%26retURL%3D%252Fsetup%252Fhome')

    WebUI.delay(5)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101540000016PXZ%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4qa.lightning.force.com%2526nonce%253Dac1b2682af964b45ad05ec101a6b533ca26541b7b4abebf76de08b72a2a505df%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_CL_Celegene'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://juno--r4qa--c.cs40.content.force.com/servlet/servlet.ImageServer?id=01554000000PTAD&oid=00D540000000dYN&lastMod=1547029523000')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101540000016PXr%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4qa.lightning.force.com%2526nonce%253Dc7a662a5ca0d7e925eb7ced091993b7d28d980d911bf1d4a6664ee2221eed25d%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_CL_Jn_Community_Apheresis'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://r4qa-r3dryrun.cs40.force.com/s/jn-aphpatientdetail?')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101540000016PXs%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4qa.lightning.force.com%2526nonce%253D7542aeb4f93b0d6378659b1db400a5802ffad51b427ca4316f71b47c1d275fa2%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_CL_Jn_Community'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://r4qa-r3dryrun.cs40.force.com/s/patient-detail-screen?')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F1014100000NzMU8%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4qa.lightning.force.com%2526nonce%253D7542aeb4f93b0d6378659b1db400a5802ffad51b427ca4316f71b47c1d275fa2%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Dataloader_UserID'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), '00541000006392EAAQ')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F1014100000NzMV6%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4qa.lightning.force.com%2526nonce%253D87b4a789765116251e2ff0eaa64fc68359a4b8f597ba93c5f234ddba470a089e%2526lsc%253D9%2526tour%253D%2526lsr%253D150%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Integration_UserID'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), '005410000063929AAA')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F1014100000NzMVH%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526lsr%253D300%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4qa.lightning.force.com%2526nonce%253D87b4a789765116251e2ff0eaa64fc68359a4b8f597ba93c5f234ddba470a089e%2526lsc%253D9%2526tour%253D%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Jn_LightningBaseURL'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://juno--r4qa.lightning.force.com/')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101540000016PZE%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526lsr%253D300%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4qa.lightning.force.com%2526nonce%253D87b4a789765116251e2ff0eaa64fc68359a4b8f597ba93c5f234ddba470a089e%2526lsc%253D9%2526tour%253D%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Jn_MNCQueryId'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'a3x54000000Qo92AAC')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101540000016PZR%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526ltn_app_id%253D06m41000001UkBgAAK%2526sfdcIFrameHost%253Dweb%2526lsr%253D300%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r4qa.lightning.force.com%2526nonce%253D87b4a789765116251e2ff0eaa64fc68359a4b8f597ba93c5f234ddba470a089e%2526lsc%253D9%2526tour%253D%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1')

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Jn_OrgLink'), 5)

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://r4qa-r3dryrun.cs40.force.com/')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

    WebUI.delay(5)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/home')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00X%3FappLayout%3Dsetup%26ltn_app_id%3D06m41000001UkBgAAK%26setupid%3DCommunicationTemplatesEmail%26sfdcIFrameHost%3Dweb%26clc%3D1%26sfdcIFrameOrigin%3Dhttps%253A%252F%252Fjuno--r4qa.lightning.force.com%26nonce%3D6df026f6f0f66bed8502dc56829d63be84670e22b810abeab77ae2b0e6c829c3%26tour%3D%26lsc%3D9%26retURL%3D%252Fsetup%252Fhome')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00X54000000axWz%3Fsetupid%3DCommunicationTemplatesEmail')

    WebUI.delay(5)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_JN_New_Member_Welcome_Email'), 5)

    WebUI.delay(5)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/New_Member_Welcome_Email_Edit'))

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Email_Jn_New_Member'), 10)

    WebUI.delay(10)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Txtbox_New_Member_welcome'), 10)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/Txtbox_New_Member_welcome'), findTestData('New Test Data_R4QA_1').getValue(
            1, 1))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save_New_Member_Welcome'))

    WebUI.delay(5)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/home')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00X%3FappLayout%3Dsetup%26ltn_app_id%3D06m41000001UkBgAAK%26setupid%3DCommunicationTemplatesEmail%26sfdcIFrameHost%3Dweb%26clc%3D1%26sfdcIFrameOrigin%3Dhttps%253A%252F%252Fjuno--r4qa.lightning.force.com%26nonce%3D6df026f6f0f66bed8502dc56829d63be84670e22b810abeab77ae2b0e6c829c3%26tour%3D%26lsc%3D9%26retURL%3D%252Fsetup%252Fhome')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00X54000000axWy%3Fsetupid%3DCommunicationTemplatesEmail')

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_ForgotUserName'), 10)

    WebUI.delay(3)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/ForgotUserName_EditBtn'))

    WebUI.delay(10)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_ForgotUserName_TxtBox'), 10)

    WebUI.delay(5)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TextBox_ForgotUserName'), 5)

    WebUI.delay(3)

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox_ForgotUserName'), findTestData('New Test Data_R4QA_2').getValue(
            1, 1))

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save_ForgotUserName'))

    WebUI.delay(2)

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9D/Details/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9D/FieldsAndRelationships/view')

    WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9D/FieldsAndRelationships/page?address=%2F00N54000002SOhb%2Fe%3FretURL%3D%252Fsetup%252FObjectManager%252F01I41000003ag9D%252FFieldsAndRelationships%252Fview')

    WebUI.delay(8)

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_FormAndLabel'), 5)

    WebUI.delay(3)

    WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TxtBox_FormAndLabel'), 5)

    WebUI.delay(3)

    WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TxtBox_FormAndLabel'), '\'https://r4qa-r3dryrun.cs40.force.com/sfc/servlet.shepherd/document/download/\'+RIGHT(JN_Document_Link__c,18)+\'?operationContext=S1\'')

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save_FormAndLabel'))

    WebUI.delay(2 /*
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
*/ )

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

    /* WebUI.navigateToUrl('https://juno--r4qa.lightning.force.com/lightning/setup/ObjectManager/01I41000003ag9M/FieldsAndRelationships/00N4100000dkZAV/view')

    WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_ExecutionStatus_Picklist'), 10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Ibtrans_Deactivate_Picklist'))

    WebUI.acceptAlert()

    WebUI.delay(10)

    WebUI.click(findTestObject('Login/Page_Home  Salesforce/Ibtrans_Deactivate_Picklist'))

    WebUI.acceptAlert()
*/
    WebUI.closeBrowser()
} 

