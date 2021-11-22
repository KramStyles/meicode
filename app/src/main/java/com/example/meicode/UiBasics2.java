package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class UiBasics2 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private CheckBox chkHarry, chkMatrix, chkBlade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_basics2);
        chkHarry = findViewById(R.id.ui2Harry);
        chkMatrix = findViewById(R.id.ui2Matrix);
        chkBlade = findViewById(R.id.ui2Blade);

        chkMatrix.setOnCheckedChangeListener(this);
        chkBlade.setOnCheckedChangeListener(this);
        
        if (chkHarry.isChecked()) Toast.makeText(this, "Harry Porter is the default one here!", Toast.LENGTH_SHORT).show();

        chkHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) Toast.makeText(UiBasics2.this, "You have watched Harry Porter", Toast.LENGTH_SHORT).show();
                else Toast.makeText(UiBasics2.this, "You need to watch this movie", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.ui2Matrix:
                Toast.makeText(this, "Nice. you've watched Matrix", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ui2Blade:
                if(isChecked) Toast.makeText(this, "Blade Trinity was dope", Toast.LENGTH_LONG).show();
                else Toast.makeText(this, "You missed watching the Blade Trinity", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}