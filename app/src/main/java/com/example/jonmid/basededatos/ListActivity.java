package com.example.jonmid.basededatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    private TextView Name;
    private TextView Phone;
    private TextView Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        Name = (TextView)findViewById(R.id.name);
        Phone =(TextView)findViewById(R.id.telefono);
        Email =(TextView)findViewById(R.id.email);

        Bundle bundle= getIntent().getExtras();


        Name.setText(bundle.getString("name"));
        Phone.setText(bundle.getString("phone"));
        Email.setText(bundle.getString("email"));

    }


    public void regresar(View v){
        Intent intent= new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
