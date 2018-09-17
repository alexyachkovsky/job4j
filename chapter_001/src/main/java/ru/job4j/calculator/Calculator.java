package ru.job4j.calculator;
/**
 *Class Calculate решения задачи части 001 урок 3.1.
 *@author Alexey Yachkovsky (mailto:yachkovsiy@yahoo.com)
 *version $Id$
 *@since 15.09.2018
 */
public class Calculator {
    private double result;

    public void add(double first, double second) {
        this.result = first + second;
    }
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    public void div(double first, double second) {
        this.result = first / second;
    }
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }
}
