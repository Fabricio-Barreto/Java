package lambdas;

@FunctionalInterface
public interface Calculo {
    double executar(double a, double b);

    default String mensagem() {
        return "Mensagem do metódo default";
    }

    static String outraMensagem() {
        return "Mensagem do metódo static";
    }
}
