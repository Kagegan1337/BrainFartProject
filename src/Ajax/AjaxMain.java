package Ajax;

import javax.swing.*;
import java.awt.*;

public class AjaxMain {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Test ajax");
        frame.setSize(800,600);
        frame.setBackground(Color.BLUE);
        AjaxController controller = new AjaxController(frame);
        JPanel buttonPanel = new JPanel(new GridLayout());
        JButton testButton = new JButton("test");
        testButton.addActionListener( e -> {
            System.out.println("testing...");
        });
        testButton.setSize(150,50);
        JButton button = new JButton("waiting");
        button.setSize(150,50);
        button.addActionListener( e -> {
            controller.showPanel();
            new Thread(() -> {
                for(int i = 0 ; i< 10 ; i++) {
                    try {
                        System.out.println("working..");
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                controller.disposePanel();
            }).start();

        });
        buttonPanel.add(button);
        buttonPanel.add(testButton);
        frame.add(buttonPanel);
        frame.setVisible(true);
    }
}
