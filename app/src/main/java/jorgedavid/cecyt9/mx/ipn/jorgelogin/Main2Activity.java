package jorgedavid.cecyt9.mx.ipn.jorgelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView Usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Usuario = (TextView) findViewById(R.id.Usur);

        Bundle bundlito = new Bundle();
        bundlito = this.getIntent().getExtras();

        String nombre = bundlito.getString("Usuario");

        Usuario.setText(nombre);

    }
}
