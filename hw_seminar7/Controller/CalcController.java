package HWSeminar7.Controller;

import HWSeminar7.Structure.Calculator.ICalculator;
import HWSeminar7.Structure.Calculator.ComplexNumber;
import HWSeminar7.Structure.Logger.Logger;

public class CalcController<E> {
    private ICalculator<ComplexNumber> calculator;
    private Logger logger;

    public CalcController(ICalculator<ComplexNumber> calculator) {
        this.calculator = calculator;
        logger = new Logger();
    }

    public ComplexNumber summarize(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.summarize(a, b);
        logger.log(STR."Сумма комплексных чисел: \{a.toString()} and \{b.toString()} = \{result}");
        return result;
    }

    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.subtract(a, b);
        logger.log(STR."Разница комплексных чисел: \{a.toString()} and \{b.toString()} = \{result}");
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.multiply(a, b);
        logger.log(STR."Произведение комплексных чисел: \{a.toString()} and \{b.toString()} = \{result}");
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.divide(a, b);
        logger.log(STR."Частное комплексных чисел \{a.toString()} and \{b.toString()} = \{result}");
        return result;
    }
}

