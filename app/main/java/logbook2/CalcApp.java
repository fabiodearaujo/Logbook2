package logbook2;


/**
 *   @author Fabio De Araujo
 *   @version 1.0
 *   @date 2022-04-18
 *   @description This is a simple calculator app for showing the
 *                implementation of a gradle pipeline project.
 */

public class CalcApp {

    private double state;

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

    public void main(String[] args) {
        CalcApp calc = new CalcApp();
        calc.add(10).add(20).add(30).subtract(15).multiply(2).divide(5);
        System.out.println(calc.value());
    }

}