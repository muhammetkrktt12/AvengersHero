package com.korkutata.kotlinlandmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.korkutata.kotlinlandmarkbook.databinding.ReycyclerRowBinding

class BonusClass(val arrayList: ArrayList<DetailsClass>) : RecyclerView.Adapter<BonusClass.BlankHolder>(){

   class BlankHolder(var binding: ReycyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {


   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlankHolder {
            val binding = ReycyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BlankHolder(binding)
    }

    override fun onBindViewHolder(holder: BlankHolder, position: Int) {

        holder.binding.recyclerTextView.text = arrayList.get(position).name
        holder.binding.recyclerViewImageView.setImageResource(arrayList.get(position).image)

        holder.itemView.setOnClickListener() {

            var intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            MySingletonTwo.chosenSingletonTwo = arrayList.get(position)
            holder.itemView.context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
      return arrayList.size
    }
}