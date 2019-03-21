package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private HandWrite handWrite=null;
    private Button clear=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       handWrite=(HandWrite)findViewById(R.id.handwriteview);
       clear=(Button)findViewById(R.id.clear);
       clear.setOnClickListener(new mClick());
    }

   private class mClick implements OnClickListener{

        public void onClick(View v){
            handWrite.clear();
        }
    }
}
