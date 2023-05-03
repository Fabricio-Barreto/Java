package excecao;

public class ChevadaVsNaoChecada {
    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            geraErro2();
        } catch (Throwable e) {
            e.printStackTrace();
        }


        System.out.println("Fim !");
    }

    // Não checada.... Não obriga você a tratar o erro!
    static void geraErro1() {
        throw new RuntimeException("Erro");
    }

    // Checada, precisa ser tratada!
    static void geraErro2() throws Exception {
        throw new Exception("Erro 02");
    }
}
