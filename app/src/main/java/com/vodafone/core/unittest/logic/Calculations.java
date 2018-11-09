package com.vodafone.core.unittest.logic;

public class Calculations {

    private CalcLogic calcLogic;

    public Calculations() {

        Numbers numbers = new Numbers();
        numbers.setNum2(15);
        numbers.setNum1(10);
        CalcLogicImpl.getInstance().setNumbers(numbers);
        calcLogic = CalcLogicImpl.getInstance();
    }

    Calculations(CalcLogic calcLogic) {
        this.calcLogic = calcLogic;
    }

    public int add() {

        return calcLogic
                .getNumbers()
                .getNum1() +
                calcLogic
                        .getNumbers()
                        .getNum2();
    }

    public int subtract() {

        return calcLogic
                .getNumbers()
                .getNum1() -
                calcLogic
                        .getNumbers()
                        .getNum2();
    }

    public int divide() {

        return calcLogic
                .getNumbers()
                .getNum1() /
                calcLogic
                        .getNumbers()
                        .getNum2();
    }

    public int multiply() {

        return calcLogic
                .getNumbers()
                .getNum1() *
                calcLogic
                        .getNumbers()
                        .getNum2();
    }

}


