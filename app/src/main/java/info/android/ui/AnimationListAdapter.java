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

public class AnimationListAdapter extends ArrayAdapter<String> {

    private List<String> headings;
    private Context context;
    private Integer resource;

    public AnimationListAdapter(@NonNull Context context, Integer resource, List<String> headings) {
        super(context, resource, headings);
        this.headings = headings;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View animationListCard = layoutInflater.inflate(resource, null, false);

        TextView countTextView = animationListCard.findViewById(R.id.count_text_view);
        TextView headingTextView = animationListCard.findViewById(R.id.heading_text_view);

        countTextView.setText(String.valueOf(position + 1).concat("."));
        headingTextView.setText(headings.get(position));

        animationListCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return animationListCard;
    }
}
