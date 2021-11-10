import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PrintServiceTest {

    @Test
    fun `should print and return lenght of name1`() {

        assertEquals(3, PrintService().print("Woj"))
    }
}