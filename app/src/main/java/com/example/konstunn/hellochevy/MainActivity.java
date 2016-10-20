package com.example.konstunn.hellochevy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mInfoTextView;
    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInfoTextView = (TextView)findViewById(R.id.textView);
        mNameEditText = (EditText) findViewById(R.id.editText);
    }

    public void onClick(View view) {
        if (mNameEditText.getText().length() == 0) {
            mInfoTextView.setText("Hello Chevy!");
        } else {
            mInfoTextView.setText("Hello, " + mNameEditText.getText());
        }
    }
}
