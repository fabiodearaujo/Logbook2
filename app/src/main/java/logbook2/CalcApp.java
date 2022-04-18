package logbook2;


/**
 *   @author Fabio De Araujo
 *   @version 1.0
 *   Created on 18/04/2022
 *   Description: This is a simple calculator app for showing the
 *                implementation of a gradle pipeline project.
 */

public class CalcApp {

    /**
    Main method executing the application.
    @param args the command line arguments
    */
    public static void main(String[] args) {
    CalcApp calc = new CalcApp();
    calc.add(100).subtract(10).multiply(2).divide(5);
    System.out.println("Calculation = " + calc.value());
    }

    private double state = 0;

    /**
    This method adds a number to the current state.
    @param value The number to be added.
    @return The current state.
    */
    public CalcApp add(double value) {
        state += value;
        return this;
    }

    /**
    This method subtracts a number from the current state.
    @param value The number to be subtracted from the current state.
    @return The current state.
    */
    public CalcApp subtract(double value) {
        state -= value;
        return this;
    }

    /**
    This method multiplies the current state by a number.
    @param value The number to be multiplied by the current state.
    @return The current state.
    */
    public CalcApp multiply(double value) {
        state = state * value;
        return this;
    }

    /**
    This method divides the current state by a number.
    @param value The number to be divided by the current state.
    @return The current state.
    */
    public CalcApp divide(double value) {
        state = state / value;
        return this;
    }

    /**
    This method resets the current state to 0.
    */
    public void resetCalc() {
        state = 0.0;
    }

    /**
    This method returns the current state.
    @return The current state.
    */
    public double value() {
        return state;
    }
}