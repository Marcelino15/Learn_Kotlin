package com.example.ads2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        buttonSignUp.setOnClickListener {
            back()
        }

        textSignIn.setOnClickListener{
            back()
        }
    }

    override fun onBackPressed() {
        back()
    }

    private fun back(){
        finish()
        overridePendingTransition(R.anim.no_animation, R.anim.slide_out)
    }
}
