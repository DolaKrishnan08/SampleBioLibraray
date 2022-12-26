package com.krishnan.biolibrary

import android.hardware.biometrics.BiometricManager

object BioLibrary {

    fun checkBiometric(): Int {
        return BiometricManager.BIOMETRIC_SUCCESS
    }

}