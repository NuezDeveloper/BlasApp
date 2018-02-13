package blaspascal.com.blaspascal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BIENVENIDOS extends AppCompatActivity {
Button btnh1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenidos);
        btnh1 = (Button) findViewById(R.id.btn3);
        btnh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(BIENVENIDOS.this,Noticias.class);
                startActivity(intento);
            }
        });
    }
}
