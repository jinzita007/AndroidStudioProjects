package com.example.along.myapplication7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements OnCheckedChangeListener{
  //  private AutoCompleteTextView acTextView;
  //  private String[] res = {"beijing1","beijing2","beijing3","shanghai1","shanghai2"};

   // private MultiAutoCompleteTextView macTextView;

    private ToggleButton tb;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //    acTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
      //  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);
  //      acTextView.setAdapter(adapter);

  //      macTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
   //     macTextView.setAdapter(adapter);
   //     macTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        tb = (ToggleButton) findViewById(R.id.toggleButton1);
        img = (ImageView) findViewById(R.id.imageView1);

        tb.setOnCheckedChangeListener(this);

    }
    public void OnCheckedChanged(CompoundButton buttonView,boolean isChecked){
        img.setBackgroundResource(isChecked?R.drawable.on:R.drawable.off);
    }
}
