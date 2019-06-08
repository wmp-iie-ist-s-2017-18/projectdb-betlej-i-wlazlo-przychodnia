package przychodnia;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static przychodnia.Pesel.sprawdz;

public class GUI1 extends javax.swing.JFrame {

    final void FillList() {

        try {
            //String url = "jdbc:sqlite:PrzychodniaDane.db";
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();
            
            String Query = "SELECT * FROM PRZYCHODNIA";
            ResultSet rs = stmt.executeQuery(Query);

            DefaultListModel DLM = new DefaultListModel();
            while (rs.next()) {
                DLM.addElement(rs.getString("ID_PACJENTA"));
            }
            Lista.setModel(DLM);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    final void FillList1() {

        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            //Connection con = DriverManager.getConnection("url");
            Statement stmt = con.createStatement();

            String Query = "SELECT * FROM LEKARZE";
            ResultSet rs = stmt.executeQuery(Query);

            DefaultListModel DLM = new DefaultListModel();
            while (rs.next()) {
                DLM.addElement(rs.getString("ID_LEKARZA"));
              
            }
            Lista1.setModel(DLM);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
          
    }
    
   
      final void FillList4() {

        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            //Connection con = DriverManager.getConnection("url");
            Statement stmt = con.createStatement();

            String Query = "SELECT * FROM WIZYTA";
            ResultSet rs = stmt.executeQuery(Query);

            DefaultListModel DLM = new DefaultListModel();
            while (rs.next()) {
                DLM.addElement(rs.getString("id"));
              
            }
            Lista2.setModel(DLM);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
          
    }
     
      

    public GUI1() {
        initComponents();
        FillList();
        FillList1();
     
 
        
        FillList4();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        id_wl1 = new javax.swing.JTextField();
        id_wl2 = new javax.swing.JTextField();
        id_wl5 = new javax.swing.JTextField();
        id_wl6 = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Aktualizuj = new javax.swing.JButton();
        Nazwisko = new javax.swing.JTextField();
        Imie = new javax.swing.JTextField();
        ImieLBL = new javax.swing.JLabel();
        SzukajTxt = new javax.swing.JTextField();
        Odswiez = new javax.swing.JButton();
        Szukaj = new javax.swing.JButton();
        Pesel = new javax.swing.JTextField();
        Nr_telefonu = new javax.swing.JTextField();
        NazwiskoLBL = new javax.swing.JLabel();
        PeselLBL = new javax.swing.JLabel();
        Nr_telefonuLBL = new javax.swing.JLabel();
        Id_pacjentaLBL = new javax.swing.JLabel();
        Dodaj = new javax.swing.JButton();
        Usun = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Id_pacjenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList();
        Szukaj2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sprpesel2 = new javax.swing.JTextField();
        sprpesel3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Dodaj1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lista1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        SzukajTxt1 = new javax.swing.JTextField();
        Szukaj1 = new javax.swing.JButton();
        Odswiez1 = new javax.swing.JButton();
        Usun1 = new javax.swing.JButton();
        Aktualizuj1 = new javax.swing.JButton();
        Id_lekarza = new javax.swing.JTextField();
        Imie1 = new javax.swing.JTextField();
        Id_pacjentaLBL1 = new javax.swing.JLabel();
        ImieLBL1 = new javax.swing.JLabel();
        NazwiskoLBL1 = new javax.swing.JLabel();
        Nazwisko1 = new javax.swing.JTextField();
        PeselLBL1 = new javax.swing.JLabel();
        Pesel1 = new javax.swing.JTextField();
        Nr_telefonu1 = new javax.swing.JTextField();
        Nr_telefonuLBL1 = new javax.swing.JLabel();
        Specjalizacja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Szukaj3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sprpesel1 = new javax.swing.JButton();
        sprpesel = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Lista2 = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        aaa = new javax.swing.JTextField();
        id_wp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        id_w = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        id_wd1 = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        imie_lek = new javax.swing.JTextField();
        naz_lek = new javax.swing.JTextField();
        imie_pac = new javax.swing.JTextField();
        nazwisko_pac = new javax.swing.JTextField();
        od2 = new javax.swing.JButton();
        od1 = new javax.swing.JButton();
        id_wl3 = new javax.swing.JTextField();
        spec_leka = new javax.swing.JTextField();
        pesel_pacc1 = new javax.swing.JTextField();
        od3 = new javax.swing.JButton();
        bbb = new javax.swing.JTextField();
        ccc = new javax.swing.JTextField();
        od4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        id_wl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_wl1ActionPerformed(evt);
            }
        });

