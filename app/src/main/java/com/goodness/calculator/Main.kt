package com.goodness.calculator


fun main() {
  println("첫번째 숫자를 입력하세요.")
  var initNum = readln().toDoubleOrNull() ?: throw Error("숫자가 아닌 값을 입력하였습니다.")

  while (true) {
    println("다음 숫자를 입력하세요.")
    val num2 = readln().toDoubleOrNull() ?: throw Error("숫자가 아닌 값을 입력하였습니다.")

    println("수행할 연산을 입력하세요. add, sub, mul, div")
    val operator = readln()

    val result = when (operator) {
      "add" -> AddOperator().operate(initNum, num2)
      "sub" -> SubOperator().operate(initNum, num2)
      "mul" -> MulOperator().operate(initNum, num2)
      "div" -> DivOperator().operate(initNum, num2)
      else -> throw Error("잘못된 연산자입니다.")
    }

    initNum = result
    println("result: $result")
  }
}