package padrao.observer2;

public class AniversarioSurpresa {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registrarObservadores(namorada);
        porteiro.registrarObservadores(e -> {
            System.out.println("Surpresa via lambda!");
            System.out.println("Ocorreu em: " + e.getMomento());
        });

        porteiro.monitorar();
    }
}
