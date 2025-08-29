package unit1GettingStarted.chp02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.net.URI;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Project6 {
    public static void main(String[] args) {
        //todo

        displayFlagsOfCountry("France");
        //displayFlagsOfCountry("Mauritius");
        //displayFlagsOfCountry("Bulgaria");
    }

    /**
     * Natonal flags are displayed on various websites like https://www.cia.gov/library/publications/resources/the-flags-of-the-world.html
     * the flags of the world project
     * https://www.cia.gov/library/publications/resources/the-flags-of-the-world.html
     * Flags of France, Mauritius, Bulgaria consist of flat coloured areas
     * write programs to display the flags of France, Mauritius, Bulgaria
     */
    private static void displayFlagsOfCountry(String countryName) {
        //String website = "https://www.cia.gov/library/publications/resources/the-flags-of-the-world.html";
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        

        Container contentPane = frame.getContentPane();

        String flagLink = null;
        if (countryName.equalsIgnoreCase("France")) {
            flagLink = "https://www.fotw.info/images/f/fr.gif";
        } else if(countryName.equalsIgnoreCase("Mauritius")) {
            flagLink = "https://www.fotw.info/images/m/mu.gif";
        } else if(countryName.equalsIgnoreCase("Bulgaria")) {
            flagLink = "https://www.fotw.info/images/b/bg.gif";
        }
        
        try {
            URI URI = new URI(flagLink);
            URL imgUrl = URI.toURL();
            ImageIcon icon = new ImageIcon(imgUrl);
            JLabel imageLabel = new JLabel(icon);
            JPanel panel = new JPanel();
            panel.add(imageLabel);
            contentPane.add(panel, BorderLayout.CENTER);
            contentPane.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        frame.setVisible(true);

    }
}
