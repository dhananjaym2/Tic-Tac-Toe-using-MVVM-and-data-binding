package tic.tac.toe.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tic.tac.toe.R;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
}