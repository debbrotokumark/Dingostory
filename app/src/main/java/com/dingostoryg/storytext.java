package com.dingostoryg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class storytext extends AppCompatActivity {
    ImageView imgbutton;
    TextView textmain,textbody;
    Button copy,share;
    String headt,bodyt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storytext);
        copy=findViewById(R.id.copy);
        share=findViewById(R.id.share);
        imgbutton=findViewById(R.id.imgbutton);
        textmain=findViewById(R.id.textmain);
        textbody=findViewById(R.id.textbody);

        headt=MainActivity.golpohead;
        bodyt=MainActivity.golpobody;
        textmain.setText(""+headt);
        textbody.setText(""+bodyt);


        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tent =new Intent(storytext.this,MainActivity.class);
                startActivity(tent);

            }
        });

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("copy text", bodyt);

                clipboard.setPrimaryClip(clip);
                Toast.makeText(storytext.this,"COPY",Toast.LENGTH_LONG).show();



            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareintent=new Intent();
                shareintent.setAction(Intent.ACTION_SEND);
                shareintent.putExtra(Intent.EXTRA_TEXT,bodyt);
                shareintent.setType("text/plain");
                shareintent=Intent.createChooser(shareintent,"share via");
                startActivity(shareintent);




            }
        });



    }
}