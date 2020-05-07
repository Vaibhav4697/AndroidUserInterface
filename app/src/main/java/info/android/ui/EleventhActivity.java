package info.android.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;

public class EleventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);

        coordinateMotion();
    }

    private void coordinateMotion() {
        AppBarLayout appBarLayout = findViewById(R.id.app_bar_layout);
        final MotionLayout motionLayout = findViewById(R.id.motion_layout);

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                motionLayout.setProgress(-verticalOffset / Float.valueOf(appBarLayout.getTotalScrollRange()));
            }
        });
    }
}
