package com.example.proyecto_final_movil.Admin

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto_final_movil.R
import com.example.proyecto_final_movil.Recyclerviews.User.Adapter.UserAdapter
import com.example.proyecto_final_movil.Recyclerviews.User.UserProvider
import com.example.proyecto_final_movil.Utils.Utils
import com.example.proyecto_final_movil.databinding.FragmentUsuariosAdminBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [UsuariosAdminFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UsuariosAdminFragment : Fragment() {

    private lateinit var binding: FragmentUsuariosAdminBinding
    // TODO: Rename and change types of parameters
   // private var param1: String? = null
    //private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            //param1 = it.getString(ARG_PARAM1)
            //param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /*
        // Inflate the layout for this fragment
        binding = FragmentCatalogoAdminBinding.inflate(inflater,container,false)

        val createProductBtn = binding.createProductBtn


        initRecyclerView(binding.root)

        createProductBtn.setOnClickListener{
            Utils.replaceFragment(R.id.fragment_container,fragmentC,parentFragmentManager)
        }
        return binding.root */

        binding = FragmentUsuariosAdminBinding.inflate(inflater,container,false)

        initRecyclerViewUsers(binding.root,requireContext())
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment UsuariosAdminFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            UsuariosAdminFragment().apply {
                arguments = Bundle().apply {
                    //putString(ARG_PARAM1, param1)
                    //putString(ARG_PARAM2, param2)
                }
            }
    }

    fun initRecyclerViewUsers(view: View, context: Context) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.usuarios_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = UserAdapter(UserProvider.userList)

        val result = UserAdapter(UserProvider.userList).itemCount.toString()

        val resultTextView = view.findViewById<TextView>(R.id.userResultTxt)
        resultTextView.text = "$result resultados"
    }
}