package com.example.mebelcart.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mebelcart.R
import com.google.firebase.FirebaseApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_register)
    }
    override fun onBackPressed() {
        // This will close the app when back button is pressed from LoginRegisterActivity
        finishAffinity()
    }
}