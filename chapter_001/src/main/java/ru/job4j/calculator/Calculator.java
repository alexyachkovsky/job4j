package ru.job4j.calculator;
/**
 *Class Calculate решения задачи части 001 урок 3.1.
 *@author Alexey Yachkovsky (mailto:yachkovsiy@yahoo.com)
 *version $Id$
 *@since 15.09.2018
 * Производим простейшие арифметические вычисления
 */
public class Calculator {
    /**
     *метод add, subtract, div, multiple производит арифметические действия с аргументами first и second и записывает результат в поле this.result
     */
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
    /**
     *метод double getResult() - метод должен возвращать значение поля result
     */
    public double getResult() {
        return this.result;
    }
}
