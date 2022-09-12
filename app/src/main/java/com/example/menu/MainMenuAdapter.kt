package com.example.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.menu.databinding.MainmenuModelBinding

class MainMenuAdapter(private val list:ArrayList<MainMenuClass>):
    RecyclerView.Adapter<MainMenuAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: MainmenuModelBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var text = binding.textView
    }
companion object
 {//to be public for on level of project
     var x:Int=0
 }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            MainmenuModelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=list[position]
        holder.text.text=item.text
        val text=item.text.toString()
        holder.binding.root.setOnClickListener()
        {
            x=position
          val bundle= bundleOf("index" to position,"text" to text)
         it.findNavController().navigate(R.id.action_mainMenu_to_subMenu,bundle)
        }
    }
    override fun getItemCount(): Int {
        return list.size
    }
}