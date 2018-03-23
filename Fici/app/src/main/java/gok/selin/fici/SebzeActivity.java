package gok.selin.fici;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SebzeActivity extends AppCompatActivity {


    ListView lvSebzeler;
    ArrayList<TarifModel> tarifListesi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebze);

        lvSebzeler = (ListView) findViewById(R.id.listViewTarifler);

        tarifListesi.add(new TarifModel("Zeytinyağlı Pırasa", "50dk", 4, "6 adet\n" +
                "orta boy pırasa\n" +
                "2 adet\n" +
                "orta boy havuç\n" +
                "2 yemek kaşığı\n" +
                "pirinç\n" +
                "1 adet\n" +
                "limon suyu\n" +
                "1 su bardağı\n" +
                "taze sıkılmış portakal suyu\n" +
                "1/2 su bardağı\n" +
                "su\n" +
                "6 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 tatlı kaşığı\n" +
                "toz şeker\n" +
                "1 çay kaşığı\n" +
                "tuz", "Dış kabuklarını ve kök kısımlarını ayıkladığınız pırasaları bol suda yıkadıktan sonra verev şeklinde doğrayın.\n" +
                "Kabuğunu soyduktan sonra uzunlamasına ortadan ikiye kestiğiniz havuçları pırasalarla uyumlu olacak şekilde kesin.\n" +
                "Geniş tabanlı bir tencereye sırasıyla; doğranmış pırasa ve havuçları yerleştirin. Duruladıktan sonra suyunu süzdürdüğünüz pirinçleri üzerlerine serpiştirin.\n" +
                "Tuz ve toz şekeri ekledikten sonra taze sıkılmış limon ve portakal suyunu tencereye aktarın. Suyu ekleyin.\n" +
                "Üzerine zeytinyağı gezdirdiğiniz pırasayı, kapağı kapalı tencerede, kısık ateşte 30-35 dakika kadar pişirin.\n" +
                "Arzuya göre ılık ya da soğuk olarak limon dilimleri eşliğinde servis edin. Şifa kaynağı kış sebzesi pırasayı tüm sevdiklerinizle paylaşın.",
                R.drawable.zeytinyaglipirasatarifi));

        tarifListesi.add(new TarifModel("Karnıbahar kızartma", "50dk", 4, "6 adet\n" +
                "orta boy pırasa\n" +
                "2 adet\n" +
                "orta boy havuç\n" +
                "2 yemek kaşığı\n" +
                "pirinç\n" +
                "1 adet\n" +
                "limon suyu\n" +
                "1 su bardağı\n" +
                "taze sıkılmış portakal suyu\n" +
                "1/2 su bardağı\n" +
                "su\n" +
                "6 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 tatlı kaşığı\n" +
                "toz şeker\n" +
                "1 çay kaşığı\n" +
                "tuz", "Dış kabuklarını ve kök kısımlarını ayıkladığınız pırasaları bol suda yıkadıktan sonra verev şeklinde doğrayın.\n" +
                "Kabuğunu soyduktan sonra uzunlamasına ortadan ikiye kestiğiniz havuçları pırasalarla uyumlu olacak şekilde kesin.\n" +
                "Geniş tabanlı bir tencereye sırasıyla; doğranmış pırasa ve havuçları yerleştirin. Duruladıktan sonra suyunu süzdürdüğünüz pirinçleri üzerlerine serpiştirin.\n" +
                "Tuz ve toz şekeri ekledikten sonra taze sıkılmış limon ve portakal suyunu tencereye aktarın. Suyu ekleyin.\n" +
                "Üzerine zeytinyağı gezdirdiğiniz pırasayı, kapağı kapalı tencerede, kısık ateşte 30-35 dakika kadar pişirin.\n" +
                "Arzuya göre ılık ya da soğuk olarak limon dilimleri eşliğinde servis edin. Şifa kaynağı kış sebzesi pırasayı tüm sevdiklerinizle paylaşın.",
                R.drawable.karnibahar));

        tarifListesi.add(new TarifModel("Bezelye yemeği", "40dk", 6, "6 adet\n" +
                "orta boy pırasa\n" +
                "2 adet\n" +
                "orta boy havuç\n" +
                "2 yemek kaşığı\n" +
                "pirinç\n" +
                "1 adet\n" +
                "limon suyu\n" +
                "1 su bardağı\n" +
                "taze sıkılmış portakal suyu\n" +
                "1/2 su bardağı\n" +
                "su\n" +
                "6 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 tatlı kaşığı\n" +
                "toz şeker\n" +
                "1 çay kaşığı\n" +
                "tuz", "Dış kabuklarını ve kök kısımlarını ayıkladığınız pırasaları bol suda yıkadıktan sonra verev şeklinde doğrayın.\n" +
                "Kabuğunu soyduktan sonra uzunlamasına ortadan ikiye kestiğiniz havuçları pırasalarla uyumlu olacak şekilde kesin.\n" +
                "Geniş tabanlı bir tencereye sırasıyla; doğranmış pırasa ve havuçları yerleştirin. Duruladıktan sonra suyunu süzdürdüğünüz pirinçleri üzerlerine serpiştirin.\n" +
                "Tuz ve toz şekeri ekledikten sonra taze sıkılmış limon ve portakal suyunu tencereye aktarın. Suyu ekleyin.\n" +
                "Üzerine zeytinyağı gezdirdiğiniz pırasayı, kapağı kapalı tencerede, kısık ateşte 30-35 dakika kadar pişirin.\n" +
                "Arzuya göre ılık ya da soğuk olarak limon dilimleri eşliğinde servis edin. Şifa kaynağı kış sebzesi pırasayı tüm sevdiklerinizle paylaşın.",
                R.drawable.bezelye));

        tarifListesi.add(new TarifModel("Patlıcan Musakka", "60dk", 5, "6 adet\n" +
                "orta boy pırasa\n" +
                "2 adet\n" +
                "orta boy havuç\n" +
                "2 yemek kaşığı\n" +
                "pirinç\n" +
                "1 adet\n" +
                "limon suyu\n" +
                "1 su bardağı\n" +
                "taze sıkılmış portakal suyu\n" +
                "1/2 su bardağı\n" +
                "su\n" +
                "6 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 tatlı kaşığı\n" +
                "toz şeker\n" +
                "1 çay kaşığı\n" +
                "tuz", "Dış kabuklarını ve kök kısımlarını ayıkladığınız pırasaları bol suda yıkadıktan sonra verev şeklinde doğrayın.\n" +
                "Kabuğunu soyduktan sonra uzunlamasına ortadan ikiye kestiğiniz havuçları pırasalarla uyumlu olacak şekilde kesin.\n" +
                "Geniş tabanlı bir tencereye sırasıyla; doğranmış pırasa ve havuçları yerleştirin. Duruladıktan sonra suyunu süzdürdüğünüz pirinçleri üzerlerine serpiştirin.\n" +
                "Tuz ve toz şekeri ekledikten sonra taze sıkılmış limon ve portakal suyunu tencereye aktarın. Suyu ekleyin.\n" +
                "Üzerine zeytinyağı gezdirdiğiniz pırasayı, kapağı kapalı tencerede, kısık ateşte 30-35 dakika kadar pişirin.\n" +
                "Arzuya göre ılık ya da soğuk olarak limon dilimleri eşliğinde servis edin. Şifa kaynağı kış sebzesi pırasayı tüm sevdiklerinizle paylaşın.",
                R.drawable.patlican));

        tarifListesi.add(new TarifModel("Zeytinyağlı Taze Fasülye", "50dk", 4, "6 adet\n" +
                "orta boy pırasa\n" +
                "2 adet\n" +
                "orta boy havuç\n" +
                "2 yemek kaşığı\n" +
                "pirinç\n" +
                "1 adet\n" +
                "limon suyu\n" +
                "1 su bardağı\n" +
                "taze sıkılmış portakal suyu\n" +
                "1/2 su bardağı\n" +
                "su\n" +
                "6 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 tatlı kaşığı\n" +
                "toz şeker\n" +
                "1 çay kaşığı\n" +
                "tuz", "Dış kabuklarını ve kök kısımlarını ayıkladığınız pırasaları bol suda yıkadıktan sonra verev şeklinde doğrayın.\n" +
                "Kabuğunu soyduktan sonra uzunlamasına ortadan ikiye kestiğiniz havuçları pırasalarla uyumlu olacak şekilde kesin.\n" +
                "Geniş tabanlı bir tencereye sırasıyla; doğranmış pırasa ve havuçları yerleştirin. Duruladıktan sonra suyunu süzdürdüğünüz pirinçleri üzerlerine serpiştirin.\n" +
                "Tuz ve toz şekeri ekledikten sonra taze sıkılmış limon ve portakal suyunu tencereye aktarın. Suyu ekleyin.\n" +
                "Üzerine zeytinyağı gezdirdiğiniz pırasayı, kapağı kapalı tencerede, kısık ateşte 30-35 dakika kadar pişirin.\n" +
                "Arzuya göre ılık ya da soğuk olarak limon dilimleri eşliğinde servis edin. Şifa kaynağı kış sebzesi pırasayı tüm sevdiklerinizle paylaşın.",
                R.drawable.zeytin));

        tarifListesi.add(new TarifModel("Semizotu yemeği", "50dk", 4, "6 adet\n" +
                "orta boy pırasa\n" +
                "2 adet\n" +
                "orta boy havuç\n" +
                "2 yemek kaşığı\n" +
                "pirinç\n" +
                "1 adet\n" +
                "limon suyu\n" +
                "1 su bardağı\n" +
                "taze sıkılmış portakal suyu\n" +
                "1/2 su bardağı\n" +
                "su\n" +
                "6 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 tatlı kaşığı\n" +
                "toz şeker\n" +
                "1 çay kaşığı\n" +
                "tuz", "Dış kabuklarını ve kök kısımlarını ayıkladığınız pırasaları bol suda yıkadıktan sonra verev şeklinde doğrayın.\n" +
                "Kabuğunu soyduktan sonra uzunlamasına ortadan ikiye kestiğiniz havuçları pırasalarla uyumlu olacak şekilde kesin.\n" +
                "Geniş tabanlı bir tencereye sırasıyla; doğranmış pırasa ve havuçları yerleştirin. Duruladıktan sonra suyunu süzdürdüğünüz pirinçleri üzerlerine serpiştirin.\n" +
                "Tuz ve toz şekeri ekledikten sonra taze sıkılmış limon ve portakal suyunu tencereye aktarın. Suyu ekleyin.\n" +
                "Üzerine zeytinyağı gezdirdiğiniz pırasayı, kapağı kapalı tencerede, kısık ateşte 30-35 dakika kadar pişirin.\n" +
                "Arzuya göre ılık ya da soğuk olarak limon dilimleri eşliğinde servis edin. Şifa kaynağı kış sebzesi pırasayı tüm sevdiklerinizle paylaşın.",
                R.drawable.semiz));

        tarifListesi.add(new TarifModel("Biber Dolması", "50dk", 4, "6 adet\n" +
                "orta boy pırasa\n" +
                "2 adet\n" +
                "orta boy havuç\n" +
                "2 yemek kaşığı\n" +
                "pirinç\n" +
                "1 adet\n" +
                "limon suyu\n" +
                "1 su bardağı\n" +
                "taze sıkılmış portakal suyu\n" +
                "1/2 su bardağı\n" +
                "su\n" +
                "6 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 tatlı kaşığı\n" +
                "toz şeker\n" +
                "1 çay kaşığı\n" +
                "tuz", "Dış kabuklarını ve kök kısımlarını ayıkladığınız pırasaları bol suda yıkadıktan sonra verev şeklinde doğrayın.\n" +
                "Kabuğunu soyduktan sonra uzunlamasına ortadan ikiye kestiğiniz havuçları pırasalarla uyumlu olacak şekilde kesin.\n" +
                "Geniş tabanlı bir tencereye sırasıyla; doğranmış pırasa ve havuçları yerleştirin. Duruladıktan sonra suyunu süzdürdüğünüz pirinçleri üzerlerine serpiştirin.\n" +
                "Tuz ve toz şekeri ekledikten sonra taze sıkılmış limon ve portakal suyunu tencereye aktarın. Suyu ekleyin.\n" +
                "Üzerine zeytinyağı gezdirdiğiniz pırasayı, kapağı kapalı tencerede, kısık ateşte 30-35 dakika kadar pişirin.\n" +
                "Arzuya göre ılık ya da soğuk olarak limon dilimleri eşliğinde servis edin. Şifa kaynağı kış sebzesi pırasayı tüm sevdiklerinizle paylaşın.",
                R.drawable.biber));



        CustomAdaptor adaptor = new CustomAdaptor(this, tarifListesi);
        lvSebzeler.setAdapter(adaptor);


        lvSebzeler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
