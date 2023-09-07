package setup.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(FileInputGUI::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("File Input Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel nameLabel = new JLabel("File Name:");
        JTextField nameTextField = new JTextField(20);

        JLabel typeLabel = new JLabel("File Type:");
        JTextField typeTextField = new JTextField(20);

        JButton submitButton = new JButton("Submit");

        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(typeLabel);
        panel.add(typeTextField);
        panel.add(submitButton);

        frame.add(panel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fileName = nameTextField.getText();
                String fileType = typeTextField.getText();

                // Concatenate the fileType to the fileName
                String fullFileName = fileName + "." + fileType;

                // Save the data to a local file
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(fullFileName));
                    writer.write("File Name: " + fileName);
                    writer.newLine();
                    writer.write("File Type: " + fileType);
                    writer.close();
                    JOptionPane.showMessageDialog(frame, "Data saved to " + fullFileName);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                    JOptionPane.showMessageDialog(frame, "Error saving data to file");
                }
            }
        });

        frame.setVisible(true);
    }
}
