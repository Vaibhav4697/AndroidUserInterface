package info.android.ui;

public class Video {

    private String heading;
    private Integer videoId;
    private Class intentClass;

    public Video(String heading, Integer videoId, Class intentClass) {
        this.heading = heading;
        this.videoId = videoId;
        this.intentClass = intentClass;
    }

    public String getHeading() {
        return heading;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public Class getIntentClass() {
        return intentClass;
    }
}