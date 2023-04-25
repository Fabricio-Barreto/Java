package lambdas;
public class Desafio {
    public static void main(String[] args) {

        Produto p = new Produto("iPad", 3235.89, 0.13);

        System.out.println(FunctionsDesafio.produtoDescontado
                .andThen(FunctionsDesafio.impostoMunicipal)
                .andThen(FunctionsDesafio.frete)
                .andThen(FunctionsDesafio.arredondar)
                .andThen(FunctionsDesafio.formatar)
                .apply(p.getValor(), p.getDesconto()));
    }
}
