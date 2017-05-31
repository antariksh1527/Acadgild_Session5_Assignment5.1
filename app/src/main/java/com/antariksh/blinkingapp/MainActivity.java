package com.antariksh.blinkingapp;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animator.AnimatorListener {

    Animation animationBlink;
    TextView blinkView;
    Button startBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   // Layout Passing

        blinkView = (TextView) findViewById(R.id.blinkView);
        startBtn = (Button) findViewById(R.id.startBtn);

        animationBlink = AnimationUtils.loadAnimation(this,R.anim.fade_in);  // Loading Animation

        startBtn.setOnClickListener(new View.OnClickListener() {   //Setting onClick nimation Listener
            @Override
            public void onClick(View v) {
                blinkView.setVisibility(View.VISIBLE);
                blinkView.startAnimation(animationBlink);         // Start Animation
            }
        });
    }

    @Override
    public void onAnimationStart(Animator animation) {      // auto generated method

    }

    @Override
    public void onAnimationEnd(Animator animation) {        // auto generated method

        //Toast.makeText(getBaseContext(),"Animation Stopped..",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAnimationCancel(Animator animation) {     // auto generated method

    }

    @Override
    public void onAnimationRepeat(Animator animation) {     // auto generated method

    }
}
