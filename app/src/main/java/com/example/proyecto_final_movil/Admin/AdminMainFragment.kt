package com.example.proyecto_final_movil.Admin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.proyecto_final_movil.R
import com.example.proyecto_final_movil.Utils.Utils
import com.example.proyecto_final_movil.databinding.FragmentAdminMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AdminMainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */


class AdminMainFragment : Fragment(){
    //intento de binding
    private lateinit var binding: FragmentAdminMainBinding
    private val fragmentB = CatalogoAdminFragment();

    // TODO: Rename and change types of parameters
    //private var param1: String? = null
    //private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }*/
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentAdminMainBinding.inflate(inflater, container, false)
        return binding.root
        //return inflater.inflate(R.layout.fragment_admin_main, container, false )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val catalogoCd = binding.catalogoCard

        // Agrega el listener a la card
        catalogoCd.setOnClickListener {

            //Tomamos como referencia el contenedor a inyectar el fragmento
            val fragmentContainerId = R.id.fragment_container


            Utils.replaceFragment(fragmentContainerId,fragmentB,parentFragmentManager)
        }
    }


    /*companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AdminMainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AdminMainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }*/
}