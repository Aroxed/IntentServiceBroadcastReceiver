package kpi.spscs.intentservicebroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        SimpleBroadcastReceiver receiver1 = new SimpleBroadcastReceiver();
        registerReceiver(receiver1, filter);
        BatteryLevelReceiver receiver2 = new BatteryLevelReceiver();
        registerReceiver(receiver2, filter);

        startService(new Intent(this, SimpleService.class));

        //difference between service and intent service
        //broadcast receiver and it's applications
        //application permissions (runtime permissions vs manifest permissions)
        //activity life cycles
    }
}