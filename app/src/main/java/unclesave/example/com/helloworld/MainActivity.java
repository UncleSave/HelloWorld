package unclesave.example.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int num = 1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
