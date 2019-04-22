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

WebUI.sendKeys(findTestObject('Login/Page_Home  Salesforce/Username'), 'npaliwal@juno.jist.r3qa')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Password'))

WebUI.sendKeys(findTestObject('Login/Page_Home  Salesforce/Password'), 'Ciitdc#1234')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Login'))

WebUI.delay(20)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Btn_Settings_Setup'))

WebUI.delay(3)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Link_Setup'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Object manager'))

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/objectmanager_SearchBox'), 'case')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/Case/Details/view?0.source=alohaHeader')

WebUI.click(findTestObject('Page_Case  Salesforce/a_Buttons Links and Actions'))

WebUI.click(findTestObject('Page_Case  Salesforce/a_Show More'))

WebUI.click(findTestObject('Page_Case  Salesforce/div_Edit'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_NewPatient'), 5)

WebUI.delay(5)

WebUI.scrollToPosition(700, 400, FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/TextBox1'))

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox1'), 'https://juno--r3qa.cs20.my.salesforce.com/500/e?retURL=%2F500%2Fo&RecordType=012m0000000DIso&ent=Case')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save1'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Case  Salesforce/a_Buttons Links and Actions'))

WebUI.click(findTestObject('Page_Case  Salesforce/a_Show More'))

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/00bm0000000MnLGAA0/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/00bm0000000MnLG/edit?0.source=alohaHeader')

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_NewProductOrder'), 5)

WebUI.delay(5)

WebUI.scrollToPosition(700, 400, FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/TextBox2'))

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox2'), 'https://juno--r3qa.cs20.my.salesforce.com/500/e?retURL=%2F500%2Fo&RecordType=012m0000000DIsr&ent=Case')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save1'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Case  Salesforce/a_Buttons Links and Actions'))

WebUI.click(findTestObject('Page_Case  Salesforce/a_Show More'))

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/00bm0000000MnLHAA0/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/Case/ButtonsLinksActions/00bm0000000MnLH/edit?0.source=alohaHeader')

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_New_Treatment'), 5)

WebUI.delay(5)

WebUI.scrollToPosition(700, 400, FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/TextBox3'))

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox3'), 'https://juno--r3qa.cs20.my.salesforce.com/500/e?retURL=%2F500%2Fo&RecordType=012m0000000DIss&ent=Case')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save1'))

WebUI.delay(5)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Btn_Settings_Setup'))

WebUI.delay(5)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Link_Setup'))

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Setup_search'))

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/Setup_search'), 'custom label')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ExternalStrings/home?0.source=alohaHeader')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101m0000000dN6W%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r3qa.lightning.force.com%2526nonce%253De3dec033c82fed33e2a58ea20b9d71e18bc3adce6a82ee360eed637165da6298%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1&0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101m0000000dN6W%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r3qa.lightning.force.com%2526nonce%253Db67ddeedee0808f2bdb8c8781b14f55b0842d5d5e53fcb243c584177a80cf4bf%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1&0.source=alohaHeader')

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_CL_Celegene'), 5)

WebUI.delay(3)

WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://juno--r3qa--c.cs20.content.force.com/servlet/servlet.ImageServer?id=015m0000001aCbf&oid=00Dm0000000DB2z&lastMod=1533190722000')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

WebUI.delay(2)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101m0000000dN6X%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r3qa.lightning.force.com%2526nonce%253Db67ddeedee0808f2bdb8c8781b14f55b0842d5d5e53fcb243c584177a80cf4bf%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1&0.source=alohaHeader')

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_CL_Jn_Community_Apheresis'), 5)

WebUI.delay(3)

WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://r3qa-providerqa.cs20.force.com/s/jn-aphpatientdetail?')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

WebUI.delay(2)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101m0000000dN6Y%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r3qa.lightning.force.com%2526nonce%253D4f45bc67a4d9b707295707427c20ad018f5d1ad36c64b7e5a4ae5c6b01ecb118%2526tour%253D%2526lsc%253D9%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1&0.source=alohaHeader')

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_CL_Jn_Community'), 5)

WebUI.delay(3)

WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://r3qa-providerqa.cs20.force.com/s/patient-detail-screen?')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

WebUI.delay(2)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F1011F000000ULQG%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526sfdcIFrameHost%253Dweb%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r3qa.lightning.force.com%2526nonce%253D4f45bc67a4d9b707295707427c20ad018f5d1ad36c64b7e5a4ae5c6b01ecb118%2526lsc%253D9%2526tour%253D%2526lsr%253D200%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1&0.source=alohaHeader')

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Jn_LightningBaseURL'), 5)

WebUI.delay(3)

WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://juno--r3qa.lightning.force.com/')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

WebUI.delay(2)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101m0000000eDXh%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526sfdcIFrameHost%253Dweb%2526lsr%253D200%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r3qa.lightning.force.com%2526nonce%253Ddc850b0c569ed9b1f2617437914e0eee462b7d49623121ff81a8810182ff9bb4%2526lsc%253D9%2526tour%253D%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1&0.source=alohaHeader')

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Jn_MNCQueryId'), 5)

WebUI.delay(3)

WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'a3xm00000000dhQAAQ')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

WebUI.delay(2)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ExternalStrings/page?address=%2F101m0000000dN6d%2Fe%3FretURL%3D%252F101%253FappLayout%253Dsetup%2526sfdcIFrameHost%253Dweb%2526lsr%253D200%2526clc%253D1%2526sfdcIFrameOrigin%253Dhttps%25253A%25252F%25252Fjuno--r3qa.lightning.force.com%2526nonce%253Ddc850b0c569ed9b1f2617437914e0eee462b7d49623121ff81a8810182ff9bb4%2526lsc%253D9%2526tour%253D%2526retURL%253D%25252Fsetup%25252Fhome%2526isdtp%253Dp1&0.source=alohaHeader')

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Jn_OrgLink'), 5)

WebUI.delay(3)

WebUI.clearText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'))

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/CL_Textbox'), 'https://r3qa-providerqa.cs20.force.com')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/CL_Save'))

WebUI.delay(5)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/home?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00X%3FappLayout%3Dsetup%26setupid%3DCommunicationTemplatesEmail%26sfdcIFrameHost%3Dweb%26clc%3D1%26sfdcIFrameOrigin%3Dhttps%253A%252F%252Fjuno--r3qa.lightning.force.com%26nonce%3D186007123060079e77ac28993b265444f835c9136012f9fbc2dad32db9f573ec%26tour%3D%26lsc%3D9%26retURL%3D%252Fsetup%252Fhome&0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00Xm0000000EDkg%3Fsetupid%3DCommunicationTemplatesEmail&0.source=alohaHeader')

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_JN_New_Member_Welcome_Email'), 5)

WebUI.delay(3)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/New_Member_Welcome_Email_Edit'))

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Email_Jn_New_Member'), 3)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Txtbox_New_Member_welcome'), 5)

WebUI.delay(3)

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/Txtbox_New_Member_welcome'), findTestData('New Test Data').getValue(
        1, 1))

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save_New_Member_Welcome'))

