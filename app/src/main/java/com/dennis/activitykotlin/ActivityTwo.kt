package com.dennis.activitykotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_two.*

class ActivityTwo : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        //From incoming intent exteact bundle
        val bundle:Bundle? = intent.extras

        //use the key "user_message" to extract value from the bundle
        val msg = bundle!!.getString("user_message")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        //Asign the message to the TextView Id of activitytwo
        textViewTwo.text = msg

        //return home i.e to MainActivity when clicked
        homeButton.setOnClickListener {
            val intentHome = Intent(this, MainActivity::class.java)
            startActivity(intentHome)
        }
    }

}