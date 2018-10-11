package com.example.home.tp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActiviteLast extends Activity implements View.OnClickListener {
    Button btntoa1;
    Activity context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite_last);
        context = this;
        context.setTitle("fenetre 3");
        btntoa1.findViewById(R.id.btntoa1);
        btntoa1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == btntoa1){
            Intent intent = new Intent(context,ActiviteAppelante.class);
            setResult(3,intent);
            context.finish();

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==3){
            finish();
        }
    }
}
