package firebase.neo.analytics.sproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class NumeroActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    private Button numBotoncontinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        numBotoncontinuar = (Button) findViewById(R.id.numContinuarButton);



        numBotoncontinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FA
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "2_Validacionnumero");
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Continuar");
                bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Boton");
                mFirebaseAnalytics.logEvent("SendSMS", bundle);

                //Redireccion
                Intent intento = new Intent(getApplicationContext(), TarjetaActivity.class);
                startActivity(intento);
            }
        });
    }
}
