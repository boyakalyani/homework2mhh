package com.example.homework2mhh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var text1:TextView
    lateinit var text2:TextView
    lateinit var text3:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        text1=findViewById(R.id.txt1_id)
        text2=findViewById(R.id.txt2_id)
        text3=findViewById(R.id.txt3_id)

        val user_name=intent.getStringExtra("enter user name")
        val email_name=intent.getStringExtra("enter email")
        val pass_name=intent.getStringExtra(" enter password:")

        text1.text="user name:- "+user_name
        text2.text="email id:- "+email_name
text3.text="pass word:- "+pass_name

    }
}