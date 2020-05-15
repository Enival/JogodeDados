package rocode.com;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Context context;
    private Object text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void JogarDados(View view) {
       // TextView Msg = (TextView) findViewById(R.id.);
        // Msg.setText("Funcionou!!!");
        ImageView img = (ImageView)findViewById(R.id.imageViewDado);
        Dado dado = new Dado();
        dado.JogarDados();

        boolean flag = false;
        if(dado.getNumero()==1) img.setImageResource(R.drawable.diered1);
        if(dado.getNumero()==2) img.setImageResource(R.drawable.diered2);
        if(dado.getNumero()==3) img.setImageResource(R.drawable.diered3);
        if(dado.getNumero()==4) img.setImageResource(R.drawable.diered4);
        if(dado.getNumero()==5) img.setImageResource(R.drawable.diered5);
        if(dado.getNumero()==6) {
            img.setImageResource(R.drawable.diered6);
            Button bt = (Button)findViewById(R.id.btJogar);
            bt.setEnabled(false);
            flag = true;
        }
        if (flag == true)
            Toast.makeText(this,"Você Venceu !!!!",1).show();
        else
            Toast.makeText(this,"Tente Novamente Idiota !!!!",1).show();

    }

    public void JogarNovamente(View view) {
        setContentView(R.layout.activity_main);
    }
}