WebUI.delay(5)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/home?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00X%3FappLayout%3Dsetup%26setupid%3DCommunicationTemplatesEmail%26sfdcIFrameHost%3Dweb%26clc%3D1%26sfdcIFrameOrigin%3Dhttps%253A%252F%252Fjuno--r3qa.lightning.force.com%26nonce%3D0a200c0929353b76a61100425a841cd68d03166c6a4b4f2b9303226988127f2e%26tour%3D%26lsc%3D9%26retURL%3D%252Fsetup%252Fhome&0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/CommunicationTemplatesEmail/page?address=%2F00Xm0000000ECvY%3Fsetupid%3DCommunicationTemplatesEmail&0.source=alohaHeader')

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_ForgotUserName'), 5)

WebUI.delay(3)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/ForgotUserName_EditBtn'))

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_ForgotUserName_TxtBox'), 3)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TextBox_ForgotUserName'), 5)

WebUI.delay(3)

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TextBox_ForgotUserName'), findTestData('New Test Data2').getValue(
        1, 1))

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save_ForgotUserName'))

WebUI.delay(2)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMZ/Details/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMZ/FieldsAndRelationships/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMZ/FieldsAndRelationships/page?address=%2F00Nm0000002BLqp%2Fe%3FretURL%3D%252Fsetup%252FObjectManager%252F01I1F0000001PMZ%252FFieldsAndRelationships%252Fview&0.source=alohaHeader')

