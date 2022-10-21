package dev.gggedr.oberon.math.cons

class Cuboid(
    val first: Point,
    val second: Point
) {

    fun isInside(x: Double, y: Double, z: Double): Boolean {
        return x in first.x..second.x && y in first.y..second.y && z in first.z..second.z
    }

    fun isInside(point: Point): Boolean {
        return isInside(point.x, point.y, point.z)
    }

}