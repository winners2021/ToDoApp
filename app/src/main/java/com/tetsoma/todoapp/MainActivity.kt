package com.tetsoma.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val validusername = "admin"
    val validPassword = "admin"


    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: EditText


    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.usernameInput)
        passwordInput = findViewById(R.id.passwordInput)
        submitButton = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {

            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            login(username, password)
        }
    }

    private fun login(username: String, password: String) {
        if (isValidCredential(username, password)) {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("name", username)
            startActivity(intent)

        } else{
            Toast.makeText(applicationContext, "something went wrong", Toast.LENGTH_SHORT).show()
        }

    }

    private fun isValidCredential(username: String, password: String): Boolean {
        if (username == validusername && password == validPassword) return true
        return false
    }
}
