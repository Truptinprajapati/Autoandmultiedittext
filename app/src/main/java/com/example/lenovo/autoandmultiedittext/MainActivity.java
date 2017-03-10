package com.example.lenovo.autoandmultiedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String colors[]={"Aero","Aero Blue","Acide green","Alice Blue","Ball Bule","red","green","blue","green","purple","black","orange"};

        ArrayAdapter<String>ad=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,colors);

        AutoCompleteTextView text=(AutoCompleteTextView)findViewById(R.id.act);
        text.setAdapter(ad);

    }
}
