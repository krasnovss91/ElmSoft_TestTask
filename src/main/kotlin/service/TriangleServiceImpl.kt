package service

import java.math.BigDecimal

class TriangleServiceImpl: TriangleService {
    override fun getPerimetre(a: BigDecimal, b: BigDecimal, c: BigDecimal): BigDecimal {
        val d : BigDecimal = BigDecimal("2.0")
        return (a + b + c) / d
    }

    override fun getArea(b: BigDecimal) {
        TODO("Not yet implemented")
    }

}