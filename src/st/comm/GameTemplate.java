/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.comm;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Andrew
 */
public class GameTemplate extends javax.swing.JFrame {

    /**
     * Creates new form GameTemplate
     */
    private String teacherName;
    private String categoryName;

    public GameTemplate() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        teacherName = "";
        categoryName = "";
        jSpinner1.setEditor(new JSpinner.DefaultEditor(jSpinner1));
        jSpinner2.setEditor(new JSpinner.DefaultEditor(jSpinner2));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jSpinner1 = new javax.swing.JSpinner();
        createGame = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create Game");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 38, -1, -1));

        jLabel2.setText("Level");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 76, -1, -1));

        jLabel3.setText("Number Of Questions");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 155, 115, -1));

        jLabel4.setText("Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 115, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 35, 191, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("MCQ");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 111, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("True / False");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 111, -1, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 152, 111, -1));

        createGame.setText("Create");
        createGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGameActionPerformed(evt);
            }
        });
        getContentPane().add(createGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 209, 115, -1));

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 209, 111, -1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 73, 191, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/st/comm/bg2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void createGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGameActionPerformed

        String name = jTextField1.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Game Name !", "Create Game", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Integer lvl = (Integer) (jSpinner2.getValue());
        Vector<Question> questions = new Vector<>();
        Integer num = (Integer) (jSpinner1.getValue());

        for (int i = 0; i < num; ++i) {
            JLabel statement = new JLabel("Question Statement");
            JPanel jp = new JPanel();
            jp.setLayout(new GridLayout(6, 5, 10, 10));
            JTextField qst = new JTextField();
            qst.setSize(150, HEIGHT);
            jp.add(statement);
            jp.add(qst);
            if (jRadioButton1.isSelected()) {
                JLabel a1 = new JLabel("Choice #1");
                JTextField qa1 = new JTextField();
                JLabel a2 = new JLabel("Choice #2");
                JTextField qa2 = new JTextField();
                JLabel a3 = new JLabel("Choice #3");
                JTextField qa3 = new JTextField();
                JLabel a4 = new JLabel("Choice #4");
                JTextField qa4 = new JTextField();
                JLabel a5 = new JLabel("Correct Answer Index");
                JSpinner ca = new JSpinner();
                ca.setModel(new SpinnerNumberModel(1, 1, 4, 1));
                jp.add(a1);
                jp.add(qa1);
                jp.add(a2);
                jp.add(qa2);
                jp.add(a3);
                jp.add(qa3);
                jp.add(a4);
                jp.add(qa4);
                jp.add(a5);
                jp.add(ca);
                ca.setEditor(new JSpinner.DefaultEditor(ca));

                int result = JOptionPane.showConfirmDialog(null, jp,
                        "Question " + (i + 1) + " Out Of " + num, JOptionPane.OK_CANCEL_OPTION);
                if (result != JOptionPane.OK_OPTION) {
                    return;
                }
                Question q = new Question();
                Vector<String> choices = new Vector<>();
                choices.add(qa1.getText());
                choices.add(qa2.getText());
                choices.add(qa3.getText());
                choices.add(qa4.getText());
                try {
                    q.setInfo(choices, QuestionType.MCQ, (Integer) ca.getValue() - 1, qst.getText());
                } catch (Exception ex) {
                    Logger.getLogger(GameTemplate.class.getName()).log(Level.SEVERE, null, ex);
                }
                questions.add(q);
            } else if (jRadioButton2.isSelected()) {

                JLabel a1 = new JLabel("Correct Answer");
                ButtonGroup bg = new ButtonGroup();
                JLabel a2 = new JLabel("");
                JRadioButton r1 = new JRadioButton("True");
                JRadioButton r2 = new JRadioButton("False");
                bg.add(r1);
                bg.add(r2);
                jp.add(a1);
                jp.add(r1);
                jp.add(r2);
                int result = JOptionPane.showConfirmDialog(null, jp,
                        "Question " + (i + 1) + " Out Of " + num, JOptionPane.OK_CANCEL_OPTION);
                if (result != JOptionPane.OK_OPTION) {
                    return;
                }
                int idx = 1;
                if (r1.isSelected()) {
                    idx = 0;
                } else if (r2.isSelected()) {
                    idx = 1;
                } else {
                    --i;
                    continue;
                }
                Question q = new Question();
                Vector<String> choices = new Vector<>();
                choices.add("True");
                choices.add("False");
                try {
                    q.setInfo(choices, QuestionType.TRUEorFALSE, idx, qst.getText());
                } catch (Exception ex) {
                    Logger.getLogger(GameTemplate.class.getName()).log(Level.SEVERE, null, ex);
                }
                questions.add(q);
            }

        }
        try {
            GameController.createGame(name, lvl, categoryName, teacherName, false, questions);
            JOptionPane.showMessageDialog(null, "Thank You For Creating New Game ! Your Game is Pending Confirmation !", "Create Game", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Create Game", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createGameActionPerformed

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
            java.util.logging.Logger.getLogger(GameTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameTemplate gt = new GameTemplate();
                gt.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton createGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    /**
     * @param teacherName the teacherName to set
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
