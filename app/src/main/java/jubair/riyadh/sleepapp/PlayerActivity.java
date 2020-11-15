package jubair.riyadh.sleepapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class PlayerActivity extends AppCompatActivity {

    SeekBar seekbar;
    TextView musicname,musiccategory,player_duration,full_duration;
    ImageView backwordsbtn,pausebtn,playbtn,forwordsbtn;
    String name,details;
    int music;
    MediaPlayer mediaPlayer;
    Handler handler=new Handler();
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        seekbar=findViewById(R.id.musicseekbar);
        musicname=findViewById(R.id.musicname);
        musiccategory=findViewById(R.id.musiccategory);
        backwordsbtn=findViewById(R.id.backwordsbtn);
        pausebtn=findViewById(R.id.pausebtn);
        playbtn=findViewById(R.id.playbtn);
        forwordsbtn=findViewById(R.id.forwordsbtn);
        player_duration=findViewById(R.id.player_duration);
        full_duration=findViewById(R.id.full_duration);

        name=getIntent().getStringExtra(SleepAdapter.Name);
        details=getIntent().getStringExtra(SleepAdapter.Details);
        music=getIntent().getIntExtra(SleepAdapter.Music,0);
        musicname.setText(name);
        musiccategory.setText(details);

        mediaPlayer =MediaPlayer.create(PlayerActivity.this,music);

        //player_duration.setText(conertFormat(mediaPlayer.getCurrentPosition()));
        full_duration.setText(conertFormat(mediaPlayer.getDuration()));
        runnable=new Runnable() {
            @Override
            public void run() {
                seekbar.setProgress(mediaPlayer.getCurrentPosition());

                handler.postDelayed(this,500);
            }
        };

        int duration=mediaPlayer.getDuration();

        String sDuration=conertFormat(duration);

        //player_duration.setText(sDuration);

        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playbtn.setVisibility(View.GONE);

                pausebtn.setVisibility(View.VISIBLE);

                mediaPlayer.start();
                seekbar.setMax(mediaPlayer.getDuration());

                handler.postDelayed(runnable,0);
            }
        });
        pausebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playbtn.setVisibility(View.VISIBLE);

                pausebtn.setVisibility(View.GONE);

                mediaPlayer.pause();

                handler.removeCallbacks(runnable);
            }
        });

        forwordsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition=mediaPlayer.getCurrentPosition();

                int duration=mediaPlayer.getDuration();

                if (mediaPlayer.isPlaying()&&duration!=currentPosition){

                    currentPosition=currentPosition+15000;

                    player_duration.setText(conertFormat(currentPosition));
                    mediaPlayer.seekTo(currentPosition);

                }
            }
        });

        backwordsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition=mediaPlayer.getCurrentPosition();

                int duration=mediaPlayer.getDuration();

                if (mediaPlayer.isPlaying()&&currentPosition>15000){

                    currentPosition=currentPosition-15000;

                    player_duration.setText(conertFormat(currentPosition));
                    mediaPlayer.seekTo(currentPosition);

                }
            }
        });

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser){
                    mediaPlayer.seekTo(progress);
                }
                player_duration.setText(conertFormat(mediaPlayer.getCurrentPosition()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                pausebtn.setVisibility(View.GONE);
                playbtn.setVisibility(View.VISIBLE);
                mediaPlayer.seekTo(0);
            }
        });


    }
    @SuppressLint("DefaultLocale")
    private String conertFormat(int duration){

        return String.format("%02d:%02d", TimeUnit.MILLISECONDS.toMinutes(duration)
                ,TimeUnit.MILLISECONDS.toSeconds(duration)-TimeUnit.MINUTES.
                        toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
    }

    public void cancle(View view) {

        mediaPlayer.stop();
        onBackPressed();

    }
}