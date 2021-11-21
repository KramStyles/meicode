package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class third_ui extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_ui);
        Button btnHi = findViewById(R.id.thirdBtnHi);
        TextView txtWelcome = findViewById(R.id.thirdTxtWelcome);

//        Calling click method using the switch case
        Button btnDiffMthd = findViewById(R.id.thirdBtnDifferentClickMethod);
        Button btnToast = findViewById(R.id.thirdBtnToast);

        btnDiffMthd.setOnClickListener(this);
        btnToast.setOnClickListener(this);

        btnHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Say hello in console");
            }
        });
    }

    public void thirdSayHello(View view) {
        TextView txtWelcome = findViewById(R.id.thirdTxtWelcome);
        txtWelcome.setText("Hello and Welcome");
    }

    @Override
    public void onClick(View v) {
        TextView txtWelcome = findViewById(R.id.thirdTxtWelcome);
        switch (v.getId()){
            case R.id.btnHello:
                System.out.println("Hello clicked");
                break;
            case R.id.thirdBtnDifferentClickMethod:
                txtWelcome.setText("Method from Another method Called!");
                break;
            case R.id.thirdBtnToast:
                Intent intent = new Intent(this, UiBasics.class);
                startActivity(intent);
                break;
            default:
                System.out.println("I don't know");
        }
    }
}