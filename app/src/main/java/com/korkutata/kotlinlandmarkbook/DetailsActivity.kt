package com.korkutata.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.korkutata.kotlinlandmarkbook.databinding.ActivityDetailsBinding
import com.korkutata.kotlinlandmarkbook.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent // Gelen intent alındı.

        //var selectedLandmark = intent.getSerializableExtra("landmark") as DetailsClass // Serializable edilen sınıfın yani sınıfın veri şeklinde geleceğini biz burda casting ettik. Yoksa bir class olarak alınması mümkün değildi.
         var chosenLandmark = MySingleton.chosenLandmark //Singleton yapısı > Bu obje her yerde aynı özelliği taşır. Yani nerede çağırılırsa çağırılsın hep aynıdır. Bu yüzden aynı verileri gönderebiliyor.
            var chosenLandmarkTwo = MySingletonTwo.chosenSingletonTwo
            binding.nameText.text = chosenLandmark!!.name
            binding.imageView.setImageResource(chosenLandmark!!.image)
            binding.skillText.text = chosenLandmark!!.skills


    }
}