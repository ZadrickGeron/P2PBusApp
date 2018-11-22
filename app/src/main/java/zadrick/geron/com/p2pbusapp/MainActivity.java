package zadrick.geron.com.p2pbusapp;

import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button guestlogin;

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
    }

    public void openallstat() {
        Intent intent = new Intent(this, allstat.class);
        startActivity(intent);
    }
}
