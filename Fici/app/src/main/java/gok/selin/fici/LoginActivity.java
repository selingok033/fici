package gok.selin.fici;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
BERKAY
Klasik bir login ekranı olsa yeter. Uygulama logosunu gösteren bir imageview, kullanıcı adı ve
şifre girilebilecek alan ve giriş butonu. Giriş yapılınca sayfanın CategoriesActivity'e yönlenmesi
lazım. Bunu Intent ile yapacaksın. Web'te "başka bir activity başlatmak" diye arayabilirsin.
*/

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
