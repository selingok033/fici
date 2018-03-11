package gok.selin.fici;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import gok.selin.fici.CustomAdaptor;
import gok.selin.fici.TarifModel;

public class CorbalarActivity extends AppCompatActivity {

    ListView lvCorbalar;
    ArrayList<TarifModel> tarifListesi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corbalar);

        lvCorbalar = (ListView) findViewById(R.id.listViewTarifler);

        tarifListesi.add(new TarifModel("Mercimek Çorbası","20 dk",4,"1 su bardağı kırmızı mercimek\n" +
                "1 adet soğan\n" +
                "1 yemek kaşığı un\n" +
                "1 adet havuç\n" +
                "yarım yemek kaşığı biber ya da  domates salçası (rengi kırmızı olsun isterseniz artırabilir ya da hiç kullanmayabilirsiniz)\n" +
                "Tuz\n" +
                "1 çay kaşığı karabiber\n" +
                "yarım çay kaşığı kimyon (isteğe bağlı)\n" +
                "1 litre su\n" +
                "2 yemek kaşığı sıvı yağ","Kırmızı mercimek çorbası için sıvı yağı tencereye alınarak yemeklik doğranan soğanlar hafif pembeleşinceye kadar kavrulur.\n" +
                "Daha sonra un ilave edilerek kısık ateşte kavurmaya devam edilir.\n" +
                "Salça kullanılacak ise salça ilave edilir, kavrulduktan sonra küp küp doğranmış havuç ve iyice yıkanıp suyu süzülen mercimekler ilave edilir.\n" +
                "Üzerine 1 lt su eklenerek karıştırılır ve tencerenin kapağı kapatılır. Mercimekler ve havuçlar yumuşayana kadar kısık ateşte pişirilir.\n" +
                "Çorba piştikten sonra el blenderı ile güzelce ezilir.\n" +
                "Karabiber, tuz ve isteğe bağlı olarak kimyon eklenir.\n" +
                "Kıvamı koyu gelirse size bir miktar su ilave edilerek bir taşım kaynatılır.\n" +
                "Bu arada küçük bir tavaya iki yemek kaşığı tereyağı alınır, kızdırılır ve bir tatlı kaşığı kırmızı toz biber eklenerek ocaktan alınır.\n" +
                "Mercimek çorbası servis kasesine alındıktan sonra üzerine kırmızı biberli sos gezdirilir ve bir dilim limon ile servis edilir.",R.drawable.mercimek));

        tarifListesi.add(new TarifModel("Yayla Çorbası","25 dk",4,"yarım su bardağı pirinç\n" +
                "4.5 su bardağı su\n" +
                "2 su bardağı yoğurt\n" +
                "1 silme yemek kaşığı un\n" +
                "1 adet yumurta\n" +
                "1 yemek kaşığı tereyağı\n" +
                "nane","Pirinci 3 su bardağı soğuk suda haşlayın. Yoğurdu bir kaba alıp, 1 su bardağı su ile iyice çırpıp, yumurtayı ve unu ilave ederek çırpmaya devam edin. Haşlanmış pirince yarım su bardağı soğuk suyu ilave edin ve yoğurtlu karışımı birden döküp, karıştırın. Kıvamı koyu olursa biraz ılık su ilave edip, 5 dakika kaynatın. Ocağın altını kapatıp, tavada tereyağını eritip, naneyi kavurun. Çorbayı servis kaselerine aldıktan sonra kavrulmuş naneyi üzerinde gezdirip, sıcak servis yapın.",
                R.drawable.yayla));

        tarifListesi.add(new TarifModel("Ezogelin Çorbası","45 dk",6,"1 su bardağı kırmızı mercimek\n" +
                "1 tatlı kaşığı pirinç\n" +
                "1 tatlı kaşığı bulgur\n" +
                "2 çay kaşığı pul biber\n" +
                "1 yemek kaşığı nane\n" +
                "2 diş sarımsak\n" +
                "1 orta boy soğan\n" +
                "1 yemek kaşığı biber salçası\n" +
                "1 yemek kaşığı tuz\n" +
                "1 yemek kaşığı tereyağı\n" +
                "2 litreye yakın sıcak su","Ezogelin çorbası yapmak için düdüklü tencerede önce rendelemiş olduğumuz soğanı ve ezmiş olduğumuz sarımsağı tereyağında kavuruyoruz. Soğanlar diriliğini kaybetsin yeterli yakmadan orta ateşte kavuralım.\n" +
                "Soğanlar kavrulunca naneyi, kırmızı biberi ve salçayı ilave edip. Kavurmaya devam edelim.\n" +
                "Bir iki karıştırdıktan sonra yıkadığımız mercimeği, pirinci, bulguru ve tuzunu da ilave ederek karıştıralım.\n" +
                "Başka bir tarafta kaynamakta olan 2 litreye yakın suyu üzerine boşaltalım.\n" +
                "Düdüklünün kapağını ve düdüğünü kapattıktan sonra 10 dakika pişiriyoruz. Normal tencerede de yapabilirsiniz ama biraz daha geç pişecektir (yaklaşık 30-40 dakika sürecektir).",
                R.drawable.ezogelin));

        // TODO: 11.03.2018 Daha fazla tarif eklenebilir.
        
        CustomAdaptor adaptor = new CustomAdaptor(this,tarifListesi);
        lvCorbalar.setAdapter(adaptor);

        lvCorbalar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(getApplicationContext(),WebActivity.class);
//                intent.putExtra("LINK",haberListesi.get(position).getLink());
//                startActivity(intent);

            }
        });

    }
}
