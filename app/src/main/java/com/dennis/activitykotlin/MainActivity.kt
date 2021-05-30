package com.dennis.activitykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //connect this file to the corresponding xml layout
        setContentView(R.layout.activity_main)

        //when this particular button is clicked, Toast a message
        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "Button was Clicked")
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT ).show()
        }

        //when this button is clicked do the following
        sendMessageToNextActivity.setOnClickListener {

            //output a toast message
            Toast.makeText(this,"Second message was clicked", Toast.LENGTH_SHORT).show()

            //save the inpute in a variable and convert to string
            val message:String = etUserMessage.text.toString()

            //Navigate to ActivityTwo when clicked
            val intent = Intent(this, ActivityTwo::class.java)

            //put value from activitymain as Explicit intent to activitytwo
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
    }

}