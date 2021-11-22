package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class UiBasics2 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private CheckBox chkHarry, chkMatrix, chkBlade;
    private RadioGroup radStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_basics2);
        chkHarry = findViewById(R.id.ui2Harry);
        chkMatrix = findViewById(R.id.ui2Matrix);
        chkBlade = findViewById(R.id.ui2Blade);
        radStatus = findViewById(R.id.ui2RadStatus);

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

        radStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ui2RadMarried:
                        Toast.makeText(UiBasics2.this, "I guess you are married", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ui2RadSingle:
                        Toast.makeText(UiBasics2.this, "Let's just say you are still single", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ui2RadRelationship:
                        Toast.makeText(UiBasics2.this, "Nice. I hope it's not a complicated one", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
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