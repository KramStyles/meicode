package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Layouts extends AppCompatActivity implements View.OnClickListener {

    Button btnHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);

        btnHello = findViewById(R.id.layBtnHello);
        btnHello.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.layBtnHello:
                Intent intent = new Intent(this, Constraits.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}