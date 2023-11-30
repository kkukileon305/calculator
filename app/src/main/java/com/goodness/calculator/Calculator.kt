package com.goodness.calculator

interface Calculator {
  fun operate(num1: Double, num2: Double): Double
}

class AddOperator : Calculator {
  override fun operate(num1: Double, num2: Double): Double {
    return num1 + num2
  }
}

class SubOperator : Calculator {
  override fun operate(num1: Double, num2: Double): Double {
    return num1 - num2
  }
}

class MulOperator : Calculator {
  override fun operate(num1: Double, num2: Double): Double {
    return num1 * num2
  }
}

class DivOperator : Calculator {
  override fun operate(num1: Double, num2: Double): Double {
    if (num2 == 0.0) throw Error("0으로 나눌 수 없습니다.")

    return num1 / num2
  }
}