package kazumi.miui.power;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(Intent.ACTION_VIEW);

        String packageName = "com.android.settings";
        String className = "com.android.settings.fuelgauge.PowerModeSettings";
        intent.setClassName(packageName, className);

        startActivity(intent);

        finishApp();
    }

    // 结束应用
    private void finishApp() {
        finish();
        System.gc();
        System.currentTimeMillis();
        System.exit(0);
    }
}
