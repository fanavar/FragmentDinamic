package cl.awakelab.fragmentdinamic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.awakelab.fragmentdinamic.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}