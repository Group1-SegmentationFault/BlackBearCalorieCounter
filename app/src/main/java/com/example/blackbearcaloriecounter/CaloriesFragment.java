package com.example.blackbearcaloriecounter;


import android.os.Bundle;
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
                //text input
                EditText ageText = (EditText)view.findViewById(R.id.ageInput);
                EditText weightText = (EditText)view.findViewById(R.id.weightInput);
                EditText heightFt = (EditText)view.findViewById(R.id.heightFt);
                EditText heightIn = (EditText)view.findViewById(R.id.heightIn);

                // m/f radio group
                RadioButton male = (RadioButton)view.findViewById(R.id.maleButton);
                RadioButton female = (RadioButton)view.findViewById(R.id.femaleButton);

                // activity level radio group
                RadioButton inactive = (RadioButton)view.findViewById(R.id.inactiveButton);
                RadioButton light = (RadioButton)view.findViewById(R.id.lightButton);
                RadioButton moderate = (RadioButton)view.findViewById(R.id.moderateButton);
                RadioButton heavy = (RadioButton)view.findViewById(R.id.heavyButton);

                // weight goals radio group
                RadioButton lose = (RadioButton)view.findViewById(R.id.loseButton);
                RadioButton maintain = (RadioButton)view.findViewById(R.id.maintainButton);
                RadioButton gain = (RadioButton)view.findViewById(R.id.gainButton);

                TextView result = (TextView)view.findViewById(R.id.calResult);

                // get age, weight, height
                int weight = Integer.parseInt(weightText.getText().toString());
                int age = Integer.parseInt(ageText.getText().toString());
                int height = (Integer.parseInt(heightFt.getText().toString()) * 12) +
                        Integer.parseInt(heightIn.getText().toString());

                double BMR = 0;
                double TEE = 0;
                int cals = 0;

                //calculate Basal Metabolic Rate based on gender
                if (male.isChecked()){
                    BMR = (10 * weight * 0.454) + (6.25*height*2.54) - 5*age + 5;
                }

                else if (female.isChecked()){
                    BMR = (10 * weight * 0.454) + (6.25*height*2.54) - 5*age - 161;
                }

                // calculate Total Energy Expenditure based on activity level
                if (inactive.isChecked()){
                    TEE = 1.2;
                    //calculate cals based on weight goals
                    if (lose.isChecked()){
                        cals = (int)(BMR * TEE * 0.75);
                    }
                    else if (maintain.isChecked()){
                        cals = (int)(BMR * TEE);
                    }
                    else if (gain.isChecked()){
                        cals = (int)(BMR * TEE * 1.25);
                    }
                }

                else if (light.isChecked()){
                    TEE = 1.375;
                    if (lose.isChecked()){
                        cals = (int)(BMR * TEE * 0.79);
                    }
                    else if (maintain.isChecked()){
                        cals = (int)(BMR * TEE);
                    }
                    else if (gain.isChecked()){
                        cals = (int)(BMR * TEE * 1.21);
                    }
                }

                else if (moderate.isChecked()){
                    TEE = 1.55;
                    if (lose.isChecked()){
                        cals = (int)(BMR * TEE * 0.81);
                    }
                    else if (maintain.isChecked()){
                        cals = (int)(BMR * TEE);
                    }
                    else if (gain.isChecked()){
                        cals = (int)(BMR * TEE * 1.19);
                    }
                }

                else if (heavy.isChecked()){
                    TEE = 1.725;
                    if (lose.isChecked()){
                        cals = (int)(BMR * TEE * 0.83);
                    }
                    else if (maintain.isChecked()){
                        cals = (int)(BMR * TEE);
                    }
                    else if (gain.isChecked()){
                        cals = (int)(BMR * TEE *1.17);
                    }
                }

                result.setText(Integer.toString(cals));

            }
        });

        return view;
    }


}
