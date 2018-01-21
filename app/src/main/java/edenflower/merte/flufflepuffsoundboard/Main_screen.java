package edenflower.merte.flufflepuffsoundboard;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main_screen extends AppCompatActivity {
    private MediaPlayer brumm_player = new MediaPlayer();
    private MediaPlayer gasp_player = new MediaPlayer();
    private MediaPlayer purr_player = new MediaPlayer();
    private MediaPlayer crazy_player = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void brumm (View view){
        if (brumm_player.isPlaying())
        {
            brumm_player.stop();
            brumm_player.release();
            brumm_player = new MediaPlayer();
        }
        else
        {
            try {
                AssetFileDescriptor descriptor = getAssets().openFd("brumm.ogg");
                brumm_player.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                brumm_player.prepare();
                brumm_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        brumm_player.release();
                        brumm_player = new MediaPlayer();
                    }
                });
                brumm_player.start();
                brumm_player.setLooping(true);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void gasp (View view){
        if (gasp_player.isPlaying())
        {
            gasp_player.stop();
            gasp_player.release();
            gasp_player = new MediaPlayer();
        }
        else
        {
            try {
                AssetFileDescriptor descriptor = getAssets().openFd("Gasp.ogg");
                gasp_player.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                gasp_player.prepare();
                gasp_player.setLooping(false);
                gasp_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        gasp_player.release();
                        gasp_player = new MediaPlayer();
                    }
                });
                gasp_player.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void purr (View view){
        if (purr_player.isPlaying())
        {
            purr_player.stop();
            purr_player.release();
            purr_player = new MediaPlayer();
        }
        else
        {
            try {
                AssetFileDescriptor descriptor = getAssets().openFd("purr.ogg");
                purr_player.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                purr_player.prepare();
                purr_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        purr_player.release();
                        purr_player = new MediaPlayer();
                    }
                });
                purr_player.setLooping(true);
                purr_player.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void crazy (View view){
        if (crazy_player.isPlaying())
        {
            crazy_player.stop();
            crazy_player.release();
            crazy_player = new MediaPlayer();
        }
        else
        {
            try {
                AssetFileDescriptor descriptor = getAssets().openFd("crazy.ogg");
                crazy_player.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                crazy_player.prepare();
                crazy_player.setLooping(false);
                crazy_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        crazy_player.release();
                        crazy_player = new MediaPlayer();
                    }
                });
                crazy_player.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
