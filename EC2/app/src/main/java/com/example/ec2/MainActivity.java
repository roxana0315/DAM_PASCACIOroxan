package com.example.ec2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton=findViewById(R.id.btnenvir);
        boton.setOnClickListener(view -> Toast.makeText(this, "SE ENVIA DATOS", Toast.LENGTH_SHORT).show());

    }
}