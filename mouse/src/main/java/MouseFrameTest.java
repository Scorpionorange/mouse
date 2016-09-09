import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/02.
 */
public class MouseFrameTest {
    public static void main(String[] args){
        /**
         *
         */
        /*
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new MouseFrame();
                frame.setTitle("MouseFrameTest");
                frame.setSize(800, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        */
        EventQueue.invokeLater(()->{
            JFrame frame = new MouseFrame();
            frame.setTitle("MouseFrameTest");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
