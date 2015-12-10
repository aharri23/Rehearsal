package com.example.aaron.rehearsal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Script extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_script);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.onClickListener() {

            @Override

            public void onClick(View v) {

                goToSecondActivity();

            }

        });
    }

    private void goToSecondActivity() {

        Intent intent = new Intent(this, ExampleScript.class);

        startActivity(intent);

    }
}
