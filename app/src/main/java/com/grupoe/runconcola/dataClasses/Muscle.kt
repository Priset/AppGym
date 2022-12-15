package com.grupoe.runconcola.dataClasses

import android.graphics.drawable.Drawable

data class Muscle (
    var type: String,
    var image: Int,
    var listExercise: List<Exercise>

)

fun Muscle.group(): String {
    return "${this.type},${this.image}"
}
