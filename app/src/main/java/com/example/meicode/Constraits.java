package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Constraits extends AppCompatActivity implements View.OnClickListener {

    private Button btnImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraits);

        btnImages = findViewById(R.id.button4);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button4:
                Intent intent = new Intent(this, Images.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}