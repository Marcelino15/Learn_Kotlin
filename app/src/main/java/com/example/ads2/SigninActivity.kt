package com.example.ads2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        button2.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }

        textSignIn.setOnClickListener {
            startActivity(Intent(this, SigninActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }
    }

    override fun onBackPressed() {
        finish()
    }
}
