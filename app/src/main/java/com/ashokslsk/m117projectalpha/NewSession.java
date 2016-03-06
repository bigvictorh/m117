package com.ashokslsk.m117projectalpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class NewSession extends AppCompatActivity {

    EditText topic_text, spec_text,timer_text;
    ListView timer_list = null;

    public final static String timer_key = "com.ashokslsk.m117projectalpha.timer_key"; //MUST BE UNIQUE!
    public final static String topic_key = "com.ashokslsk.m117projectalpha.topic_key";
    public final static String spec_key = "com.ashokslsk.m117projectalpha.spec_key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsess);
    }

    /*on click of the submit button, pass the timer (spec and topic as ewll or store in AwesomeFirebase?
    and then start the Brainstorm_Session activity*/
    public void submit(View view) {
        topic_text = (EditText) findViewById(R.id.topic_text);
        spec_text = (EditText) findViewById(R.id.spec_text);
        timer_text = (EditText) findViewById(R.id.timer_text);

        String topic =  topic_text.getText().toString(); // do we wanna store this in firebase"
        String timer = timer_text.getText().toString();
        String spec = spec_text.getText().toString();

        Intent submit = new Intent(this,Brainstorm.class);
        submit.putExtra(timer_key, timer);
        submit.putExtra(topic_key, topic);
        submit.putExtra(spec_key, spec);
        startActivity(submit);
    }





}
