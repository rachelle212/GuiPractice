import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Raymin on 10/16/16.
 */
public class StartScreen {
    private JButton button_msg;
    private JPanel panelMain;

    public StartScreen() {
        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is the mone");
            }
        });
    }
}
