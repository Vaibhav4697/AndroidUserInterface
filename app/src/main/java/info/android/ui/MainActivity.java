package info.android.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> headings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);
        headings = new ArrayList<>();

        headings.add("Animations with Motion Layout");
        headings.add("Animating based on Drag Events");
        headings.add("Modifying a Path");
        headings.add("Modifying a Path");
        headings.add("Changing Attributes with Motion");
        headings.add("Changing Attributes with Motion");
        headings.add("Changing Attributes with Motion");
        headings.add("Changing Custom Attributes with Motion");
        headings.add("Drag Events and Complex Path");

        listView.setAdapter(new AnimationListAdapter(this, R.layout.animation_list_card, headings));
    }
}
