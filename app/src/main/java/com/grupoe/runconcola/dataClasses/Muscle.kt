package com.grupoe.runconcola.dataClasses

class Muscle (
    var type: String,
)

fun Muscle.group(): String {
    return "${this.type}"
}
