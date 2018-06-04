package sg.edu.rp.c347.smsretriever;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Fragment f1 = new fragment1();
        ft.replace(R.id.framLayout1, f1);

        Fragment f2 = new fragment2();
        ft.replace(R.id.frameLayout2, f2);

        ft.commit();

    }
}
