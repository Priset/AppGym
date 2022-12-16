package com.grupoe.runconcola.dataClasses


data class Muscle (
    var type: String,
    var image: Int


)

fun Muscle.group(): String {
    return "${this.type},${this.image}"
}
