package com.example.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.menu.databinding.MainmenuRecyclerBinding

class MainMenu_recycler : Fragment(R.layout.mainmenu_recycler) {
    private lateinit var binding: MainmenuRecyclerBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = MainmenuRecyclerBinding.bind(view)
        navController = Navigation.findNavController(view)

        //to hide action bar
        val activity = activity as MainActivity
        activity.supportActionBar?.hide()
        //Connect the recycler to the adapter
        val array = ArrayList<MainMenuClass>()
        array.add(MainMenuClass("فراخ"))
        array.add(MainMenuClass("لحوم"))
        array.add(MainMenuClass("أسماك"))
        array.add(MainMenuClass("مقبلات"))
        array.add(MainMenuClass("مخبوزات"))
        array.add(MainMenuClass("طواجن"))
        array.add(MainMenuClass("مكرونات"))
        array.add(MainMenuClass("شربة"))
        array.add(MainMenuClass("أرز"))
        array.add(MainMenuClass("مشويات"))
        array.add(MainMenuClass("سلطة فواكة"))
        array.add(MainMenuClass("سلطة خضروات"))
        array.add(MainMenuClass("ساندوتشات"))
        array.add(MainMenuClass("حلويات"))
        array.add(MainMenuClass("مشروبات دافية"))
        array.add(MainMenuClass("مشروبات باردة"))
        array.add(MainMenuClass("مثلجات"))
        val adapter = MainMenuAdapter(array)
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = adapter
    }
}