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
    private MediaPlayer player_m_1 = new MediaPlayer();
    private MediaPlayer player_m_2 = new MediaPlayer();
    private MediaPlayer player_m_3 = new MediaPlayer();
    private MediaPlayer player_m_4 = new MediaPlayer();
    private MediaPlayer player_m_5 = new MediaPlayer();
    private MediaPlayer player_m_8 = new MediaPlayer();
    private MediaPlayer player_pfu_2 = new MediaPlayer();
    private MediaPlayer player_pfu_3 = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setContentView(R.layout.activity_main_screen);
    }
    public void mainscreen(View view){
        this.setContentView(R.layout.activity_main_screen);
        if (player_m_1.isPlaying()){
            final Button btn = findViewById(R.id.button1);
            try {
                btn.setBackgroundColor(color2);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        if (player_m_2.isPlaying()){
            final Button btn = findViewById(R.id.button2);
            try {
                btn.setBackgroundColor(color2);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        if (player_m_3.isPlaying()){
            final Button btn = findViewById(R.id.button3);
            try {
                btn.setBackgroundColor(color2);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        if (player_m_4.isPlaying()){
            final Button btn = findViewById(R.id.button4);
            try {
                btn.setBackgroundColor(color2);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        if (player_m_5.isPlaying()){
            final Button btn = findViewById(R.id.button5);
            try {
                btn.setBackgroundColor(color2);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        if (player_m_8.isPlaying()){
            final Button btn = findViewById(R.id.button8);
            try {
                btn.setBackgroundColor(color2);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void btn_m_1 (View view){
        final Button btn = findViewById(R.id.button1);
        if (player_m_1.isPlaying())
        {
            player_m_1.stop();
            player_m_1.release();
            player_m_1 = new MediaPlayer();
            try {
                btn.setBackgroundColor(color1);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                btn.setBackgroundColor(color2);
                AssetFileDescriptor descriptor = getAssets().openFd("brumm.ogg");
                player_m_1.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                player_m_1.prepare();
                player_m_1.setLooping(true);
                player_m_1.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void btn_m_2 (View view){
        final Button btn = findViewById(R.id.button2);
        if (player_m_2.isPlaying())
        {
            player_m_2.stop();
            player_m_2.release();
            player_m_2 = new MediaPlayer();
            try {
                btn.setBackgroundColor(color1);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                btn.setBackgroundColor(color2);
                AssetFileDescriptor descriptor = getAssets().openFd("Gasp.ogg");
                player_m_2.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                player_m_2.prepare();
                player_m_2.setLooping(false);
                player_m_2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        player_m_2.release();
                        player_m_2 = new MediaPlayer();
                        btn.setBackgroundColor(color1);
                    }
                });
                player_m_2.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void btn_m_3 (View view){
        final Button btn = findViewById(R.id.button3);
        if (player_m_3.isPlaying())
        {
            player_m_3.stop();
            player_m_3.release();
            player_m_3 = new MediaPlayer();
            try {
                btn.setBackgroundColor(color1);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                btn.setBackgroundColor(color2);
                AssetFileDescriptor descriptor = getAssets().openFd("purr.ogg");
                player_m_3.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                player_m_3.prepare();
                player_m_3.setLooping(true);
                player_m_3.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void btn_m_4 (View view){
        final Button btn = findViewById(R.id.button4);
        if (player_m_4.isPlaying())
        {
            player_m_4.stop();
            player_m_4.release();
            player_m_4 = new MediaPlayer();
            try {
                btn.setBackgroundColor(color1);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                btn.setBackgroundColor(color2);
                AssetFileDescriptor descriptor = getAssets().openFd("crazy.ogg");
                player_m_4.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                player_m_4.prepare();
                player_m_4.setLooping(false);
                player_m_4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        player_m_4.release();
                        player_m_4 = new MediaPlayer();
                        btn.setBackgroundColor(color1);
                    }
                });
                player_m_4.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void btn_m_5 (View view){
        final Button btn = findViewById(R.id.button5);
        if (player_m_5.isPlaying())
        {
            player_m_5.stop();
            player_m_5.release();
            player_m_5 = new MediaPlayer();
            try {
                btn.setBackgroundColor(color1);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                btn.setBackgroundColor(color2);
                AssetFileDescriptor descriptor = getAssets().openFd("Vanheart.ogg");
                player_m_5.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                player_m_5.prepare();
                player_m_5.setLooping(false);
                player_m_5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        player_m_5.release();
                        player_m_5 = new MediaPlayer();
                        btn.setBackgroundColor(color1);
                    }
                });
                player_m_5.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void btn_m_6 (View view){
        this.setContentView(R.layout.pfudor);
        if (player_pfu_2.isPlaying()){
            final Button btn = findViewById(R.id.button2);
            try {
                btn.setBackgroundColor(color2);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        if (player_pfu_3.isPlaying()){
            final Button btn = findViewById(R.id.button3);
            try {
                btn.setBackgroundColor(color2);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void btn_m_7 (View view) {

    }
    public void btn_m_8 (View view){
        final Button btn = findViewById(R.id.button8);
        if (player_m_8.isPlaying())
        {
            player_m_8.stop();
            player_m_8.release();
            player_m_8 = new MediaPlayer();
            try {
                btn.setBackgroundColor(color1);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                btn.setBackgroundColor(color2);
                AssetFileDescriptor descriptor = getAssets().openFd("crazy.ogg");
                player_m_8.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                player_m_8.prepare();
                player_m_8.setLooping(false);
                player_m_8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        player_m_8.release();
                        player_m_8 = new MediaPlayer();
                        btn.setBackgroundColor(color1);
                    }
                });
                player_m_8.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void btn_pfu_2 (View view){
        final Button btn = findViewById(R.id.button2);
        if (player_pfu_2.isPlaying())
        {
            player_pfu_2.stop();
            player_pfu_2.release();
            player_pfu_2 = new MediaPlayer();
            try {
                btn.setBackgroundColor(color1);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                btn.setBackgroundColor(color2);
                AssetFileDescriptor descriptor = getAssets().openFd("PFUDOR.ogg");
                player_pfu_2.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                player_pfu_2.prepare();
                player_pfu_2.setLooping(false);
                player_pfu_2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        player_pfu_2.release();
                        player_pfu_2 = new MediaPlayer();
                        btn.setBackgroundColor(color1);
                    }
                });
                player_pfu_2.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }    
    public void btn_pfu_3 (View view){
        final Button btn = findViewById(R.id.button3);
        if (player_pfu_3.isPlaying())
        {
            player_pfu_3.stop();
            player_pfu_3.release();
            player_pfu_3 = new MediaPlayer();
            try {
                btn.setBackgroundColor(color1);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                btn.setBackgroundColor(color2);
                AssetFileDescriptor descriptor = getAssets().openFd("PFUDOR.ogg");
                player_pfu_3.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                player_pfu_3.prepare();
                player_pfu_3.setLooping(false);
                player_pfu_3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        player_pfu_3.release();
                        player_pfu_3 = new MediaPlayer();
                        btn.setBackgroundColor(color1);
                    }
                });
                player_pfu_3.start();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

}
