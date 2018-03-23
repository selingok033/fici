package gok.selin.fici;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class DetaylarActivity extends AppCompatActivity {
    String sure,tarif,detay;
    int resim,yas;

    TextView tvyas,tvsure,tvtarif,tvdetay;
    ImageView ivresim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaylar);

        tvsure = (TextView) findViewById(R.id.tvsure);
        tvyas = (TextView) findViewById(R.id.tvyas);
        tvtarif = (TextView) findViewById(R.id.tvtarif);
        tvdetay = (TextView) findViewById(R.id.tvdetay);
        ivresim = (ImageView) findViewById(R.id.ivresim);

        tvdetay.setMovementMethod(new ScrollingMovementMethod());

        Intent intent = getIntent();
        sure = intent.getStringExtra("sure");
        yas = intent.getIntExtra("yas", -1);
        tarif = intent.getStringExtra("tarif");
        detay = intent.getStringExtra("detay");
        resim = intent.getIntExtra("resim",-1);

        tvsure.setText(sure);
        tvyas.setText(yas+"");
        ivresim.setImageResource(resim);
        tvtarif.setText(tarif);
        tvdetay.setText(detay);

    }
}
