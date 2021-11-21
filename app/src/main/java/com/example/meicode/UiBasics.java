package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UiBasics extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_basics);

        Button btnToast = findViewById(R.id.uiBtnToast);


        btnToast.setOnClickListener(this);
        btnToast.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(UiBasics.this, "You clicked and held", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.uiBtnToast:
                Toast.makeText(this, "Music is playing in ear", Toast.LENGTH_SHORT).show();
                break;
            default:
                System.out.println("I don't understand ooo");
        }
    }

}