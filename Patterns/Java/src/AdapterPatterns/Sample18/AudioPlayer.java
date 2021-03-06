package AdapterPatterns.Sample18;

/**
 * Created by Indi on 6/24/2016.
 */
public class AudioPlayer implements MediaPlayer {

    MediaPlayer mp;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mkv")||audioType.equalsIgnoreCase("mp4")){
            mp = new MediaAdapter(audioType);
            mp.play(audioType,fileName);
        }else if(audioType.equalsIgnoreCase("wav")){
            System.out.println("playing wav file "+fileName);
        }else {
            System.out.println("Unknown file type "+audioType);
        }
    }
}
