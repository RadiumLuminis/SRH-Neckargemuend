import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {

    private JPanel contentPane;
    private JTextField tfNachname;
    private JTextField tfVorname;
    private JTextField tfGehalt;
    private JTextField tfGebDat;
    private JTextField tfAbtNr;
    private JTextField tfANr;

    private JTextArea taAusgabe;

    private JTextField tfMomentaneANr;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 645);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setTitle("Datenbank Abfrage");

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(50, 41, 430, 250);
        contentPane.add(scrollPane);

        taAusgabe = new JTextArea();
        scrollPane.setViewportView(taAusgabe);

        tfANr = new JTextField();
        tfANr.setBounds(583, 40, 150, 25);
        contentPane.add(tfANr);
        tfANr.setColumns(10);
        
        tfNachname = new JTextField();
        tfNachname.setBounds(583, 80, 150, 25);
        contentPane.add(tfNachname);
        tfNachname.setColumns(10);

        tfVorname = new JTextField();
        tfVorname.setBounds(583, 120, 150, 25);
        contentPane.add(tfVorname);
        tfVorname.setColumns(10);

        tfGehalt = new JTextField();
        tfGehalt.setBounds(583, 160, 150, 25);
        contentPane.add(tfGehalt);
        tfGehalt.setColumns(10);
        
        tfGebDat = new JTextField();
        tfGebDat.setBounds(583, 200, 150, 25);
        contentPane.add(tfGebDat);
        tfGebDat.setColumns(10);
        
        tfAbtNr = new JTextField();
        tfAbtNr.setBounds(583, 240, 150, 25);
        contentPane.add(tfAbtNr);
        tfAbtNr.setColumns(10);
        
        tfMomentaneANr = new JTextField();
        tfMomentaneANr.setEditable(false);
        tfMomentaneANr.setBounds(150, 291+15, 100, 25);
        contentPane.add(tfMomentaneANr);
        
        JLabel lblmomANr = new JLabel("Momentane ANR: ");
        lblmomANr.setBounds(50, 291+15+5, 100, 14);
        contentPane.add(lblmomANr);

        JLabel lblANr = new JLabel("ANR");
        lblANr.setBounds(503, 45, 70, 14);
        contentPane.add(lblANr);
        
        JLabel lblNachname = new JLabel("Nachname");
        lblNachname.setBounds(503, 85, 70, 14);
        contentPane.add(lblNachname);

        JLabel lblVorname = new JLabel("Vorname");
        lblVorname.setBounds(503, 125, 70, 14);
        contentPane.add(lblVorname);

        JLabel lblGehalt = new JLabel("Gehalt");
        lblGehalt.setBounds(503, 165, 70, 14);
        contentPane.add(lblGehalt);
        
        JLabel lblGebDat = new JLabel("Geburtsdatum");
        lblGebDat.setBounds(503, 205, 70, 14);
        contentPane.add(lblGebDat);
        
        JLabel lblAbtNr = new JLabel("AbtNr");
        lblAbtNr.setBounds(503, 245, 70, 14);
        contentPane.add(lblAbtNr);

        JButton btnAnzeigen = new JButton("Alle Datensätze anzeigen");
        btnAnzeigen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                dbMaxAngestellter();
                dbAusgabe();
            }
        });
        btnAnzeigen.setBounds(503, 300, 230, 40);
        contentPane.add(btnAnzeigen);

        JButton btnHinzufuegen = new JButton("Datensatz Hinzuf\u00FCgen");
        btnHinzufuegen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Statement stm = db();

                String nachname = tfNachname.getText();
                String vorname = tfVorname.getText();
                double gehalt = Double.parseDouble(tfGehalt.getText());

                String sql = "INSERT INTO angestellte (Nachname, Vorname, Gehalt, PLZ, ABTNR) VALUES ('" + nachname + "', '"
                        + vorname + "', " + gehalt + ", 0, 0);";

                try {
                    stm.executeUpdate(sql);
                    dbAusgabe();

                    tfNachname.setText("");
                    tfVorname.setText("");
                    tfGehalt.setText("");
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        });
        btnHinzufuegen.setBounds(503, 360, 230, 40);
        contentPane.add(btnHinzufuegen);

        JButton btnSuchen = new JButton("Nach Merkmal suchen");
        btnSuchen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Statement stm = db();
                String liste = "";
                boolean suche = false;
                String suchstring = "";

                String sNachname = tfNachname.getText();
                String sVorname = tfVorname.getText();
                String sGehalt = tfGehalt.getText();
                String sGeburtstag = tfGebDat.getText();
                String sAbtNr = tfAbtNr.getText();
                
                if (!sNachname.equals("")) {
                    suche = true;
                    suchstring += "Nachname = '" + sNachname + "'";
                }
                if (!sVorname.equals("")) {
                    if (suche) {
                        suchstring += " AND ";
                    }
                    suche = true;
                    suchstring += "vorname = '" + sVorname + "'";
                }
                if (!sGehalt.equals("")) {
                    if (suche) {
                        suchstring += " AND ";
                    }
                    suche = true;
                    double dGehalt = Double.parseDouble(sGehalt);
                    suchstring += "gehalt = " + dGehalt;
                }
                if (!sGeburtstag.equals("")) {
                    if (suche) {
                        suchstring += " AND ";
                    }
                    suche = true;
                    suchstring += "Geburtsdatum = \"" + sGeburtstag + "\"";
                }
                if (!sAbtNr.equals("")) {
                    if (suche) {
                        suchstring += " AND ";
                    }
                    suche = true;
                    suchstring += "AbtNr = '" + sAbtNr + "'";
                }

                String sql;

                if (suche) {
                    sql = "SELECT * FROM `angestellte` WHERE " + suchstring + ";";
                } else {
                    sql = "SELECT * FROM `angestellte`;";
                }

                dbAusgabe(sql);
            }
        });
        btnSuchen.setBounds(503, 420, 230, 40);
        contentPane.add(btnSuchen);
    }

    private Statement db() {
        String url = "jdbc:mysql://localhost/db01?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String pw = "";

        Connection con;
        try {
            con = DriverManager.getConnection(url, user, pw);
            Statement stm = con.createStatement();
            return stm;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    private void dbAusgabe() {
        dbAusgabe("SELECT * FROM `angestellte`;");
    }
    private void dbAusgabe(String sql) {
        System.out.println(sql);
        Statement stm = db();
        taAusgabe.setText("no data\n");
        taAusgabe.updateUI();
        String liste = "";
        try {
            ResultSet rs = stm.executeQuery(sql);
            int count=0;
            while (rs.next()) {
                count++;
                String Nachname = rs.getString("Nachname");
                String Vorname = rs.getString("Vorname");
                double Gehalt = rs.getDouble("Gehalt");
                String date = rs.getString("Geburtsdatum");
                int AngNr = rs.getInt("AngNr");

                liste += AngNr+" : "+Nachname + " : " + Vorname + " : " + Gehalt + " : " + date + "\n";

                taAusgabe.setText(liste);
            }
            System.out.println("count "+count);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    private void dbMaxAngestellter() {
        String sql = "SELECT MAX(AngNr) AS AngNr FROM `angestellte`;";
        System.out.println(sql);
        tfMomentaneANr.setText("no data");
        tfMomentaneANr.updateUI();
        Statement stm = db();
        String liste = "";
        try {
            ResultSet rs = stm.executeQuery(sql);
            rs.next();
            int maxAngNr = rs.getInt("AngNr");
            tfMomentaneANr.setText(""+maxAngNr);
            tfMomentaneANr.updateUI();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
