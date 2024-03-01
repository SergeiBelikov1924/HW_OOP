package HWSeminar7.Structure.Calculator;

public interface ICalculator<E> {
    E summarize(E a, E b);
    E subtract(E a, E b);
    E multiply(E a, E b);
    E divide(E a, E b);
}
