package com.example.home.tp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActiviteAppelante extends Activity implements View.OnClickListener {

    private Button btnAction;
    ActiviteAppelante context;
    EditText nom;
    EditText prenom;
    EditText age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        nom = (EditText)findViewById(R.id.textnom);
        prenom = (EditText)findViewById(R.id.textprenom);
        age = (EditText)findViewById(R.id.textage);

        btnAction = findViewById(R.id.btnaction);

        btnAction.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view== btnAction){
            Intent intent = new Intent(context,ActiviteSuivante.class);
            Bundle objetbunble = new Bundle();
            objetbunble.putString("nom",nom.getText().toString());
            objetbunble.putString("prenom",prenom.getText().toString());
            objetbunble.putString("age",age.getText().toString());
            intent.putExtras(objetbunble );
            //context.startActivity(intent);
            context.startActivityForResult(intent,1);

        }
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // Si le résultat provient d’une demande de la fenêtre1
        // if (requestCode == 1) { // le code retour est bon
        if (resultCode == 2) { //récupérer les informations
            // et les afficher dans TextView
            Log.e("message ", "Viens de A2");
            //nom.setText((CharSequence) data.getStringExtra("passInfo"));
        }
        if(resultCode == 3){
            Log.e("message","Viens de A3");
        }
    }
}
