package zadrick.geron.com.p2pbusapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class allstat extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allstat);



    }


    public  void toStation(View V){

        if (V.getId() == R.id.button13) {
            Intent intent = new Intent(this, atcgoingtog1.class);
            startActivity(intent);
        } else if (V.getId() == R.id.button14) {
            Intent intent = new Intent(this, atcgoingtomarket.class);
            startActivity(intent);
        } else if (V.getId() == R.id.button15) {
            Intent intent = new Intent(this, ayalasouthgoingtog5.class);
            startActivity(intent);
        } else if (V.getId() == R.id.button16) {
            Intent intent = new Intent(this, centralmalldasmatostarmall.class);
            startActivity(intent);
        } else if (V.getId() == R.id.button17) {
            Intent intent = new Intent(this, clarktotrinoma.class);
            startActivity(intent);
        } else if (V.getId() == R.id.button18) {
            Intent intent = new Intent(this, eastwoodtog3.class);
            startActivity(intent);
        } else if (V.getId() == R.id.button19) {
            Intent intent = new Intent(this, eastwoodtomakaticircuit.class);
            startActivity(intent);
        } else if (V.getId() == R.id.button20) {
            Intent intent = new Intent(this, G5toMegaMalltoTrinomatoSmNorth.class);
            startActivity(intent);
        } else if (V.getId() == R.id.button21) {
            Intent intent = new Intent(this, Naia1to4loop.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button22) {
            Intent intent = new Intent(this, Naia3toclark.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button23) {
            Intent intent = new Intent(this, Nuvalitomakaticircuit.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button24) {
            Intent intent = new Intent(this, Robinsonsantipolotogalleria.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button25) {
            Intent intent = new Intent(this, Robinsonsgtog3.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button26) {
            Intent intent = new Intent(this, Robinsonsmalolostotrinoma.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button27) {
            Intent intent = new Intent(this, Robinsonsnovalichestog3.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button28) {
            Intent intent = new Intent(this, Smcherryantipolog5.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button29) {
            Intent intent = new Intent(this, Smmasinagtog5.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button30) {
            Intent intent = new Intent(this, Smnorthtosmmegamall.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button31) {
            Intent intent = new Intent(this,Starmallabangtogalleriatoshaw.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button32) {
            Intent intent = new Intent(this, Trinomatoglor5.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button33) {
            Intent intent = new Intent(this, Uptowncentertoglor3.class);
            startActivity(intent);

        } else if (V.getId() == R.id.button34) {
            Intent intent = new Intent(this, Vistamalltostarmall.class);
            startActivity(intent);


        }
    }//end toStation








}//end of  allstat class
