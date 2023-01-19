package ie.setu.types.main




fun main(args: Array<String>) {

    fun explicitConversions(inputByte: Byte) {

        println("\n==========================================================")
        println("=================  Explicit Conversions ==================")
        println("==========================================================")

        val byteNum: Byte = inputByte       //static type check: OK
        val intNum: Int = byteNum.toInt()   //explicit conversion: OK
        val floatNum: Float = byteNum.toFloat()
        val doubleNum: Double = intNum.toDouble()

        println("byteNum: " + byteNum)
        println("intNum: " + intNum)
        println("floatNum: " + floatNum)
        println("doubleNum: " + doubleNum)

    }
    explicitConversions(25)

    fun mutableVariables (input: Int, updatedNumber: Int){
        println ("\n==========================================================")
        println ("===========  Working with Mutable Variables =============")
        println ("==========================================================")

        //mutable variables
        var number = input   //Int type is inferred

        number++;       //mathematical operations are allowed
        println("Mutable number: " + number)

        number = updatedNumber;       //Allowed to reassign a var too
        println("Mutable number (updated): " + number)

    }
    mutableVariables(25, 30)
}


