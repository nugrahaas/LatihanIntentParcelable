package com.example.latihanintentparcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    public static String EXTRA_PERSON = " extra_person";
    public TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tvObject = (TextView)findViewById(R.id.tv_object_received);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : " + mPerson.getName() + ", Email : " + mPerson.getEmail() + ", Age : " + mPerson.getAge() + ", Location : " + mPerson.getCity();
        tvObject.setText(text);
    }
}
