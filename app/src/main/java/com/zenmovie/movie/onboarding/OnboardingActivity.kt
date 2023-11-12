package com.zenmovie.movie.onboarding

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.zenmovie.movie.R
import com.zenmovie.movie.auth.SignInActivity

class OnboardingActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val buttonClick = findViewById<Button>(R.id.next_login)
        buttonClick.setOnClickListener{
            val intent = Intent(this@OnboardingActivity, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}