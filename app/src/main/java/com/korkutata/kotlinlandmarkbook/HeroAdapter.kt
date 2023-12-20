package com.korkutata.kotlinlandmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.korkutata.kotlinlandmarkbook.databinding.ActivityMainBinding
import com.korkutata.kotlinlandmarkbook.databinding.ReycyclerRowBinding

class HeroAdapter(val arrayList: ArrayList<DetailsClass>) : RecyclerView.Adapter<HeroAdapter.HeroHolder>() {


   class HeroHolder(var binding:ReycyclerRowBinding):RecyclerView.ViewHolder(binding.root) {


   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        var binding = ReycyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return HeroHolder(binding)
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {


        holder.binding.recyclerTextView.text = arrayList.get(position).name
        holder.binding.recyclerViewImageView.setImageResource(arrayList.get(position).image)
        holder.itemView.setOnClickListener() {

            var intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmark",arrayList.get(position))
            holder.itemView.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
       return arrayList.size
    }


}