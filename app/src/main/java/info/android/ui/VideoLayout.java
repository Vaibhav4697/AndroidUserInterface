package info.android.ui;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class VideoLayout {

    private Context context;
    private RelativeLayout relativeLayout;
    private List<Video> videos;
    private String packageName;
    private int currentPosition;

    private PopupWindow popupWindow;

    private ImageView cancelImageView;
    private TextView headingTextView;
    private VideoView videoView;
    private FloatingActionButton leftFAB;
    private FloatingActionButton rightFAB;

    public VideoLayout(Context context, RelativeLayout relativeLayout, List<Video> videos, String packageName, int currentPosition) {
        this.context = context;
        this.relativeLayout = relativeLayout;
        this.videos = videos;
        this.packageName = packageName;
        this.currentPosition = currentPosition;

        popupWindow = showWindow();
    }

    private PopupWindow showWindow() {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View videoLayoutView = inflater.inflate(R.layout.video_layout, null);

        final PopupWindow popupWindow = new PopupWindow(
                videoLayoutView,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        // Set an elevation value for popup window
        // Call requires API level 21
        if (Build.VERSION.SDK_INT >= 21) {
            popupWindow.setElevation(5.0f);
        }

        popupWindow.setOutsideTouchable(false);
        popupWindow.setFocusable(true);
        popupWindow.showAtLocation(relativeLayout, Gravity.CENTER, 0, 0);

        cancelImageView = videoLayoutView.findViewById(R.id.cancel_image_view);
        headingTextView = videoLayoutView.findViewById(R.id.heading_text_view);
        videoView = videoLayoutView.findViewById(R.id.video_view);
        leftFAB = videoLayoutView.findViewById(R.id.left_fab);
        rightFAB = videoLayoutView.findViewById(R.id.right_fab);

        /* Code for cancel button */
        cancelImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismissWindow();
            }
        });

        /* Code for heading */
        setHeading();

        /* Code for video view */
        playVideo();
        videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, videos.get(currentPosition).getIntentClass());
                context.startActivity(intent);
            }
        });

        /* Code for FAB */
        checkFAB();
        leftFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --currentPosition;
                setHeading();
                checkFAB();
                playVideo();
            }
        });
        rightFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++currentPosition;
                setHeading();
                checkFAB();
                playVideo();
            }
        });

        return popupWindow;
    }

    private void dismissWindow() {

        popupWindow.dismiss();
    }

    private MediaPlayer.OnPreparedListener preparedListener = new MediaPlayer.OnPreparedListener() {

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

    private void playVideo() {
        if (videoView.isPlaying()) {
            videoView.stopPlayback();
        }
        videoView.setOnPreparedListener(preparedListener);
        videoView.requestFocus();
        videoView.setVideoPath("android.resource://" + packageName + "/" + videos.get(currentPosition).getVideoId());
    }

    private void setHeading() {
        headingTextView.setText(videos.get(currentPosition).getHeading());
    }

    private void checkFAB() {
        if (currentPosition == 0) {
            leftFAB.setVisibility(View.INVISIBLE);
        } else if (currentPosition == videos.size() - 1) {
            rightFAB.setVisibility(View.INVISIBLE);
        } else {
            leftFAB.setVisibility(View.VISIBLE);
            rightFAB.setVisibility(View.VISIBLE);
        }
    }
}