package `class`

class Class02 {
/*
 * 기본 자료형(primitive type)
 * 	정수형
 * 	Byte	8bits
 * 	Short	16bits
 * 	Int		32bits
 * 	Long	64bits
 *
 *	실수형
 * 	Float	32bits
 * 	Double	64bits
 *
 * 	문자형
 * 	Char	1개의 문자
 *
 * 	논리형
 * 	Boolean	true, false
 */
}

fun main() {
    var intValue: Int = 1234
    println(intValue)
    var longValue: Long = 1234L
    println(longValue)
    var intValueByHex: Int = 0x1af
    println(intValueByHex)
    var intValueByBin: Int = 0b10110110
    println(intValueByBin)
    // kotlin은 8진수의 표기는 지원하지 않는다. (10진수, 16진수, 2진수 지원)

    var doubleValue: Double = 123.5
    println(doubleValue)
    var doubleValueWithExp: Double = 123.5e10
    println(doubleValueWithExp)
    var floatValue: Float = 123.5f
    println(floatValue)

    var charValue: Char = 'a'
    println(charValue)
    var koreanCharValue: Char = '가'
    println(koreanCharValue)

    var booleanValue: Boolean = true
    println(booleanValue)

    val stringValue = "one line string test"
    println(stringValue)
    val multiLineStringValue = """multi
string
test"""

    println(multiLineStringValue)
}