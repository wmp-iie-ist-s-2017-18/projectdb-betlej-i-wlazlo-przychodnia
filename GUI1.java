package przychodnia;

import java.sql.*;
import javax.swing.*;

public class GUI1 extends javax.swing.JFrame {

    final void FillList() {

        try {
            String url = "jdbc:sqlite:PrzychodniaDane.db";
            Connection con = DriverManager.getConnection(url);
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
            String url = "jdbc:sqlite:PrzychodniaDaneLek.db";
            Connection con = DriverManager.getConnection(url);
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

    public GUI1() {
        initComponents();
        FillList();
        FillList1();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        LEKARZ_WIZ = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PACJENT_WIZ = new javax.swing.JTextField();
        WIZYTA_WIZ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DodajWiz = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Dodaj1.setText("Dodaj lekarza");
        Dodaj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dodaj1ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(Lista1);

        jLabel2.setText("Specjalizacja:");

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

        Id_pacjentaLBL1.setText("Id_lekarza");

        ImieLBL1.setText("Imie");

        NazwiskoLBL1.setText("Nazwisko");

        PeselLBL1.setText("Pesel");

        Nr_telefonuLBL1.setText("Nr_ telefonu");

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

        jLabel4.setText("Lista lekarzy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Dodaj1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Szukaj3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Szukaj1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Odswiez1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Usun1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Aktualizuj1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(SzukajTxt1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Id_pacjentaLBL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImieLBL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NazwiskoLBL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PeselLBL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nr_telefonuLBL1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Id_lekarza)
                    .addComponent(Specjalizacja)
                    .addComponent(Imie1)
                    .addComponent(Nazwisko1)
                    .addComponent(Nr_telefonu1)
                    .addComponent(Pesel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Dodaj1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Id_pacjentaLBL1)
                            .addComponent(Id_lekarza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SzukajTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Szukaj3)
                            .addComponent(jLabel3)
                            .addComponent(Specjalizacja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Szukaj1)
                            .addComponent(ImieLBL1)
                            .addComponent(Imie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Odswiez1)
                            .addComponent(NazwiskoLBL1)
                            .addComponent(Nazwisko1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Usun1)
                            .addComponent(PeselLBL1)
                            .addComponent(Pesel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Aktualizuj1)
                            .addComponent(Nr_telefonuLBL1)
                            .addComponent(Nr_telefonu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jTabbedPane2.addTab("lekarze", jPanel3);

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

        NazwiskoLBL.setText("Nazwisko");

        PeselLBL.setText("Pesel");

        Nr_telefonuLBL.setText("Nr_ telefonu");

        Id_pacjentaLBL.setText("Id_pacjenta");

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

        jScrollPane1.setViewportView(Lista);

        Szukaj2.setText("Pokaż");
        Szukaj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Szukaj2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Lista pacjentów");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Dodaj, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Szukaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Szukaj2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Odswiez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Usun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Aktualizuj, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(SzukajTxt)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ImieLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Id_pacjentaLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NazwiskoLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PeselLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nr_telefonuLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imie, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(Nazwisko)
                    .addComponent(Pesel)
                    .addComponent(Nr_telefonu)
                    .addComponent(Id_pacjenta))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Dodaj)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SzukajTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Szukaj)
                            .addComponent(Id_pacjentaLBL)
                            .addComponent(Id_pacjenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Szukaj2)
                            .addComponent(ImieLBL)
                            .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Odswiez)
                            .addComponent(NazwiskoLBL)
                            .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Usun)
                            .addComponent(PeselLBL)
                            .addComponent(Pesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nr_telefonu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Aktualizuj)
                            .addComponent(Nr_telefonuLBL)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        SzukajTxt.getAccessibleContext().setAccessibleName("SzukajTxt");

        jTabbedPane2.addTab("pacjenci", jPanel1);

        jLabel6.setText("Lekarz:");

