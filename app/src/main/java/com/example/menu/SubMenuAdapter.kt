package com.example.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.navigation.navArgument
import androidx.recyclerview.widget.RecyclerView
import com.example.menu.databinding.MainmenuModelBinding
import com.example.menu.databinding.SubmenuModelBinding

class SubMenuAdapter(private val list:ArrayList<MainMenuClass>):
    RecyclerView.Adapter<SubMenuAdapter.ViewHolder>() {
    inner class ViewHolder(val binding:SubmenuModelBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var text = binding.textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            SubmenuModelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=list[position]
        holder.text.text=item.text
        val text=item.text.toString()
        holder.binding.root.setOnClickListener()
        {
            val bundle= bundleOf("pos" to position,"text" to text)
            it.findNavController().navigate(R.id.action_subMenu_to_price,bundle)
        }
    }
    override fun getItemCount(): Int {
        return list.size
    }
}