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

WebUI.click(findTestObject('Page_iad - Vente achat location maison appa_3091d3/a_Estimer'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/label_Maison  Villa'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Ce champ est requis_estimate-fake-address'), 
    '20 rue grande')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Ce champ est requis_estimate-fake-zipcode'))

WebUI.doubleClick(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Ce champ est requis_estimate-fake-zipcode'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Etape suivante'))

WebUI.doubleClick(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/span_'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/span_'))

WebUI.doubleClick(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/span_'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/span_-'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Qualit Emplacement_estimate_my_houseQ_965f87'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Standing_estimate_my_houseStanding'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/label_Mitoyennet'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Etape suivante_1'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Ce champ est obligatoire_estimate_my__221e16'), 
    '50')

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Ce champ est obligatoire_estimate_my__9cccbb'), 
    '0')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Etape suivante_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Gros uvre_estimate_my_houseEtatMursEx_4dd27d'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_nergie_estimate_my_houseEtatInstallat_6b429c'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Revtement_estimate_my_houseEtatCouverture'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Isolation_estimate_my_houseEtatIsolation'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Etape suivante_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/label_Madame'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Ce champ est requis_estimate_my_house_1b6174'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Ce champ est requis_estimate_my_house_4f3ae5'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_Vous tes'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Ce champ est requis_estimate_my_house_cd6f79'), 
    '0101010101')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/label_Propritaire'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/label_Dans trois mois'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Lorsque vous avez termin cliquez sur le bouton de validation_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Lorsque vous avez termin cliquez sur le bouton de validation_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Lorsque vous avez termin cliquez sur le bouton de validation_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Valider'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_Lorsque vous avez termin cliquez sur le_83aa4e'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Valider'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_Slectionnez toutes les images montrant _949fdd'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Valider'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_Lorsque vous avez termin cliquez sur le_83aa4e_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_Lorsque vous avez termin cliquez sur le_83aa4e_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_Lorsque vous avez termin cliquez sur le_83aa4e'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Valider'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Lorsque vous avez termin cliquez sur le_38e283_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Lorsque vous avez termin cliquez sur le_38e283_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Lorsque vous avez termin cliquez sur le_38e283_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Valider'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_Lorsque vous avez termin cliquez sur le_83aa4e_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Valider'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Ignorer'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Suivant'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_concat(S  il n  y en a aucune cliquez s_6e9196'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_concat(S  il n  y en a aucune cliquez s_6e9196_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Suivant'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1_2'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1_2'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_Suivant'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Suivant'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Valider'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Dcouvrir mon estimation'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/div_undefined   undefined             Indic_78f855'))

