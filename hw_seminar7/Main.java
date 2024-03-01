package HWSeminar7;

import java.util.Scanner;

import HWSeminar7.Controller.CalcController;
import HWSeminar7.Structure.Calculator.Calculator;
import HWSeminar7.Structure.Calculator.ComplexNumber;
import HWSeminar7.Structure.Calculator.ICalculator;
import HWSeminar7.View.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculator<ComplexNumber> calc = new Calculator();
        CalcController<ComplexNumber> calcController = new CalcController<>(calc);

        ViewCalculator viewCalculator = new ViewCalculator(calcController, new DataInput(new Scanner(System.in)));
        viewCalculator.Start();
    }
}
