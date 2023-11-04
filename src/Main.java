import javax.swing.*;
import java.io.File;
import java.net.URISyntaxException;
import java.util.Scanner;

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

        Scanner myObj = new Scanner(System.in);
        System.out.println("Name of window");
        String title = myObj.nextLine();
        if(!title.equals(""))
            windowTitle=title;
        myObj.close();

        FrameTest frame =new FrameTest(windowTitle, absolutePath.getPath());

    }
}