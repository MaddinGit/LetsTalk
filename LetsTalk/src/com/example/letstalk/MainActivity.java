package com.example.letstalk;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {

	 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        Button button = (Button) findViewById(R.id.my_button);
       
        
        button.setOnClickListener(new OnClickListener() {
         
         @Override
        public void onClick(View view) {
        	 EditText et = (EditText) findViewById(R.id.editText1);
             TextView textView1 = (TextView) findViewById(R.id.textView1);
             
        	 //Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
        	 
             String text = et.getText().toString();
	    	 textView1.setText(text+" \n");
	    	 textView1.setText(" \n");
	    	 textView1.setText(text);
	    	 et.setText("");
         }
      
        });
       return true;
      
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
   
    
    
   
   
}
