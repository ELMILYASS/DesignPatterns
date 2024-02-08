  /*
   * Video Reference: https://youtu.be/TS5i-uPXLs8
   */
import example.internet.Internet;
import example.internet.ProxyInternet;
import example.video.ProxyVideoDownloader;
import example.video.VideoDownloader;

  public class MainApp {


    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("==========================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("geekific");

    }

}
