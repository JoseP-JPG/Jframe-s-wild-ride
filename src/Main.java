import java.awt.event.WindowEvent;
import java.io.File;
import java.net.URISyntaxException;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {

        File absolutePath;
        try {
            absolutePath = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
            System.out.println(absolutePath.getPath());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        String windowTitle = "Quirky campaign";
        CountDownLatch loginSignal = new CountDownLatch(1);

        //FrameTest frame = new FrameTest(windowTitle, absolutePath.getPath());
        TextTest text = new TextTest(loginSignal);

        try {
            loginSignal.await();
            text.dispatchEvent(new WindowEvent(text, WindowEvent.WINDOW_CLOSING));
            System.out.println("lol");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}