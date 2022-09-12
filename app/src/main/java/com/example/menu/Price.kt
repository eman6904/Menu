package com.example.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.menu.MainMenuAdapter.Companion.x
import com.example.menu.databinding.FragmentPriceBinding
import com.example.menu.databinding.FragmentSubMenuBinding

class Price : Fragment(R.layout.fragment_price) {
    private lateinit var binding: FragmentPriceBinding
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPriceBinding.bind(view)
        navController = Navigation.findNavController(view)

        //to hide action bar
        val activity = activity as MainActivity
        activity.supportActionBar?.hide()

        val p=imagesgroub()
        val text=arguments?.getString("text")
        binding.textView9.text=text
        var idx=arguments?.getInt("pos")
        val pos=x
        when(pos)
        {
            0->
            {
                p.imagechecken()
                binding.imageView2.setImageResource(p.arr[idx!!].first)
                binding.textView3.text=p.arr[idx!!].second.toString()
            }
            6->
            {
                p.imagemcrona()
                binding.imageView2.setImageResource(p.arr[idx!!].first)
                binding.textView3.text=p.arr[idx!!].second.toString()
            }
        }
        binding.textView5.setOnClickListener()
        {
           Toast.makeText(requireContext(),"تم طلبك بنجاح شكرا لك",Toast.LENGTH_LONG).show()
        }

    }
}