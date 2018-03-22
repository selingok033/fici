package gok.selin.fici;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * Created by umuti on 17.03.2018.
 */

public class CustomIngredientAdaptor extends BaseAdapter {
    private LayoutInflater ingredientsInflater;
    private List<CustomIngredientModel> CustomIngredientList;

    public CustomIngredientAdaptor (Activity activity, List<CustomIngredientModel> CustomIngredientsList) {
        ingredientsInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.CustomIngredientList = CustomIngredientsList;
    }
    @Override
    public int getCount() {
        return CustomIngredientList.size();
    }

    @Override
    public Object getItem(int i) {
        return CustomIngredientList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View lineView;
        lineView = ingredientsInflater.inflate(R.layout.customingredientsrow,null);
        TextView ingredientText = lineView.findViewById(R.id.rowingredientname);
        CheckBox ingredientExists = lineView.findViewById(R.id.rowingredientexists);
        EditText ingredientAmount = lineView.findViewById(R.id.rowingredientamount);


        return null;
    }
}
