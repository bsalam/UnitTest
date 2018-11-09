package com.vodafone.core.unittest.logic;

public class CalcLogicImplMock implements CalcLogic {

    Numbers numbers;

    @Override
    public Numbers getNumbers() {

        return numbers;
    }

    @Override
    public void setNumbers(Numbers numbers) {

        this.numbers = numbers;
    }
}
