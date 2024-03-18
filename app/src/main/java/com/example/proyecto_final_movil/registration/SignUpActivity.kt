package com.example.proyecto_final_movil.registration

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto_final_movil.Admin.AdminActivity
import com.example.proyecto_final_movil.databinding.ActivitySignUpBinding


class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Toast.makeText(this, "Bienvenido al registro", Toast.LENGTH_LONG).show()








        //Normal sign_up
        binding.confirmSignUpBtn.setOnClickListener(){
            val intentA = Intent(this, AdminActivity::class.java)
            startActivity(intentA)
            finish()
        }



        binding.backToLoginBtn.setOnClickListener{
            val intentB = Intent(this, LoginActivity::class.java)
            startActivity(intentB)
        }



    }




    private fun EditText.getString(): String {
        return this.text.toString()
    }
}