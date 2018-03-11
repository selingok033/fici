package gok.selin.fici;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/*
BERKAY
Register olurken şimdilik sadece kullanıcı adı, şifre ve vejeteryan olup olmadığının (radio button)
bilgisini alsak yeterli. Aynı şifreyi 2 kere girmesini isteyip, 2 şifre de eşleşiyor mu diye kontrol
etmelisin.
NOT: Radio button kullanmak için onları bir radio group içerisine koyman gerekiyor.
 */

public class RegisterActivity extends AppCompatActivity {

    EditText name, pass, pass1, email;
    Button buttonnext;
    String username, userpass, userpass1, useremail;
    RadioButton r1,r2;
    RadioGroup rg1;
    CheckBox c1;
    //checkpoint tanımlama


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton1);
        rg1=(RadioGroup)findViewById(R.id.RadioGroup);
        c1=(CheckBox) findViewById(R.id.checkBox);
        name = findViewById(R.id.editTextUsername);
        pass = findViewById(R.id.editTextPass);
        pass1 = findViewById(R.id.editTextPass1);
        buttonnext = findViewById(R.id.button);

        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = name.getText().toString();
                userpass = pass.getText().toString();
                userpass1 = pass1.getText().toString();
                useremail = email.getText().toString();
                Toast.makeText(getApplicationContext(), "Name: " + username + "Pass1: " + pass1 + "Useremail: " + useremail + " Pass: " + userpass, Toast.LENGTH_LONG).show();

                if (userpass.equals("Pass1") && userpass1.equals("Pass")) {
                    if(c1.isChecked()) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        intent.putExtra("USERNAME", username);
                        startActivity(intent);
                    }
                }

            }


        });

    }
}