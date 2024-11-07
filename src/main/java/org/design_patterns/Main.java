package org.design_patterns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VideoProvider youtubeVideoProvider = new YoutubeVideoPlayer(new HDVideoQuality());
        youtubeVideoProvider.play();

        TwitchVideoPlayer twitchVideoPlayer = new TwitchVideoPlayer(new SDVideoQuality());
        twitchVideoPlayer.play();
    }
}