package gok.selin.fici;

/**
 * Created by umuti on 17.03.2018.
 */

public class CustomIngredientModel {
    private String ingredientname;
    private boolean ingredientexists;
    private int ingredientamount;

    public CustomIngredientModel(String ingredientname, boolean ingredientexists, int ingredientamount ) {
        this.ingredientname = ingredientname;
        this.ingredientexists = ingredientexists;
        this.ingredientamount = ingredientamount;
    }

    public String getIngredientname() {
        return ingredientname;
    }

    public boolean getIngredientexists() {
        return ingredientexists;
    }

    public int getIngredientamount () {
        return ingredientamount;
    }

    public void setIngredientname (String ingredientname) {
        this.ingredientname = ingredientname;
    }

    public void setIngredientexists (boolean ingredientexists) {
        this.ingredientexists = ingredientexists;
    }

    public void setIngredientamount (int ingredientamount) {
        this.ingredientamount = ingredientamount;
    }
}
