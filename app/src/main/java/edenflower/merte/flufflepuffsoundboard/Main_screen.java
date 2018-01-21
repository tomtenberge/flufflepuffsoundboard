package edenflower.merte.flufflepuffsoundboard;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main_screen extends AppCompatActivity {
    private MediaPlayer brumm_player = new MediaPlayer();
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
            //AssetFileDescriptor descriptor = getAssets().openFd("brumm.ogg");
            //brumm_player.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
            //descriptor.close();
        }
    }

}
