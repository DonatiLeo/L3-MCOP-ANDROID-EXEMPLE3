package fr.uca.ds4h.miage.donati.exemple3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup group = (RadioGroup) findViewById(R.id.rgGroup1);

        /*
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton bt = (RadioButton) findViewById(checkedId);
                Toast.makeText(group.getContext(),
                        "vous avez cliqué sur " + bt.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });*/

        // La même chose mais avec une expression lambda
        group.setOnCheckedChangeListener(
                (g, id) ->
                    {
                        RadioButton bt = (RadioButton) findViewById(id);
                        Toast.makeText(g.getContext(),
                                "vous avez cliqué sur " + bt.getText(),
                                Toast.LENGTH_SHORT).show();
                    }
            );
    }
}