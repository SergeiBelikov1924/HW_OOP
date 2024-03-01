package HWSeminar7.View;

import HWSeminar7.DataInput;
import HWSeminar7.Controller.CalcController;
import HWSeminar7.Structure.Calculator.ComplexNumber;

public class ViewCalculator {
    private final CalcController<ComplexNumber> calcController;
    private final DataInput dataInput;

    public ViewCalculator(CalcController<ComplexNumber> calcController, DataInput dataInput) {
        this.calcController = calcController;
        this.dataInput = dataInput;
    }

    private static void Awake() {
        double aReal = dataInput.prompt("Введите действительное число А: ");
        double aImg = dataInput.prompt("Введите мнимое число A: ");
        String operator = dataInput.getOperator();
        double bReal = dataInput.prompt("Введите действительное число B: ");
        double bImg = dataInput.prompt("Введите мнимое число B: ");

        ComplexNumber real = new ComplexNumber(aReal, aImg);
        ComplexNumber imaginary = new ComplexNumber(bReal, bImg);
        ComplexNumber result;

        switch (operator) {
            case "+":
                result = calcController.summarize(real, imaginary);
                System.out.println(STR."Результат = \{result.toString()}");
                break;
            case "-":
                result = calcController.subtract(real, imaginary);
                System.out.println(STR."Результат = \{result.toString()}");
                break;
            case "*":
                result = calcController.multiply(real, imaginary);
                System.out.println(STR."Результат = \{result.toString()}");
                break;
            case "/":
                result = calcController.divide(real, imaginary);
                System.out.println(STR."Результат = \{result.toString()}");
                break;
            default:
                System.out.println("Неверный оператор. Попробуйте еще раз.");
        }
    }

    public void Start() {
        while(true) {
            String action = dataInput.prompt();
            if (action.equals("q")) {
                System.exit(0);
            } else {
                Awake();
            }
        }
    }


}
