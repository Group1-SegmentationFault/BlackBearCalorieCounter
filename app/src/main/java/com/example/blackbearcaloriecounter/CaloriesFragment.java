package com.example.blackbearcaloriecounter;


import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class CaloriesFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calories, container, false);

        Button calcBtn = (Button) view.findViewById(R.id.calcBtn);

        //Calculates calories on button click
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ageText = (EditText)view.findViewById(R.id.ageInput);
                EditText weightText = (EditText)view.findViewById(R.id.weightInput);
                EditText heightText = (EditText)view.findViewById(R.id.heightInput);

                RadioButton male = (RadioButton)view.findViewById(R.id.maleButton);
                RadioButton female = (RadioButton)view.findViewById(R.id.femaleButton);

                TextView result = (TextView)view.findViewById(R.id.calResult);

                int cals = 0;

                int weight = Integer.parseInt(weightText.getText().toString());
                int age = Integer.parseInt(ageText.getText().toString());
                int height = Integer.parseInt(heightText.getText().toString());



                if (male.isChecked()){
                    cals = (10 * weight) + ((int)6.25*height) - 5*age + 5;
                    result.setText(Integer.toString(cals));
                }

                else if (female.isChecked()){
                    cals = (10 * weight) + ((int)6.25 * height) - 5*age - 161;
                    result.setText(Integer.toString(cals));
                }

            }
        });

        return view;
    }


}
