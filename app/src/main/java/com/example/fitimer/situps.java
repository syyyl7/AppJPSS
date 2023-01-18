package com.example.fitimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class situps extends AppCompatActivity {
    Button button6;
    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situps);

        button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(situps.this, HomePageActivity.class);
                startActivity(intent6);
            }
        });
        checkBox=(CheckBox)findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent checkbox=new Intent(situps.this,Timer.class);
                startActivity(checkbox);
            }
        });

        checkBox2=(CheckBox)findViewById(R.id.checkBox2);
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent checkbox2=new Intent(situps.this,Timer.class);
                startActivity(checkbox2);
            }
        });

        checkBox3=(CheckBox)findViewById(R.id.checkBox3);
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent checkbox3=new Intent(situps.this,Timer.class);
                startActivity(checkbox3);
            }
        });
    }
}