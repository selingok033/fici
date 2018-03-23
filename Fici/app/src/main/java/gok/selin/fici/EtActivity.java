package gok.selin.fici;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EtActivity extends AppCompatActivity {

    ListView lvEtler;
    ArrayList<TarifModel> tarifListesi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_et);

        lvEtler = (ListView) findViewById(R.id.listViewEt);

        tarifListesi.add(new TarifModel("Karnıyarık","60 dk",5,"4 adet\n" +
                "orta boy patlıcan\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 adet\n" +
                "büyük boy kuru soğan\n" +
                "3 diş\n" +
                "sarımsak\n" +
                "300 gram\n" +
                "kıyma\n" +
                "1 adet\n" +
                "büyük boy domates\n" +
                "2 adet\n" +
                "orta boy yeşil sivri biber\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "karabiber\n" +
                "1/4 çay kaşığı\n" +
                "yenibahar","Bol suda yıkadığınız patlıcanları, sap ve uç kısımlarını kestikten sonra alacalı bir şekilde soyun.\n" +
                "\n" +
                "Keskin bir bıçak yardımıyla orta kısımlarına çizik attığınız patlıcanları derin bir tavada kızdırdığınız ayçiçek yağında kızartın. Fazla yağlarını bırakması için kağıt havlu serili bir tabağa aldığınız patlıcanları bekletin.\n" +
                "\n" +
                "Kıymalı harcını hazırlamak için; kuru soğanı küçük parçalar halinde yemeklik doğrayın. Sarımsağı ince ince kesin.\n" +
                "\n" +
                "Kabuğunu soyduğunuz domatesi küp şeklinde doğrayın. Ortadan ikiye kesip, çekirdeklerini çıkardığınız sivri biberleri ince ince dilimleyin.\n" +
                "\n" +
                "Zeytinyağını bir tavada kızdırın. Yemeklik doğradığınız soğan ve sarımsakları hafif bir renk alana kadar kavurun.\n" +
                "\n" +
                "Lezzet vermesi adına tercih edebileceğiniz orta yağlı kıymayı tavaya aktarın. Kavrulmakta olan soğanlarla birlikte renk alıp, suyunu çekene kadar pişirin.",
                R.drawable.karniyarik));
        tarifListesi.add(new TarifModel("Biftek Izgara","60 dk",5,"4 adet\n" +
                "orta boy patlıcan\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 adet\n" +
                "büyük boy kuru soğan\n" +
                "3 diş\n" +
                "sarımsak\n" +
                "300 gram\n" +
                "kıyma\n" +
                "1 adet\n" +
                "büyük boy domates\n" +
                "2 adet\n" +
                "orta boy yeşil sivri biber\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "karabiber\n" +
                "1/4 çay kaşığı\n" +
                "yenibahar","Bol suda yıkadığınız patlıcanları, sap ve uç kısımlarını kestikten sonra alacalı bir şekilde soyun.\n" +
                "\n" +
                "Keskin bir bıçak yardımıyla orta kısımlarına çizik attığınız patlıcanları derin bir tavada kızdırdığınız ayçiçek yağında kızartın. Fazla yağlarını bırakması için kağıt havlu serili bir tabağa aldığınız patlıcanları bekletin.\n" +
                "\n" +
                "Kıymalı harcını hazırlamak için; kuru soğanı küçük parçalar halinde yemeklik doğrayın. Sarımsağı ince ince kesin.\n" +
                "\n" +
                "Kabuğunu soyduğunuz domatesi küp şeklinde doğrayın. Ortadan ikiye kesip, çekirdeklerini çıkardığınız sivri biberleri ince ince dilimleyin.\n" +
                "\n" +
                "Zeytinyağını bir tavada kızdırın. Yemeklik doğradığınız soğan ve sarımsakları hafif bir renk alana kadar kavurun.\n" +
                "\n" +
                "Lezzet vermesi adına tercih edebileceğiniz orta yağlı kıymayı tavaya aktarın. Kavrulmakta olan soğanlarla birlikte renk alıp, suyunu çekene kadar pişirin.",
                R.drawable.biftek));

        tarifListesi.add(new TarifModel("Etli Pilav","60 dk",5,"4 adet\n" +
                "orta boy patlıcan\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 adet\n" +
                "büyük boy kuru soğan\n" +
                "3 diş\n" +
                "sarımsak\n" +
                "300 gram\n" +
                "kıyma\n" +
                "1 adet\n" +
                "büyük boy domates\n" +
                "2 adet\n" +
                "orta boy yeşil sivri biber\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "karabiber\n" +
                "1/4 çay kaşığı\n" +
                "yenibahar","Bol suda yıkadığınız patlıcanları, sap ve uç kısımlarını kestikten sonra alacalı bir şekilde soyun.\n" +
                "\n" +
                "Keskin bir bıçak yardımıyla orta kısımlarına çizik attığınız patlıcanları derin bir tavada kızdırdığınız ayçiçek yağında kızartın. Fazla yağlarını bırakması için kağıt havlu serili bir tabağa aldığınız patlıcanları bekletin.\n" +
                "\n" +
                "Kıymalı harcını hazırlamak için; kuru soğanı küçük parçalar halinde yemeklik doğrayın. Sarımsağı ince ince kesin.\n" +
                "\n" +
                "Kabuğunu soyduğunuz domatesi küp şeklinde doğrayın. Ortadan ikiye kesip, çekirdeklerini çıkardığınız sivri biberleri ince ince dilimleyin.\n" +
                "\n" +
                "Zeytinyağını bir tavada kızdırın. Yemeklik doğradığınız soğan ve sarımsakları hafif bir renk alana kadar kavurun.\n" +
                "\n" +
                "Lezzet vermesi adına tercih edebileceğiniz orta yağlı kıymayı tavaya aktarın. Kavrulmakta olan soğanlarla birlikte renk alıp, suyunu çekene kadar pişirin.",
                R.drawable.etlipilav));

        tarifListesi.add(new TarifModel("Et Güveç","100 dk",6,"4 adet\n" +
                "orta boy patlıcan\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 adet\n" +
                "büyük boy kuru soğan\n" +
                "3 diş\n" +
                "sarımsak\n" +
                "300 gram\n" +
                "kıyma\n" +
                "1 adet\n" +
                "büyük boy domates\n" +
                "2 adet\n" +
                "orta boy yeşil sivri biber\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "karabiber\n" +
                "1/4 çay kaşığı\n" +
                "yenibahar","Bol suda yıkadığınız patlıcanları, sap ve uç kısımlarını kestikten sonra alacalı bir şekilde soyun.\n" +
                "\n" +
                "Keskin bir bıçak yardımıyla orta kısımlarına çizik attığınız patlıcanları derin bir tavada kızdırdığınız ayçiçek yağında kızartın. Fazla yağlarını bırakması için kağıt havlu serili bir tabağa aldığınız patlıcanları bekletin.\n" +
                "\n" +
                "Kıymalı harcını hazırlamak için; kuru soğanı küçük parçalar halinde yemeklik doğrayın. Sarımsağı ince ince kesin.\n" +
                "\n" +
                "Kabuğunu soyduğunuz domatesi küp şeklinde doğrayın. Ortadan ikiye kesip, çekirdeklerini çıkardığınız sivri biberleri ince ince dilimleyin.\n" +
                "\n" +
                "Zeytinyağını bir tavada kızdırın. Yemeklik doğradığınız soğan ve sarımsakları hafif bir renk alana kadar kavurun.\n" +
                "\n" +
                "Lezzet vermesi adına tercih edebileceğiniz orta yağlı kıymayı tavaya aktarın. Kavrulmakta olan soğanlarla birlikte renk alıp, suyunu çekene kadar pişirin.",
                R.drawable.etguvec));

        tarifListesi.add(new TarifModel("Etli Nohut","80 dk",4,"4 adet\n" +
                "orta boy patlıcan\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 adet\n" +
                "büyük boy kuru soğan\n" +
                "3 diş\n" +
                "sarımsak\n" +
                "300 gram\n" +
                "kıyma\n" +
                "1 adet\n" +
                "büyük boy domates\n" +
                "2 adet\n" +
                "orta boy yeşil sivri biber\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "karabiber\n" +
                "1/4 çay kaşığı\n" +
                "yenibahar","Bol suda yıkadığınız patlıcanları, sap ve uç kısımlarını kestikten sonra alacalı bir şekilde soyun.\n" +
                "\n" +
                "Keskin bir bıçak yardımıyla orta kısımlarına çizik attığınız patlıcanları derin bir tavada kızdırdığınız ayçiçek yağında kızartın. Fazla yağlarını bırakması için kağıt havlu serili bir tabağa aldığınız patlıcanları bekletin.\n" +
                "\n" +
                "Kıymalı harcını hazırlamak için; kuru soğanı küçük parçalar halinde yemeklik doğrayın. Sarımsağı ince ince kesin.\n" +
                "\n" +
                "Kabuğunu soyduğunuz domatesi küp şeklinde doğrayın. Ortadan ikiye kesip, çekirdeklerini çıkardığınız sivri biberleri ince ince dilimleyin.\n" +
                "\n" +
                "Zeytinyağını bir tavada kızdırın. Yemeklik doğradığınız soğan ve sarımsakları hafif bir renk alana kadar kavurun.\n" +
                "\n" +
                "Lezzet vermesi adına tercih edebileceğiniz orta yağlı kıymayı tavaya aktarın. Kavrulmakta olan soğanlarla birlikte renk alıp, suyunu çekene kadar pişirin.",
                R.drawable.etlinohut));

        tarifListesi.add(new TarifModel("Dana Etli Fajita","85 dk",6,"4 adet\n" +
                "orta boy patlıcan\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 adet\n" +
                "büyük boy kuru soğan\n" +
                "3 diş\n" +
                "sarımsak\n" +
                "300 gram\n" +
                "kıyma\n" +
                "1 adet\n" +
                "büyük boy domates\n" +
                "2 adet\n" +
                "orta boy yeşil sivri biber\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "karabiber\n" +
                "1/4 çay kaşığı\n" +
                "yenibahar","Bol suda yıkadığınız patlıcanları, sap ve uç kısımlarını kestikten sonra alacalı bir şekilde soyun.\n" +
                "\n" +
                "Keskin bir bıçak yardımıyla orta kısımlarına çizik attığınız patlıcanları derin bir tavada kızdırdığınız ayçiçek yağında kızartın. Fazla yağlarını bırakması için kağıt havlu serili bir tabağa aldığınız patlıcanları bekletin.\n" +
                "\n" +
                "Kıymalı harcını hazırlamak için; kuru soğanı küçük parçalar halinde yemeklik doğrayın. Sarımsağı ince ince kesin.\n" +
                "\n" +
                "Kabuğunu soyduğunuz domatesi küp şeklinde doğrayın. Ortadan ikiye kesip, çekirdeklerini çıkardığınız sivri biberleri ince ince dilimleyin.\n" +
                "\n" +
                "Zeytinyağını bir tavada kızdırın. Yemeklik doğradığınız soğan ve sarımsakları hafif bir renk alana kadar kavurun.\n" +
                "\n" +
                "Lezzet vermesi adına tercih edebileceğiniz orta yağlı kıymayı tavaya aktarın. Kavrulmakta olan soğanlarla birlikte renk alıp, suyunu çekene kadar pişirin.",
                R.drawable.etlifajita));

        tarifListesi.add(new TarifModel("Adana Kebap","60 dk",5,"4 adet\n" +
                "orta boy patlıcan\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 adet\n" +
                "büyük boy kuru soğan\n" +
                "3 diş\n" +
                "sarımsak\n" +
                "300 gram\n" +
                "kıyma\n" +
                "1 adet\n" +
                "büyük boy domates\n" +
                "2 adet\n" +
                "orta boy yeşil sivri biber\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "karabiber\n" +
                "1/4 çay kaşığı\n" +
                "yenibahar","Bol suda yıkadığınız patlıcanları, sap ve uç kısımlarını kestikten sonra alacalı bir şekilde soyun.\n" +
                "\n" +
                "Keskin bir bıçak yardımıyla orta kısımlarına çizik attığınız patlıcanları derin bir tavada kızdırdığınız ayçiçek yağında kızartın. Fazla yağlarını bırakması için kağıt havlu serili bir tabağa aldığınız patlıcanları bekletin.\n" +
                "\n" +
                "Kıymalı harcını hazırlamak için; kuru soğanı küçük parçalar halinde yemeklik doğrayın. Sarımsağı ince ince kesin.\n" +
                "\n" +
                "Kabuğunu soyduğunuz domatesi küp şeklinde doğrayın. Ortadan ikiye kesip, çekirdeklerini çıkardığınız sivri biberleri ince ince dilimleyin.\n" +
                "\n" +
                "Zeytinyağını bir tavada kızdırın. Yemeklik doğradığınız soğan ve sarımsakları hafif bir renk alana kadar kavurun.\n" +
                "\n" +
                "Lezzet vermesi adına tercih edebileceğiniz orta yağlı kıymayı tavaya aktarın. Kavrulmakta olan soğanlarla birlikte renk alıp, suyunu çekene kadar pişirin.",
                R.drawable.adana));

        tarifListesi.add(new TarifModel("Kuzu Pirzola","75 dk",6,"4 adet\n" +
                "orta boy patlıcan\n" +
                "3 yemek kaşığı\n" +
                "zeytinyağı\n" +
                "1 adet\n" +
                "büyük boy kuru soğan\n" +
                "3 diş\n" +
                "sarımsak\n" +
                "300 gram\n" +
                "kıyma\n" +
                "1 adet\n" +
                "büyük boy domates\n" +
                "2 adet\n" +
                "orta boy yeşil sivri biber\n" +
                "1/4 demet\n" +
                "maydanoz\n" +
                "1 çay kaşığı\n" +
                "tuz\n" +
                "1/2 çay kaşığı\n" +
                "karabiber\n" +
                "1/4 çay kaşığı\n" +
                "yenibahar","Bol suda yıkadığınız patlıcanları, sap ve uç kısımlarını kestikten sonra alacalı bir şekilde soyun.\n" +
                "\n" +
                "Keskin bir bıçak yardımıyla orta kısımlarına çizik attığınız patlıcanları derin bir tavada kızdırdığınız ayçiçek yağında kızartın. Fazla yağlarını bırakması için kağıt havlu serili bir tabağa aldığınız patlıcanları bekletin.\n" +
                "\n" +
                "Kıymalı harcını hazırlamak için; kuru soğanı küçük parçalar halinde yemeklik doğrayın. Sarımsağı ince ince kesin.\n" +
                "\n" +
                "Kabuğunu soyduğunuz domatesi küp şeklinde doğrayın. Ortadan ikiye kesip, çekirdeklerini çıkardığınız sivri biberleri ince ince dilimleyin.\n" +
                "\n" +
                "Zeytinyağını bir tavada kızdırın. Yemeklik doğradığınız soğan ve sarımsakları hafif bir renk alana kadar kavurun.\n" +
                "\n" +
                "Lezzet vermesi adına tercih edebileceğiniz orta yağlı kıymayı tavaya aktarın. Kavrulmakta olan soğanlarla birlikte renk alıp, suyunu çekene kadar pişirin.",
                R.drawable.kuzu));

        // TODO: 11.03.2018 Daha fazla tarif eklenecek
        
        CustomAdaptor adaptor = new CustomAdaptor(this,tarifListesi);
        lvEtler.setAdapter(adaptor);

        
        lvEtler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
