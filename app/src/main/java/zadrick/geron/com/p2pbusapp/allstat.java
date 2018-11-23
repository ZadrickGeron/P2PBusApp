package zadrick.geron.com.p2pbusapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class allstat extends AppCompatActivity implements  View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allstat);


        Button st1 = (Button) findViewById(R.id.button13);
        st1.setOnClickListener(this);

        Button st2 = (Button) findViewById(R.id.button14);
        st2.setOnClickListener(this);

        Button st3 = (Button) findViewById(R.id.button15);
        st3.setOnClickListener(this);

        Button st4 = (Button) findViewById(R.id.button16);
        st4.setOnClickListener(this);

        Button st5 = (Button) findViewById(R.id.button17);
        st5.setOnClickListener(this);

        Button st6 = (Button) findViewById(R.id.button18);
        st6.setOnClickListener(this);

        Button st7 = (Button) findViewById(R.id.button19);
        st7.setOnClickListener(this);

        Button st8 = (Button) findViewById(R.id.button20);
        st8.setOnClickListener(this);

        Button st9 = (Button) findViewById(R.id.button21);
        st9.setOnClickListener(this);

        Button st10 = (Button) findViewById(R.id.button22);
        st10.setOnClickListener(this);

        Button st11 = (Button) findViewById(R.id.button23);
        st11.setOnClickListener(this);

        Button st12 = (Button) findViewById(R.id.button24);
        st12.setOnClickListener(this);

        Button st13 = (Button) findViewById(R.id.button25);
        st13.setOnClickListener(this);

        Button st14 = (Button) findViewById(R.id.button26);
        st14.setOnClickListener(this);

        Button st15 = (Button) findViewById(R.id.button27);
        st15.setOnClickListener(this);

        Button st16 = (Button) findViewById(R.id.button28);
        st16.setOnClickListener(this);

        Button st17 = (Button) findViewById(R.id.button29);
        st17.setOnClickListener(this);

        Button st18 = (Button) findViewById(R.id.button30);
        st18.setOnClickListener(this);

        Button st19 = (Button) findViewById(R.id.button31);
        st19.setOnClickListener(this);

        Button st20 = (Button) findViewById(R.id.button32);
        st20.setOnClickListener(this);

        Button st21 = (Button) findViewById(R.id.button33);
        st21.setOnClickListener(this);

        Button st22 = (Button) findViewById(R.id.button34);
        st22.setOnClickListener(this);

    }

    @Override
    public  void onClick(View V){

        switch (V.getId()){
            case R.id.button13:
                Intent intent1 = new Intent(this, atcgoingtog1.class);
                startActivity(intent1);
                break;
            case  R.id.button14:
                Intent intent2 = new Intent(this, atcgoingtomarket.class);
                startActivity(intent2);
                break;
            case R.id.button15:
                Intent intent3 = new Intent(this, ayalasouthgoingtog5.class);
                startActivity(intent3);
                break;
            case R.id.button16:
                Intent intent4 = new Intent(this, centralmalldasmatostarmall.class);
                startActivity(intent4);
                break;
            case  R.id.button17:
                Intent intent5 = new Intent(this, clarktotrinoma.class);
                startActivity(intent5);
                break;
            case   R.id.button18:
                Intent intent6 = new Intent(this, eastwoodtog3.class);
                startActivity(intent6);
                break;
            case  R.id.button19:
                Intent intent7 = new Intent(this, eastwoodtomakaticircuit.class);
                startActivity(intent7);
                break;
            case  R.id.button20:
                Intent intent8 = new Intent(this, G5toMegaMalltoTrinomatoSmNorth.class);
                startActivity(intent8);
                break;
            case   R.id.button21:
                Intent intent9 = new Intent(this, Naia1to4loop.class);
                startActivity(intent9);

                break;
            case   R.id.button22:
                Intent intent10 = new Intent(this, Naia3toclark.class);
                startActivity(intent10);

                break;
            case   R.id.button23:
                Intent intent11 = new Intent(this, Nuvalitomakaticircuit.class);
                startActivity(intent11);

                break;
            case   R.id.button24:
                Intent intent12 = new Intent(this, Robinsonsantipolotogalleria.class);
                startActivity(intent12);

                break;
            case   R.id.button25:
                Intent intent13 = new Intent(this, Robinsonsgtog3.class);
                startActivity(intent13);

                break;
            case   R.id.button26:
                Intent intent14 = new Intent(this, Robinsonsmalolostotrinoma.class);
                startActivity(intent14);

                break;
            case   R.id.button27:
                Intent intent15 = new Intent(this, Robinsonsnovalichestog3.class);
                startActivity(intent15);

                break;
            case   R.id.button28:
                Intent intent16 = new Intent(this, Smcherryantipolog5.class);
                startActivity(intent16);

                break;
            case   R.id.button29:
                Intent intent17 = new Intent(this, Smmasinagtog5.class);
                startActivity(intent17);

                break;
            case   R.id.button30:
                Intent intent18 = new Intent(this, Smnorthtosmmegamall.class);
                startActivity(intent18);

                break;
            case   R.id.button31:
                Intent intent19 = new Intent(this,Starmallabangtogalleriatoshaw.class);
                startActivity(intent19);

                break;
            case   R.id.button32:
                Intent intent20 = new Intent(this, Trinomatoglor5.class);
                startActivity(intent20);

                break;
            case   R.id.button33:
                Intent intent21 = new Intent(this, Uptowncentertoglor3.class);
                startActivity(intent21);

                break;
            case   R.id.button34:
                Intent intent22 = new Intent(this, Vistamalltostarmall.class);
                startActivity(intent22);

                break;

            default:
                break;
        }
    }//end on click
}//end of  allstat class
