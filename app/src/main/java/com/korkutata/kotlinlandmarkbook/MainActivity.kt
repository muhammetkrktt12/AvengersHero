package com.korkutata.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.korkutata.kotlinlandmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var arrayList: ArrayList<DetailsClass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        arrayList = ArrayList<DetailsClass>()

        var stark = DetailsClass("Tony Stark","İron Man",R.drawable.stark)
        var doctorStrange = DetailsClass("Stephan","Doctor Strange",R.drawable.strange)
        var blackWidow = DetailsClass("Natali","Black Widow",R.drawable.natassha)
        var stark2 = DetailsClass("Stark","İron",R.drawable.stark)
        arrayList.add(stark)
        arrayList.add(doctorStrange)
        arrayList.add(blackWidow)
        arrayList.add(stark2)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val bonusAdapter = BonusClass(arrayList) // Burada bonus
        binding.recyclerView.adapter = bonusAdapter
        val landmarkAdapter = LandmarkAdapter(arrayList)// Burada landmarkadaptere arraylist gönderildi.
        binding.recyclerView.adapter = landmarkAdapter // recyclerView'e landmarkAdaper  verildi ve veriler sıralandı.
    }
}