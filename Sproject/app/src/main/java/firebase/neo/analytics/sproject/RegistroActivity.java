package firebase.neo.analytics.sproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class RegistroActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        register = (Button)findViewById(R.id.buttonRegister);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FA
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "4_LeadAcounter");
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Registro");
                bundle.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "Aplicación");
                bundle.putDouble(FirebaseAnalytics.Param.PRICE, 2.0);

                bundle.putLong(FirebaseAnalytics.Param.QUANTITY, 1);
                bundle.putString(FirebaseAnalytics.Param.CURRENCY, "PEN");
                bundle.putDouble(FirebaseAnalytics.Param.VALUE, 2.0);
                mFirebaseAnalytics.logEvent("LeadAccounter", bundle);
            }
        });



    }

}
