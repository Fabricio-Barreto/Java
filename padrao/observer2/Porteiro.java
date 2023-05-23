package padrao.observer2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

    public void registrarObservadores(ObservadorChegadaAniversariante observador) {
        observadores.add(observador);
    }

    public void monitorar() {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!"sair".equalsIgnoreCase(valor)) {
            System.out.print("Aniversariante chegou? ");
            valor = entrada.nextLine();

            if("sim".equalsIgnoreCase(valor)) {
                // Criar o evento
                EventoChegadaAniverrsariante evento = new EventoChegadaAniverrsariante(new Date());

                // Notificar os observadores!
                observadores.stream().forEach(observador -> observador.chegou(evento));
                valor = "sair";
            } else {
                System.out.println("Alarme Falso!");
            }
        }
    }
}