        LEKARZ_WIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LEKARZ_WIZActionPerformed(evt);
            }
        });

        jLabel7.setText("Pacjent:");

        WIZYTA_WIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WIZYTA_WIZActionPerformed(evt);
            }
        });

        jLabel8.setText("Wizyta:");

        DodajWiz.setText("Dodaj");
        DodajWiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajWizActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DodajWiz, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(WIZYTA_WIZ)
                    .addComponent(PACJENT_WIZ)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(LEKARZ_WIZ))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LEKARZ_WIZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PACJENT_WIZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WIZYTA_WIZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DodajWiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab3", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("lekarze");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajActionPerformed
        Dodaj add = new Dodaj();
        add.setVisible(true);

    }//GEN-LAST:event_DodajActionPerformed

    private void UsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsunActionPerformed
        try {
            String url = "jdbc:sqlite:PrzychodniaDane.db";
            Connection con = DriverManager.getConnection(url);
            Statement stmt = con.createStatement();
            String Query = "DELETE FROM PRZYCHODNIA WHERE ID_PACJENTA = '" + Lista.getSelectedValue() + "' ";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Usuwanie zakończone pomyślnie");
            FillList();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_UsunActionPerformed

    private void AktualizujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AktualizujActionPerformed
        try {
            String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection(url);
            Statement stmt = con.createStatement();

            String Query = "UPDATE PRZYCHODNIA SET ID_PACJENTA = '" + Id_pacjenta.getText() + "', IMIE = '" + Imie.getText() + "', NAZWISKO = '" + Nazwisko.getText() + "', PESEL = '" + Pesel.getText() + "', NR_TELEFONU = '" + Nr_telefonu.getText() + "' WHERE ID_PACJENTA = '" + Lista.getSelectedValue() + "'";
            stmt.execute(Query);

            JOptionPane.showMessageDialog(null, "Aktualizacja zakończona pomyślnie");

            FillList();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_AktualizujActionPerformed

    private void SzukajTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzukajTxtActionPerformed


    }//GEN-LAST:event_SzukajTxtActionPerformed

    private void OdswiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OdswiezActionPerformed
        try {
            Connection con = null;
            ResultSet rs = null;
            PreparedStatement pst = null;
            con = DriverManager.getConnection("jdbc:sqlite:PrzychodniaDane.db");

            JOptionPane.showMessageDialog(null, "Odswieżanie zakończone pomyślnie");
            FillList();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_OdswiezActionPerformed

    private void SzukajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzukajActionPerformed
        try {
            String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection(url);
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
        DodajL add = new DodajL();
        add.setVisible(true);

    }//GEN-LAST:event_Dodaj1ActionPerformed

    private void SzukajTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzukajTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SzukajTxt1ActionPerformed

    private void Szukaj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Szukaj1ActionPerformed
        try {
            String url = "jdbc:sqlite:PrzychodniaDaneLek.db";

            Connection con = DriverManager.getConnection(url);
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
            Connection con = null;
            ResultSet rs = null;
            PreparedStatement pst = null;
            con = DriverManager.getConnection("jdbc:sqlite:PrzychodniaDaneLek.db");

            JOptionPane.showMessageDialog(null, "Odswieżanie zakończone pomyślnie");
            FillList1();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_Odswiez1ActionPerformed

    private void Usun1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usun1ActionPerformed
        try {
            String url = "jdbc:sqlite:PrzychodniaDaneLek.db";
            Connection con = DriverManager.getConnection(url);
            Statement stmt = con.createStatement();
            String Query = "DELETE FROM LEKARZE WHERE ID_LEKARZA = '" + Lista1.getSelectedValue() + "' ";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Usuwanie zakończone pomyślnie");
            FillList1();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_Usun1ActionPerformed

    private void Aktualizuj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aktualizuj1ActionPerformed
        try {
            String url = "jdbc:sqlite:PrzychodniaDaneLek.db";

            Connection con = DriverManager.getConnection(url);
            Statement stmt = con.createStatement();
            String Query = "UPDATE LEKARZE SET ID_LEKARZA = '" + Id_lekarza.getText() + "', PESEL= '" + Pesel1.getText() + "', IMIE = '" + Imie1.getText() + "', NAZWISKO = '" + Nazwisko1.getText() + "', SPECJALIZACJA = '" + Specjalizacja.getText() + "', NR_TELEFONU = '" + Nr_telefonu1.getText() + "' WHERE ID_LEKARZA = '" + Lista1.getSelectedValue() + "'";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Aktualizacja zakończona pomyślnie");

            FillList1();
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

    private void Szukaj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Szukaj2ActionPerformed
      try {
            String url = "jdbc:sqlite:PrzychodniaDane.db";

            Connection con = DriverManager.getConnection(url);
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

    private void Szukaj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Szukaj3ActionPerformed
      try {
            String url = "jdbc:sqlite:PrzychodniaDaneLek.db";

            Connection con = DriverManager.getConnection(url);
            Statement stmt = con.createStatement();

            String Query = "SELECT * FROM LEKARZE WHERE SPECJALIZACJA = '" + SzukajTxt1.getText() + "' ";
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

    private void LEKARZ_WIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LEKARZ_WIZActionPerformed
         try {
             String url = "jdbc:sqlite:PrzychodniaDaneLek.db";
         

            Connection con = DriverManager.getConnection(url);
            Statement stmt = con.createStatement();

            String Query = "INSERT INTO LEKARZE, PRZYCHODNIA VALUES ";
            ResultSet rs = stmt.executeQuery(Query);

        
    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }//GEN-LAST:event_LEKARZ_WIZActionPerformed

    private void DodajWizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajWizActionPerformed
try {
            String url = "jdbc:sqlite:PrzychodniaDaneLek.db";

            Connection con = DriverManager.getConnection(url);
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO RELACJA(ID_LEKARZA, ID_PACJENTA,WIZYTY) VALUES ('"+LEKARZ_WIZ.getText()+"' , '"+PACJENT_WIZ.getText()+"' , '"+WIZYTA_WIZ.getText()+"')";
            
            ResultSet rs = stmt.executeQuery(Query);

           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }



    }//GEN-LAST:event_DodajWizActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void WIZYTA_WIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WIZYTA_WIZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WIZYTA_WIZActionPerformed

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
    private javax.swing.JButton DodajWiz;
    private javax.swing.JTextField Id_lekarza;
    private javax.swing.JTextField Id_pacjenta;
    private javax.swing.JLabel Id_pacjentaLBL;
    private javax.swing.JLabel Id_pacjentaLBL1;
    private javax.swing.JTextField Imie;
    private javax.swing.JTextField Imie1;
    private javax.swing.JLabel ImieLBL;
    private javax.swing.JLabel ImieLBL1;
    private javax.swing.JTextField LEKARZ_WIZ;
    public javax.swing.JList Lista;
    public javax.swing.JList Lista1;
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
    private javax.swing.JTextField PACJENT_WIZ;
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
    private javax.swing.JTextField WIZYTA_WIZ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
