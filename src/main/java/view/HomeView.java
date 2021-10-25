package view;

public class HomeView extends javax.swing.JFrame {

    public HomeView() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonTipoDeAnimal = new javax.swing.JButton();
        jButtonRacas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemLogoff = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 225));
        setMinimumSize(new java.awt.Dimension(600, 225));

        jButtonTipoDeAnimal.setText("Tipo de Animal");
        jButtonTipoDeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoDeAnimalActionPerformed(evt);
            }
        });

        jButtonRacas.setText("Raças");
        jButtonRacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRacasActionPerformed(evt);
            }
        });

        jMenuUsuario.setText("Usuário");

        jMenuItemLogoff.setText("Logoff");
        jMenuItemLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoffActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemLogoff);

        jMenuBar1.add(jMenuUsuario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonTipoDeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRacas, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTipoDeAnimal)
                    .addComponent(jButtonRacas))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemLogoffActionPerformed

    private void jButtonTipoDeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoDeAnimalActionPerformed
        new TipoDeAnimalView().setVisible(true);
    }//GEN-LAST:event_jButtonTipoDeAnimalActionPerformed

    private void jButtonRacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRacasActionPerformed
        new RacaView().setVisible(true);
    }//GEN-LAST:event_jButtonRacasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRacas;
    private javax.swing.JButton jButtonTipoDeAnimal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemLogoff;
    private javax.swing.JMenu jMenuUsuario;
    // End of variables declaration//GEN-END:variables
}
