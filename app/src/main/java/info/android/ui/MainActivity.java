package info.android.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> headings;
    private List<Video> videos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);
        videos = new ArrayList<>();

        videos.add(new Video("Animations with Motion Layout", R.raw.video_1, FirstActivity.class));
        videos.add(new Video("Animating based on Drag Events", R.raw.video_2, SecondActivity.class));
        videos.add(new Video("Modifying a Path", R.raw.video_3, ThirdActivity.class));
        videos.add(new Video("Modifying a Path", R.raw.video_4, FourthActivity.class));
        videos.add(new Video("Changing Attributes with Motion", R.raw.video_5, FifthActivity.class));
        videos.add(new Video("Changing Attributes with Motion", R.raw.video_6, SixthActivity.class));
        videos.add(new Video("Changing Attributes with Motion", R.raw.video_7, SeventhActivity.class));
        videos.add(new Video("Changing Custom Attributes with Motion", R.raw.video_8, EighthActivity.class));
        videos.add(new Video("Drag Events and Complex Path", R.raw.video_9, NinthActivity.class));
        videos.add(new Video("Drag Events and Complex Path with Hint", R.raw.video_10, TenthActivity.class));
        videos.add(new Video("Running Motion with Code", R.raw.video_11, EleventhActivity.class));
        videos.add(new Video("Touch Controlled Motion", R.raw.video_12, TwelfthActivity.class));
        videos.add(new Video("Touch Controlled Motion with Changing Custom Attributes", R.raw.video_13, ThirteenthActivity.class));
        videos.add(new Video("Image Filter View Transition", R.raw.video_14, FourteenthActivity.class));

        RelativeLayout relativeLayout = findViewById(R.id.main_activity);

        listView.setAdapter(new AnimationListAdapter(this, R.layout.animation_list_card, videos, relativeLayout, getPackageName()));
    }
}
