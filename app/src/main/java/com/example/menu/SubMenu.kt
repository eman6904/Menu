package com.example.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.menu.databinding.FragmentSubMenuBinding
import com.example.menu.databinding.MainmenuRecyclerBinding

class SubMenu : Fragment(R.layout.fragment_sub_menu) {
    private lateinit var binding: FragmentSubMenuBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSubMenuBinding.bind(view)
        navController = Navigation.findNavController(view)

        //to hide action bar
        val activity = activity as MainActivity
        activity.supportActionBar?.hide()

        val text=arguments?.getString("text")
        binding.textView2.text=text
        val pos=arguments?.getInt("index")
        //Connect the recycler to the adapter
        val p=array_group()
        when(pos)
        {
            0->
            {
                p.sechicken()
                val adapter = SubMenuAdapter(p.arr)
                binding.recycler.layoutManager = LinearLayoutManager(requireContext())
                binding.recycler.adapter = adapter
            }
            6->
            {
                p.setmcrona()
                val adapter = SubMenuAdapter(p.arr)
                binding.recycler.layoutManager = LinearLayoutManager(requireContext())
                binding.recycler.adapter = adapter
            }
        }
    }
}