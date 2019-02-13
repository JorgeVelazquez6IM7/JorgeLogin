package jorgedavid.cecyt9.mx.ipn.jorgelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;

    EditText Us, Psw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.Login);

        Us = findViewById(R.id.User);
        Psw = findViewById(R.id.Pass);
    }

    @Override
    public void onClick(View v) {

        if(Us.getText().toString().equals("Gokuruto0")){
            if(Psw.getText().toString().equals("2901")){
                Toast.makeText(this, "Iniciando sesión...", Toast.LENGTH_LONG).show();
                Guardar(v);
            }else
                Toast.makeText(this, "Contraseña erronea, vuelva a intentarlo", Toast.LENGTH_LONG).show();
        }else
            Toast.makeText(this, "Usuario y/o contraseña erroneos, vuelva a intentarlo", Toast.LENGTH_LONG).show();
    }

    public void Guardar(View v){
        Intent envia = new Intent(this, Main2Activity.class);
        Bundle datitos = new Bundle();

        datitos.putString("Usuario", Us.getText().toString());
        envia.putExtras(datitos);
        finish();
        startActivity(envia);
    }
}
