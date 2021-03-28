package com.example.blackbearcaloriecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = (Button) findViewById(R.id.button);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                openMainActivity2();

            }


        });

    }


    public void openMainActivity2(){
        Intent intent1 = new Intent(this, MainActivity2.class);
        startActivity(intent1);
    }
}


