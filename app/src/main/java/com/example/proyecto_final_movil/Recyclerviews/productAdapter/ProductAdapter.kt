package com.example.proyecto_final_movil.Recyclerviews.productAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_final_movil.R
import com.example.proyecto_final_movil.Model.Product
import com.example.proyecto_final_movil.Recyclerviews.User.Adapter.ProductViewHolder

class ProductAdapter(private val productList: List<Product>): RecyclerView.Adapter<ProductViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ProductViewHolder(layoutInflater.inflate(R.layout.recycler_item, parent, false))
    }


    override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val item = productList[position]
        holder.render(item)
    }
}