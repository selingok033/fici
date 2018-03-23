package gok.selin.fici;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SalataActivity extends AppCompatActivity {

    ListView lvSalatalar;
    ArrayList<TarifModel> tarifListesi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salata);

        lvSalatalar = (ListView) findViewById(R.id.listViewTarifler);

        tarifListesi.add(new TarifModel("Patates Salatası", "60dk", 4, "4 adet\n" +
                "patates\n" +
                "1 adet\n" +
                "büyük boy kırmızı soğan\n" +
                "4 dal\n" +
                "taze soğan\n" +
                "6 adet\n" +
                "kurutulmuş domates\n" +
                "1 diş\n" +
                "sarımsak\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1/4 demet\n" +
                "dereotu\n" +
                "1/4 demet\n" +
                "nane\n" +
                "1 tatlı kaşığı\n" +
                "kapari\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "2 adet\n" +
                "limon suyu\n" +
                "1 tatlı kaşığı\n" +
                "balsamik sirke\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "kırmızı toz biber", "Patatesleri kabuklarını soymadan orta ateşte 30 dakika kadar haşlayın. Suyunu süzün, kabuklarını soyun ve iri parçalar halinde doğrayın. Derin bir salata kasesine alıp, soğumaları için bekletin.\n" +
                "Kırmızı soğanı halka halka, ince bir şekilde doğrayın. Sarımsağı rendeleyin. Taze soğanları halka halka doğrayın.\n" +
                "Maydanoz, dereotu ve naneyi incecik kıyın. Kapari çiçeklerini aromalarını vermeleri için küçük parçalar halinde kesin. Kurutulmuş domatesleri uzun ince parçalar halinde doğrayın.\n" +
                "Salatanın sosunu hazırlamak için; zeytinyağı, limon suyu, balsamik sirke, rendelenmiş sarımsak, tuz ve kırmızı toz biberi küçük bir kapta çırpın. Kapari çiçeklerini ekleyin ve karıştırın.\n" +
                "Doğradığınız yeşillikleri salata kasesine aktarın. Patateslerle birlikte harmanladıktan sonra sosunu ekleyin ve patateslerin ezilmemesi için yavaşca karıştırın. Bekletmeden, sevdiklerinizle paylaşın.", R.drawable.patatessalatasi));
        tarifListesi.add(new TarifModel("Çoban Salatası", "15dk", 4, "4 adet\n" +
                "patates\n" +
                "1 adet\n" +
                "büyük boy kırmızı soğan\n" +
                "4 dal\n" +
                "taze soğan\n" +
                "6 adet\n" +
                "kurutulmuş domates\n" +
                "1 diş\n" +
                "sarımsak\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1/4 demet\n" +
                "dereotu\n" +
                "1/4 demet\n" +
                "nane\n" +
                "1 tatlı kaşığı\n" +
                "kapari\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "2 adet\n" +
                "limon suyu\n" +
                "1 tatlı kaşığı\n" +
                "balsamik sirke\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "kırmızı toz biber", "Patatesleri kabuklarını soymadan orta ateşte 30 dakika kadar haşlayın. Suyunu süzün, kabuklarını soyun ve iri parçalar halinde doğrayın. Derin bir salata kasesine alıp, soğumaları için bekletin.\n" +
                "Kırmızı soğanı halka halka, ince bir şekilde doğrayın. Sarımsağı rendeleyin. Taze soğanları halka halka doğrayın.\n" +
                "Maydanoz, dereotu ve naneyi incecik kıyın. Kapari çiçeklerini aromalarını vermeleri için küçük parçalar halinde kesin. Kurutulmuş domatesleri uzun ince parçalar halinde doğrayın.\n" +
                "Salatanın sosunu hazırlamak için; zeytinyağı, limon suyu, balsamik sirke, rendelenmiş sarımsak, tuz ve kırmızı toz biberi küçük bir kapta çırpın. Kapari çiçeklerini ekleyin ve karıştırın.\n" +
                "Doğradığınız yeşillikleri salata kasesine aktarın. Patateslerle birlikte harmanladıktan sonra sosunu ekleyin ve patateslerin ezilmemesi için yavaşca karıştırın. Bekletmeden, sevdiklerinizle paylaşın.", R.drawable.coban));
        tarifListesi.add(new TarifModel("Rus Salatası", "65dk", 4, "4 adet\n" +
                "patates\n" +
                "1 adet\n" +
                "büyük boy kırmızı soğan\n" +
                "4 dal\n" +
                "taze soğan\n" +
                "6 adet\n" +
                "kurutulmuş domates\n" +
                "1 diş\n" +
                "sarımsak\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1/4 demet\n" +
                "dereotu\n" +
                "1/4 demet\n" +
                "nane\n" +
                "1 tatlı kaşığı\n" +
                "kapari\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "2 adet\n" +
                "limon suyu\n" +
                "1 tatlı kaşığı\n" +
                "balsamik sirke\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "kırmızı toz biber", "Patatesleri kabuklarını soymadan orta ateşte 30 dakika kadar haşlayın. Suyunu süzün, kabuklarını soyun ve iri parçalar halinde doğrayın. Derin bir salata kasesine alıp, soğumaları için bekletin.\n" +
                "Kırmızı soğanı halka halka, ince bir şekilde doğrayın. Sarımsağı rendeleyin. Taze soğanları halka halka doğrayın.\n" +
                "Maydanoz, dereotu ve naneyi incecik kıyın. Kapari çiçeklerini aromalarını vermeleri için küçük parçalar halinde kesin. Kurutulmuş domatesleri uzun ince parçalar halinde doğrayın.\n" +
                "Salatanın sosunu hazırlamak için; zeytinyağı, limon suyu, balsamik sirke, rendelenmiş sarımsak, tuz ve kırmızı toz biberi küçük bir kapta çırpın. Kapari çiçeklerini ekleyin ve karıştırın.\n" +
                "Doğradığınız yeşillikleri salata kasesine aktarın. Patateslerle birlikte harmanladıktan sonra sosunu ekleyin ve patateslerin ezilmemesi için yavaşca karıştırın. Bekletmeden, sevdiklerinizle paylaşın.", R.drawable.rus));
        tarifListesi.add(new TarifModel("Akdeniz Salatası", "20dk", 4, "4 adet\n" +
                "patates\n" +
                "1 adet\n" +
                "büyük boy kırmızı soğan\n" +
                "4 dal\n" +
                "taze soğan\n" +
                "6 adet\n" +
                "kurutulmuş domates\n" +
                "1 diş\n" +
                "sarımsak\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1/4 demet\n" +
                "dereotu\n" +
                "1/4 demet\n" +
                "nane\n" +
                "1 tatlı kaşığı\n" +
                "kapari\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "2 adet\n" +
                "limon suyu\n" +
                "1 tatlı kaşığı\n" +
                "balsamik sirke\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "kırmızı toz biber", "Patatesleri kabuklarını soymadan orta ateşte 30 dakika kadar haşlayın. Suyunu süzün, kabuklarını soyun ve iri parçalar halinde doğrayın. Derin bir salata kasesine alıp, soğumaları için bekletin.\n" +
                "Kırmızı soğanı halka halka, ince bir şekilde doğrayın. Sarımsağı rendeleyin. Taze soğanları halka halka doğrayın.\n" +
                "Maydanoz, dereotu ve naneyi incecik kıyın. Kapari çiçeklerini aromalarını vermeleri için küçük parçalar halinde kesin. Kurutulmuş domatesleri uzun ince parçalar halinde doğrayın.\n" +
                "Salatanın sosunu hazırlamak için; zeytinyağı, limon suyu, balsamik sirke, rendelenmiş sarımsak, tuz ve kırmızı toz biberi küçük bir kapta çırpın. Kapari çiçeklerini ekleyin ve karıştırın.\n" +
                "Doğradığınız yeşillikleri salata kasesine aktarın. Patateslerle birlikte harmanladıktan sonra sosunu ekleyin ve patateslerin ezilmemesi için yavaşca karıştırın. Bekletmeden, sevdiklerinizle paylaşın.", R.drawable.akdeniz));
        tarifListesi.add(new TarifModel("Limonlu Brokoli Salatası", "45dk", 4, "4 adet\n" +
                "patates\n" +
                "1 adet\n" +
                "büyük boy kırmızı soğan\n" +
                "4 dal\n" +
                "taze soğan\n" +
                "6 adet\n" +
                "kurutulmuş domates\n" +
                "1 diş\n" +
                "sarımsak\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1/4 demet\n" +
                "dereotu\n" +
                "1/4 demet\n" +
                "nane\n" +
                "1 tatlı kaşığı\n" +
                "kapari\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "2 adet\n" +
                "limon suyu\n" +
                "1 tatlı kaşığı\n" +
                "balsamik sirke\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "kırmızı toz biber", "Patatesleri kabuklarını soymadan orta ateşte 30 dakika kadar haşlayın. Suyunu süzün, kabuklarını soyun ve iri parçalar halinde doğrayın. Derin bir salata kasesine alıp, soğumaları için bekletin.\n" +
                "Kırmızı soğanı halka halka, ince bir şekilde doğrayın. Sarımsağı rendeleyin. Taze soğanları halka halka doğrayın.\n" +
                "Maydanoz, dereotu ve naneyi incecik kıyın. Kapari çiçeklerini aromalarını vermeleri için küçük parçalar halinde kesin. Kurutulmuş domatesleri uzun ince parçalar halinde doğrayın.\n" +
                "Salatanın sosunu hazırlamak için; zeytinyağı, limon suyu, balsamik sirke, rendelenmiş sarımsak, tuz ve kırmızı toz biberi küçük bir kapta çırpın. Kapari çiçeklerini ekleyin ve karıştırın.\n" +
                "Doğradığınız yeşillikleri salata kasesine aktarın. Patateslerle birlikte harmanladıktan sonra sosunu ekleyin ve patateslerin ezilmemesi için yavaşca karıştırın. Bekletmeden, sevdiklerinizle paylaşın.", R.drawable.limonlubrokoli));
        tarifListesi.add(new TarifModel("Havuç Salatası", "46dk", 4, "4 adet\n" +
                "patates\n" +
                "1 adet\n" +
                "büyük boy kırmızı soğan\n" +
                "4 dal\n" +
                "taze soğan\n" +
                "6 adet\n" +
                "kurutulmuş domates\n" +
                "1 diş\n" +
                "sarımsak\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1/4 demet\n" +
                "dereotu\n" +
                "1/4 demet\n" +
                "nane\n" +
                "1 tatlı kaşığı\n" +
                "kapari\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "2 adet\n" +
                "limon suyu\n" +
                "1 tatlı kaşığı\n" +
                "balsamik sirke\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "kırmızı toz biber", "Patatesleri kabuklarını soymadan orta ateşte 30 dakika kadar haşlayın. Suyunu süzün, kabuklarını soyun ve iri parçalar halinde doğrayın. Derin bir salata kasesine alıp, soğumaları için bekletin.\n" +
                "Kırmızı soğanı halka halka, ince bir şekilde doğrayın. Sarımsağı rendeleyin. Taze soğanları halka halka doğrayın.\n" +
                "Maydanoz, dereotu ve naneyi incecik kıyın. Kapari çiçeklerini aromalarını vermeleri için küçük parçalar halinde kesin. Kurutulmuş domatesleri uzun ince parçalar halinde doğrayın.\n" +
                "Salatanın sosunu hazırlamak için; zeytinyağı, limon suyu, balsamik sirke, rendelenmiş sarımsak, tuz ve kırmızı toz biberi küçük bir kapta çırpın. Kapari çiçeklerini ekleyin ve karıştırın.\n" +
                "Doğradığınız yeşillikleri salata kasesine aktarın. Patateslerle birlikte harmanladıktan sonra sosunu ekleyin ve patateslerin ezilmemesi için yavaşca karıştırın. Bekletmeden, sevdiklerinizle paylaşın.", R.drawable.havuc));

        CustomAdaptor adaptor = new CustomAdaptor(this, tarifListesi);
        lvSalatalar.setAdapter(adaptor);


        lvSalatalar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TarifModel tarif = tarifListesi.get(position);
                Intent intent = new Intent(getApplicationContext(),DetaylarActivity.class);
                intent.putExtra("tarif",tarif.getTarifAdi());
                intent.putExtra("yas",tarif.getKisiSayisi());
                intent.putExtra("detay",tarif.getMalzemeler()+"\n"+tarif.getYapilisi());
                intent.putExtra("sure",tarif.getHazirlamaSuresi());
                intent.putExtra("resim",tarif.getLogoId());
                startActivity(intent);
            }
        });

    }




}
