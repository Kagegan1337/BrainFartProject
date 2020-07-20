package Ajax;

import javax.swing.*;
import java.awt.*;

public class AjaxLoadingPanel extends JFrame{

    private final JFrame frame;

    public AjaxLoadingPanel(JFrame frame) {
        super("ggg");
        this.frame = frame;
        initPanel();
    }

    private void initPanel() {
        setLayout(new GridBagLayout());
        setSize(frame.getSize());
        setLocationRelativeTo(frame);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        ImageIcon loading = new ImageIcon(this.getClass().getResource("ajax-loader.gif"));
        JLabel label = new JLabel("loading...");
        label.setIcon(loading);
        this.add(label);
    }
}
