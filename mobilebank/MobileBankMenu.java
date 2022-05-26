package mobilebank;

import javax.swing.JOptionPane;


public class MobileBankMenu extends javax.swing.JFrame {

    double hasil;
    String answer;
    double saldo;
    int masukan;
    public MobileBankMenu() {
        initComponents();
    }

    public MobileBankMenu(int saldo) {
      this.saldo =saldo;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCekSaldo = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnAmbil = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jtxtTampilan2 = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.cyan);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selamat datang");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mobile Banking");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCekSaldo.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnCekSaldo.setText("Cek Saldo");
        btnCekSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekSaldoActionPerformed(evt);
            }
        });

        btnSimpan.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnSimpan.setText("Setor di ATM");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTransfer.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnAmbil.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnAmbil.setText("Ambil di ATM");
        btnAmbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbilActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jtxtTampilan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTampilan2ActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARDLESS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtTampilan2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCekSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAmbil, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSimpan)
                                    .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCekSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnAmbil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtTampilan2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnKeluar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCekSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekSaldoActionPerformed
       JOptionPane.showMessageDialog(rootPane, "Saldo Anda Saat Ini adalah :"+ saldo);
        hasil = saldo;
        saldo=hasil;
        answer = String.format(" %,.2f ",saldo);
        jtxtTampilan2.setText(answer);
    }//GEN-LAST:event_btnCekSaldoActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
        JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ (saldo + masukan));
        hasil = saldo + masukan;
        saldo=hasil;
        answer = String.format(" %,.2f ",saldo);
        jtxtTampilan2.setText(answer);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        String nama3=JOptionPane.showInputDialog("Silahkan Masukan Nomor Rekening");

        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
        if (saldo <= masukan) {
        JOptionPane.showMessageDialog(rootPane,"Maaf Saldo anda kurang !!!!!");
        JOptionPane.showConfirmDialog(null, " Apakah ingin lanjut");
        JOptionPane.showMessageDialog(rootPane,"Tambahkan Saldo Rekening Anda Terlebih Dahulu");
        System.exit(0);
        } else if (saldo >= masukan) {

        }
        hasil = saldo - masukan;
        saldo=hasil;
        answer = String.format(" %,.2f ", hasil);
        jtxtTampilan2.setText(answer);
        JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ saldo+ "\n"+ "Berhasil transfer kepada "+nama3+"sebesar :"+ masukan);

    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnAmbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbilActionPerformed
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
        hasil = saldo - masukan;
        saldo=hasil;
        answer = String.format(" %,.2f ", hasil);
        jtxtTampilan2.setText(answer);
        JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ saldo+ "\n");

    }//GEN-LAST:event_btnAmbilActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
       dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        jtxtTampilan2.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jtxtTampilan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTampilan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTampilan2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MobileBankMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmbil;
    private javax.swing.JButton btnCekSaldo;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jtxtTampilan2;
    // End of variables declaration//GEN-END:variables
}
