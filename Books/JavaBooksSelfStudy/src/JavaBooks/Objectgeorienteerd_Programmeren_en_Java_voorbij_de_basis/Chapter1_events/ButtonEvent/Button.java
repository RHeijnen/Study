package JavaBooks.Objectgeorienteerd_Programmeren_en_Java_voorbij_de_basis.Chapter1_events.ButtonEvent;

import javax.swing.*;

/**
 * Rene Heijnen - book exercises - "Objectgeorienteerd programmeren en Java ... voorbij de basis"
 * ISBN : 978-90-5940-0315-4
 *
 * Chapter 1 : Events
 * Making a simple button listener delegation
 */
public class Button extends JFrame {

    private JButton button;
    private ButtonListener buttonListener;

    public Button(String title){
        super(title);
        this.button = new JButton("Press me");
        this.buttonListener = new ButtonListener();
        this.button.addActionListener(buttonListener);
        this.getContentPane().add(button);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

    }
    public static void main(String[] args) {
        Button newbutton = new Button("Event Button Sample");
        newbutton.setVisible(true);
    }
}
