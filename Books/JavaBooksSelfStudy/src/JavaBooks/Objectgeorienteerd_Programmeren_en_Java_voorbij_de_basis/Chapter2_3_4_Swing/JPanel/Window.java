package JavaBooks.Objectgeorienteerd_Programmeren_en_Java_voorbij_de_basis.Chapter2_3_4_Swing.JPanel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Rene Heijnen - book exercises - "Objectgeorienteerd programmeren en Java ... voorbij de basis"
 * ISBN : 978-90-5940-0315-4
 *
 * Chapter 2 : Swing
 * NOTE : JAVAFX replaces Swing, this is study material.
 */
public class Window extends JFrame {
    private JPanel panel;
    private JLabel label;

    public Window(String title){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        TitledBorder panelBorder = BorderFactory.createTitledBorder("JPanel");
        TitledBorder labelBorder = BorderFactory.createTitledBorder("JLabel");
        Container windowContainer = getContentPane();
        panel = new JPanel();
        panel.setBorder(panelBorder);
        panel.setBackground(Color.WHITE);
        label = new JLabel("This is a label");
        label.setBorder(labelBorder);
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);
        panel.add(label);
        windowContainer.add(panel);
        pack();
    }



    public static void main(String[] args) {
        Window sample = new Window("Panel sample");
        sample.setVisible(true);
    }
}
