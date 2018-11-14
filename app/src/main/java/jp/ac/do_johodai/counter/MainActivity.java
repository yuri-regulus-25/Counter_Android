package jp.ac.do_johodai.counter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView count_num = findViewById(R.id.count);
        Button CountUp1 = findViewById(R.id.up1);
        Button CountDown1 = findViewById(R.id.down1);
        count_num.setText(String.valueOf(count));
        findViewById(R.id.count).setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                count = 0;
                count_num.setText(String.valueOf(count));
            }
        });
    }

    public void onClick(View view)
    {
        TextView count_num = findViewById(R.id.count);
        switch(view.getId())
        {
            case R.id.up1:
                count++;
                break;

            case R.id.up5:
                count+=5;
                break;

            case R.id.up10:
                count+=10;
                break;

            case R.id.down1:
                if(count !=0)
                    count--;
                else
                    Toast.makeText(this, "0より以下はカウントできません", Toast.LENGTH_LONG).show();
                break;

            case R.id.down5:
                if(count >= 5)
                    count-=5;
                else
                    Toast.makeText(this, "0より以下はカウントできません", Toast.LENGTH_LONG).show();
                break;

            case R.id.down10:
                if(count >= 10)
                    count-=10;
                else
                    Toast.makeText(this, "0より以下はカウントできません", Toast.LENGTH_LONG).show();
                break;
        }
        count_num.setText(String.valueOf(count));
    }
}
