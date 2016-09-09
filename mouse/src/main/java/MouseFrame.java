import javax.swing.*;

/**
 * Created by ScorpionOrange on 2016/09/02.
 * A frame containing a panel for testing mouse operations
 */
public class MouseFrame extends JFrame {
    public MouseFrame(){
        add(new MouseComponent());
        pack();
    }
}
