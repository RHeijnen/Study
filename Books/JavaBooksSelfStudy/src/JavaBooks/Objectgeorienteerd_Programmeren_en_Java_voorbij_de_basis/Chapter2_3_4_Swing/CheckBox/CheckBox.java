package JavaBooks.Objectgeorienteerd_Programmeren_en_Java_voorbij_de_basis.Chapter2_3_4_Swing.CheckBox;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Rene Heijnen - book exercises - "Objectgeorienteerd programmeren en Java ... voorbij de basis"
 * ISBN : 978-90-5940-0315-4
 *
 * Chapter 2 : Swing
 * NOTE : JAVAFX replaces Swing, this is study material.
 *
 * Checkbox sample in swing
 */
public class CheckBox extends JFrame {
    private JCheckBox checkBox;
    public CheckBox(){
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.checkBox = new JCheckBox("save messages",false);
        checkBox.addItemListener(new PrivateClassListener()); // Can omit this after having the refference, book doesnt do this TODO see if that matters
        this.getContentPane().add(checkBox);
        this.pack();
    }


    private class PrivateClassListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED){
                System.out.println("Saving messages");
            } else {
                System.out.println("Not saving messages");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Chapter 2 - Swing CheckBox");
        CheckBox checkbox = new CheckBox();
        checkbox.setVisible(true);

    }
}
