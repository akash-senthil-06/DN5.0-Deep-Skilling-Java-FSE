package DesignPatterns.Exercise06;
public class RealImage implements Image {
    private String filename;
    public RealImage(String filename) {
        this.filename = filename;
        loadFromRemoteServer();
    }
    private void loadFromRemoteServer() {
        System.out.println("Loading image: " + filename + " from remote server...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
