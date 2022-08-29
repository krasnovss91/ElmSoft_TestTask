import dto.Triangle
import org.junit.jupiter.api.Test
import service.TriangleServiceImpl
import java.math.BigDecimal
import kotlin.test.assertEquals

internal class SampleTest {

    val a = BigDecimal("13.0")
    val b = BigDecimal("14.0")
    val c = BigDecimal("15.0")

    val triangle = Triangle(a,b,c)

    val triangleService = TriangleServiceImpl()

    @Test
    fun demoTest(){
        val expected = 84.0
        assertEquals(expected, triangleService.getArea(triangle))
    }
}