package com.example.proyecto_final_movil.Recyclerviews.User.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_final_movil.R
import com.example.proyecto_final_movil.Recyclerviews.User.User

class UserAdapter(private val userList: List<User>): RecyclerView.Adapter<UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return UserViewHolder(layoutInflater.inflate(R.layout.recycler_item, parent, false))
    }
//binding = FragmentCatalogoAdminBinding.inflate(inflater,container,false)

    override fun getItemCount(): Int = userList.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val item = userList[position]
        holder.render(item)
    }
}