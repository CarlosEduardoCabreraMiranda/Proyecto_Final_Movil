package com.example.proyecto_final_movil.Admin

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyecto_final_movil.R
import com.example.proyecto_final_movil.Model.Product
import com.example.proyecto_final_movil.Recyclerviews.Service.ProductApiService
import com.example.proyecto_final_movil.Recyclerviews.productAdapter.ProductAdapter
import com.example.proyecto_final_movil.Utils.Utils
import com.example.proyecto_final_movil.databinding.FragmentCatalogoAdminBinding
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class CatalogoAdminFragment : Fragment() {

    //lista auxiliar para
    private var productMutableList:MutableList<Product> = mutableListOf()
    private lateinit var binding: FragmentCatalogoAdminBinding
    private val fragmentC = CreateCatalogoFragment();


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {}
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCatalogoAdminBinding.inflate(inflater,container,false)
        val createProductBtn = binding.createProductBtn

        val rootView = binding.root

        //initRecyclerViewProducts(rootView,requireContext())

        // Llama a getProducts dentro de un bloque de suspensión
        lifecycleScope.launch {
            try {
                val productList = getProducts()

                Log.i("productos","${productList.size}")
                // Configura el RecyclerView con la lista de productos
                initRecyclerViewProducts(rootView.context,productList)
            } catch (e: Exception) {
                // Maneja errores
                showError()
            }
        }

        //initRecyclerViewProducts(productMutableList)

        createProductBtn.setOnClickListener{
            Utils.replaceFragment(R.id.fragment_container,fragmentC,parentFragmentManager)
        }
        return rootView
}

companion object {


@JvmStatic
fun newInstance(param1: String, param2: String) =
    CatalogoAdminFragment().apply {
        arguments = Bundle().apply {
        }
    }
}

    //retrofit call
    private fun getRetroFit(): Retrofit {

        //val productService = retrofit.create(ProductApiService::class.java)
        return Retrofit.Builder()
            .baseUrl("http://192.168.20.106:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    private suspend fun getProducts(): List<Product> {
        try {
            val productService = getRetroFit().create(ProductApiService::class.java)
            val productListApi = productService.getProductos()
            if(productListApi.isNotEmpty())
                productMutableList.addAll(productService.getProductos())
            else
                Log.i("productosman","${productMutableList.size}")

        // Configura el RecyclerView con la lista de productos

        } catch (e: Exception) {
            // Maneja errores
            showError()
        }
        return productMutableList
    }



    private fun showError() {
        Toast.makeText(requireContext(),"Ha ocurrido un error",Toast.LENGTH_SHORT).show()
    }

    //view: View, context: Context
    private fun initRecyclerViewProducts(context: Context, productosList: List<Product>) {

        binding.productosRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.productosRecyclerView.adapter = ProductAdapter(productosList)
        //binding.productosRecyclerView.adapter = ProductAdapter(ProductProvider.productList)

        val result = ProductAdapter(productosList).itemCount.toString()
        val resultTextView = binding.resultTxt
        resultTextView.text = "$result resultados"

    }
}