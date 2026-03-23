import javax.swing.*;
import java.awt.*;
import JPanelsPackage.JPanelsClass;

public class Borderlayout {

    JFrame BorderFrame;
    JPanelsClass JP = new JPanelsClass();

    public Borderlayout() {
        this.CreateJFrameborderlayout();
    }

    private JFrame CreateJFrameborderlayout() {

        JFrame.setDefaultLookAndFeelDecorated(true);

        BorderFrame = new JFrame("Customized Frame");

        BorderFrame.setSize(600,400);
        BorderFrame.setLayout(new GridLayout(1,3,10,10));

        BorderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        BorderFrame.add(JP.CreateJPanelOne());
        BorderFrame.add(JP.CreateJPanelTwo());
        BorderFrame.add(JP.CreateJPanelThree());

        BorderFrame.setVisible(true);

        return BorderFrame;
    }

}