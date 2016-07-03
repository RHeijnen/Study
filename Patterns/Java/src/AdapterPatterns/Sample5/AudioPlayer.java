package AdapterPatterns.Sample5;

/**
 * Created by Indi on 6/23/2016.
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mp;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("wav")){
            System.out.println("playing wav file : "+fileName );
        }else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("MKV")){
            mp = new MediaAdapter();
            mp.play(audioType,fileName);
        }else{
            System.out.println("Unknown file type : "+audioType );
        }
    }
}
