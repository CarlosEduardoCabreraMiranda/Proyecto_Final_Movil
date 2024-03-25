package com.example.proyecto_final_movil.Recyclerviews.User.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_final_movil.R
import com.example.proyecto_final_movil.Recyclerviews.User.User
import com.example.proyecto_final_movil.databinding.FragmentCatalogoAdminBinding


class UserViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private lateinit var binding: FragmentCatalogoAdminBinding

    val userTxt = view.findViewById<TextView>(R.id.recycler_textView)

    val userImg = view.findViewById<ImageView>(R.id.catalogo_first_img)

    fun render(userModel : User){
        userTxt.text = userModel.nombre
    }
}