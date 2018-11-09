package com.vodafone.core.unittest.logic;

public class CalcLogicImpl implements CalcLogic {

    private Numbers numbers;

    private static CalcLogicImpl calcLogic;

    private CalcLogicImpl() {
    }

    static CalcLogicImpl getInstance() {

        if (calcLogic == null)
            calcLogic = new CalcLogicImpl();

        return calcLogic;
    }

    @Override
    public Numbers getNumbers() {
        return numbers;
    }

    @Override
    public void setNumbers(Numbers numbers) {
        this.numbers = numbers;
    }
}
