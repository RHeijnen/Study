package AdapterPatterns.Sample12;

/**
 * Created by Indi on 6/23/2016.
 */
public class MKVPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMKV(String fileName) {
        System.out.println("Playing MKV : "+fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
