package com.example.proyecto_final_movil.Utils

import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

object Utils {


     fun replaceFragment(fragmentId: Int, fragment: Fragment, fragmentManager: FragmentManager) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(fragmentId, fragment)
        transaction.commit()
    }

    fun EditText.getString(): String {
        return this.text.toString()
    }

}
