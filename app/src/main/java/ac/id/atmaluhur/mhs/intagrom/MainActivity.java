package ac.id.atmaluhur.mhs.intagrom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText name = (EditText) findViewById(R.id.editText2);
        final EditText name2 = (EditText) findViewById(R.id.editTextP2);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("name", name.getText().toString());
                startActivity(i);
            }
        });
        Button button1 = (Button) findViewById(R.id.butt3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity3.class);
                i.putExtra("name", name.getText().toString());
                startActivity(i);
            }
        });
    }
}