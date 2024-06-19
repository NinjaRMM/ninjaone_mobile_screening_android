package com.example.zeldaapp.errorsandvalidation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ErrorsAndValidationViewModel : ViewModel() {

    private val _email = MutableStateFlow("")
    val email: StateFlow<String> = _email
    fun updateEmail(newEmail: String) {
        _email.value = newEmail
    }

    private val _phone = MutableStateFlow("")
    val phone: StateFlow<String> = _phone
    fun updatePhone(newPhone: String) {
        _phone.value = newPhone
    }

    private val _mfaCode = MutableStateFlow("")
    val mfaCode: StateFlow<String> = _mfaCode
    fun updateMfaCode(newMfaCode: String) {
        _mfaCode.value = newMfaCode
    }

    // TODO: - Validate these three items using a custom Error type, and expose the validation result to the view.
    // E-mail: Must be in normal format such as username@domain.com
    // Phone: Must be exactly 10 digits. The user can enter hyphens, but any non-numerical chars can be removed.
    // MFA code: Must be exactly 6 digits.
    fun validate() {}

}