package info.android.ui;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoAdapter extends BaseAdapter {

    private Context context;
    private String packageName;

    private Integer[] videoIds = {
            R.raw.video_1, R.raw.video_1,
            R.raw.video_1, R.raw.video_1,
            R.raw.video_1, R.raw.video_1
    };

    private Class[] intentClasses = {
            FirstActivity.class, FirstActivity.class,
            FirstActivity.class, FirstActivity.class,
            FirstActivity.class, FirstActivity.class
    };

    public VideoAdapter(Context context, String packageName) {
        this.context = context;
        this.packageName = packageName;
    }

    @Override
    public int getCount() {
        return videoIds.length;
    }

    @Override
    public Object getItem(int position) {
        return videoIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public Class getIntentClass(int position) {
        return intentClasses[position];
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        final VideoView videoView = new VideoView(context);
        videoView.setLayoutParams(new GridView.LayoutParams(500, 500));

        videoView.setOnPreparedListener(preparedListener);
        videoView.requestFocus();
//        Toast.makeText(context, "android.resource://" + packageName + "/" + getItem(position), Toast.LENGTH_LONG).show();
        videoView.setVideoPath("android.resource://" + packageName + "/" + getItem(position));

        videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, getIntentClass(position));
                context.startActivity(intent);
            }
        });

        return videoView;
    }

    MediaPlayer.OnPreparedListener preparedListener = new MediaPlayer.OnPreparedListener() {

        @Override
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = new MediaPlayer();
                }
                mediaPlayer.setVolume(0f, 0f);
                mediaPlayer.setLooping(true);
                mediaPlayer.start();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    };
}