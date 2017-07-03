package com.enchcorp.kusuma20.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Win extends Activity {
ImageView imageViewc;
    TextView winn;
    Button b,share;
    final Context context=this;
    ImageView im;
    String abc="http://24x7shoppers.com/kusuma0543/rocket.gif";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win_layout);
        Intent intent = getIntent();
        String win=intent.getStringExtra("winner");
        imageViewc=(ImageView)findViewById(R.id.image1);
        Glide.with(this).load(abc).into(imageViewc);
        winn=(TextView)findViewById(R.id.wintxt);
        b=(Button)findViewById(R.id.back);
        im=(ImageView)findViewById(R.id.trophy);
        im.setImageResource(R.drawable.trophy);
        winn.setText(win);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,MainActivity.class);
                startActivity(i);
            }
        });
        share=(Button) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent=new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(sendIntent.EXTRA_TEXT,"This game is Assume ");
                //sendIntent.putExtra("android.intent.extra.SUBJECT",share_data);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
    }
}
