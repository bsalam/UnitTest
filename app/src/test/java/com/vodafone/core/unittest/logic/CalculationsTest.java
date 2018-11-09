package com.vodafone.core.unittest.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationsTest {

    private Calculations calculations;

//    private Calculations calculations;

//    @BeforeClass
//    public void setUpAll() throws Exception {
//
//        calculations = new Calculations();
//    }
//
//    @AfterClass
//    public void tearDownAll() throws Exception {
//
//        calculations = null;
//    }

    @Before
    public void setUp() throws Exception {

        CalcLogicImplMock calcLogicImplMock = new CalcLogicImplMock();
        Numbers numbers = new Numbers();
        numbers.setNum2(11);
        numbers.setNum1(14);
        calcLogicImplMock.setNumbers(numbers);
        calculations = new Calculations(calcLogicImplMock);
    }

    @After
    public void tearDown() throws Exception {

        calculations = null;
    }

    @Test
    public void add() {

        assertEquals(calculations.add(), 25);
    }

    @Test
    public void subtract() {

        assertEquals(calculations.subtract(), 3);
    }

    @Test
    public void divide() {

        assertEquals(calculations.divide(), 1);
    }

    @Test
    public void multiply() {

        assertEquals(calculations.multiply(), 151);
    }
}