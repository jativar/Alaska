package com.jativa.ramiro.alaska;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


public class MainActivity extends AppCompatActivity {

    //Declare variables for CircleMenu
    String arrayName[]={"Ingreso al Sistema",
            "Ayuda del Sistema",
            "Telefonos de contacto",
            "Contrato de uso de applicacion",
            "Derechos de Propiedad Intelectual"};


    // Variables declaration
    private SeekBar mRotation;
    private SeekBar mStartAngle;
    private SeekBar mSweepAngle;
    private SeekBar mArcWidth;
    private SeekBar mProgressWidth;
    private CheckBox mRoundedEdges;
    private CheckBox mTouchInside;
    private CheckBox mClockwise;
    private TextView mSeekArcProgress;
    private CheckBox mEnabled;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = findViewById(R.id.circle_menu);
        // Set MainMenu and SubMenu
        circleMenu.setMainMenu(Color.parseColor("#FFEB3B"),R.drawable.ic_add,R.drawable.ic_remove)
                .addSubMenu(Color.parseColor("#FFEB3B"),R.drawable.ic_agreement)
                .addSubMenu(Color.parseColor("#FFEB3B"),R.drawable.ic_help)
                .addSubMenu(Color.parseColor("#FFEB3B"),R.drawable.ic_login)
                .addSubMenu(Color.parseColor("#FFEB3B"),R.drawable.ic_telephone)
                .addSubMenu(Color.parseColor("#FFEB3B"),R.drawable.ic_copyright)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        //Toast.makeText(MainActivity.this, "You selected "+arrayName[index], Toast.LENGTH_SHORT).show();

                        if (index == 0) { // Display ic_agreement
                            // You selected Water Filter arrayName[0]
                            //Toast.makeText(MainActivity.this, "You selected " + arrayName[0] , Toast.LENGTH_SHORT).show();

                            Toast.makeText(MainActivity.this, "Agreement Activity" , Toast.LENGTH_SHORT).show();

                            Intent waterfilter = new Intent(MainActivity.this, AgreementActivity.class);

                            startActivity(waterfilter);

                        };

                        if (index == 1) { // display ic_help.png
                            // You selected "Ayuda del Sistema"
                            //Toast.makeText(MainActivity.this, "You selected " + arrayName[1], Toast.LENGTH_SHORT).show();
                            //TextView dwh = (TextView) findViewById(R.id.dwh);

                            Toast.makeText(MainActivity.this, "Help Activity", Toast.LENGTH_SHORT).show();

                            Intent dwh = new Intent(MainActivity.this, HelpActivity.class);

                            startActivity(dwh);
                        };

                        if (index == 2) {
                            // You selected Heat Pump that corresponds to arrayName[2]

                            Toast.makeText(MainActivity.this, "Login Activity", Toast.LENGTH_SHORT).show();

                            Intent heatpump = new Intent(MainActivity.this, LoginActivity.class);

                            startActivity(heatpump);
                        };

                        if (index == 3) {
                            // You selected Water Pump that corresponds to arrayName[3]

                            Toast.makeText(MainActivity.this, "Contact Telephone Activity", Toast.LENGTH_SHORT).show();

                            Intent waterpump = new Intent(MainActivity.this, ContactTelephoneActivity.class);

                            startActivity(waterpump);

                        };

                        if (index == 4) {
                            // You selected Hand Dryer that corresponds to arrayName[4]

                            Toast.makeText(MainActivity.this, "Copyright Activity", Toast.LENGTH_SHORT).show();

                            Intent handdryer = new Intent(MainActivity.this, CopyrightActivity.class);

                            startActivity(handdryer);

                        };

                    }
                });

    }
}
