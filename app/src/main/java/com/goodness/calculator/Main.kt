package com.goodness.calculator


fun main() {
  println("첫번째 숫자를 입력하세요.")
  var initNum: Double = getDouble()

  while (true) {
    println("다음 숫자를 입력하세요.")
    val num2: Double = getDouble()

    println("수행할 연산을 입력하세요. add, sub, mul, div")
    val operator = getOperator()

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

fun getDouble(): Double {
  while (true) {
    val input = readln().toDoubleOrNull()
    if (input is Double) {
      return input
    } else {
      println("올바른 숫자를 입력해주세요")
    }
  }
}

fun getOperator(): String {
  while (true) {
    when (val input = readln()) {
      "add", "sub", "mul", "div" -> return input
      else -> println("올바른 연산자를 입력해주세요")
    }
  }
}