package service

import java.math.BigDecimal

interface TriangleService {
    fun getPerimetre(a: BigDecimal, b: BigDecimal, c: BigDecimal) : BigDecimal

    fun getArea(b: BigDecimal)
}