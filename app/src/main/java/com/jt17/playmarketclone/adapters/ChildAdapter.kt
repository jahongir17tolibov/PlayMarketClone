package com.jt17.playmarketclone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jt17.playmarketclone.databinding.ChildItemBinding
import com.jt17.playmarketclone.models.ParentModel

class ChildAdapter(private val list: List<ParentModel.ChildModel>) :
    RecyclerView.Adapter<ChildAdapter.ItemHolder>() {

    inner class ItemHolder(val b: ChildItemBinding) : RecyclerView.ViewHolder(b.root) {
        fun bind(child: ParentModel.ChildModel) {
            b.gamesName.text = child.appName
            b.typeApp.text = child.typeP

            b.topImage.setImageResource(child.image)
            b.smallImg.setImageResource(child.smallImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            ChildItemBinding.inflate(
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