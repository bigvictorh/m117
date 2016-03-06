package com.ashokslsk.m117projectalpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by Victor on 3/5/2016.
 */
public class Groups extends AppCompatActivity {
    EditText member_search, group_text;
    ListView member_list = null;

    public final static String member_key = "com.ashokslsk.m117projectalpha.member_key";
    public final static String group_key = "com.ashokslsk.m117projectalpha.group_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_make);
    }

    public void search(View view)
    {
        member_search = (EditText) findViewById(R.id.member_search);
        group_text = (EditText) findViewById(R.id.group_text);

        String group = group_text.getText().toString();
    }

    private void createGroupButton() {
        Button createGroup = (Button) findViewById((R.id.create_group));
        createGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Groups.this, Brainstorm.class));
            }
        });
    }



}
