package com.example.CompleteCalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView visor;
    Button btSoma, btSub, btMult, btDiv, bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btPonto, btRes, btClear, btBack;
    Boolean Soma = false, Sub = false, Div = false, Mult = false;
    String str = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView visor = findViewById(R.id.visor);
        final Button btSoma = findViewById(R.id.btSoma);
        final Button btSub = findViewById(R.id.btSub);
        final Button btMult = findViewById(R.id.btMult);
        final Button btDiv = findViewById(R.id.btDiv);
        final Button btPonto = findViewById(R.id.btPonto);
        final Button btRes = findViewById(R.id.btRes);
        final Button btClear = findViewById(R.id.btClear);
        final Button btBack = findViewById(R.id.btBack);
        final Button bt0 = findViewById(R.id.bt0);
        final Button bt1 = findViewById(R.id.bt1);
        final Button bt2 = findViewById(R.id.bt2);
        final Button bt3 = findViewById(R.id.bt3);
        final Button bt4 = findViewById(R.id.bt4);
        final Button bt5 = findViewById(R.id.bt5);
        final Button bt6 = findViewById(R.id.bt6);
        final Button bt7 = findViewById(R.id.bt7);
        final Button bt8 = findViewById(R.id.bt8);
        final Button bt9 = findViewById(R.id.bt9);
        visor.setText(str);
        bt0.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("0")) str = "";
                str = str + "0";
                visor.setText(str);
            }
        });
        bt1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("0")) str = "";
                str = str + "1";
                visor.setText(str);
            }
        });
        bt2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("0")) str = "";
                str = str + "2";
                visor.setText(str);
            }
        });
        bt3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("0")) str = "";
                str = str + "3";
                visor.setText(str);
            }
        });
        bt4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("0")) str = "";
                str = str + "4";
                visor.setText(str);
            }
        });
        bt5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("0")) str = "";
                str = str + "5";
                visor.setText(str);
            }
        });
        bt6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("0")) str = "";
                str = str + "6";
                visor.setText(str);
            }
        });
        bt7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("0")) str = "";
                str = str + "7";
                visor.setText(str);
            }
        });
        bt8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("0")) str = "";
                str = str + "8";
                visor.setText(str);
            }
        });
        bt9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("0")) str = "";
                str = str + "9";
                visor.setText(str);
            }
        });
        btSoma.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "+";
                visor.setText(str);
                Soma = true;
            }
        });
        btSub.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str.equals("0")) str = "-";
                else {
                    str = str + "-";
                    Sub = true;
                }
                visor.setText(str);
            }
        });
        btMult.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "*";
                visor.setText(str);
                Mult = true;
            }
        });
        btDiv.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "/";
                visor.setText(str);
                Div = true;
            }
        });
        btBack.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = str.length();
                str = str.substring(0,length-1);
                if(str.equals("")) str = "0";
                visor.setText(str);
            }
        });
        btClear.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "0";
                visor.setText(str);
            }
        });
        btPonto.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + ".";
                visor.setText(str);
            }
        });
        btRes.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                double calc = 0;
                String vet[] = new String[2];
                if(Soma == true){
                    vet = str.split("\\+");
                    calc = Double.parseDouble(vet[0]) + Double.parseDouble(vet[1]);
                    str = String.valueOf(calc);
                }
                else if(Sub == true ) {
                    if (str.indexOf("-") == 0) {
                        str = str.substring(1, str.length());
                        vet = str.split("\\-");
                        calc = -Double.parseDouble(vet[0]) - Double.parseDouble(vet[1]);

                    }
                    else{
                        vet = str.split("\\-");
                        calc = Double.parseDouble(vet[0]) - Double.parseDouble(vet[1]);
                    }
                    str = String.valueOf(calc);
                }
                else if(Mult == true ){
                    vet = str.split("\\*");
                    calc = Double.parseDouble(vet[0]) * Double.parseDouble(vet[1]);
                    str = String.valueOf(calc);
                }
                else if(Div == true ){
                    vet = str.split("\\/");
                    calc = Double.parseDouble(vet[0]) / Double.parseDouble(vet[1]);
                    str = String.valueOf(calc);
                }
                visor.setText(str);
                Soma = false; Sub = false; Div = false; Mult = false;
            }
        });


    }
}