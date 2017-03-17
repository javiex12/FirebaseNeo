package firebase.neo.analytics.sproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class TarjetaActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarjeta);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        register = (Button)findViewById(R.id.buttonTarjeta);




        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "3_Target");
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Registro");
                bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Boton");
                bundle.putDouble(FirebaseAnalytics.Param.PRICE, 4.0);


                mFirebaseAnalytics.logEvent("TargetRegister", bundle);
                //Redireccion
                Intent intento = new Intent(getApplicationContext(), RegistroActivity.class);
                startActivity(intento);
            }
        });
    }
}
