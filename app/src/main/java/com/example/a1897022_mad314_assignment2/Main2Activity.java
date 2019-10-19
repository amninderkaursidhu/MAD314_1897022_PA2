package com.example.a1897022_mad314_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public TextView tVname;
    TextView  tVpwd,tVid,textView2,textView4,textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tVname=findViewById(R.id.tVname);
        tVpwd=findViewById(R.id.tVpwd);
        tVid=findViewById(R.id.tVid);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        textView6=findViewById(R.id.textView6);


        Intent intent=getIntent();
        String username=intent .getStringExtra("username");
        tVname.setText("Hi Aman");
    }
}
