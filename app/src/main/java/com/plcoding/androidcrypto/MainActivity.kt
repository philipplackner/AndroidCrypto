package com.plcoding.androidcrypto

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import com.plcoding.androidcrypto.ui.theme.AndroidCryptoTheme

@RequiresApi(Build.VERSION_CODES.M)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidCryptoTheme {

            }
        }
    }
}
