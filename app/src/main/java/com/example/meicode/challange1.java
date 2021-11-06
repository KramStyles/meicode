package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class challange1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challange1);
    }
    public void submitDetails(View view){
        EditText txtFname = findViewById(R.id.txtFname);
        EditText txtMname = findViewById(R.id.txtMname);
        EditText txtSname = findViewById(R.id.txtSname);
        TextView lblFname = findViewById(R.id.lblFname);
        TextView lblMname = findViewById(R.id.lblMname);
        TextView lblSname = findViewById(R.id.lblSname);

        lblFname.setText("First name: " + txtFname.getText().toString().toUpperCase());
        lblMname.setText("Middle name: " + txtMname.getText().toString().toUpperCase());
        lblSname.setText("Surname: " + txtSname.getText().toString().toUpperCase());
    }
}