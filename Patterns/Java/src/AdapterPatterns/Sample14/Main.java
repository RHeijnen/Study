package AdapterPatterns.Sample14;

public class Main {

    public static void main(String[] args) {

        AudioPlayer ap = new AudioPlayer();
        ap.play("mp3","hello");
        ap.play("mp4","hello");
        ap.play("mp5","hello");
        ap.play("wav","hello");
        ap.play("mkv","hello");



    }
}
