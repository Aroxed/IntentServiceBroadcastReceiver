package kpi.spscs.intentservicebroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        SimpleBroadcastReceiver receiver = new SimpleBroadcastReceiver();
        registerReceiver(receiver, filter);

        //startService(new Intent(this, MyService.class));

        //difference between service and intent service
        //broadcast receiver and it's applications
        //application permissions (runtime permissions vs manifest permissions)
        //activity life cycles
    }
}