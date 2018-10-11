package com.example.home.tp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActiviteSuivante extends Activity implements View.OnClickListener {
    Activity context;
    Button btnAction;
    EditText nom;
    EditText prenom;
    EditText age;
    Button btntoa3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        context = this;
        context.setTitle("fenetre 2");

        nom = (EditText)findViewById(R.id.textnom);
        prenom = (EditText)findViewById(R.id.textprenom);
        age = (EditText)findViewById(R.id.textage);
        Bundle objetbunble = this.getIntent().getExtras();
        // récupération de la valeur
        //String InfoPasse=objetbunble.description() ;
        String lastname= objetbunble.getString("nom");
        String firstname = objetbunble.getString("prenom");
        // on afffiche l'information dans l'edittext
        nom.setText(lastname);
        prenom.setText(firstname);

        btnAction = findViewById(R.id.btnaction);
        btnAction.setOnClickListener(this);

        btntoa3 = findViewById(R.id.buttontoa3);
        btntoa3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view== btnAction){
            Intent intent = new Intent(context,ActiviteAppelante.class);
            Bundle objetbunble = new Bundle();
            //objetbunble.putString("passInfo",editText.getText().toString());
            intent.putExtras(objetbunble );
            setResult(1,intent);
            //context.finish();
        }
        if(view == btntoa3){
            Intent intent = new Intent(context,ActiviteLast.class);
            context.startActivityForResult(intent,2);
        }
    }
}
