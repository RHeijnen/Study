package AdapterPatterns.Sample15;

/**
 * Created by Indi on 6/23/2016.
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String fileName) {
        System.out.println("playing mp4 ."+fileName);
    }

    @Override
    public void playMP5(String fileName) {

    }
}
