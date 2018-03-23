package gok.selin.fici;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
HASAN : 6 kategori olmasını bekliyoruz. Çorba, Salata, Tavuk, Et, Sebze, Tatlı
Gruba attığım bir ekran görüntüsü vardı. Öyle bir görüntü bekliyoruz.
 */


public class CategoriesActivity extends AppCompatActivity {
Button buttonCorba,buttonet,buttontat,buttonsalata,buttontavuk,buttonsebze;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        buttonCorba=findViewById(R.id.buttonCorba);



        buttonCorba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),CorbalarActivity.class);
                startActivity(intent);
            }
        });

        buttonet=findViewById(R.id.buttonet);



        buttonet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),EtActivity.class);
                startActivity(intent);
            }
        });

        buttontat=findViewById(R.id.buttontat);



        buttontat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),TatliActivity.class);
                startActivity(intent);

            }
        });

        buttonsalata=findViewById(R.id.buttonsalata);



        buttonsalata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SalataActivity.class);
                startActivity(intent);

            }
        });


        buttontavuk=findViewById(R.id.buttontavuk);



        buttontavuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),TavukActivity.class);
                startActivity(intent);

            }
        });

        buttonsebze=findViewById(R.id.buttonsebze);


        buttonsebze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SebzeActivity.class);
                startActivity(intent);

            }
        });


    }
}
