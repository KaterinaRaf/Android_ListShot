package com.example.android_listshot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCreateList(View view) {
        TextView text_toDo = (TextView) findViewById(R.id.text_toDo);
        Spinner toDoList = (Spinner) findViewById(R.id.toDoList);
        text_toDo.setText(String.valueOf(toDoList.getSelectedItem()));
    }
}