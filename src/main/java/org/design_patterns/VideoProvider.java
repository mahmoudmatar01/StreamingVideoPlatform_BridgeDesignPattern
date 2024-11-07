package org.design_patterns;

public abstract class VideoProvider {

    private final VideoQuality videoQuality;

    protected VideoProvider(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }

    public abstract void play();

    public VideoQuality getVideoQuality() {
        return videoQuality;
    }
}
