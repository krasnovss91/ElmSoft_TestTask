package service

import dto.Triangle
import java.math.BigDecimal

interface TriangleService {
    fun getPerimetre(a: BigDecimal, b: BigDecimal, c: BigDecimal) : BigDecimal

    fun getArea(triangle: Triangle) : Double
}