package org.design_patterns;

public class TwitchVideoPlayer extends VideoProvider{

    protected TwitchVideoPlayer(VideoQuality videoQuality) {
        super(videoQuality);
    }

    @Override
    public void play() {
        getVideoQuality().renderVideoQuality();
        System.out.println("Play twitch video .........");
    }
}
