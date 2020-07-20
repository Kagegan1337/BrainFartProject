package SwingLayouting;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Frame extends JDialog {

    private Color bgColor = Color.BLACK;
    private Color fgColor = Color.red;

    public Frame() {
        initComponents();
    }

    private void initComponents() {
        this.setModal(true);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setPreferredSize(new Dimension(600,300));

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel upperPanel = new JPanel(new BorderLayout());

        upperPanel.add(createLeftSide(), BorderLayout.WEST);
        upperPanel.add(createRightSide(), BorderLayout.EAST);

        mainPanel.add(upperPanel);
        this.add(mainPanel);
        this.pack();
        this.setVisible(true);
    }

    private JPanel createRightSide() {
        JPanel result = new JPanel(new GridBagLayout());
        result.setBackground(bgColor);
        GridBagConstraints c = new GridBagConstraints();
        Insets defaultInsets = new Insets(10,5,10,5);
        Insets leftPadding = new Insets(10,30,10,5);
        c.gridx = 0;
        c.gridy = 0;
        c.insets = defaultInsets;
        JLabel lb1 = new JLabel("1.1");
        lb1.setForeground(fgColor);
        result.add(lb1, c);
        c.gridx++;
        c.insets = leftPadding;
        JLabel lb2 = new JLabel("1.2");
        lb2.setForeground(fgColor);
        result.add(lb2, c);
        c.gridx = 0;
        c.gridy++;
        c.insets = defaultInsets;
        JLabel lb3 = new JLabel("2.1");
        lb3.setForeground(fgColor);
        result.add(lb3, c);
        c.gridx++;
        c.insets = leftPadding;
        JLabel lb4 = new JLabel("2.1");
        lb4.setForeground(fgColor);
        result.add(lb4, c);

        return result;
    }

    private JPanel createLeftSide() {
        JPanel buttonPanel = new JPanel(new GridLayout(0,1,5,5));
        buttonPanel.setBackground(bgColor);
        int btHeight = 30;
        int btWidth = 90;
        Color btBgColor = Color.gray;
        Dimension btDIm = new Dimension(btWidth, btHeight);
        Border btBorder = BorderFactory.createEmptyBorder(5,5,5,5);

        JButton bt1 = new JButton("BT1");
        bt1.setBackground(btBgColor);
        bt1.setForeground(fgColor);
        bt1.setBorder(btBorder);
        bt1.setPreferredSize(btDIm);
        buttonPanel.add(bt1);

        JButton bt2 = new JButton("BT2");
        bt2.setBackground(btBgColor);
        bt2.setForeground(fgColor);
        bt2.setBorder(btBorder);
        bt2.setPreferredSize(btDIm);
        buttonPanel.add(bt2);

        JButton bt3 = new JButton("BT3");
        bt3.setBackground(btBgColor);
        bt3.setForeground(fgColor);
        bt3.setBorder(btBorder);
        bt3.setPreferredSize(btDIm);
        buttonPanel.add(bt3);

        JButton bt4 = new JButton("BT4");
        bt4.setBackground(btBgColor);
        bt4.setForeground(fgColor);
        bt4.setBorder(btBorder);
        bt4.setPreferredSize(btDIm);
        buttonPanel.add(bt4);

        return buttonPanel;
    }
}
