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
        jButtonAdotante = new javax.swing.JButton();
        jButtonDoador = new javax.swing.JButton();
        jButtonConsumivel = new javax.swing.JButton();
        jButtonAnimal = new javax.swing.JButton();
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

        jButtonRacas.setText("Ra�as");
        jButtonRacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRacasActionPerformed(evt);
            }
        });

        jButtonAdotante.setText("Adotante");
        jButtonAdotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdotanteActionPerformed(evt);
            }
        });

        jButtonDoador.setText("Doador");
        jButtonDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoadorActionPerformed(evt);
            }
        });

        jButtonConsumivel.setText("Consumivel");
        jButtonConsumivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsumivelActionPerformed(evt);
            }
        });

        jButtonAnimal.setText("Animal");
        jButtonAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnimalActionPerformed(evt);
            }
        });

        jMenuUsuario.setText("Usu�rio");

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonTipoDeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonRacas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jButtonAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(jButtonConsumivel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButtonAdotante, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonTipoDeAnimal)
                                        .addComponent(jButtonRacas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonAdotante)
                                        .addComponent(jButtonConsumivel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonDoador)
                                        .addComponent(jButtonAnimal))
                                .addContainerGap(106, Short.MAX_VALUE))
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

    private void jButtonAdotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdotanteActionPerformed
        new AdotanteView().setVisible(true);
    }//GEN-LAST:event_jButtonAdotanteActionPerformed

    private void jButtonDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoadorActionPerformed
        new DoadorView().setVisible(true);
    }//GEN-LAST:event_jButtonDoadorActionPerformed

    private void jButtonConsumivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsumivelActionPerformed
        new ConsumivelView().setVisible(true);
    }//GEN-LAST:event_jButtonConsumivelActionPerformed

    private void jButtonAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnimalActionPerformed
        new AnimalView().setVisible(true);
    }//GEN-LAST:event_jButtonAnimalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdotante;
    private javax.swing.JButton jButtonAnimal;
    private javax.swing.JButton jButtonConsumivel;
    private javax.swing.JButton jButtonDoador;
    private javax.swing.JButton jButtonRacas;
    private javax.swing.JButton jButtonTipoDeAnimal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemLogoff;
    private javax.swing.JMenu jMenuUsuario;
    // End of variables declaration//GEN-END:variables
}