        id_wl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_wl2ActionPerformed(evt);
            }
        });

        id_wl5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_wl5ActionPerformed(evt);
            }
        });

        id_wl6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_wl6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Aktualizuj.setText("Aktualizuj");
        Aktualizuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AktualizujActionPerformed(evt);
            }
        });

        Imie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImieActionPerformed(evt);
            }
        });

        ImieLBL.setText("Imie");

        SzukajTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzukajTxtActionPerformed(evt);
            }
        });

        Odswiez.setText("Odśwież");
        Odswiez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OdswiezActionPerformed(evt);
            }
        });

        Szukaj.setText("Szukaj");
        Szukaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzukajActionPerformed(evt);
            }
        });

        Pesel.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                PeselCaretUpdate(evt);
            }
        });

        NazwiskoLBL.setText("Nazwisko");

        PeselLBL.setText("Pesel");

        Nr_telefonuLBL.setText("Nr telefonu");

        Id_pacjentaLBL.setText("Id pacjenta");

        Dodaj.setText("Dodaj pacjenta");
        Dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajActionPerformed(evt);
            }
        });

        Usun.setText("Usuń");
        Usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsunActionPerformed(evt);
            }
        });

        jLabel1.setText("Szukaj PESEL: ");

        Id_pacjenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_pacjentaActionPerformed(evt);
            }
        });

        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        Szukaj2.setText("Pokaż");
        Szukaj2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                Szukaj2AncestorRemoved(evt);
            }
        });
        Szukaj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Szukaj2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Lista pacjentów:");

        sprpesel3.setText("Sprawdzanie PESEL");
        sprpesel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprpesel3ActionPerformed(evt);
            }
        });

        jButton6.setText("Sprawdzanie PESEL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("Wyczyść pola");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Dodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)
                        .addComponent(sprpesel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SzukajTxt)
                                        .addGap(47, 47, 47)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sprpesel2)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Odswiez, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Aktualizuj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(Usun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Szukaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NazwiskoLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PeselLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nr_telefonuLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ImieLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Szukaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)
                                .addComponent(Id_pacjentaLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Nr_telefonu, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(Pesel)
                                    .addComponent(Id_pacjenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nazwisko)
                                    .addComponent(Imie))))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dodaj)
                    .addComponent(sprpesel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel1))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SzukajTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sprpesel2))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Szukaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Id_pacjentaLBL)
                            .addComponent(Id_pacjenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Szukaj)
                            .addComponent(ImieLBL)
                            .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Aktualizuj)
                            .addComponent(NazwiskoLBL)
                            .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Usun)
                            .addComponent(PeselLBL)
                            .addComponent(Pesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Odswiez, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nr_telefonuLBL)
                            .addComponent(Nr_telefonu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        SzukajTxt.getAccessibleContext().setAccessibleName("SzukajTxt");

        jTabbedPane2.addTab("pacjenci", jPanel1);

        Dodaj1.setText("Dodaj lekarza");
        Dodaj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dodaj1ActionPerformed(evt);
            }
        });

        Lista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lista1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Lista1MouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(Lista1);

        jLabel2.setText("Szukaj PESEL:");

        SzukajTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzukajTxt1ActionPerformed(evt);
            }
        });

        Szukaj1.setText("Pokaż");
        Szukaj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Szukaj1ActionPerformed(evt);
            }
        });

        Odswiez1.setText("Odśwież");
        Odswiez1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Odswiez1ActionPerformed(evt);
            }
        });

        Usun1.setText("Usuń");
        Usun1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usun1ActionPerformed(evt);
            }
        });

        Aktualizuj1.setText("Aktualizuj");
        Aktualizuj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aktualizuj1ActionPerformed(evt);
            }
        });

        Id_lekarza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_lekarzaActionPerformed(evt);
            }
        });

        Imie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imie1ActionPerformed(evt);
            }
        });

        Id_pacjentaLBL1.setText("Id lekarza");

        ImieLBL1.setText("Imie");

        NazwiskoLBL1.setText("Nazwisko");

        PeselLBL1.setText("Pesel");

        Pesel1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Pesel1CaretUpdate(evt);
            }
        });

        Nr_telefonuLBL1.setText("Nr telefonu");

        Specjalizacja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecjalizacjaActionPerformed(evt);
            }
        });

        jLabel3.setText("Spcjalizacja");

        Szukaj3.setText("Szukaj");
        Szukaj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Szukaj3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Lista lekarzy:");

        sprpesel1.setText("Sprawdzanie PESEL");
        sprpesel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprpesel1ActionPerformed(evt);
            }
        });

        sprpesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprpeselActionPerformed(evt);
            }
        });

        jButton7.setText("Sprawdzanie PESEL");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Wyczyść pola");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(107, 107, 107)
                        .addComponent(SzukajTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Dodaj1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sprpesel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Szukaj1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                    .addComponent(Usun1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Aktualizuj1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Szukaj3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Odswiez1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(PeselLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Nr_telefonuLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Pesel1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                                    .addComponent(Nr_telefonu1)))
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                    .addComponent(NazwiskoLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Nazwisko1))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                    .addComponent(ImieLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Imie1))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Id_pacjentaLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Specjalizacja, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Id_lekarza, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(sprpesel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 73, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dodaj1)
                    .addComponent(sprpesel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SzukajTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sprpesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Szukaj1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Id_lekarza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Id_pacjentaLBL1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Specjalizacja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ImieLBL1)
                            .addComponent(Imie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Szukaj3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NazwiskoLBL1)
                            .addComponent(Nazwisko1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Aktualizuj1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Usun1)
                            .addComponent(PeselLBL1)
                            .addComponent(Pesel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nr_telefonuLBL1)
                            .addComponent(Nr_telefonu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Odswiez1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("lekarze", jPanel3);

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        Lista2.setToolTipText("");
        Lista2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lista2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(Lista2);

        jLabel6.setText("Zaplanowane wizyty:");

        jLabel7.setText("Id lekarza:");

        jLabel8.setText("Id pacjenta:");

        aaa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                aaaCaretUpdate(evt);
            }
        });
        aaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aaaActionPerformed(evt);
            }
        });

        id_wp.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                id_wpCaretUpdate(evt);
            }
        });

        jLabel9.setText("Dodaj datę:");

        jButton1.setText("Dodaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Aktualizuj");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Usuń");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        id_w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_wActionPerformed(evt);
            }
        });

        jLabel10.setText("Id wizyty");

        jButton4.setText("Szukaj");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        id_wd1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jButton5.setText("Odśwież");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        imie_lek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imie_lekActionPerformed(evt);
            }
        });

        naz_lek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naz_lekActionPerformed(evt);
            }
        });

        imie_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imie_pacActionPerformed(evt);
            }
        });

        nazwisko_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nazwisko_pacActionPerformed(evt);
            }
        });

        od2.setText("2");
        od2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                od2ActionPerformed(evt);
            }
        });

        od1.setText("1");
        od1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                od1ActionPerformed(evt);
            }
        });

        id_wl3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                id_wl3CaretUpdate(evt);
            }
        });
        id_wl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_wl3ActionPerformed(evt);
            }
        });

        spec_leka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spec_lekaActionPerformed(evt);
            }
        });

        pesel_pacc1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                pesel_pacc1CaretUpdate(evt);
            }
        });
        pesel_pacc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesel_pacc1ActionPerformed(evt);
            }
        });

        od3.setText("3");
        od3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                od3ActionPerformed(evt);
            }
        });

        bbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbbActionPerformed(evt);
            }
        });

        od4.setText("4");
        od4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                od4ActionPerformed(evt);
            }
        });

        jLabel11.setText("Wizyta:");

        jLabel12.setText("Zapisane Wizyty:");

        jLabel13.setText("Wizyty tego dnia dla lekarza:");

        jLabel14.setText("Pesel pacjenta:");

        jLabel15.setText("Dane lekarza:");

        jLabel16.setText("Dane pacjenta:");

        jLabel17.setText("Specjalizacja:");

        jButton11.setText("Wyczyść");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ccc))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(imie_lek, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(naz_lek, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(spec_leka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_wp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(imie_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nazwisko_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bbb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id_wl3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(id_wd1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_w, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pesel_pacc1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(od1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(od2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(od4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(od3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(od1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(od2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(od4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(od3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id_w, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pesel_pacc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(id_wl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(170, 170, 170)
                                        .addComponent(id_wd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imie_lek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(naz_lek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spec_leka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_wp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imie_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nazwisko_pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );

        jTabbedPane2.addTab("wizyty", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("lekarze");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajActionPerformed
           try{
            //String url = "jdbc:sqlite:PrzychodniaDane.db";
      try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
      Statement stmt = con.createStatement();
      //String Query = "INSERT INTO PRZYCHODNIA(IMIE, NAZWISKO, PESEL, NR_TELEFONU) VALUES ('"+Imie.getText()+"' , '"+Nazwisko.getText()+"' , '"+Pesel.getText()+"' , '"+Nr_telefonu.getText()+"')";
      String Query = "CALL `add_pac`('"+Imie.getText()+"' , '"+Nazwisko.getText()+"' , '"+Pesel.getText()+"', '"+Nr_telefonu.getText()+"');";
      
      stmt.execute(Query);
      
      JOptionPane.showMessageDialog(null, "Pacjent dodany do bazdy danych");
      
      
      Imie.setText(null);
      Nazwisko.setText(null);
      Pesel.setText(null);
      Nr_telefonu.setText(null);
      
      
      
      Odswiez.doClick();
    }                 
           
catch(SQLException ex){
    JOptionPane.showMessageDialog(null, ex.toString());
    
}

    }//GEN-LAST:event_DodajActionPerformed

    private void UsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsunActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();
            String Query = "DELETE FROM PRZYCHODNIA WHERE ID_PACJENTA = '" + Lista.getSelectedValue() + "' ";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Usuwanie zakończone pomyślnie");
            FillList();
            Odswiez.doClick();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_UsunActionPerformed

    private void AktualizujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AktualizujActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            //String Query = "UPDATE PRZYCHODNIA SET ID_PACJENTA = '" + Id_pacjenta.getText() + "', IMIE = '" + Imie.getText() + "', NAZWISKO = '" + Nazwisko.getText() + "', PESEL = '" + Pesel.getText() + "', NR_TELEFONU = '" + Nr_telefonu.getText() + "' WHERE ID_PACJENTA = '" + Lista.getSelectedValue() + "'";
            String Query = "CALL `Update_prz`('" + Lista.getSelectedValue() + "', '" + Imie.getText() + "', '" + Nazwisko.getText() + "', '" + Pesel.getText() + "', '" + Nr_telefonu.getText() + "'); ";

            stmt.execute(Query);

            JOptionPane.showMessageDialog(null, "Aktualizacja zakończona pomyślnie");
            Odswiez.doClick();
            FillList();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_AktualizujActionPerformed

    private void SzukajTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzukajTxtActionPerformed


    }//GEN-LAST:event_SzukajTxtActionPerformed

    private void OdswiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OdswiezActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = null;
            ResultSet rs = null;
            PreparedStatement pst = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");

            
            FillList();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_OdswiezActionPerformed

    private void SzukajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzukajActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            String Query = "SELECT * FROM PRZYCHODNIA WHERE PESEL = '" + SzukajTxt.getText() + "' ";
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {

                Id_pacjenta.setText(rs.getString(1));
                Imie.setText(rs.getString(2));
                Nazwisko.setText(rs.getString(3));
                Pesel.setText(rs.getString(4));
                Nr_telefonu.setText(rs.getString(5));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_SzukajActionPerformed

    private void Id_pacjentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_pacjentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Id_pacjentaActionPerformed

    private void ImieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImieActionPerformed

    private void Dodaj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dodaj1ActionPerformed
        try{
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";
      
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
      Statement stmt = con.createStatement();
      //String Query = "INSERT INTO LEKARZE(SPECJALIZACJA, IMIE, NAZWISKO, PESEL, NR_TELEFONU) VALUES ('"+Specjalizacja.getText()+"' , '"+Imie1.getText()+"' , '"+Nazwisko1.getText()+"' , '"+Pesel1.getText()+"' , '"+Nr_telefonu1.getText()+"')";
      
      String Query = "CALL `add_lek`('"+Specjalizacja.getText()+"', '"+Imie1.getText()+"', '"+Nazwisko1.getText()+"', '"+Pesel1.getText()+"', '"+Nr_telefonu1.getText()+"');";
      
      stmt.execute(Query);
      
      JOptionPane.showMessageDialog(null, "Pacjent dodany do bazdy danych");
      
      
      Specjalizacja.setText(null);
      Pesel1.setText(null);
      Imie1.setText(null);
      Nazwisko1.setText(null);
      Nr_telefonu1.setText(null);
      Odswiez1.doClick();
    }                                     
catch(SQLException ex){
    JOptionPane.showMessageDialog(null, ex.toString());
}

    }//GEN-LAST:event_Dodaj1ActionPerformed

    private void SzukajTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzukajTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SzukajTxt1ActionPerformed

    private void Szukaj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Szukaj1ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            String Query = "SELECT * FROM LEKARZE WHERE ID_LEKARZA = '" + Lista1.getSelectedValue() + "' ";
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {

                Id_lekarza.setText(rs.getString(1));
                Specjalizacja.setText(rs.getString(2));
                Imie1.setText(rs.getString(3));
                Nazwisko1.setText(rs.getString(4));
                Pesel1.setText(rs.getString(5));
                Nr_telefonu1.setText(rs.getString(6));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_Szukaj1ActionPerformed

    private void Odswiez1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Odswiez1ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = null;
            ResultSet rs = null;
            PreparedStatement pst = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");

            
            FillList1();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_Odswiez1ActionPerformed

    private void Usun1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usun1ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();
            String Query = "DELETE FROM LEKARZE WHERE ID_LEKARZA = '" + Lista1.getSelectedValue() + "' ";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Usuwanie zakończone pomyślnie");
            FillList1();
            Odswiez1.doClick();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_Usun1ActionPerformed

    private void Aktualizuj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aktualizuj1ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();
            String Query = "UPDATE LEKARZE SET ID_LEKARZA = '" + Id_lekarza.getText() + "', PESEL= '" + Pesel1.getText() + "', IMIE = '" + Imie1.getText() + "', NAZWISKO = '" + Nazwisko1.getText() + "', SPECJALIZACJA = '" + Specjalizacja.getText() + "', NR_TELEFONU = '" + Nr_telefonu1.getText() + "' WHERE ID_LEKARZA = '" + Lista1.getSelectedValue() + "'";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Aktualizacja zakończona pomyślnie");

            FillList1();
            Odswiez1.doClick();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_Aktualizuj1ActionPerformed

    private void Id_lekarzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_lekarzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Id_lekarzaActionPerformed

    private void Imie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imie1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Imie1ActionPerformed

    private void SpecjalizacjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecjalizacjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpecjalizacjaActionPerformed

    private void Szukaj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Szukaj3ActionPerformed
      try {
          try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            String Query = "SELECT * FROM LEKARZE WHERE pesel = '" + SzukajTxt1.getText() + "' ";
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {

                Id_lekarza.setText(rs.getString(1));
                Specjalizacja.setText(rs.getString(2));
                Imie1.setText(rs.getString(3));
                Nazwisko1.setText(rs.getString(4));
                Pesel1.setText(rs.getString(5));
                Nr_telefonu1.setText(rs.getString(6));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_Szukaj3ActionPerformed

    private void sprpesel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprpesel1ActionPerformed
      
    }//GEN-LAST:event_sprpesel1ActionPerformed

    private void Lista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lista1MouseClicked
        
        Szukaj1.doClick();
        
    }//GEN-LAST:event_Lista1MouseClicked

    private void Lista1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lista1MouseReleased
    }//GEN-LAST:event_Lista1MouseReleased

    private void Pesel1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_Pesel1CaretUpdate
        // TODO add your handling code here:
        sprpesel1.doClick();
    }//GEN-LAST:event_Pesel1CaretUpdate

    private void PeselCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_PeselCaretUpdate
        // TODO add your handling code here:
        sprpesel3.doClick();  
    }//GEN-LAST:event_PeselCaretUpdate

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseClicked
        // TODO add your handling code here:
        Szukaj2.doClick();

    }//GEN-LAST:event_ListaMouseClicked

    private void id_wl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_wl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_wl1ActionPerformed

    private void id_wl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_wl2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_wl2ActionPerformed

    private void id_wl5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_wl5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_wl5ActionPerformed

    private void id_wl6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_wl6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_wl6ActionPerformed

    private void sprpesel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprpesel3ActionPerformed

    }//GEN-LAST:event_sprpesel3ActionPerformed

    private void Szukaj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Szukaj2ActionPerformed
   
try {
          try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            String Query = "SELECT * FROM PRZYCHODNIA WHERE ID_PACJENTA = '" + Lista.getSelectedValue() + "' ";
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {

                Id_pacjenta.setText(rs.getString(1));
                Imie.setText(rs.getString(2));
                Nazwisko.setText(rs.getString(3));
                Pesel.setText(rs.getString(4));
                Nr_telefonu.setText(rs.getString(5));
             

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_Szukaj2ActionPerformed

    private void Szukaj2AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Szukaj2AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Szukaj2AncestorRemoved

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        id_w.setText(null);
        id_wl3.setText(null);
        pesel_pacc1.setText(null);
        imie_lek.setText(null);
        naz_lek.setText(null);
        spec_leka.setText(null);
        id_wp.setText(null);
        imie_pac.setText(null);
        nazwisko_pac.setText(null);
        bbb.setText(null);
        aaa.setText(null);
        id_wd1.setDate(null);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void od4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_od4ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            String Query = "CALL `licz`()";
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {
                ccc.setText(rs.getString(1));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }         // TODO add your handling code here:
    }//GEN-LAST:event_od4ActionPerformed

    private void bbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbbActionPerformed

    private void od3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_od3ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            String Query = "SELECT COUNT('id_lekarza') FROM wizyta WHERE DATA='" + aaa.getText() + "' and id_lekarza = '" + id_wl3.getText() + "' ";
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {
                pesel_pacc1.setText(rs.getString(1));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_od3ActionPerformed

    private void pesel_pacc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesel_pacc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesel_pacc1ActionPerformed

    private void pesel_pacc1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_pesel_pacc1CaretUpdate

    }//GEN-LAST:event_pesel_pacc1CaretUpdate

    private void spec_lekaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spec_lekaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spec_lekaActionPerformed

    private void id_wl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_wl3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_wl3ActionPerformed

    private void id_wl3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_id_wl3CaretUpdate
        od1.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_id_wl3CaretUpdate

    private void od1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_od1ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            String Query = "SELECT * FROM LEKARZE WHERE ID_LEKARZA = '" + id_wl3.getText() + "' ";
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {
                spec_leka.setText(rs.getString(2));
                imie_lek.setText(rs.getString(3));
                naz_lek.setText(rs.getString(4));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_od1ActionPerformed

    private void od2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_od2ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            String Query = "SELECT * FROM PRZYCHODNIA WHERE ID_PACJENTA = '" + id_wp.getText() + "' ";
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {

                imie_pac.setText(rs.getString(2));
                nazwisko_pac.setText(rs.getString(3));
                bbb.setText(rs.getString(4));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }  // TODO add your handling code here:
    }//GEN-LAST:event_od2ActionPerformed

    private void nazwisko_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nazwisko_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nazwisko_pacActionPerformed

    private void imie_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imie_pacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imie_pacActionPerformed

    private void naz_lekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naz_lekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naz_lekActionPerformed

    private void imie_lekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imie_lekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imie_lekActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = null;
            ResultSet rs = null;
            PreparedStatement pst = null;
            con = DriverManager.getConnection("jdbc:sqlite:PrzychodniaDane.db");

            FillList4();
            od4.doClick();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            String Query = "SELECT * FROM WIZYTA WHERE id = '" + id_w.getText() + "' ";
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {

                id_w.setText(rs.getString(1));
                id_wl3.setText(rs.getString(2));
                id_wp.setText(rs.getString(3));
                String Data = rs.getString(4);
                aaa.setText(Data);
                // id_wd1.setDate(rs.getDate(4));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void id_wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_wActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_wActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();
            String Query = "DELETE FROM WIZYTA WHERE id = '" + Lista2.getSelectedValue() + "' ";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Usuwanie zakończone pomyślnie");
            FillList1();
            jButton5.doClick();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();
            String Query = "UPDATE WIZYTA SET ID_LEKARZA= '" + id_wl3.getText() + "', ID_PACJENTA = '" + id_wp.getText() + "', DATA = '" + SQLDate(id_wd1.getDate()) + "' WHERE id = '" + id_w.getText() + "'";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Aktualizacja zakończona pomyślnie");

            FillList1();
            jButton5.doClick();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            String Query = "INSERT INTO WIZYTA(ID_LEKARZA, ID_PACJENTA, DATA) VALUES ('"+id_wl3.getText()+"' , '"+id_wp.getText()+"' , '"+SQLDate(id_wd1.getDate())+"')";

            stmt.execute(Query);

            JOptionPane.showMessageDialog(null, "Wizyta dodana do bazdy danych");

            id_wl3.setText(null);
            id_wp.setText(null);
            id_wd1.setDate(null);

            imie_lek.setText(null);
            naz_lek.setText(null);
            spec_leka.setText(null);
            imie_pac.setText(null);
            nazwisko_pac.setText(null);
            aaa.setText(null);
            bbb.setText(null);
            jButton5.doClick();

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void id_wpCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_id_wpCaretUpdate
        od2.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_id_wpCaretUpdate

    private void aaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aaaActionPerformed

    private void aaaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_aaaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_aaaCaretUpdate

    private void Lista2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lista2MouseClicked
        jButton4.doClick();
        od3.doClick();
        od4.doClick();
         try {
            try {
                //String url = "jdbc:sqlite:PrzychodniaDane.db";
                //Connection con = DriverManager.getConnection(url);
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/przychodniadane", "root", "");
            Statement stmt = con.createStatement();

            String Query = "SELECT * FROM WIZYTA WHERE id = '" + Lista2.getSelectedValue() + "' ";
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {

                id_w.setText(rs.getString(1));
                id_wl3.setText(rs.getString(2));
                id_wp.setText(rs.getString(3));
                String Data = rs.getString(4);
                aaa.setText(Data);
                // id_wd1.setDate(rs.getDate(4));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_Lista2MouseClicked

    private void sprpeselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprpeselActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sprpeselActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String pesel = Pesel.getText();
sprpesel2.setText("Twój PESEL jest " + ((sprawdz(pesel)) ? "poprawny." : "niepoprawny"));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
             
String pesel = Pesel1.getText();
sprpesel.setText("Twój PESEL jest " + ((sprawdz(pesel)) ? "poprawny." : "niepoprawny"));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
                Id_pacjenta.setText("");
                Imie.setText("");
                Nazwisko.setText("");
                Pesel.setText("");
                Nr_telefonu.setText("");
                sprpesel2.setText("");
                SzukajTxt.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       Id_lekarza.setText("");
                Imie1.setText("");
                Nazwisko1.setText("");
                Pesel1.setText("");
                Nr_telefonu1.setText("");
                sprpesel.setText("");
                SzukajTxt1.setText("");
                Specjalizacja.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       id_w.setText("");
                pesel_pacc1.setText("");
                id_wl3.setText("");
                imie_lek.setText("");
                naz_lek.setText("");
                spec_leka.setText("");
                id_wp.setText("");
                imie_pac.setText("");
                nazwisko_pac.setText("");
                bbb.setText("");
                aaa.setText("");
                ccc.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
try {
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (UnsupportedLookAndFeelException ex) {
} catch (ClassNotFoundException ex) {
} catch (InstantiationException ex) {
} catch (IllegalAccessException ex) {
}
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI1().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aktualizuj;
    private javax.swing.JButton Aktualizuj1;
    private javax.swing.JButton Dodaj;
    private javax.swing.JButton Dodaj1;
    private javax.swing.JTextField Id_lekarza;
    private javax.swing.JTextField Id_pacjenta;
    private javax.swing.JLabel Id_pacjentaLBL;
    private javax.swing.JLabel Id_pacjentaLBL1;
    private javax.swing.JTextField Imie;
    private javax.swing.JTextField Imie1;
    private javax.swing.JLabel ImieLBL;
    private javax.swing.JLabel ImieLBL1;
    public javax.swing.JList Lista;
    public javax.swing.JList Lista1;
    private javax.swing.JList Lista2;
    private javax.swing.JTextField Nazwisko;
    private javax.swing.JTextField Nazwisko1;
    private javax.swing.JLabel NazwiskoLBL;
    private javax.swing.JLabel NazwiskoLBL1;
    private javax.swing.JTextField Nr_telefonu;
    private javax.swing.JTextField Nr_telefonu1;
    private javax.swing.JLabel Nr_telefonuLBL;
    private javax.swing.JLabel Nr_telefonuLBL1;
    private javax.swing.JButton Odswiez;
    private javax.swing.JButton Odswiez1;
    private javax.swing.JTextField Pesel;
    private javax.swing.JTextField Pesel1;
    private javax.swing.JLabel PeselLBL;
    private javax.swing.JLabel PeselLBL1;
    private javax.swing.JTextField Specjalizacja;
    private javax.swing.JButton Szukaj;
    private javax.swing.JButton Szukaj1;
    private javax.swing.JButton Szukaj2;
    private javax.swing.JButton Szukaj3;
    private javax.swing.JTextField SzukajTxt;
    private javax.swing.JTextField SzukajTxt1;
    private javax.swing.JButton Usun;
    private javax.swing.JButton Usun1;
    private javax.swing.JTextField aaa;
    private javax.swing.JTextField bbb;
    private javax.swing.JTextField ccc;
    private javax.swing.JTextField id_w;
    private com.toedter.calendar.JDateChooser id_wd1;
    private javax.swing.JTextField id_wl1;
    private javax.swing.JTextField id_wl2;
    private javax.swing.JTextField id_wl3;
    private javax.swing.JTextField id_wl5;
    private javax.swing.JTextField id_wl6;
    private javax.swing.JTextField id_wp;
    private javax.swing.JTextField imie_lek;
    private javax.swing.JTextField imie_pac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField naz_lek;
    private javax.swing.JTextField nazwisko_pac;
    private javax.swing.JButton od1;
    private javax.swing.JButton od2;
    private javax.swing.JButton od3;
    private javax.swing.JButton od4;
    private javax.swing.JTextField pesel_pacc1;
    private javax.swing.JTextField spec_leka;
    private javax.swing.JTextField sprpesel;
    private javax.swing.JButton sprpesel1;
    private javax.swing.JTextField sprpesel2;
    private javax.swing.JButton sprpesel3;
    // End of variables declaration//GEN-END:variables

    private void Pesel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static java.sql.Date SQLDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
}
