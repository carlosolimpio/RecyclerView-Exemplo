package com.olimpio.study.exemplo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextUserName;
    private TextView mTextViewUserName;
    private Button mButtonHello;

    private RecyclerView mRecyclerView;
    private HelloListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextUserName = findViewById(R.id.editTextText_name);
        mTextViewUserName = findViewById(R.id.textView_result);
        mButtonHello = findViewById(R.id.button_show);

        mButtonHello.setOnClickListener(v -> showMe(v));

        mRecyclerView = findViewById(R.id.recyclerView_list);
        mAdapter = new HelloListAdapter(getHelloList());

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void showMe(View view) {
        String result = mEditTextUserName.getText().toString();

        if (!result.equals("")) {
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
            mTextViewUserName.setText(result);
        } else
            Toast.makeText(this, "ERRO!", Toast.LENGTH_LONG).show();
    }

    private ArrayList<Hello> getHelloList() {
        final ArrayList<Hello> list = new ArrayList<>();
        list.add(new Hello("Hello", 1));
        list.add(new Hello("Hola", 2));
        list.add(new Hello("Alô", 3));
        list.add(new Hello("Hello", 1));
        list.add(new Hello("Hola", 2));
        list.add(new Hello("Alô", 3));
        list.add(new Hello("Hello", 1));
        list.add(new Hello("Hola", 2));
        list.add(new Hello("Alô", 3));
        list.add(new Hello("Hello", 1));
        list.add(new Hello("Hola", 2));
        list.add(new Hello("Alô", 3));
        list.add(new Hello("Hello", 1));
        list.add(new Hello("Hola", 2));
        list.add(new Hello("Alô", 3));
        list.add(new Hello("Hello", 1));
        list.add(new Hello("Hola", 2));
        list.add(new Hello("Alô", 3));
        list.add(new Hello("Hello", 1));
        list.add(new Hello("Hola", 2));
        list.add(new Hello("Alô", 3));
        list.add(new Hello("Hello", 1));
        list.add(new Hello("Hola", 2));
        list.add(new Hello("Alô", 3));

        return list;
    }
}