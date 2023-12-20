package com.korkutata.kotlinlandmarkbook

import android.content.ClipData
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.korkutata.kotlinlandmarkbook.databinding.ActivityDetailsBinding
import com.korkutata.kotlinlandmarkbook.databinding.ReycyclerRowBinding

class LandmarkAdapter( val arrayList: ArrayList<DetailsClass>): RecyclerView.Adapter<LandmarkAdapter.LandMarkHolder>() { //Recycler sınıfından kalıtım aldı.



    class LandMarkHolder (var binding: ReycyclerRowBinding) : RecyclerView.ViewHolder(binding.root) { // Görüntü tutucu sınıf


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarkHolder {
        val binding = ReycyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandMarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) {
        holder.binding.recyclerTextView.text = arrayList.get(position).name
        holder.binding.recyclerViewImageView.setImageResource(arrayList.get(position).image)
        holder.itemView.setOnClickListener() {


            var intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            MySingleton.chosenLandmark = arrayList.get(position)
            holder.itemView.context.startActivity(intent)


        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}