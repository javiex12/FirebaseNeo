package firebase.neo.analytics.sproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    private Button botonRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        mFirebaseAnalytics.setUserId("javier");
        botonRegistro = (Button)findViewById(R.id.buttonMainRegistro);






        botonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FA
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "1_MainRegistro");
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Registro");
                bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Boton");
                mFirebaseAnalytics.logEvent("StartRegister", bundle);

                //Redireccion
                Intent intento = new Intent(getApplicationContext(), NumeroActivity.class);
                startActivity(intento);

            }
        });
    }


}
