/**
 *
 * Project name: Hydra Virus
 * Initial date: 23/07/2020
 *
 * @author Carlos Alberto Ro'Pe
 */
package hydra;

import java.awt.Toolkit;

public class Hydra {

    /**
     * @param args the cmd arguments. To use it open cmd ant write <java -jar
     * YourJARFile.jar arg0 arg1 ... argn>
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(() -> {
            new HydraView(getX(), getY()).setVisible(true);
        });
    }

    public static int getX() {
        float medio = Toolkit.getDefaultToolkit().getScreenSize().width / 2;
        return (int) medio - 214;
    }

    public static int getY() {
        float medio = Toolkit.getDefaultToolkit().getScreenSize().height / 2;
        return (int) medio - 62;
    }

}
