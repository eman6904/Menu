package com.example.menu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.menu.databinding.FragmentOrderBinding
import com.example.menu.databinding.FragmentPriceBinding


class Order_Fragment : Fragment(R.layout.fragment_order_) {

    private lateinit var binding: FragmentOrderBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOrderBinding.bind(view)
        navController = Navigation.findNavController(view)

        //to hide action bar
        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
    }
}