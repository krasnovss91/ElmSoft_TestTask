package service

import dto.Triangle
import java.math.BigDecimal

class TriangleServiceImpl: TriangleService {
    override fun getPerimetre(a: BigDecimal, b: BigDecimal, c: BigDecimal): BigDecimal {
        val d : BigDecimal = BigDecimal("2.0")
        return (a + b + c) / d
    }

    override fun getArea(triangle: Triangle): Double {
        var p: BigDecimal = getPerimetre(triangle.a,triangle.b,triangle.c)

        val a = (p - triangle.a)
        val b = (p - triangle.b)
        val c = (p - triangle.c)

        return Math.sqrt((p * a * b * c).toDouble())
    }

}