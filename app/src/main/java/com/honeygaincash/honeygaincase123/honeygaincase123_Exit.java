package com.honeygaincash.honeygaincase123;



import static com.honeygaincash.honeygaincase123.honeygaincase123_SplashActivity.dialogbox1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class honeygaincase123_Exit extends AppCompatActivity {
    public String TAG = String.valueOf(getClass());

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.honeygaincase123_exitactivity);

        dialogbox1(this);

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer1, new honeygaincase123_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer2, new honeygaincase123_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer3, new honeygaincase123_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer4, new honeygaincase123_WebViewFragment1());
            fragmentTransaction.add(R.id.fragmentContainer5, new honeygaincase123_WebViewFragment1());
            fragmentTransaction.commit();
        }


        Button button = (Button) findViewById(R.id.exitapp);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                honeygaincase123_Exit.this.startActivity(new Intent(honeygaincase123_Exit.this, honeygaincase123_Thank_you.class));

            }
        });
        Button button1 = (Button) findViewById(R.id.btn_no);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                honeygaincase123_Exit.this.startActivity(new Intent(honeygaincase123_Exit.this, honeygaincase123_start_page.class));
            }
        });
    }

}
