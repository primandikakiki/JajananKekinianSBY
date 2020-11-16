package com.example.jajanankekiniansby

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_jajanan.view.*

class AdapterJajanan (val itemFac: List<DataJajanan>, val clickListener: (DataJajanan) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_jajanan, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemFac[position], clickListener)
    }

    override fun getItemCount() = itemFac.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: DataJajanan, clickListener: (DataJajanan) -> Unit) {
            itemView.image_jjn.setImageResource(data.imgJjn)
            itemView.tv_list_jjn.text = data.nameJjn
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}