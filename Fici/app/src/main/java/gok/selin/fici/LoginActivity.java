package gok.selin.fici;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/*
BERKAY
Klasik bir login ekranı olsa yeter. Uygulama logosunu gösteren bir imageview, kullanıcı adı ve
şifre girilebilecek alan ve giriş butonu. Giriş yapılınca sayfanın CategoriesActivity'e yönlenmesi
lazım. Bunu Intent ile yapacaksın. Web'te "başka bir activity başlatmak" diye arayabilirsin.
*/

public class LoginActivity extends AppCompatActivity {
    ImageView logo;
    EditText name,pass;
    Button buttongiris,buttonregister;
    String username,userpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        logo = findViewById(R.id.imageView);
        name = findViewById(R.id.editTextUsername);
        pass = findViewById(R.id.editTextPass);
        buttongiris =findViewById(R.id.buttonGiris);
        buttonregister =findViewById(R.id.buttonRegister);



        buttongiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = name.getText().toString();
                userpass = pass.getText().toString();
                Toast.makeText(getApplicationContext(),"Name: "+username+" Pass: "+userpass,Toast.LENGTH_LONG).show();

                if(username.equals("admin") && userpass.equals("root"))
                {
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    intent.putExtra("USERNAME",username);
                    startActivity(intent);
                }


            }
        });

        buttonregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                {
                    Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
                    //intent.putExtra("USERNAME",username);
                    startActivity(intent);
                }


            }
        });




    }
}
