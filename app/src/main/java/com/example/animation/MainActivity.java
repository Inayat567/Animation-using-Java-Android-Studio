package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView blink, fade, mov, rotate, slide, zoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blink = findViewById(R.id.blink);
        fade = findViewById(R.id.fade);
        mov = findViewById(R.id.mov);
        rotate = findViewById(R.id.rotate);
        slide = findViewById(R.id.slide);
        zoom = findViewById(R.id.zoom);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation blink1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink1);
                blink.startAnimation(blink1);
                Animation Fade = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);
                fade.startAnimation(Fade);
                Animation Mov = AnimationUtils.loadAnimation(MainActivity.this, R.anim.mov);
                mov.startAnimation(Mov);
                Animation Rotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                rotate.startAnimation(Rotate);
                Animation Slide = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide);
                slide.startAnimation(Slide);
                Animation Zoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
                zoom.startAnimation(Zoom);
            }
        });
    }
}