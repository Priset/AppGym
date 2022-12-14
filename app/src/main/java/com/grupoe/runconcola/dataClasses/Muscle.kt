package com.grupoe.runconcola.dataClasses

import android.graphics.drawable.Drawable

data class Muscle (
    var type: String,
    var image: Int

)

fun Muscle.group(): String {
    return "${this.type},${this.image}"
}
