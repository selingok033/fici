package gok.selin.fici;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
BERKAY
Register olurken şimdilik sadece kullanıcı adı, şifre ve vejeteryan olup olmadığının (radio button)
bilgisini alsak yeterli. Aynı şifreyi 2 kere girmesini isteyip, 2 şifre de eşleşiyor mu diye kontrol
etmelisin.
NOT: Radio button kullanmak için onları bir radio group içerisine koyman gerekiyor.
 */

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
