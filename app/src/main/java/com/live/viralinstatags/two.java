package com.live.viralinstatags;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class two extends AppCompatActivity {

    EditText text;
    Button button;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        text = findViewById(R.id.texta);
        button = findViewById(R.id.buttonc);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("textb", text.getEditableText().toString() );
                clipboard.setPrimaryClip(clip);


                Toast.makeText(two.this, "Copied", Toast.LENGTH_SHORT).show();



            }
        });

    }


}
