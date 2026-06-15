package DesignPatterns.Exercise06;
public class ProxyTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo_high_res.jpg");
        Image image2 = new ProxyImage("wallpaper.png");
        System.out.println("First display call (Requires Loading)");
        image1.display();
        System.out.println("\nSecond display call (Cached, Should not reload)");
        image1.display();
        System.out.println("Display call for image2 (First time)");
        image2.display();
    }
}
