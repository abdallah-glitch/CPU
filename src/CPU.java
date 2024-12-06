import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CPU extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CPU Scheduling Simulator");


        JButton startButton = new JButton("Start");
        JButton teamInfoButton = new JButton("Team Info");

   
    JComboBox<String> algorithmDropdown = new JComboBox<>(
        new String[]{
            "Round Robin", 
            "First Come First Serve", 
            "Shortest Remaining Time First", 
            "Shortest Job First"
        }
    );

      
        JTextField sourceField = new JTextField();
        JTextField processCountField = new JTextField("0");

  
        JLabel titleLabel = new JLabel("CPU Scheduling");
        JLabel subtitleLabel = new JLabel("Simulation");
        JLabel algorithmLabel = new JLabel("Algorithm:");
        JLabel sourceLabel = new JLabel("Source:");
        JLabel processCountLabel = new JLabel("# of Process:");
        JLabel processInstructionLabel = new JLabel("(0 <= N <= 10)");

      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLayout(null); 

      
        titleLabel.setBounds(280, 20, 400, 50);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setForeground(Color.white);

        subtitleLabel.setBounds(380, 70, 400, 30);
        subtitleLabel.setFont(new Font("SansSerif", Font.ITALIC, 20));
        subtitleLabel.setForeground(Color.white);


        algorithmLabel.setBounds(300, 150, 150, 30);
        algorithmLabel.setFont(new Font("Arial", Font.BOLD, 20));
        algorithmLabel.setForeground(Color.white);

        algorithmDropdown.setBounds(500, 150, 150, 30);

        sourceLabel.setBounds(300, 200, 150, 30);
        sourceLabel.setFont(new Font("Arial", Font.BOLD, 20));
        sourceLabel.setForeground(Color.white);

        sourceField.setBounds(500, 200, 150, 30);

        processCountLabel.setBounds(300, 250, 200, 30);
        processCountLabel.setFont(new Font("Arial", Font.BOLD, 20));
        processCountLabel.setForeground(Color.white);

        processCountField.setBounds(500, 250, 150, 30);
        processCountField.setHorizontalAlignment(JTextField.CENTER);

        processInstructionLabel.setBounds(500, 280, 200, 30);
        processInstructionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        processInstructionLabel.setForeground(Color.white);

        
        startButton.setBounds(358, 350, 130, 40);
        startButton.setFocusable(false);
        startButton.setFont(new Font("Arial", Font.BOLD, 20));

       
        teamInfoButton.setBounds(0, 532, 100, 30);
        teamInfoButton.setFocusable(false);


        BackgroundPanel backgroundPanel = new BackgroundPanel("C:/Users/abdal/OneDrive/Pictures/Screenshots/Pproject.png/");
        backgroundPanel.setLayout(null); 
        frame.setContentPane(backgroundPanel);

       
        backgroundPanel.add(titleLabel);
        backgroundPanel.add(subtitleLabel);
        backgroundPanel.add(algorithmLabel);
        backgroundPanel.add(algorithmDropdown);
        backgroundPanel.add(sourceLabel);
        backgroundPanel.add(sourceField);
        backgroundPanel.add(processCountLabel);
        backgroundPanel.add(processCountField);
        backgroundPanel.add(processInstructionLabel);
        backgroundPanel.add(startButton);
        backgroundPanel.add(teamInfoButton);

      
        teamInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "Team Members:\n" +
                        "1. Abdallah Esam Mater - ID: 2202363\n" +
                        "2. Mustafa Mohamed AbdelTawab - ID: 2202380\n" +
                        "3. Hazem Othman - ID: 2202276\n" +
                        "4. Mostafa Ali Mohamed - ID: 2202381",
                        "Team Info",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setResizable(false);
        frame.setVisible(true);
    }
}


class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(String filePath) {
        try {
            backgroundImage = Toolkit.getDefaultToolkit().getImage(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
}
