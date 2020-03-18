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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://preprod.iadfrance.fr/')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_PRESTIGE'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Estimer'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Vendre'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Louer'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Acheter'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Action'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/li_Acheter'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Surface minmax'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Min _surface_min'), 
    '50')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Pice(s)'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/li_3 pices'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Type(s) de bien'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/li_Maison'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_Recherche                              _82a000'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Prix minmax'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Min _price_min'), 
    '120000')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Surface dcroissant_img-holder'))

WebUI.closeBrowser()

