package com.example.a1897022_mad314_assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 EditText eTid ,eTpwd;
 Button button;

 String myusername="aman";
 String mypassword="12345";
    RecyclerView rvStudents;
    private StudentAdaptor mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvStudents = findViewById(R.id.rvStudents);
        layoutManager = new LinearLayoutManager(this);
        rvStudents.setLayoutManager(layoutManager);

        mAdapter = new StudentAdapter(getApplicationContext());
        rvStudents.setAdapter(mAdapter);

        final StudentAdaptor = StudentAdaptor.getInstance();

        eTid=findViewById(R.id.eTid);
        eTpwd=findViewById(R.id.eTpwd);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable usernameedit=eTid.getText();
                String username=usernameedit.toString();
                Editable passwordedit=eTpwd.getText();
                String password=passwordedit.toString();

                if (username.equals(myusername)&& password.equals(mypassword) ) {


                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("username",username);
                    startActivity(intent);
                }
            }
        });




    }
}
