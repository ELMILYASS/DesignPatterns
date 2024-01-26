package Facade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        File mp4 = converter.convert("funny-cats-video.ogg", "mp4");
    }
}
