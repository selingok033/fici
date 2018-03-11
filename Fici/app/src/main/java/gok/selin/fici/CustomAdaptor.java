package gok.selin.fici;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Selin on 11.03.2018.
 */

public class CustomAdaptor extends BaseAdapter {

    ArrayList<TarifModel> tarifListe;
    LayoutInflater userInflater;

    public CustomAdaptor (Activity activity, ArrayList<TarifModel> tarifListesi){
        userInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        tarifListe = tarifListesi;
    }

    @Override
    public int getCount() {
        return tarifListe.size();
    }

    @Override
    public Object getItem(int position) {
        return tarifListe.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satir;
        satir = userInflater.inflate(R.layout.custom_row,null);

        ImageView ivLogo = (ImageView) satir.findViewById(R.id.imageViewLogo);
        TextView tvTarifAdi = (TextView) satir.findViewById(R.id.textViewTarifAdi);
        TextView tvKisiSayisi = (TextView) satir.findViewById(R.id.textViewKisiSayisi);
        TextView tvHazirlamaSuresi = (TextView) satir.findViewById(R.id.textViewHazirlamaSuresi);

        tvTarifAdi.setText(tarifListe.get(position).getTarifAdi());
        tvKisiSayisi.setText(tarifListe.get(position).getKisiSayisi()+" Kişilik");
        tvHazirlamaSuresi.setText(tarifListe.get(position).getHazirlamaSuresi());
        ivLogo.setImageResource(tarifListe.get(position).getLogoId());
        return satir;
    }
}
