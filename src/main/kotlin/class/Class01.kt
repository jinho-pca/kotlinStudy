package `class`

class Class01 {
/*
 * var : 일반적으로 통용되는 변수, 언제든지 읽기 쓰기가 가능함.
 * val : 선언시에만 초기화 가능, 중간에 값을 변경할 수 없음.
 *
 * Property(속성) : 클래스에 선언된 변수
 * Local Variable(로컬변수) : 이 외의 Scope 내에 선언된 변수
 */
}

fun main() {

    var a: Int = 123
    var b: Int? = null // ?를 사용하면 nullable 변수로 선언할 수 있음, nullable 변수는 값을 할당하지 않은 상태로 연산할 경우 NullPointerException 발생
    println(a)
    println(b)

}