WebUI.delay(8)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_FormAndLabel'), 5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/TxtBox_FormAndLabel'), 5)

WebUI.delay(3)

WebUI.setText(findTestObject('Login/Page_Home  Salesforce/TxtBox_FormAndLabel'), '\'https://r3qa-providerqa.cs20.force.com/sfc/servlet.shepherd/document/download/\'+RIGHT(JN_Document_Link__c,18)+\'?operationContext=S1\'')

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Save_FormAndLabel'))

WebUI.delay(2)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMu/Details/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMu/PageLayouts/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMu/PageLayouts/00h1F000000IGAvQAO/view?0.source=alohaHeader')

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_1_Edit'), 5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'), 5)

WebUI.delay(3)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_1_MobileBtn'))

WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Edit'), findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'))

WebUI.click(findTestObject('Page_Treatment  Salesforce/button_Save'))

WebUI.delay(3)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMu/PageLayouts/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMu/PageLayouts/00h1F000000IGBKQA4/view?0.source=alohaHeader')

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_2_Edit'), 5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'), 5)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_2_MobileBtn'))

WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Edit'), findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'))

WebUI.click(findTestObject('Page_Treatment  Salesforce/button_Save'))

WebUI.delay(3)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMu/PageLayouts/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMu/PageLayouts/00h1F000000IGBLQA4/view?0.source=alohaHeader')

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_3_Edit'), 5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'), 5)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_2_MobileBtn'))

WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Edit'), findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'))

WebUI.click(findTestObject('Page_Treatment  Salesforce/button_Save'))

WebUI.delay(3)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMu/PageLayouts/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMu/PageLayouts/00h1F000000IGBMQA4/view?0.source=alohaHeader')

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_4_Edit'), 5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'), 5)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_2_MobileBtn'))

WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Edit'), findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'))

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Save'))

WebUI.click(findTestObject('Page_Treatment  Salesforce/button_Save'))

WebUI.delay(3)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMu/PageLayouts/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMu/PageLayouts/00h1F000000IGBNQA4/view?0.source=alohaHeader')

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Treatment_5_Edit'), 5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'), 5)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_2_MobileBtn'))

WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Edit'), findTestObject('Login/Page_Home  Salesforce/Treatment_1_SF'))

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Treatment_1_Save'))

WebUI.delay(2)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMp/Details/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMp/PageLayouts/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMp/PageLayouts/00h1F000000IGAqQAO/view?0.source=alohaHeader')

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Product_Order_1_Edit'), 5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_SF'), 5)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_MobileBtn'))

WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_EditBtn'), findTestObject('Login/Page_Home  Salesforce/Product_Order_1_SF'))

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Product_Order_Save'))

WebUI.delay(3)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMp/PageLayouts/view?0.source=alohaHeader')

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/ObjectManager/01I1F0000001PMp/PageLayouts/00h1F000000IGBJQA4/view?0.source=alohaHeader')

WebUI.switchToFrame(findTestObject('Login/Page_Home  Salesforce/Iframe_Product_Order_1_Edit'), 5)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_SF'), 5)

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_MobileBtn'))

WebUI.dragAndDropToObject(findTestObject('Login/Page_Home  Salesforce/Product_Order_1_EditBtn'), findTestObject('Login/Page_Home  Salesforce/Product_Order_1_SF'))

WebUI.click(findTestObject('Login/Page_Home  Salesforce/Product_Order_Save'))

WebUI.delay(5)

WebUI.navigateToUrl('https://juno--r3qa.lightning.force.com/lightning/setup/SecuritySharing/home?0.source=alohaHeader')

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

