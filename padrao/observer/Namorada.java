package padrao.observer;

public class Namorada implements  ChegadaAniversarianteObserver{


    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Apagar as Luzes...");
        System.out.println("Fazer Silência!!!");
        System.out.println("Surpresa!!!!");
    }
}
