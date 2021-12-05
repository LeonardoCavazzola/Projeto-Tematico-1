package view;

import model.Doador;
import service.DoadorService;

public class DoadorView extends javax.swing.JFrame implements DoadorConsultaOwner {

    private Operacao operacao = null;
    private Doador doador = null;
    private final DoadorService service = new DoadorService();

    public DoadorView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void setEntity(Doador doador) {
        this.doador = doador;
        this.jTextFieldID.setText(doador.getId().toString());
        this.jTextFieldNome.setText(doador.getNome());
        this.jFormattedTextFieldNascimento.setText(StringLocalDateConverter.localDateToString(doador.getNascimento()));
        this.habilitarDesabiliarBotoes();
    }

    private void setEnabledCampos(Boolean enabled) {
        this.jTextFieldNome.setEnabled(enabled);
        this.jFormattedTextFieldNascimento.setEnabled(enabled);
    }

    private void limparCampos() {
        this.jTextFieldID.setText("");
        this.jTextFieldNome.setText("");
        this.jFormattedTextFieldNascimento.setText("");
    }

    private void novo() {
        this.operacao = Operacao.CREATE;
        this.limparCampos();
        this.setEnabledCampos(true);
        this.habilitarDesabiliarBotoes();
    }

    private void alterar() {
        this.operacao = Operacao.UPDATE;
        this.setEnabledCampos(true);
        this.habilitarDesabiliarBotoes();
    }

    private void cancelar() {
        this.operacao = null;
        this.limparCampos();
        this.setEnabledCampos(false);
        this.habilitarDesabiliarBotoes();
    }

    private void habilitarDesabiliarBotoes() {
        this.jButtonConfirmar.setEnabled(operacao != null);
        this.jButtonAlterar.setEnabled(!jTextFieldNome.getText().equals(""));
        this.jButtonNovo.setEnabled(operacao == null);
        this.jButtonBuscar.setEnabled(operacao == null);
        this.jButtonCancelar.setEnabled(operacao != null);
    }

    private void create() {
        System.out.println(jFormattedTextFieldNascimento.getText());
        this.doador = new Doador(jTextFieldNome.getText(), StringLocalDateConverter.stringToLocalDate(jFormattedTextFieldNascimento.getText()));
        Doador doador = this.service.create(this.doador);
        this.jTextFieldID.setText(doador.getId().toString());
    }

    private void update() {
        this.doador.setNome(jTextFieldNome.getText());
        this.doador.setNascimento(StringLocalDateConverter.stringToLocalDate(jFormattedTextFieldNascimento.getText()));
        this.service.update(doador);
    }

    private void confirm() {
        switch (operacao) {
            case CREATE -> create();
            case UPDATE -> update();
        }
        this.setEnabledCampos(false);
        this.operacao = null;
        this.habilitarDesabiliarBotoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jLabelNascimento = new javax.swing.JLabel();
        jFormattedTextFieldNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 150));
        setResizable(false);

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.setEnabled(false);
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jLabelID.setText("ID:");

        jTextFieldID.setEnabled(false);

        jTextFieldNome.setEnabled(false);

        jLabelNome.setText("Nome:");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jLabelNascimento.setText("Nascimento:");

        jFormattedTextFieldNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldNascimento.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelID)
                                                        .addComponent(jLabelNome)
                                                        .addComponent(jLabelNascimento))
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldNome)
                                                        .addComponent(jTextFieldID)
                                                        .addComponent(jFormattedTextFieldNascimento))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelID)
                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNome)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jFormattedTextFieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelNascimento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonConfirmar)
                                        .addComponent(jButtonCancelar)
                                        .addComponent(jButtonAlterar)
                                        .addComponent(jButtonBuscar)
                                        .addComponent(jButtonNovo))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        this.confirm();
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        this.alterar();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.cancelar();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        this.showDoadorConsulta(this::setEntity);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        this.novo();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JFormattedTextField jFormattedTextFieldNascimento;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNascimento;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
