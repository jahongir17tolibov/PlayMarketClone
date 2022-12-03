package com.jt17.playmarketclone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jt17.playmarketclone.databinding.ParentItemBinding
import com.jt17.playmarketclone.models.ParentModel

class ParentAdapter(val list: List<ParentModel>) :
    RecyclerView.Adapter<ParentAdapter.ItemHolder>() {

    inner class ItemHolder(val b: ParentItemBinding) : RecyclerView.ViewHolder(b.root) {
        fun bind(parent: ParentModel) {
            b.titleName.text = parent.mainTitle
            val subChild = ChildAdapter(parent.childrens)
            b.parentRecyc.run {
                layoutManager =
                    LinearLayoutManager(b.root.context, LinearLayoutManager.HORIZONTAL, false)
                adapter = subChild
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            ParentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val itemData = list[position]
        holder.bind(itemData)
    }

    override fun getItemCount(): Int = list.size

}