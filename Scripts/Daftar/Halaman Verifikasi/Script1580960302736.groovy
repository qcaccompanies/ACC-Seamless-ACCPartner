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

Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Verifikasi untuk Keamanan'), 0)

if (status_verifikasi == 'normal') {
    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Daftar/new/input_otp_1'), var_otp_1, 0)

    Mobile.setText(findTestObject('Daftar/new/input_otp_2'), var_otp_2, 0)

    Mobile.setText(findTestObject('Daftar/new/input_otp_3'), var_otp_3, 0)

    Mobile.setText(findTestObject('Daftar/new/input_otp_4'), var_otp_4, 0)

    Mobile.setText(findTestObject('Daftar/new/input_otp_5'), var_otp_5, 0)

    Mobile.setText(findTestObject('Daftar/new/input_otp_6'), var_otp_6, 0)

    Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/button_verifikasi'), 0)

    switch (expected_verifikasi) {
        case 'passed':
            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

            Mobile.verifyElementNotVisible(findTestObject('Daftar/a - VerifikasiDaftar/button_verifikasi'), 0)

            Mobile.waitForElementPresent(findTestObject('Login/tap_username'), 5)

            Mobile.tap(findTestObject('Login/tap_username'), 0)

            Mobile.setText(findTestObject('Login/input_username'), var_username, 0)

            Mobile.tap(findTestObject('Login/tap_password'), 0)

            Mobile.setText(findTestObject('Login/input_password'), var_password, 0)

            Mobile.tap(findTestObject('Login/button_masuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Login/warn - Hi after login'), 0)

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            break
        case 'failed':
            Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Kode Verifikasi Anda salah'), 
                0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Semua Field Harus Diisi'), 0, 
                FailureHandling.OPTIONAL)

            break
    }
} else if (status_verifikasi == 'kirim_ulang') {
    switch (expected_verifikasi) {
        case 'passed':
            Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap - Kirim ulang (03)'), 0, FailureHandling.OPTIONAL)

            Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap - Kirim ulang (13)'), 0, FailureHandling.OPTIONAL)

            Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap - Kirim ulang (23)'), 0, FailureHandling.OPTIONAL)

            Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap - Kirim ulang (33)'), 0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - 00 29'), 0, FailureHandling.OPTIONAL)

            break
        case 'failed':
            Mobile.verifyElementNotVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - 00 29'), 0, FailureHandling.OPTIONAL)

            break
    }
} else if (status_verifikasi == '3_kali_kirim_ulang') {
    switch (expected_verifikasi) {
        case 'passed':
            Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap - Kirim ulang (03)'), 0)

            Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap - Kirim ulang (13)'), 0)

            Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap - Kirim ulang (23)'), 0)

            Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap - Kirim ulang (33)'), 0)

            Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Recaptcha memerlukan verifikasi. Saya bukan robot'), 
                0)

            break
        case 'failed':
            Mobile.verifyElementNotVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Recaptcha memerlukan verifikasi. Saya bukan robot'), 
                0)

            break
    }
}

