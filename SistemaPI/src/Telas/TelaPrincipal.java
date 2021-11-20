/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author otavi
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        MenuCadFaculdade = new javax.swing.JMenuItem();
        MenuConFaculdade = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MenuCadCurso = new javax.swing.JMenuItem();
        MenuConCurso = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        MenuCadDisciplina = new javax.swing.JMenuItem();
        MenuConDisciplina = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        MenuCadAluno = new javax.swing.JMenuItem();
        MenuConAluno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Programming-Edit-Property-icon.png"))); // NOI18N
        jMenu1.setText("Cadastros   |");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/university_cap_icon-icons.com_66109.png"))); // NOI18N
        jMenu4.setText("Faculdades");

        MenuCadFaculdade.setText("Cadastrar");
        jMenu4.add(MenuCadFaculdade);

        MenuConFaculdade.setText("Consultar");
        MenuConFaculdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConFaculdadeActionPerformed(evt);
            }
        });
        jMenu4.add(MenuConFaculdade);

        jMenu1.add(jMenu4);

        jMenu5.setText("Cursos");

        MenuCadCurso.setText("Cadastrar");
        MenuCadCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadCursoActionPerformed(evt);
            }
        });
        jMenu5.add(MenuCadCurso);

        MenuConCurso.setText("Consultar");
        MenuConCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConCursoActionPerformed(evt);
            }
        });
        jMenu5.add(MenuConCurso);

        jMenu1.add(jMenu5);

        jMenu6.setText("Disciplinas");

        MenuCadDisciplina.setText("Cadastrar");
        jMenu6.add(MenuCadDisciplina);

        MenuConDisciplina.setText("Consultar");
        jMenu6.add(MenuConDisciplina);

        jMenu1.add(jMenu6);

        jMenu7.setText("Alunos");

        MenuCadAluno.setText("Cadastrar");
        jMenu7.add(MenuCadAluno);

        MenuConAluno.setText("Consultar");
        jMenu7.add(MenuConAluno);

        jMenu1.add(jMenu7);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tarefasico.png"))); // NOI18N
        jMenu2.setText("Atividades   |");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu2);

        MenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconesair.png"))); // NOI18N
        MenuSair.setText("Sair");
        MenuSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuConFaculdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConFaculdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuConFaculdadeActionPerformed

    private void MenuCadCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCadCursoActionPerformed

    private void MenuConCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuConCursoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCadAluno;
    private javax.swing.JMenuItem MenuCadCurso;
    private javax.swing.JMenuItem MenuCadDisciplina;
    private javax.swing.JMenuItem MenuCadFaculdade;
    private javax.swing.JMenuItem MenuConAluno;
    private javax.swing.JMenuItem MenuConCurso;
    private javax.swing.JMenuItem MenuConDisciplina;
    private javax.swing.JMenuItem MenuConFaculdade;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}