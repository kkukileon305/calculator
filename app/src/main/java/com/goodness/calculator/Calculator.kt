package com.goodness.calculator

class Calculator(private val operator: Operator) {
  fun operate(num1: Double, num2: Double): Double {
    return operator.operate(num1, num2)
  }
}

interface Operator {
  fun operate(num1: Double, num2: Double): Double
}

class AddOperator : Operator {
  override fun operate(num1: Double, num2: Double): Double {
    return num1 + num2
  }
}

class SubOperator : Operator {
  override fun operate(num1: Double, num2: Double): Double {
    return num1 - num2
  }
}

class MulOperator : Operator {
  override fun operate(num1: Double, num2: Double): Double {
    return num1 * num2
  }
}

class DivOperator : Operator {
  override fun operate(num1: Double, num2: Double): Double {
    if (num2 == 0.0) throw Error("0으로 나눌 수 없습니다.")

    return num1 / num2
  }
}