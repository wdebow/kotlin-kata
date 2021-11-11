import org.junit.jupiter.api.Test
import java.util.*

class CalendarServiceTest {

    @Test
    fun test() {
        val testee = CalendarService()

        testee.calculate(Calendar.getInstance())
    }
}