package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Images extends AppCompatActivity implements View.OnClickListener{

    private Button btnSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        btnSpinner = findViewById(R.id.btnSpinner);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSpinner:
                Intent intent = new Intent(this, SpinnerList.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}