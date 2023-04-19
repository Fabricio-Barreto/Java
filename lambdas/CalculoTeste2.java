package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> { return x + y;};
        System.out.println(calc.apply(2.0, 3.0));

        Calculo calculo = (x,y) -> {
          return x + y;
        };

        System.out.println(calculo.executar(2,3));

        calculo = (x, y) -> x * y;

        System.out.println(calculo.executar(10,33));

        System.out.println(calculo.mensagem());
        System.out.println(Calculo.outraMensagem());

    }
}
