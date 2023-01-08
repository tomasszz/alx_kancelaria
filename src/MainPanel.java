import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class MainPanel extends JPanel {
    
    private static final Color bgGreen = new Color(15, 49, 27);
    
    int initialPanelWidth = 1600;
    int initialPanelHeight = 900;
    
    public MainPanel() {
        this.setBackground(bgGreen);
    }
    
    @Override
    protected void paintComponent(Graphics component) {
        super.paintComponent(component);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(initialPanelWidth, initialPanelHeight);
    }
    
}
