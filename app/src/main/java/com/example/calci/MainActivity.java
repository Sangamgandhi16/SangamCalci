package com.example.calci;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue , etSecondValue;    // here we hv initialised all the views//
    TextView tvAns;
    Button add , subtract , multiply , divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);  //here we are finding views by ids
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide= findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {   //makind add button repond to click event
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString()); //parsing etfirstvalue into intgeger type
                secondValue= Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue + secondValue;

                tvAns.setText("Ans is "+ans); //setting ans into textview of tvans


            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {   //makind add button repond to click event
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString()); //parsing etfirstvalue into intgeger type
                secondValue= Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue - secondValue;

                tvAns.setText("Ans is "+ans); //setting ans into textview of tvans


            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {   //makind add button repond to click event
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString()); //parsing etfirstvalue into intgeger type
                secondValue= Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue * secondValue;

                tvAns.setText("Ans is "+ans); //setting ans into textview of tvans


            }
        });

        divide.setOnClickListener(new View.OnClickListener() {   //makind add button repond to click event
            @Override
            public void onClick(View view) {

                int firstValue , secondValue , ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString()); //parsing etfirstvalue into intgeger type
                secondValue= Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue / secondValue;

                tvAns.setText("Ans is "+ans); //setting ans into textview of tvans


            }
        });
    }
}