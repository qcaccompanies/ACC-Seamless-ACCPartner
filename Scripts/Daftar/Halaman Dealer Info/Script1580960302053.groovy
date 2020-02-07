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

Mobile.tap(findTestObject('VerifikasiDaftar/button_dealer_info'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/tap_jalan'), 0)

Mobile.clearText(findTestObject('VerifikasiDaftar/clear_jalan'), 0)

Mobile.setText(findTestObject('VerifikasiDaftar/input_jalan'), var_jalan, 0)

Mobile.tap(findTestObject('VerifikasiDaftar/tap_kode_pos'), 0)

Mobile.clearText(findTestObject('VerifikasiDaftar/clear_kode_pos'), 0)

Mobile.setText(findTestObject('VerifikasiDaftar/input_kode_pos'), var_kode_pos, 0)

Mobile.tap(findTestObject('VerifikasiDaftar/tap_input_kode_pos'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/tap_kelurahan'), 0)

Mobile.clearText(findTestObject('VerifikasiDaftar/clear_kelurahan'), 0)

Mobile.setText(findTestObject('VerifikasiDaftar/input_kelurahan'), var_kelurahan, 0)

Mobile.tap(findTestObject('VerifikasiDaftar/tap_input_kelurahan'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/tap_kecamatan'), 0)

Mobile.clearText(findTestObject('VerifikasiDaftar/clear_kecamatan'), 0)

Mobile.setText(findTestObject('VerifikasiDaftar/input_kecamatan'), var_kecamatan, 0)

Mobile.tap(findTestObject('VerifikasiDaftar/tap_kota'), 0)

Mobile.clearText(findTestObject('VerifikasiDaftar/clear_kota'), 0)

Mobile.setText(findTestObject('VerifikasiDaftar/input_kota'), var_kota, 0)

Mobile.tap(findTestObject('VerifikasiDaftar/tap_provinsi'), 0)

Mobile.clearText(findTestObject('VerifikasiDaftar/clear_provinsi'), 0)

Mobile.setText(findTestObject('VerifikasiDaftar/input_provinsi'), var_provinsi, 0)

Mobile.tap(findTestObject('VerifikasiDaftar/tap_input_provinsi'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/warn - Panjang karakter Nama Jalan harus diantara 3 sampai 100'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/warn - Nama jalan harus diisi'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/warn - Kode Pos harus diisi'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/warn - Kelurahan harus diisi'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/warn - Kecamatan harus diisi'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/warn - Kota harus diisi'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/warn - Provinsi harus diisi'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/button_daftar'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/warn - Verifikasi untuk Keamanan'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/button_verifikasi'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/warn - Kode Verifikasi Anda salah'), 0)

Mobile.tap(findTestObject('VerifikasiDaftar/warn - Semua Field Harus Diisi'), 0)

Mobile.closeApplication()

