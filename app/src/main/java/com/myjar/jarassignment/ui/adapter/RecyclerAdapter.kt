package com.myjar.jarassignment.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myjar.jarassignment.R
import com.myjar.jarassignment.data.model.ComputerItem

class RecyclerAdapter(private val items: List<ComputerItem> ) : RecyclerView.Adapter<RecyclerAdapter.JarViewModel>() {
    class JarViewModel(view: View) : RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.name)
        val color: TextView = view.findViewById(R.id.color)
        val capacity: TextView = view.findViewById(R.id.capacity)

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): JarViewModel {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return JarViewModel(view)
     }

    override fun onBindViewHolder(holder: JarViewModel, position: Int) {

        val item = items[position]
        holder.name.text = item.name
        holder.color.text = item.data?.color ?: "Null"
        holder.capacity.text = item.data?.capacity ?: "Null"
    }

    override fun getItemCount(): Int {
        return items.size
    }
}