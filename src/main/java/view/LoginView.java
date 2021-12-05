package view;

import model.Usuario;
import service.UsuarioService;

import javax.swing.*;

public class LoginView extends javax.swing.JFrame {

    private final UsuarioService usuarioService = new UsuarioService();

    public LoginView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void login() {
        String email = jTextFieldEmail.getText();
        String pass = jPasswordFieldSenha.getText();

        if (!email.equals("") && !pass.equals("")) {
            usuarioService.findOneByEmail(email).ifPresentOrElse(this::validaUsuario, this::showMessage);
        } else {
            showMessage();
        }
    }

    public void validaUsuario(Usuario usuario) {
        if (usuario.getSenha().equals(jPasswordFieldSenha.getText())) {
            new HomeView().setVisible(true);
            this.dispose();
        } else {
            showMessage();
        }
    }

    public void showMessage() {
        JOptionPane.showMessageDialog(this, "Usuario ou senha invalidos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 120));
        setMinimumSize(new java.awt.Dimension(600, 120));
        setResizable(false);

        jLabelEmail.setText("E-mail:");

        jLabelSenha.setText("Senha:");

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelSenha)
                                                        .addComponent(jLabelEmail))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                                        .addComponent(jPasswordFieldSenha))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelEmail)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelSenha)
                                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jButtonLogin)
                                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        login();
    }//GEN-LAST:event_jButtonLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables
}
