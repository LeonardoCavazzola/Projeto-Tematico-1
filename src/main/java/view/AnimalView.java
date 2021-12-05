package view;

import model.Adotante;
import model.Animal;
import model.Historico;
import model.Raca;
import service.AnimalService;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class AnimalView extends javax.swing.JFrame implements AnimalConsultaOwner, RacaConsultaOwner, AdotanteConsultaOwner {

    private Operacao operacao = null;
    private Animal animal = null;
    private Raca raca = null;
    private Adotante adotante = null;
    private List<Historico> historicos = new ArrayList<>();
    private final AnimalService animalService = new AnimalService();

    public AnimalView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void setEntity(Animal animal) {
        this.animal = animal;
        this.jTextFieldID.setText(animal.getId().toString());
        this.jTextFieldNome.setText(animal.getNome());
        this.jFormattedTextFieldNascimento.setText(StringLocalDateConverter.localDateToString(animal.getNascimento()));
        this.setRaca(animal.getRaca());
        this.jCheckBox1.setSelected(animal.getAdotado());
        this.setAdotante(animal.getAdotante());
        this.jFormattedTextFieldAdocao.setText(StringLocalDateConverter.localDateToString(animal.getDataDeAdocao()));
        this.setHistoricos(animal.getHistoricos());
        this.habilitarDesabiliarBotoes();
    }

    private void setRaca(Raca raca) {
        this.raca = raca;
        this.jTextFieldRaca.setText(raca.getNome());
    }

    private void setAdotante(Adotante adotante) {
        this.adotante = adotante;
        if (adotante != null) {
            this.jTextFieldAdotante.setText(adotante.getNome());
        }
    }

    private void setHistoricos(List<Historico> historicos) {
        this.historicos = historicos;

        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        this.animal.getHistoricos().forEach(historico1 -> model.addRow(new Object[]{
                historico1.getRegistro(),
                StringLocalDateConverter.localDateToString(historico1.getDataTime()),
        }));
    }

    private void addHistorico(Historico historico) {
        this.historicos.add(historico);

        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        this.historicos.forEach(historico1 -> model.addRow(new Object[]{
                historico1.getRegistro(),
                StringLocalDateConverter.localDateToString(historico1.getDataTime()),
        }));
    }

    private void setEnabledCampos(Boolean enabled) {
        this.jTextFieldNome.setEnabled(enabled);
        this.jFormattedTextFieldNascimento.setEnabled(enabled);
        this.jButtonRaca.setEnabled(enabled);
        this.jCheckBox1.setEnabled(enabled);

        if (jCheckBox1.isSelected()) {
            setEnabledAdotanteCampos(enabled);
        }
    }

    private void setEnabledAdotanteCampos(Boolean enabled) {
        this.jButtonAdotante.setEnabled(enabled);
        this.jFormattedTextFieldAdocao.setEnabled(enabled);
    }

    private void limparCampos() {
        this.animal = null;
        this.jTextFieldID.setText(null);
        this.jTextFieldNome.setText(null);
        this.jFormattedTextFieldNascimento.setText(null);
        this.raca = null;
        this.jTextFieldRaca.setText(null);
        this.jCheckBox1.setSelected(false);
        this.adotante = null;
        this.jTextFieldAdotante.setText(null);
        this.jFormattedTextFieldAdocao.setText(null);
        this.setEnabledCampos(false);
        this.setEnabledAdotanteCampos(false);
        this.habilitarDesabiliarBotoes();

        this.historicos = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
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
        this.jButtonAddHistorico.setEnabled(operacao != null);
    }

    private void create() {
        this.animal = new Animal(
                jTextFieldNome.getText(),
                StringLocalDateConverter.stringToLocalDate(jFormattedTextFieldNascimento.getText()),
                StringLocalDateConverter.stringToLocalDate(jFormattedTextFieldAdocao.getText()),
                jCheckBox1.isSelected(),
                raca,
                historicos,
                adotante
        );
        Animal animal = this.animalService.create(this.animal);
        this.jTextFieldID.setText(animal.getId().toString());
    }

    private void update() {
        this.animal.setNome(jTextFieldNome.getText());
        this.animal.setNascimento(StringLocalDateConverter.stringToLocalDate(jFormattedTextFieldNascimento.getText()));
        this.animal.setDataDeAdocao(StringLocalDateConverter.stringToLocalDate(jFormattedTextFieldAdocao.getText()));
        this.animal.setAdotado(jCheckBox1.isSelected());
        this.animal.setRaca(raca);
        this.animal.setHistoricos(historicos);
        this.animal.setAdotante(adotante);

        this.animalService.update(animal);
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
        jLabelNome1 = new javax.swing.JLabel();
        jLabelNome2 = new javax.swing.JLabel();
        jTextFieldRaca = new javax.swing.JTextField();
        jButtonRaca = new javax.swing.JButton();
        jLabelTipo = new javax.swing.JLabel();
        jLabelNome3 = new javax.swing.JLabel();
        jTextFieldAdotante = new javax.swing.JTextField();
        jButtonAdotante = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFormattedTextFieldNascimento = new javax.swing.JFormattedTextField();
        jFormattedTextFieldAdocao = new javax.swing.JFormattedTextField();
        jButtonAddHistorico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabelNome1.setText("Nascimento:");

        jLabelNome2.setText("Data De Adoção:");

        jTextFieldRaca.setEditable(false);
        jTextFieldRaca.setEnabled(false);

        jButtonRaca.setText("...");
        jButtonRaca.setEnabled(false);
        jButtonRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRacaActionPerformed(evt);
            }
        });

        jLabelTipo.setText("Raça:");

        jLabelNome3.setText("Adotante");

        jTextFieldAdotante.setEditable(false);
        jTextFieldAdotante.setEnabled(false);

        jButtonAdotante.setText("...");
        jButtonAdotante.setEnabled(false);
        jButtonAdotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdotanteActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Adotado");
        jCheckBox1.setEnabled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jFormattedTextFieldNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldNascimento.setEnabled(false);

        jFormattedTextFieldAdocao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldAdocao.setEnabled(false);

        jButtonAddHistorico.setText("Adicionar Historico");
        jButtonAddHistorico.setEnabled(false);
        jButtonAddHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddHistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome3)
                            .addComponent(jLabelNome2))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldAdotante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAdotante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFormattedTextFieldAdocao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelID)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelNome1)
                            .addComponent(jLabelTipo))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldRaca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldID)
                            .addComponent(jFormattedTextFieldNascimento)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addComponent(jButtonAddHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jLabelNome1)
                    .addComponent(jFormattedTextFieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jTextFieldRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRaca))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome3)
                    .addComponent(jTextFieldAdotante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdotante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome2)
                    .addComponent(jFormattedTextFieldAdocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
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
        this.showAnimalConsulta(this::setEntity);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        this.novo();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRacaActionPerformed
        this.showRacaConsulta(this::setRaca);
    }//GEN-LAST:event_jButtonRacaActionPerformed

    private void jButtonAdotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdotanteActionPerformed
        this.showAdotanteConsulta(this::setAdotante);
    }//GEN-LAST:event_jButtonAdotanteActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        this.setEnabledAdotanteCampos(jCheckBox1.isSelected());
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButtonAddHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddHistoricoActionPerformed
        new HistoricoView(this::addHistorico).setVisible(true);
    }//GEN-LAST:event_jButtonAddHistoricoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddHistorico;
    private javax.swing.JButton jButtonAdotante;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonRaca;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFormattedTextFieldAdocao;
    private javax.swing.JFormattedTextField jFormattedTextFieldNascimento;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelNome2;
    private javax.swing.JLabel jLabelNome3;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAdotante;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRaca;
    // End of variables declaration//GEN-END:variables
}
