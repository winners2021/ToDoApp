package com.tetsoma.todoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ProfileActivity2 : AppCompatActivity() {


    private lateinit var homeButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)


        homeButton = findViewByI(R.layout.activiy_profile)

        homeButton = findViewById(R.id.homeButton)

        homeButton.setOnClickListener{ it view!
        val intent = Intent(packageContext this, HomeActivity:: class.java)
    }
}