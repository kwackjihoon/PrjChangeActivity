package com.example.sec.prjchangeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSecondView = findViewById(R.id.btSecondView);
        btSecondView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SubActivity1.class);
                startActivity(intent);
            }
        });
        Button btThirdView = findViewById(R.id.btThirdView);
        btThirdView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SubActivity2.class);
                startActivity(intent);
            }
        });
    }
}
