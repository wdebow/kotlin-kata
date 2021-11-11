import java.util.*

class CalendarService {

    //refactor it using scope functions,
    fun calculate(date: Calendar?): Calendar {
        val myDate: Calendar;
        if (date != null) {
            date.add(Calendar.YEAR, 1)
            date.add(Calendar.MONTH, 2)
            date.add(Calendar.DATE, 3)
            myDate = date
        } else {
            println("creating new date")
            myDate = Calendar.getInstance()
        }

        println(myDate.get(Calendar.DAY_OF_WEEK))
        println(myDate.get(Calendar.DAY_OF_MONTH))
        println(myDate.get(Calendar.DAY_OF_YEAR))

        val newValue = calculateExternal(myDate)
        println("final value was$newValue")
        return newValue;
    }

    fun calculateRefactor(date: Calendar?): Calendar {
        val myDate = date?.apply {
            add(Calendar.YEAR, 1)
            add(Calendar.MONTH, 2)
            add(Calendar.DATE, 3)
        } ?: run {
            println("creating new date")
            Calendar.getInstance()
        }

        with(myDate) {
            println(get(Calendar.DAY_OF_WEEK))
            println(get(Calendar.DAY_OF_MONTH))
            println(get(Calendar.DAY_OF_YEAR))
        }
        return calculateExternal(myDate).also {
            println("final value was$it")
        }
    }

    fun calculateRefactorCondensed(date: Calendar?): Calendar =
        with(
            date?.apply {
                add(Calendar.YEAR, 1)
                add(Calendar.MONTH, 2)
                add(Calendar.DATE, 3)
            } ?: run {
                println("creating new date")
                Calendar.getInstance()
            }
        ) {
            println(get(Calendar.DAY_OF_WEEK))
            println(get(Calendar.DAY_OF_MONTH))
            println(get(Calendar.DAY_OF_YEAR))
            calculateExternal(this)
        }.also {
            println("final value was$it")
        }


    private fun calculateExternal(date: Calendar): Calendar {
        val c = Calendar.getInstance()
        c.add(Calendar.DATE, date.get(Calendar.DATE))
        return c
    }

}