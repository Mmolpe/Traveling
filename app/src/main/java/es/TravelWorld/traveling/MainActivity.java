package es.TravelWorld.traveling;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton btn;
    private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = (ConstraintLayout)findViewById(R.id.constraint_root);

        btn = (MaterialButton) findViewById(R.id.main_button);
        btn.setOnClickListener(v -> {
            changeScenes(R.layout.activity_menu);

        });



    }

    private void changeScenes(@LayoutRes int idLayout){
        ConstraintSet constrainSet = new ConstraintSet();
        constrainSet.clone(this,idLayout);
        setContentView(idLayout);
        constrainSet.applyTo(constraintLayout);

    }


}