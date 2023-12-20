package com.korkutata.kotlinlandmarkbook

import android.app.ActivityManager
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.korkutata.kotlinlandmarkbook.databinding.ReycyclerRowBinding

class DestroyAdapter(val arrayList: ArrayList<DetailsClass>) : RecyclerView.Adapter<DestroyAdapter.DestroyHolder>() {

    class DestroyHolder(val binding: ReycyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestroyHolder {
        val binding = ReycyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return DestroyHolder(binding)
    }

    override fun onBindViewHolder(holder: DestroyHolder, position: Int) {
       holder.binding.recyclerTextView.text = arrayList.get(position).name
        holder.binding.recyclerViewImageView.setImageResource(arrayList.get(position).image)

        holder.itemView.setOnClickListener() {

            var intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("stark",arrayList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
     return arrayList.size
    }

}