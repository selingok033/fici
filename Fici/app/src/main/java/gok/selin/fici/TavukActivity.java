package gok.selin.fici;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TavukActivity extends AppCompatActivity {

    ListView lvTavuklar;
    ArrayList<TarifModel> tarifListesi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tavuk);

        lvTavuklar =(ListView) findViewById(R.id.listViewTarifler);

        tarifListesi.add(new TarifModel("Tavuk Külbastı","150dk",6,"1 kilo tavuk bonfile (Göğüs eti)\n" +
                "1 adet soğan\n" +
                "2 diş sarımsak\n" +
                "2 kaşık sıvı yağ\n" +
                "1 kaşık kekik\n" +
                "1 çay kaşığı karabiber\n" +
                "1 tatlı kaşığı toz biber\n" +
                "1 adet tavuk bulyon\n" +
                "tuz1 adet çarliston biber\n" +
                "1 adet kırmızı biber","Önce bonfileleri iyice yıkayın ortadan ikiye dilimleyin.Et döveceği ile biraz inceltin.Et döveceği olmayanlar aynı işlemi bardak altı ile yapabilirsiniz. Geniş bir kabın içerisine koyun. Soğanı, sarımsağı ayıklayın, soğanı dörde bölün rondo da  suyu çıkana kadar çekin.Soğanın ve sarımsağın suyunu süzgeçten geçirerek bonfilelere ilave edin soğanın posasını atın.Üzerine sıvı yağını tuzu ve bütün baharatları ekleyin iyice harmanlayın.Bir iki saat buzdolabında dinlendirin.Ocağa teflon tavayı koyun kızdırın yada yanmaz tavada olur .Soslu bonfileleri yağ koymadan arkalı önlü kızartın.Kızarttığınız bonfileleri orta boy borcam veya fırın kabına ikişerli üst üste yerleştirin.Kırmızı ve çarliston biberi parmak şeklinde doğrayın etleri kızarttığınız tavada hafif arkalı önlü soteleyin.Biberleri borcamda ki kızarttığınız bonfilelerin üzerine bir kırmızı bir çarliston biberi kürdan yardımıyla sabitleyin.Bir bardak sıcak suyun içerisinde tavuk bulyonu eritin fırın kabının içerisine koyun.Önceden fırını 180 derecede ısıtın. Borcamı fırına koyun üzeri kızarana kadar on beş dakika kızartın.fırını kapatın.Fırın Külbastı yemeğimiz servise hazır.Afiyet olsun."
                ,R.drawable.tavukkulbasti));

        tarifListesi.add(new TarifModel("Köri Soslu Tavuk","30dk",4,"1 kilo tavuk bonfile (Göğüs eti)\n" +
                "1 adet soğan\n" +
                "2 diş sarımsak\n" +
                "2 kaşık sıvı yağ\n" +
                "1 kaşık kekik\n" +
                "1 çay kaşığı karabiber\n" +
                "1 tatlı kaşığı toz biber\n" +
                "1 adet tavuk bulyon\n" +
                "tuz1 adet çarliston biber\n" +
                "1 adet kırmızı biber","Önce bonfileleri iyice yıkayın ortadan ikiye dilimleyin.Et döveceği ile biraz inceltin.Et döveceği olmayanlar aynı işlemi bardak altı ile yapabilirsiniz. Geniş bir kabın içerisine koyun. Soğanı, sarımsağı ayıklayın, soğanı dörde bölün rondo da  suyu çıkana kadar çekin.Soğanın ve sarımsağın suyunu süzgeçten geçirerek bonfilelere ilave edin soğanın posasını atın.Üzerine sıvı yağını tuzu ve bütün baharatları ekleyin iyice harmanlayın.Bir iki saat buzdolabında dinlendirin.Ocağa teflon tavayı koyun kızdırın yada yanmaz tavada olur .Soslu bonfileleri yağ koymadan arkalı önlü kızartın.Kızarttığınız bonfileleri orta boy borcam veya fırın kabına ikişerli üst üste yerleştirin.Kırmızı ve çarliston biberi parmak şeklinde doğrayın etleri kızarttığınız tavada hafif arkalı önlü soteleyin.Biberleri borcamda ki kızarttığınız bonfilelerin üzerine bir kırmızı bir çarliston biberi kürdan yardımıyla sabitleyin.Bir bardak sıcak suyun içerisinde tavuk bulyonu eritin fırın kabının içerisine koyun.Önceden fırını 180 derecede ısıtın. Borcamı fırına koyun üzeri kızarana kadar on beş dakika kızartın.fırını kapatın.Fırın Külbastı yemeğimiz servise hazır.Afiyet olsun."
                ,R.drawable.kori));

        tarifListesi.add(new TarifModel("Tavuk Kanat","120dk",8,"1 kilo tavuk bonfile (Göğüs eti)\n" +
                "1 adet soğan\n" +
                "2 diş sarımsak\n" +
                "2 kaşık sıvı yağ\n" +
                "1 kaşık kekik\n" +
                "1 çay kaşığı karabiber\n" +
                "1 tatlı kaşığı toz biber\n" +
                "1 adet tavuk bulyon\n" +
                "tuz1 adet çarliston biber\n" +
                "1 adet kırmızı biber","Önce bonfileleri iyice yıkayın ortadan ikiye dilimleyin.Et döveceği ile biraz inceltin.Et döveceği olmayanlar aynı işlemi bardak altı ile yapabilirsiniz. Geniş bir kabın içerisine koyun. Soğanı, sarımsağı ayıklayın, soğanı dörde bölün rondo da  suyu çıkana kadar çekin.Soğanın ve sarımsağın suyunu süzgeçten geçirerek bonfilelere ilave edin soğanın posasını atın.Üzerine sıvı yağını tuzu ve bütün baharatları ekleyin iyice harmanlayın.Bir iki saat buzdolabında dinlendirin.Ocağa teflon tavayı koyun kızdırın yada yanmaz tavada olur .Soslu bonfileleri yağ koymadan arkalı önlü kızartın.Kızarttığınız bonfileleri orta boy borcam veya fırın kabına ikişerli üst üste yerleştirin.Kırmızı ve çarliston biberi parmak şeklinde doğrayın etleri kızarttığınız tavada hafif arkalı önlü soteleyin.Biberleri borcamda ki kızarttığınız bonfilelerin üzerine bir kırmızı bir çarliston biberi kürdan yardımıyla sabitleyin.Bir bardak sıcak suyun içerisinde tavuk bulyonu eritin fırın kabının içerisine koyun.Önceden fırını 180 derecede ısıtın. Borcamı fırına koyun üzeri kızarana kadar on beş dakika kızartın.fırını kapatın.Fırın Külbastı yemeğimiz servise hazır.Afiyet olsun."
                ,R.drawable.kanat));

        tarifListesi.add(new TarifModel("Tavuk Tirit","110dk",5,"1 kilo tavuk bonfile (Göğüs eti)\n" +
                "1 adet soğan\n" +
                "2 diş sarımsak\n" +
                "2 kaşık sıvı yağ\n" +
                "1 kaşık kekik\n" +
                "1 çay kaşığı karabiber\n" +
                "1 tatlı kaşığı toz biber\n" +
                "1 adet tavuk bulyon\n" +
                "tuz1 adet çarliston biber\n" +
                "1 adet kırmızı biber","Önce bonfileleri iyice yıkayın ortadan ikiye dilimleyin.Et döveceği ile biraz inceltin.Et döveceği olmayanlar aynı işlemi bardak altı ile yapabilirsiniz. Geniş bir kabın içerisine koyun. Soğanı, sarımsağı ayıklayın, soğanı dörde bölün rondo da  suyu çıkana kadar çekin.Soğanın ve sarımsağın suyunu süzgeçten geçirerek bonfilelere ilave edin soğanın posasını atın.Üzerine sıvı yağını tuzu ve bütün baharatları ekleyin iyice harmanlayın.Bir iki saat buzdolabında dinlendirin.Ocağa teflon tavayı koyun kızdırın yada yanmaz tavada olur .Soslu bonfileleri yağ koymadan arkalı önlü kızartın.Kızarttığınız bonfileleri orta boy borcam veya fırın kabına ikişerli üst üste yerleştirin.Kırmızı ve çarliston biberi parmak şeklinde doğrayın etleri kızarttığınız tavada hafif arkalı önlü soteleyin.Biberleri borcamda ki kızarttığınız bonfilelerin üzerine bir kırmızı bir çarliston biberi kürdan yardımıyla sabitleyin.Bir bardak sıcak suyun içerisinde tavuk bulyonu eritin fırın kabının içerisine koyun.Önceden fırını 180 derecede ısıtın. Borcamı fırına koyun üzeri kızarana kadar on beş dakika kızartın.fırını kapatın.Fırın Külbastı yemeğimiz servise hazır.Afiyet olsun."
                ,R.drawable.tirit));

        tarifListesi.add(new TarifModel("Tavuk Şiş","90dk",10,"1 kilo tavuk bonfile (Göğüs eti)\n" +
                "1 adet soğan\n" +
                "2 diş sarımsak\n" +
                "2 kaşık sıvı yağ\n" +
                "1 kaşık kekik\n" +
                "1 çay kaşığı karabiber\n" +
                "1 tatlı kaşığı toz biber\n" +
                "1 adet tavuk bulyon\n" +
                "tuz1 adet çarliston biber\n" +
                "1 adet kırmızı biber","Önce bonfileleri iyice yıkayın ortadan ikiye dilimleyin.Et döveceği ile biraz inceltin.Et döveceği olmayanlar aynı işlemi bardak altı ile yapabilirsiniz. Geniş bir kabın içerisine koyun. Soğanı, sarımsağı ayıklayın, soğanı dörde bölün rondo da  suyu çıkana kadar çekin.Soğanın ve sarımsağın suyunu süzgeçten geçirerek bonfilelere ilave edin soğanın posasını atın.Üzerine sıvı yağını tuzu ve bütün baharatları ekleyin iyice harmanlayın.Bir iki saat buzdolabında dinlendirin.Ocağa teflon tavayı koyun kızdırın yada yanmaz tavada olur .Soslu bonfileleri yağ koymadan arkalı önlü kızartın.Kızarttığınız bonfileleri orta boy borcam veya fırın kabına ikişerli üst üste yerleştirin.Kırmızı ve çarliston biberi parmak şeklinde doğrayın etleri kızarttığınız tavada hafif arkalı önlü soteleyin.Biberleri borcamda ki kızarttığınız bonfilelerin üzerine bir kırmızı bir çarliston biberi kürdan yardımıyla sabitleyin.Bir bardak sıcak suyun içerisinde tavuk bulyonu eritin fırın kabının içerisine koyun.Önceden fırını 180 derecede ısıtın. Borcamı fırına koyun üzeri kızarana kadar on beş dakika kızartın.fırını kapatın.Fırın Külbastı yemeğimiz servise hazır.Afiyet olsun."
                ,R.drawable.sis));

        tarifListesi.add(new TarifModel("Tavuk Pirzola","70dk",4,"1 kilo tavuk bonfile (Göğüs eti)\n" +
                "1 adet soğan\n" +
                "2 diş sarımsak\n" +
                "2 kaşık sıvı yağ\n" +
                "1 kaşık kekik\n" +
                "1 çay kaşığı karabiber\n" +
                "1 tatlı kaşığı toz biber\n" +
                "1 adet tavuk bulyon\n" +
                "tuz1 adet çarliston biber\n" +
                "1 adet kırmızı biber","Önce bonfileleri iyice yıkayın ortadan ikiye dilimleyin.Et döveceği ile biraz inceltin.Et döveceği olmayanlar aynı işlemi bardak altı ile yapabilirsiniz. Geniş bir kabın içerisine koyun. Soğanı, sarımsağı ayıklayın, soğanı dörde bölün rondo da  suyu çıkana kadar çekin.Soğanın ve sarımsağın suyunu süzgeçten geçirerek bonfilelere ilave edin soğanın posasını atın.Üzerine sıvı yağını tuzu ve bütün baharatları ekleyin iyice harmanlayın.Bir iki saat buzdolabında dinlendirin.Ocağa teflon tavayı koyun kızdırın yada yanmaz tavada olur .Soslu bonfileleri yağ koymadan arkalı önlü kızartın.Kızarttığınız bonfileleri orta boy borcam veya fırın kabına ikişerli üst üste yerleştirin.Kırmızı ve çarliston biberi parmak şeklinde doğrayın etleri kızarttığınız tavada hafif arkalı önlü soteleyin.Biberleri borcamda ki kızarttığınız bonfilelerin üzerine bir kırmızı bir çarliston biberi kürdan yardımıyla sabitleyin.Bir bardak sıcak suyun içerisinde tavuk bulyonu eritin fırın kabının içerisine koyun.Önceden fırını 180 derecede ısıtın. Borcamı fırına koyun üzeri kızarana kadar on beş dakika kızartın.fırını kapatın.Fırın Külbastı yemeğimiz servise hazır.Afiyet olsun."
                ,R.drawable.tavukpir));

        tarifListesi.add(new TarifModel("Tavuk Bonfile","145dk",8,"1 kilo tavuk bonfile (Göğüs eti)\n" +
                "1 adet soğan\n" +
                "2 diş sarımsak\n" +
                "2 kaşık sıvı yağ\n" +
                "1 kaşık kekik\n" +
                "1 çay kaşığı karabiber\n" +
                "1 tatlı kaşığı toz biber\n" +
                "1 adet tavuk bulyon\n" +
                "tuz1 adet çarliston biber\n" +
                "1 adet kırmızı biber","Önce bonfileleri iyice yıkayın ortadan ikiye dilimleyin.Et döveceği ile biraz inceltin.Et döveceği olmayanlar aynı işlemi bardak altı ile yapabilirsiniz. Geniş bir kabın içerisine koyun. Soğanı, sarımsağı ayıklayın, soğanı dörde bölün rondo da  suyu çıkana kadar çekin.Soğanın ve sarımsağın suyunu süzgeçten geçirerek bonfilelere ilave edin soğanın posasını atın.Üzerine sıvı yağını tuzu ve bütün baharatları ekleyin iyice harmanlayın.Bir iki saat buzdolabında dinlendirin.Ocağa teflon tavayı koyun kızdırın yada yanmaz tavada olur .Soslu bonfileleri yağ koymadan arkalı önlü kızartın.Kızarttığınız bonfileleri orta boy borcam veya fırın kabına ikişerli üst üste yerleştirin.Kırmızı ve çarliston biberi parmak şeklinde doğrayın etleri kızarttığınız tavada hafif arkalı önlü soteleyin.Biberleri borcamda ki kızarttığınız bonfilelerin üzerine bir kırmızı bir çarliston biberi kürdan yardımıyla sabitleyin.Bir bardak sıcak suyun içerisinde tavuk bulyonu eritin fırın kabının içerisine koyun.Önceden fırını 180 derecede ısıtın. Borcamı fırına koyun üzeri kızarana kadar on beş dakika kızartın.fırını kapatın.Fırın Külbastı yemeğimiz servise hazır.Afiyet olsun."
                ,R.drawable.bonfile));

        tarifListesi.add(new TarifModel("Çıtır Tavuk","60dk",5,"1 kilo tavuk bonfile (Göğüs eti)\n" +
                "1 adet soğan\n" +
                "2 diş sarımsak\n" +
                "2 kaşık sıvı yağ\n" +
                "1 kaşık kekik\n" +
                "1 çay kaşığı karabiber\n" +
                "1 tatlı kaşığı toz biber\n" +
                "1 adet tavuk bulyon\n" +
                "tuz1 adet çarliston biber\n" +
                "1 adet kırmızı biber","Önce bonfileleri iyice yıkayın ortadan ikiye dilimleyin.Et döveceği ile biraz inceltin.Et döveceği olmayanlar aynı işlemi bardak altı ile yapabilirsiniz. Geniş bir kabın içerisine koyun. Soğanı, sarımsağı ayıklayın, soğanı dörde bölün rondo da  suyu çıkana kadar çekin.Soğanın ve sarımsağın suyunu süzgeçten geçirerek bonfilelere ilave edin soğanın posasını atın.Üzerine sıvı yağını tuzu ve bütün baharatları ekleyin iyice harmanlayın.Bir iki saat buzdolabında dinlendirin.Ocağa teflon tavayı koyun kızdırın yada yanmaz tavada olur .Soslu bonfileleri yağ koymadan arkalı önlü kızartın.Kızarttığınız bonfileleri orta boy borcam veya fırın kabına ikişerli üst üste yerleştirin.Kırmızı ve çarliston biberi parmak şeklinde doğrayın etleri kızarttığınız tavada hafif arkalı önlü soteleyin.Biberleri borcamda ki kızarttığınız bonfilelerin üzerine bir kırmızı bir çarliston biberi kürdan yardımıyla sabitleyin.Bir bardak sıcak suyun içerisinde tavuk bulyonu eritin fırın kabının içerisine koyun.Önceden fırını 180 derecede ısıtın. Borcamı fırına koyun üzeri kızarana kadar on beş dakika kızartın.fırını kapatın.Fırın Külbastı yemeğimiz servise hazır.Afiyet olsun."
                ,R.drawable.citir));

        CustomAdaptor adaptor = new CustomAdaptor(this,tarifListesi);
        lvTavuklar.setAdapter(adaptor);


        lvTavuklar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });


    }




}
