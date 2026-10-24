import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {

    @Test
    fun `test addition`() {
        val result = calculate(5.0, 5.0, "+")
        assertEquals(10.0, result)
    }
}