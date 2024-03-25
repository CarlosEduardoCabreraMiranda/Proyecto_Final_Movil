package com.example.proyecto_final_movil.Validations

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto_final_movil.Admin.AdminActivity
import com.example.proyecto_final_movil.Recyclerviews.User.User
import com.example.proyecto_final_movil.databinding.ActivitySignUpBinding


class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding


    //private var userI = User(1,"Carlos","CECM","1234")

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



    private fun signUp(){
        val id = binding.editId.getInt()

        val completeName = binding.editName.getString() + binding.editLastName.getString()

        val name = completeName

        val username = binding.editUser.getString()

        val password = binding.editPassword.getString()


        val user = User(id,name,username,password)




    }

    private fun EditText.getString(): String {
        return this.text.toString()
    }
    private fun EditText.getInt(): Int {
        return this.text.toString().toInt()
    }


}