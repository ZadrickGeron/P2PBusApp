package zadrick.geron.com.p2pbusapp;

import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button guestlogin;
    private Button login;
    private EditText editText;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        guestlogin = (Button) findViewById(R.id.guestlogin);
        guestlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openallstat();
            }
        });
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(editText.getText().toString().equals("admin") &&
                        editText2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                }

                else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    public void openallstat() {
        Intent intent = new Intent(this, allstat.class);
        startActivity(intent);
    }

}
