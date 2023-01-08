import javax.swing.JFrame;

public class Main {
    
    public static void main(String[] args) {
        MainPanel mainPanel = new MainPanel();
        MainFrame mainFrame = new MainFrame(mainPanel);
        
        mainFrame.add(mainPanel);
        
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}