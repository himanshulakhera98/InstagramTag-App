package com.live.viralinstatags.Artu;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.live.viralinstatags.R;

public class Styleu extends AppCompatActivity {

    EditText text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styleu);


        text = findViewById(R.id.textb);
        button = findViewById(R.id.buttona);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("textb", text.getEditableText().toString() );
                clipboard.setPrimaryClip(clip);


                Toast.makeText(Styleu.this, "Copied", Toast.LENGTH_SHORT).show();



            }
        });

    }


}
