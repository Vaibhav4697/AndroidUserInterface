package info.android.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);

        try {
            gridView.setAdapter(new VideoAdapter(this, getPackageName()));
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
