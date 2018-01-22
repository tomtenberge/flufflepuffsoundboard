package edenflower.merte.flufflepuffsoundboard;

import android.content.res.AssetFileDescriptor;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Main_screen extends AppCompatActivity {
    private int color1 = Color.rgb(249, 202, 233);
    private int color2 = Color.rgb(219, 166, 201);
    private MediaPlayer brumm_player = new MediaPlayer();
    private MediaPlayer gasp_player = new MediaPlayer();
    private MediaPlayer purr_player = new MediaPlayer();
    private MediaPlayer crazy_player = new MediaPlayer();
    private MediaPlayer bananas_player = new MediaPlayer();
    private MediaPlayer fluffle_player = new MediaPlayer();
    private MediaPlayer puff_player = new MediaPlayer();
    private MediaPlayer kar_player = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setContentView(R.layout.activity_main_screen);
    }

    public void brumm (View view){
        final Button btn = findViewById(R.id.button1);
        if (brumm_player.isPlaying())
        {
            brumm_player.stop();
            brumm_player.release();
            brumm_player = new MediaPlayer();
            btn.setBackgroundColor(color1);
        }
        else
        {
            btn.setBackgroundColor(color2);
            try {
                AssetFileDescriptor descriptor = getAssets().openFd("brumm.ogg");
                brumm_player.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                brumm_player.prepare();
                brumm_player.setLooping(true);
                brumm_player.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void gasp (View view){
        final Button btn = findViewById(R.id.button2);
        if (gasp_player.isPlaying())
        {
            gasp_player.stop();
            gasp_player.release();
            gasp_player = new MediaPlayer();
            btn.setBackgroundColor(color1);
        }
        else
        {
            btn.setBackgroundColor(color2);
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
                        btn.setBackgroundColor(color1);
                    }
                });
                gasp_player.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void purr (View view){
        final Button btn = findViewById(R.id.button3);
        if (purr_player.isPlaying())
        {
            purr_player.stop();
            purr_player.release();
            purr_player = new MediaPlayer();
            btn.setBackgroundColor(color1);
        }
        else
        {
            btn.setBackgroundColor(color2);
            try {
                AssetFileDescriptor descriptor = getAssets().openFd("purr.ogg");
                purr_player.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                purr_player.prepare();
                purr_player.setLooping(true);
                purr_player.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void crazy (View view){
        final Button btn = findViewById(R.id.button4);
        if (crazy_player.isPlaying())
        {
            crazy_player.stop();
            crazy_player.release();
            crazy_player = new MediaPlayer();
            btn.setBackgroundColor(color1);
        }
        else
        {
            btn.setBackgroundColor(color2);
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
                        btn.setBackgroundColor(color1);
                    }
                });
                crazy_player.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void bananas (View view){
        final Button btn = findViewById(R.id.button5);
        if (bananas_player.isPlaying())
        {
            bananas_player.stop();
            bananas_player.release();
            bananas_player = new MediaPlayer();
            btn.setBackgroundColor(color1);
        }
        else
        {
            btn.setBackgroundColor(color2);
            try {
                AssetFileDescriptor descriptor = getAssets().openFd("crazy.ogg");
                bananas_player.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                bananas_player.prepare();
                bananas_player.setLooping(false);
                bananas_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        bananas_player.release();
                        bananas_player = new MediaPlayer();
                        btn.setBackgroundColor(color1);
                    }
                });
                bananas_player.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void fluffle (View view){
        final Button btn = findViewById(R.id.button6);
        if (fluffle_player.isPlaying())
        {
            fluffle_player.stop();
            fluffle_player.release();
            fluffle_player = new MediaPlayer();
            btn.setBackgroundColor(color1);
        }
        else
        {
            btn.setBackgroundColor(color2);
            try {
                AssetFileDescriptor descriptor = getAssets().openFd("crazy.ogg");
                fluffle_player.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                fluffle_player.prepare();
                fluffle_player.setLooping(false);
                fluffle_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        fluffle_player.release();
                        fluffle_player = new MediaPlayer();
                        btn.setBackgroundColor(color1);
                    }
                });
                fluffle_player.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void puff (View view){
        final Button btn = findViewById(R.id.button7);
        if (puff_player.isPlaying())
        {
            puff_player.stop();
            puff_player.release();
            puff_player = new MediaPlayer();
            btn.setBackgroundColor(color1);
        }
        else
        {
            btn.setBackgroundColor(color2);
            try {
                AssetFileDescriptor descriptor = getAssets().openFd("crazy.ogg");
                puff_player.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                puff_player.prepare();
                puff_player.setLooping(false);
                puff_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        puff_player.release();
                        puff_player = new MediaPlayer();
                        btn.setBackgroundColor(color1);
                    }
                });
                puff_player.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void kar (View view){
        final Button btn = findViewById(R.id.button8);
        if (kar_player.isPlaying())
        {
            kar_player.stop();
            kar_player.release();
            kar_player = new MediaPlayer();
            btn.setBackgroundColor(color1);
        }
        else
        {
            btn.setBackgroundColor(color2);
            try {
                AssetFileDescriptor descriptor = getAssets().openFd("crazy.ogg");
                kar_player.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                kar_player.prepare();
                kar_player.setLooping(false);
                kar_player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        kar_player.release();
                        kar_player = new MediaPlayer();
                        btn.setBackgroundColor(color1);
                    }
                });
                kar_player.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
