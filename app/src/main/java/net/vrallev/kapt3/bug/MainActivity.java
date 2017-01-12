package net.vrallev.kapt3.bug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @author rwondratschek
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SomeAutoValueObject object = SomeAutoValueObject.builder().setPhotoUrl("").setLastSendDate(5).setContactName("").setUserId(4).build();
    }
}
