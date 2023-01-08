import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;

public class MainFrame extends JFrame {
    
    static JMenuBar mainMenu;
    
    static JMenuItem file, edit, tools;
    static JButton showClients, addClient, deleteClient, editClient;
    static JLabel tableLabel, menuLable;
    static JTable clientTable;
    private final String[][] clientData = {
          {"Jan", "Testowy", "Adres1", "Miasto 1", "123456"},
          {"Przemysław", "Próbny", "Adres 2", "Miasto 2", "654321"},
          {"Anna", "Poglądowa", "Adres 3", "Miasto 3", "098765"},
          {"Renata", "Eksperymentalna", "Adres 4", "Miasto 4", "3465738"},
          {"Ewa", "Sprawdzająca", "Adres 5", "Miasto 5", "2831211"}
    };
    private final String[] columnNames = {"IMIĘ", "NAZWISKO", "ADRES", "MIASTO", "TELEFON"};
    MainPanel mainPanel;
    
    public MainFrame(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
        this.setTitle("Kancelaria");
        buildMenuBar();
        buildButtons();
        buildClientTable();
        buildLabels();
        addComponentsToPanel();
    }
    
    private void buildMenuBar() {
        mainMenu = new JMenuBar();
        buildMenuItems();
        mainMenu.add(file);
        mainMenu.add(edit);
        mainMenu.add(tools);
    }
    
    private void buildMenuItems() {
        file = new JMenuItem("File");
        edit = new JMenuItem("Edit");
        tools = new JMenuItem("Tools");
    }
    
    private void buildButtons() {
        showClients = new JButton("Show Clients");
        addClient = new JButton("Add Client");
        deleteClient = new JButton("Delete Client");
        editClient = new JButton("Edit Client");
    }
    
    private void buildClientTable() {
        int tablePositionX = mainPanel.initialPanelWidth / 10;
        int tablePositionY = mainPanel.initialPanelHeight / 3;
        int tableWidth = mainPanel.initialPanelWidth / 2;
        int tableHeight = mainPanel.initialPanelHeight - tablePositionY;
        int tableFontScale = 1;
        
        clientTable = new JTable(clientData, columnNames);
        clientTable.setBounds(tablePositionX, tablePositionY, tableWidth, tableHeight);
    }
    
    private void buildLabels() {
        tableLabel = new JLabel("Klienci");
        menuLable = new JLabel("Menu");
    }
    
    private void addComponentsToPanel() {
        mainPanel.add(menuLable);
        mainPanel.add(showClients);
        mainPanel.add(addClient);
        mainPanel.add(deleteClient);
        mainPanel.add(editClient);
        
        mainPanel.add(tableLabel);
        mainPanel.add(clientTable);
    }
}
