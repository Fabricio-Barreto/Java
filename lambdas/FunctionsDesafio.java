package lambdas;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionsDesafio {
    public final static BinaryOperator<Double> produtoDescontado = (valor, desconto) -> {
        return valor*(1 - desconto);
    };

    public final static UnaryOperator<Double> impostoMunicipal = valor -> {
        if (valor >= 2500) {
            return valor + (valor * 0.085);
        } else {
            return valor;
        }
    };

    public final static UnaryOperator<Double> frete = valor -> {
        if (valor >= 3000) {
            return valor + 100;
        } else {
            return valor + 50;
        }
    };

    public final static Function<Double, String> arredondar = valor -> {
        return new DecimalFormat("##0.00").format(valor);
    };

    public final static UnaryOperator<String> formatar = valor -> {
        return "R$"+valor.replace(".",",");
    };
}
