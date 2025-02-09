package com.wtm.womentechstersfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var createNAButton: Button = findViewById(R.id.createNewAccount)
        createNAButton.setOnClickListener {
            var i = Intent(this, CreateNewAccountActivity::class.java)
            startActivity(i)
        }

        val forgotPasswordBtn: Button = findViewById(R.id.forgottenPassword)
        forgotPasswordBtn.setOnClickListener {
            var i = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(i)
        }

        val loginBtn: Button = findViewById(R.id.loginButton)
        loginBtn.setOnClickListener{
            navigateToLoginPage()
        }
    }

   private fun navigateToLoginPage() {
        var loginBtn : Button = findViewById(R.id.loginButton)
        var userName : EditText = findViewById(R.id.username)
        var password : EditText = findViewById(R.id.password)

        loginBtn.setOnClickListener{
            val userNameEnter: String = userName.text.toString()
            val userPwdEnter: String = password.text.toString()
            var message = "";

            if ((userNameEnter.isEmpty()) && (userPwdEnter.isEmpty())) {
                var message = "input your Username & password";
            }else{
                var intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
            Snackbar
                .make(
                    findViewById(R.id.layout2),
                    message,
                    Snackbar.LENGTH_LONG
                )
                .show()
        }
    }

}
}
