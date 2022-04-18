package logbook2;


/**
 *   @author Fabio De Araujo
 *   @version 1.0
 *   @date 2022-04-18
 *   @description This is a simple calculator app for showing the
 *                implementation of a gradle pipeline project.
 */

public class CalcApp {

    public static void main(String[] args) {
    CalcApp calc = new CalcApp();
    calc.add(100).subtract(10).multiply(2).divide(5);
    System.out.println("Calculation = " + calc.value());
    }

    private double state = 0;

    public CalcApp add(double value) {
        state += value;
        return this;
    }

    public CalcApp subtract(double value) {
        state -= value;
        return this;
    }

    public CalcApp multiply(double value) {
        state = state * value;
        return this;
    }

    public CalcApp divide(double value) {
        state = state / value;
        return this;
    }

    public void resetCalc() {
        state = 0.0;
    }

    public double value() {
        return state;
    }
}