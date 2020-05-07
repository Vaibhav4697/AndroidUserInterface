package info.android.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AnimationListAdapter extends ArrayAdapter<Video> {

    private Context context;
    private Integer resource;
    private RelativeLayout relativeLayout;
    private String packageName;
    private List<Video> videos;

    public AnimationListAdapter(@NonNull Context context, Integer resource, @NonNull List<Video> videos, RelativeLayout relativeLayout, String packageName) {
        super(context, resource, videos);
        this.context = context;
        this.resource = resource;
        this.relativeLayout = relativeLayout;
        this.packageName = packageName;
        this.videos = videos;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View animationListCard = layoutInflater.inflate(resource, null, false);

        TextView countTextView = animationListCard.findViewById(R.id.count_text_view);
        TextView headingTextView = animationListCard.findViewById(R.id.heading_text_view);

        countTextView.setText(String.valueOf(position + 1).concat("."));
        headingTextView.setText(videos.get(position).getHeading());

        animationListCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new VideoLayout(context, relativeLayout, videos, packageName, position);
            }
        });

        return animationListCard;
    }
}
