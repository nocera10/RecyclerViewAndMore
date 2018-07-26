package com.example.aula_01.recyclerviewandmore;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.aula_01.reciclerviewandmore.R;

public class MainActivity extends AppCompatActivity {

    private Button bRemoveFrag;
    FragmentManager fragManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bRemoveFrag = (Button) this.findViewById(R.id.removeFrag);

        fragManager = getSupportFragmentManager();

        fragManager.beginTransaction().add(R.id.fragmentFrame, new MyFragment()).commit();

        bRemoveFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragmentFrame);
                if (fragment != null)
                    fragManager.beginTransaction().remove(fragment).commit();
                Toast.makeText(view.getContext(), "You removed the fragment from frame1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
