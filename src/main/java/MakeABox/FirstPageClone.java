/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MakeABox;

/**
 *
 * @author As-Sami
 */
public class FirstPageClone extends javax.swing.JFrame {
    
    /**
     * Creates new form FirstPage
     */
    
    public FirstPageClone() {
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

        GameMode = new javax.swing.JPanel();
        MakeABox = new javax.swing.JButton();
        TicTacToe = new javax.swing.JButton();
        Ludo = new javax.swing.JButton();
        BackgroundPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Back to Childhood");
        setBackground(new java.awt.Color(132, 9, 219));
        setBounds(new java.awt.Rectangle(0, 0, 800, 500));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        GameMode.setBackground(new java.awt.Color(101, 7, 168));
        GameMode.setForeground(java.awt.Color.white);
        GameMode.setFocusable(false);
        GameMode.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        GameMode.setPreferredSize(new java.awt.Dimension(500, 300));
        GameMode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GameModeKeyTyped(evt);
            }
        });

        MakeABox.setBackground(new java.awt.Color(183, 77, 225));
        MakeABox.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        MakeABox.setText("Make a box");
        MakeABox.setActionCommand("PlayButton");
        MakeABox.setBorder(null);
        MakeABox.setFocusable(false);
        MakeABox.setPreferredSize(new java.awt.Dimension(100, 50));
        MakeABox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeABoxActionPerformed(evt);
            }
        });

        TicTacToe.setBackground(new java.awt.Color(183, 77, 225));
        TicTacToe.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        TicTacToe.setText("Tic-tac-toe");
        TicTacToe.setActionCommand("PlayButton");
        TicTacToe.setBorder(null);
        TicTacToe.setFocusable(false);
        TicTacToe.setPreferredSize(new java.awt.Dimension(100, 50));
        TicTacToe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicTacToeActionPerformed(evt);
            }
        });

        Ludo.setBackground(new java.awt.Color(183, 77, 225));
        Ludo.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        Ludo.setText("Ludo");
        Ludo.setActionCommand("PlayButton");
        Ludo.setBorder(null);
        Ludo.setFocusable(false);
        Ludo.setPreferredSize(new java.awt.Dimension(100, 50));
        Ludo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GameModeLayout = new javax.swing.GroupLayout(GameMode);
        GameMode.setLayout(GameModeLayout);
        GameModeLayout.setHorizontalGroup(
            GameModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameModeLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(GameModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TicTacToe, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MakeABox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ludo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        GameModeLayout.setVerticalGroup(
            GameModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameModeLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(MakeABox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(TicTacToe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Ludo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(GameMode);
        GameMode.setBounds(150, 100, 500, 300);

        BackgroundPanel.setBackground(new java.awt.Color(55, 4, 92));
        BackgroundPanel.setForeground(java.awt.Color.white);
        BackgroundPanel.setFocusable(false);
        BackgroundPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BackgroundPanelKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(BackgroundPanel);
        BackgroundPanel.setBounds(0, 0, 0, 0);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MakeABoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeABoxActionPerformed
        System.out.println("Make a box");
        GameMode.setVisible(false);
    }//GEN-LAST:event_MakeABoxActionPerformed

    private void TicTacToeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicTacToeActionPerformed
        System.out.println("Tic tac toe"); 
        GameMode.setVisible(false);
      
    }//GEN-LAST:event_TicTacToeActionPerformed

    private void LudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LudoActionPerformed
        System.out.println("Ludo");
        GameMode.setVisible(false);        
    }//GEN-LAST:event_LudoActionPerformed

    private void BackgroundPanelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackgroundPanelKeyTyped
        System.out.println("Typing in outer panel");
    }//GEN-LAST:event_BackgroundPanelKeyTyped

    private void GameModeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GameModeKeyTyped
        if( evt.getKeyCode() == 27 ){
            GameMode.setVisible(false);
        }
    }//GEN-LAST:event_GameModeKeyTyped

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
            java.util.logging.Logger.getLogger(FirstPageClone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPageClone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPageClone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPageClone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPageClone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JPanel GameMode;
    private javax.swing.JButton Ludo;
    private javax.swing.JButton MakeABox;
    private javax.swing.JButton TicTacToe;
    // End of variables declaration//GEN-END:variables
}
