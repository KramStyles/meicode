package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtHello = findViewById(R.id.txtMsg);
        txtHello.setText("Hello and how are you?");
    }

    public void btnClick(View view){
        TextView txtHello = findViewById(R.id.txtMsg);
        EditText editText = findViewById(R.id.txtText);
        txtHello.setText(editText.getText().toString());
    }

    public void gotoChallange(View view){
        Intent intent = new Intent(this, challange1.class);
        startActivity(intent);
    }
}