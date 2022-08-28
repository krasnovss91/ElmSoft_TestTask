package service

import java.math.BigDecimal

class TriangleServiceImpl: TriangleService {
    override fun getPerimetre(a: BigDecimal, b: BigDecimal, c: BigDecimal): BigDecimal {
        return (a + b + c) / 2
    }

    override fun getArea(b: BigDecimal) {
        TODO("Not yet implemented")
    }

}