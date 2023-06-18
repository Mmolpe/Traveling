package es.TravelWorld.traveling;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import es.TravelWorld.traveling.databinding.ActivityLoginBinding;
import es.TravelWorld.traveling.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private MaterialButton btn;
    private ConstraintLayout constraintLayout;
    private ActivityMainBinding binding;
    private ActivityLoginBinding bindingLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        bindingLogin = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();



    }

    private void setListeners(){
        binding.mainButton.setOnClickListener(v -> setContentView(bindingLogin.getRoot()));
        bindingLogin.ButtonForgot.setOnClickListener(view -> Snackbar.make(view, R.string.tarde, Snackbar.LENGTH_LONG).show());
        bindingLogin.ButtonAcount.setOnClickListener(view -> Snackbar.make(view, R.string.tarde, Snackbar.LENGTH_LONG).show());
    }



}