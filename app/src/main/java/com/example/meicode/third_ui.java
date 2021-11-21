package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class third_ui extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_ui);
    }

    public void thirdSayHello(View view) {
        TextView txtWelcome = findViewById(R.id.thirdTxtWelcome);
        txtWelcome.setText("Hello and Welcome");
    }
}