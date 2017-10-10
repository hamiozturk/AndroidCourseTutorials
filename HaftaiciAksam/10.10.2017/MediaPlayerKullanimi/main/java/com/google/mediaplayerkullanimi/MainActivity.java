package com.google.mediaplayerkullanimi;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = (ImageButton)findViewById(R.id.imageButton);
        //mediaPlayer = MediaPlayer.create(this,R.raw.music);

        try{
            Uri myUri = Uri.parse("https://stream.my-free-mp3.net/GvWBZB:mHx1rB");
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(this, myUri);
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mediaPlayer.prepare(); //don't use prepareAsync for mp3 playback
        }catch (Exception e){}


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mediaPlayer.isPlaying()){
                    mediaPlayer.start();
                    imageButton.setImageResource(android.R.drawable.ic_media_pause);
                }else{
                    mediaPlayer.pause();
                    imageButton.setImageResource(android.R.drawable.ic_media_play);
                }
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        //mediaPlayer.release();
    }


}
