package JPanelsPackage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JPanelsClass {
    JPanel JPanelOne, JPanelTwo, JPanelThree;

    public JPanel CreateJPanelOne() {
        JPanelOne = new JPanel();
        Border JPanelOneBorder = BorderFactory.createTitledBorder("Panel One");
        JPanelOne.setBorder(JPanelOneBorder);
        JPanelOne.setPreferredSize(new Dimension(100,80));
        JPanelOne.setBackground(Color.lightGray);
        return JPanelOne;
    }

    public JPanel CreateJPanelTwo() {
        JPanelTwo = new JPanel();
        Border JPanelTwoBorder = BorderFactory.createTitledBorder("Panel Two");
        JPanelTwo.setBorder(JPanelTwoBorder);
        JPanelTwo.setPreferredSize(new Dimension(100,80));
        JPanelTwo.setBackground(Color.black);
        return JPanelTwo;
    }

    public JPanel CreateJPanelThree() {
        JPanelThree = new JPanel();
        Border JPanelThreeBorder = BorderFactory.createTitledBorder("Panel Three");
        JPanelThree.setBorder(JPanelThreeBorder);
        JPanelThree.setPreferredSize(new Dimension(100,200));
        JPanelThree.setBackground(Color.yellow);
        return JPanelThree;
    }

}
