package com.example.proyecto_final_movil.Admin


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.proyecto_final_movil.MainActivity
import com.example.proyecto_final_movil.Utils.Utils
import com.example.proyecto_final_movil.databinding.ActivityAdminBinding
import com.google.firebase.auth.FirebaseAuth

class AdminActivity : AppCompatActivity() {
    private val fragmentManager = supportFragmentManager
    private lateinit var binding: ActivityAdminBinding;


    private val fragmentA = AdminMainFragment();
    private val fragmentB = CatalogoAdminFragment();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Mostrar el fragmento inicial
        Utils.replaceFragment(binding.fragmentContainer.id, fragmentA, fragmentManager)

        // Mostrar el fragmento inicial
        //replaceFragment(fragmentA)

        binding.signOutDoorImg.setOnClickListener{
            signOut()
        }
    }

    private fun signOut(){
        FirebaseAuth.getInstance().signOut()


        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)

    }



    /*private fun replaceFragment(fragment: Fragment) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(binding.fragmentContainer.id, fragment)
        transaction.commit()
    }*/

}