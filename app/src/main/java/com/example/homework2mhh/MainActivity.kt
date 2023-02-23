package com.example.homework2mhh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var edtxt1: EditText
    private lateinit var edtxt2: EditText
    private var id: Int = 6
    lateinit var edtxt3:EditText

    //    var resul=Scanner(System.`in`)
//    var id=resul.nextInt()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtxt1 = findViewById(R.id.edxt1_id)
        edtxt2 = findViewById(R.id.edxt2_id)
        btn = findViewById(R.id.btn_id)
        edtxt3=findViewById(R.id.edxt3_id)

        btn.setOnClickListener {
            if (edtxt1.text.isNotEmpty() && edtxt2.text.isNotEmpty()) {
                if (isEmaiValid(edtxt1.text.toString().trim()) && edtxt2.text.length == id) {
                    startActivity(Intent(applicationContext, MainActivity2::class.java).putExtra("enter user name",edtxt3.text.toString()).putExtra("enter email",edtxt1.text.toString()).putExtra(" enter password:",edtxt2.text.toString()))
                         Toast.makeText(applicationContext, "succuses", Toast.LENGTH_SHORT).show()

                } else {
                    Toast.makeText(applicationContext, "please check your email and password", Toast.LENGTH_SHORT).show()
                }
            } else {
                edtxt1.error = "please enter your EMAIL"
                edtxt2.error = "please enter your password"
            }
        }
            }
        private fun isEmaiValid(email: String?): Boolean {
            val expression = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"
            val pattern: Pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE)
            val matcher: Matcher = pattern.matcher(email.toString())
            return matcher.matches()
        }
    }
//"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}\$\n"
























//
////            if(edtxt1.text.isEmpty() || edtxt2.text.isEmpty()){
////                Toast.makeText(applicationContext, "hi kalyani", Toast.LENGTH_SHORT).show()
////            }
//
//            if (edtxt2.text.length <= id && edtxt2.text.length>=id){
////                val explisi=Intent(this,MainActivity2::class.java)
////                startActivity(explisi)
//                edtxt1.error="Please enter your email"
//                edtxt2.error="Please enter your password"
//            }
//            else{
//                Toast.makeText(applicationContext, "entered only 6 digits", Toast.LENGTH_SHORT).show()
//            }
//        }
