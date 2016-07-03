package JavaBooks.Objectgeorienteerd_Programmeren_en_Java_voorbij_de_basis.Chapter2_3_4_Swing.Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Rene Heijnen - book exercises - "Objectgeorienteerd programmeren en Java ... voorbij de basis"
 * ISBN : 978-90-5940-0315-4
 *
 * Chapter 2 : Swing
 * NOTE : JAVAFX replaces Swing, this is study material.
 *
 * Slider example
 */
public class Slider extends JFrame {
    private JSlider slider;
    private JLabel label;

    public Slider(String title){
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        slider = new JSlider(0, 100, 25);
        slider.setMajorTickSpacing(25);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new SliderListerner());
        label = new JLabel(Integer.toString(slider.getValue()));
        label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        this.getContentPane().add(label, BorderLayout.CENTER);
        this.getContentPane().add(slider, BorderLayout.SOUTH);
        this.pack();

    }

    private class SliderListerner implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider source = (JSlider) e.getSource();
            if(!source.getValueIsAdjusting()){
                int sliderValue = source.getValue();
                label.setText(String.valueOf(sliderValue));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("chapter 2 - Sliders");
        Slider slider = new Slider("Slider sample");
        slider.setVisible(true);

    }


}
