import Browser.Browser;
import Calls.Call;
import Musicas.Song_Player;

public class Main {
    public static void main(String[] args) {
        Call call = new Call();
        Song_Player player = new Song_Player();
        Browser web = new Browser();
        call.cellPhone();
        player.Songs_player();
        web.internet();
        call.turnOff();
    }
}