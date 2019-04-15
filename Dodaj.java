package przychodnia;

import java.sql.*;
import javax.swing.*; 

public class Dodaj extends javax.swing.JFrame {

    public Dodaj() {
        initComponents();
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Id_pacjentaLBL = new javax.swing.JLabel();
        Id_pacjenta = new javax.swing.JTextField();
        Nazwisko = new javax.swing.JTextField();
        Imie = new javax.swing.JTextField();
        ImieLBL = new javax.swing.JLabel();
        Pesel = new javax.swing.JTextField();
        Nr_telefonu = new javax.swing.JTextField();
        NazwiskoLBL = new javax.swing.JLabel();
        PeselLBL = new javax.swing.JLabel();
        Nr_telefonuLBL = new javax.swing.JLabel();
        Id_pacjentaLBL1 = new javax.swing.JLabel();
        Id_pacjenta1 = new javax.swing.JTextField();
        Dodaj = new javax.swing.JButton();

        Id_pacjentaLBL.setText("Id_pacjenta");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        ImieLBL.setText("Imie");

        NazwiskoLBL.setText("Nazwisko");

        PeselLBL.setText("Pesel");

        Nr_telefonuLBL.setText("Nr_ telefonu");

        Id_pacjentaLBL1.setText("Id_pacjenta");

        Dodaj.setText("Dodaj");
        Dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Id_pacjentaLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Id_pacjenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Dodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ImieLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NazwiskoLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PeselLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Nr_telefonuLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Nr_telefonu, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(Pesel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Nazwisko, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Imie)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_pacjenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Id_pacjentaLBL1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImieLBL)
                    .addComponent(Imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NazwiskoLBL)
                    .addComponent(Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PeselLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nr_telefonu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nr_telefonuLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(Dodaj)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajActionPerformed
      
      try{
            String url = "jdbc:sqlite:PrzychodniaDane.db";
      
      Connection con = DriverManager.getConnection(url);
      Statement stmt = con.createStatement();
      String Query = "INSERT INTO PRZYCHODNIA(ID_PACJENTA, IMIE, NAZWISKO, PESEL, NR_TELEFONU) VALUES ('"+Id_pacjenta1.getText()+"' , '"+Imie.getText()+"' , '"+Nazwisko.getText()+"' , '"+Pesel.getText()+"' , '"+Nr_telefonu.getText()+"')";
      
      
      stmt.execute(Query);
      
      JOptionPane.showMessageDialog(null, "Pacjent dodany do bazdy danych");
      
      Id_pacjenta1.setText(null);
      Imie.setText(null);
      Nazwisko.setText(null);
      Pesel.setText(null);
      Nr_telefonu.setText(null);
      
      
      
      
    }//GEN-LAST:event_DodajActionPerformed
catch(SQLException ex){
    JOptionPane.showMessageDialog(null, ex.toString());
}
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dodaj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dodaj;
    private javax.swing.JTextField Id_pacjenta;
    private javax.swing.JTextField Id_pacjenta1;
    private javax.swing.JLabel Id_pacjentaLBL;
    private javax.swing.JLabel Id_pacjentaLBL1;
    private javax.swing.JTextField Imie;
    private javax.swing.JLabel ImieLBL;
    private javax.swing.JTextField Nazwisko;
    private javax.swing.JLabel NazwiskoLBL;
    private javax.swing.JTextField Nr_telefonu;
    private javax.swing.JLabel Nr_telefonuLBL;
    private javax.swing.JTextField Pesel;
    private javax.swing.JLabel PeselLBL;
    // End of variables declaration//GEN-END:variables
}
