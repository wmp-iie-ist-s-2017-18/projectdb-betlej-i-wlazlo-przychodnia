package przychodnia;

import java.sql.*;
import javax.swing.*; 

public class DodajL extends javax.swing.JFrame {

    public DodajL() {
        initComponents(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Id_pacjentaLBL = new javax.swing.JLabel();
        Id_pacjenta = new javax.swing.JTextField();
        Nazwisko2 = new javax.swing.JTextField();
        Imie2 = new javax.swing.JTextField();
        ImieLBL = new javax.swing.JLabel();
        Pesel2 = new javax.swing.JTextField();
        Nr_telefonu2 = new javax.swing.JTextField();
        NazwiskoLBL = new javax.swing.JLabel();
        PeselLBL = new javax.swing.JLabel();
        Nr_telefonuLBL = new javax.swing.JLabel();
        Id_pacjentaLBL1 = new javax.swing.JLabel();
        Id_lekarza = new javax.swing.JTextField();
        Dodaj = new javax.swing.JButton();
        Specjalizacja = new javax.swing.JTextField();
        Nr_telefonuLBL1 = new javax.swing.JLabel();

        Id_pacjentaLBL.setText("Id_pacjenta");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        ImieLBL.setText("Imie");

        NazwiskoLBL.setText("Nazwisko");

        PeselLBL.setText("Pesel");

        Nr_telefonuLBL.setText("Nr_ telefonu");

        Id_pacjentaLBL1.setText("Id_lekarza");

        Dodaj.setText("Dodaj");
        Dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajActionPerformed(evt);
            }
        });

        Nr_telefonuLBL1.setText("Specjalizacja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Id_pacjentaLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Id_lekarza, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ImieLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NazwiskoLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PeselLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Nr_telefonuLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Nr_telefonu2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(Pesel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nazwisko2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Imie2))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nr_telefonuLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Specjalizacja))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Dodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_lekarza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Id_pacjentaLBL1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Specjalizacja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nr_telefonuLBL1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImieLBL)
                    .addComponent(Imie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NazwiskoLBL)
                    .addComponent(Nazwisko2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PeselLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nr_telefonu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nr_telefonuLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dodaj)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajActionPerformed
      
      try{
            String url = "jdbc:sqlite:PrzychodniaDaneLek.db";
      
      Connection con = DriverManager.getConnection(url);
      Statement stmt = con.createStatement();
      String Query = "INSERT INTO LEKARZE(ID_LEKARZA, SPECJALIZACJA, IMIE, NAZWISKO, PESEL, NR_TELEFONU) VALUES ('"+Id_lekarza.getText()+"' , '"+Specjalizacja.getText()+"' , '"+Imie2.getText()+"' , '"+Nazwisko2.getText()+"' , '"+Pesel2.getText()+"' , '"+Nr_telefonu2.getText()+"')";
      
      
      stmt.execute(Query);
      
      JOptionPane.showMessageDialog(null, "Pacjent dodany do bazdy danych");
      
      Id_lekarza.setText(null);
      Specjalizacja.setText(null);
      Pesel2.setText(null);
      Imie2.setText(null);
      Nazwisko2.setText(null);
      Nr_telefonu2.setText(null);
      
    }//GEN-LAST:event_DodajActionPerformed
catch(SQLException ex){
    JOptionPane.showMessageDialog(null, ex.toString());
}
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DodajL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dodaj;
    private javax.swing.JTextField Id_lekarza;
    private javax.swing.JTextField Id_pacjenta;
    private javax.swing.JLabel Id_pacjentaLBL;
    private javax.swing.JLabel Id_pacjentaLBL1;
    private javax.swing.JTextField Imie2;
    private javax.swing.JLabel ImieLBL;
    private javax.swing.JTextField Nazwisko2;
    private javax.swing.JLabel NazwiskoLBL;
    private javax.swing.JTextField Nr_telefonu2;
    private javax.swing.JLabel Nr_telefonuLBL;
    private javax.swing.JLabel Nr_telefonuLBL1;
    private javax.swing.JTextField Pesel2;
    private javax.swing.JLabel PeselLBL;
    private javax.swing.JTextField Specjalizacja;
    // End of variables declaration//GEN-END:variables
}
