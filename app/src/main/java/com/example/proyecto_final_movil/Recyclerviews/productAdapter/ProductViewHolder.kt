package com.example.proyecto_final_movil.Recyclerviews.User.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_final_movil.R
import com.example.proyecto_final_movil.Model.Product
import com.example.proyecto_final_movil.databinding.RecyclerItemBinding


class ProductViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private var binding = RecyclerItemBinding.bind(view)


    //val productImg = view.findViewById<ImageView>(R.id.catalogo_first_img)

    fun render(productModel: Product){
            binding.recyclerTextView.text = productModel.nombre

        binding.recyclerTextView.setOnClickListener{ Toast.makeText(binding.root.context,retornoOnulo(productModel.id),Toast.LENGTH_SHORT).show()}


        itemView.setOnClickListener { Toast.makeText(binding.root.context,retornoOnulo(productModel.nombre),Toast.LENGTH_SHORT).show() }

        binding.deleteBtn.setOnClickListener {

        }

    }



    fun retornoOnulo(num: Any?): String? {
        return if(num != null)
            num.toString()
        else
           return "nulo"

    }
}