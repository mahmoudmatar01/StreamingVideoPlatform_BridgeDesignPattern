package org.design_patterns;

public class YoutubeVideoPlayer extends VideoProvider {

    protected YoutubeVideoPlayer(VideoQuality videoQuality) {
        super(videoQuality);
    }

    @Override
    public void play() {
        getVideoQuality().renderVideoQuality();
        System.out.println("Play youtube video ......");
    }
}
