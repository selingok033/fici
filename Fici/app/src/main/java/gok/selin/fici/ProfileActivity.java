package gok.selin.fici;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/*
UMUT
Profilde kişiden elindeki mevcut malzemeleri ve araçları işaretleyebileceği dropdownlist veya
check list oluşturmanı bekliyoruz. Kullanıcı resminin olacağı bir imageview'e profile png de
eklersen güzel olabilir.
 */

public class ProfileActivity extends AppCompatActivity {

    List ingredients = new ArrayList<>(R.array.ingredients);

    /*Selam, bu haliyle pushluyorum. Üstteki satır OutOfMemory hatası veriyor. Çok anlayamadım, mantıksal bir hata yapıyorum sanırım.
    Hem böylece bir bugfix de yapmış oluruz. Sevgiler, Umut.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ListView ingredientsList = findViewById(R.id.ingredientsMultiList);
        CustomIngredientAdaptor ingredientsAdaptor;
        ingredientsAdaptor = new CustomIngredientAdaptor(this,ingredients);
        ingredientsList.setAdapter(ingredientsAdaptor);



/*        Spinner ingredientsSpinner = (Spinner) findViewById(R.id.ingredientSpinner);
        Spinner equipmentSpinner = (Spinner) findViewById(R.id.equipmentSpinner);
        ArrayAdapter <CharSequence> ingredientsAdapter = ArrayAdapter
                .createFromResource(this, R.array.ingredients,android.R.layout.simple_spinner_item);
        
        ArrayAdapter <CharSequence> equipmentAdapter = ArrayAdapter
                .createFromResource(this,R.array.equipment,android.R.layout.simple_spinner_item);

        ingredientsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        equipmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ingredientsSpinner.setAdapter(ingredientsAdapter);
        equipmentSpinner.setAdapter(equipmentAdapter);*/
    }
}
