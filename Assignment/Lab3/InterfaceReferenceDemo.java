package Assignment.Lab3;

interface MusicPlayer {
    void play();
}

class SoundBox implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing music on SoundBox");
    }
}

public class InterfaceReferenceDemo {
    public static void main(String[] args) {
        MusicPlayer player = new SoundBox();
        player.play();
    }
}