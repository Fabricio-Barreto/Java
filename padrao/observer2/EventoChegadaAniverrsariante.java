package padrao.observer2;

import java.util.Date;

public class EventoChegadaAniverrsariante {

    private final Date momento;

    public EventoChegadaAniverrsariante(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }
}
