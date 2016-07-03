package JavaBooks.Objectgeorienteerd_Programmeren_en_Java_voorbij_de_basis.Chapter1_events.ButtonEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Rene Heijnen - book exercises - "Objectgeorienteerd programmeren en Java ... voorbij de basis"
 * ISBN : 978-90-5940-0315-4
 *
 * Chapter 1 : Events
 * Making a simple button listener delegation
 */
public class ButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Pressed the button");
    }
}
