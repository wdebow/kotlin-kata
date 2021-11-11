class PrintService {

    //convert this function to use let/run/also/apply
    fun print(name: String) : Int {
        println(name)
        return name.length
    }

    fun printLet(name: String) : Int = name.let {
        print(it)
        name.length
    }

    fun printAlso(name: String) : Int = name.also { println(this) }.length

    fun printRun(name: String) : Int = name.run {
        print(this)
        name.length
    }

    fun printApply(name: String) : Int = name.apply {
        print(this)
    }.length

}