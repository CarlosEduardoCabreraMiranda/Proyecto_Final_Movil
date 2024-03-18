package com.example.proyecto_final_movil.Utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

object Utils {


     fun replaceFragment(FragmentId: Int, fragment: Fragment, fragmentManager: FragmentManager) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(FragmentId, fragment)
        transaction.commit()
    }
}