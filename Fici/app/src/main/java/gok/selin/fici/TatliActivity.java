package gok.selin.fici;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TatliActivity extends AppCompatActivity {

    ListView lvTatlilar;
    ArrayList<TarifModel> tarifListesi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatli);

         lvTatlilar = (ListView) findViewById(R.id.listViewTatli);

        tarifListesi.add(new TarifModel("Triliçe", "60dk", 4, "6 adet\n" +
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
                R.drawable.tricile));

        tarifListesi.add(new TarifModel("Sütlaç", "60dk", 4, "6 adet\n" +
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
                R.drawable.sutlac));

        tarifListesi.add(new TarifModel("Cevizli Baklava", "60dk", 4, "6 adet\n" +
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
                R.drawable.baklava));

        tarifListesi.add(new TarifModel("Profiterol", "60dk", 4, "6 adet\n" +
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
                R.drawable.pro));

        tarifListesi.add(new TarifModel("Kazandibi", "60dk", 4, "6 adet\n" +
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
                R.drawable.kazan));

        tarifListesi.add(new TarifModel("Tel Kadayıf", "60dk", 4, "6 adet\n" +
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
                R.drawable.tel));




        CustomAdaptor adaptor = new CustomAdaptor(this, tarifListesi);
        lvTatlilar.setAdapter(adaptor);


        lvTatlilar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                TarifModel tarif = tarifListesi.get(i);
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
