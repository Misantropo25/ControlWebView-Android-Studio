package com.example.controlwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edittext1);


    }

    public void navegar(View view) {
        Intent i = new Intent(MainActivity.this, ActivityWeb.class);
        i.putExtra("sitio", editText1.getText().toString());
        startActivity(i);
    }
}