package com.example.customer3d;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    private EditText msisdn;
    private EditText state;
    private TextView Info;
    private Button fetch;
    String status = "";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        msisdn = (EditText)findViewById(R.id.etName);
        state = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        fetch = (Button)findViewById(R.id.btnLogin);

        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText("Status is : "+status);
            }
        });
    }


}
