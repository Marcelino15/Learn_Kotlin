package com.example.ads2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_start)
        button.setOnClickListener {
            finish()
            startActivity(Intent(this, SigninActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }
    }
}
