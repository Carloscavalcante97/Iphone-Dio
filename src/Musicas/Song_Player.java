package Musicas;

public class Song_Player {
public void Songs_player(){
    chooseSong();
    play();
    pause();
}
    private void chooseSong(){
        System.out.println("Choosing Song");
    }
    private  void play(){
        System.out.println("Playing song...");
    }
    private  void pause(){
        System.out.println("Pausing song...");
    }
}

