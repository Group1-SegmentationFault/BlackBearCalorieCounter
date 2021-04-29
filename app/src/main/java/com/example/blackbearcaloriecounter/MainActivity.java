package com.example.blackbearcaloriecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button enter;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = (Button) findViewById(R.id.button);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                email = (EditText) findViewById(R.id.editTextTextEmailAddress);
                if(Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches())
                    openMainActivity2();
                else
                    Toast.makeText(MainActivity.this,"E-mail is invalid.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void openMainActivity2(){
        Intent intent1 = new Intent(this, MainActivity2.class);
        startActivity(intent1);
    }
}


