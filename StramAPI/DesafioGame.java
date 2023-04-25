package StramAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesafioGame {
    public static void main(String[] args) {
        Game game01 = new Game("Hollow Knight", "Team Cherry", "Team Cherry", "Unreal", 20.00);
        Game game02 = new Game("Ori and the Blind Florest", "Moon Studios", "Microsoft Studios", "Unity", 30.00);
        Game game03 = new Game("Grand Theft Auto V", "Rockstar North", "Rockstar Games", "Unreal", 50.00);
        Game game04 = new Game("World of Warcraft", "Blizzard Entertainment", "Blizzard Entertainment", "Unity", 70.00);
        Game game05 = new Game("Apex Legends", "Respawn Entertainmen", "Electronic Arts", "Unreal", 00.00);

        List<Game> game = Arrays.asList(game01,game02,game03,game04,game05);


        game.stream()
                .filter((Game jogo) -> {return jogo.price <= 30;})
                .filter((Game jogo) -> {return jogo.engine == "Unreal";})
                .map(e -> {
                    Double valorComDesconto = e.getPrice()*(1-0.15);
                    e.setPrice(valorComDesconto);
                    return e;
                })
                .forEach(System.out::println);
    }
}
