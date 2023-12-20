package com.korkutata.kotlinlandmarkbook

import android.media.Image
import java.io.Serializable

class DetailsClass(var name: String, var skills: String,var image: Int) : Serializable { // Classın veri şeklinde dönüştürülüp geleceğini belirttik.

    //var name: String = name
   // var skills:String = skills
   // var image:Int = image

}