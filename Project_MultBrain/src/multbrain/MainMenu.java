package multbrain;

import java.awt.Color;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {

    private boolean numberSelected = false;
    public static String currentUser = "";
    private Color btnBackGround = new Color(76, 80, 82);
    private Color frmBackGround = new Color(60, 63, 65);
    private Color forBackGround = new Color(187, 187, 187);
    private Color menuCo = new Color(48,50,52);

    public static void setCurrentUser(String currentUser) {
        MainMenu.currentUser = "Hello " + currentUser;
    }
    
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        titleName = new javax.swing.JLabel();
        btnTables = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        btnPractice = new javax.swing.JButton();
        btnTest = new javax.swing.JButton();
        btnInfinite = new javax.swing.JButton();
        btnEndurance = new javax.swing.JButton();
        btnStatistics = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        fileItem = new javax.swing.JMenu();
        loginItem = new javax.swing.JMenu();
        studentItem = new javax.swing.JMenuItem();
        intructorItem = new javax.swing.JMenuItem();
        registerItem = new javax.swing.JMenu();
        studentItem1 = new javax.swing.JMenuItem();
        intructorItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multi 4 Big Brain");
        setBackground(frmBackGround);
        setLocation(new java.awt.Point(756, 400));
        setLocationByPlatform(true);
        setResizable(false);

        topPanel.setBackground(frmBackGround);

        titleName.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        titleName.setForeground(forBackGround);
        titleName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleName.setText("Hello Guest");

        btnTables.setBackground(btnBackGround
        );
        btnTables.setForeground(forBackGround);
        btnTables.setText("Choose Your Tables");
        btnTables.setFocusPainted(false);
        btnTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titleName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnTables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleName, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnTables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bottomPanel.setBackground(frmBackGround);

        btnPractice.setBackground(btnBackGround);
        btnPractice.setForeground(forBackGround);
        btnPractice.setText("Practice");
        btnPractice.setToolTipText("This tool is made to practice the desired tables.\n This mode will present a question and wait until\n the correct answer is inputed");
        btnPractice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPractice.setFocusPainted(false);
        btnPractice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPracticeActionPerformed(evt);
            }
        });

        btnTest.setBackground(btnBackGround);
        btnTest.setForeground(forBackGround);
        btnTest.setText("Test");
        btnTest.setFocusPainted(false);
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        btnInfinite.setBackground(btnBackGround);
        btnInfinite.setForeground(forBackGround);
        btnInfinite.setText("Infinite");
        btnInfinite.setFocusPainted(false);
        btnInfinite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfiniteActionPerformed(evt);
            }
        });

        btnEndurance.setBackground(btnBackGround);
        btnEndurance.setForeground(forBackGround);
        btnEndurance.setText("Endurance");
        btnEndurance.setFocusPainted(false);
        btnEndurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnduranceActionPerformed(evt);
            }
        });

        btnStatistics.setBackground(btnBackGround);
        btnStatistics.setForeground(forBackGround);
        btnStatistics.setText("Statistics");
        btnStatistics.setFocusPainted(false);
        btnStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(btnInfinite, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEndurance, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(btnPractice, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPractice, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInfinite, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEndurance, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        MenuBar.setBackground(menuCo);
        MenuBar.setForeground(forBackGround);

        fileItem.setForeground(forBackGround);
        fileItem.setText("File");
        MenuBar.add(fileItem);

        loginItem.setForeground(forBackGround);
        loginItem.setText("Login");

        studentItem.setText("Student");
        studentItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentItemActionPerformed(evt);
            }
        });
        loginItem.add(studentItem);

        intructorItem.setText("Instructor");
        intructorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intructorItemActionPerformed(evt);
            }
        });
        loginItem.add(intructorItem);

        MenuBar.add(loginItem);

        registerItem.setForeground(forBackGround);
        registerItem.setText("Register");

        studentItem1.setText("Student");
        studentItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentItem1ActionPerformed(evt);
            }
        });
        registerItem.add(studentItem1);

        intructorItem1.setText("Instructor");
        intructorItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intructorItem1ActionPerformed(evt);
            }
        });
        registerItem.add(intructorItem1);

        MenuBar.add(registerItem);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean numbersExist(){
        return selectNumbers.getSelectedNumbers().size() > 0;
    }
    
    private void btnPracticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPracticeActionPerformed
        if(numbersExist()){
            new inputScreen(0).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select tables");
        }

    }//GEN-LAST:event_btnPracticeActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        if(numbersExist()){
            new inputScreen(1).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select tables");
        }
    }//GEN-LAST:event_btnTestActionPerformed

    private void btnInfiniteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfiniteActionPerformed
        if(numbersExist()){
            new inputScreen(2).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select tables");
        }
    }//GEN-LAST:event_btnInfiniteActionPerformed

    private void btnEnduranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnduranceActionPerformed
        if(numbersExist()){
            JOptionPane.showMessageDialog(null,"Currently in development");
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select tables");
        }
    }//GEN-LAST:event_btnEnduranceActionPerformed

    private void btnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticsActionPerformed

    }//GEN-LAST:event_btnStatisticsActionPerformed

    private void btnTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablesActionPerformed
        new selectNumbers().setVisible(true);
    }//GEN-LAST:event_btnTablesActionPerformed

    private void studentItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentItem1ActionPerformed
        //new UserCreation(false, false).setVisible(true);
        JOptionPane.showInputDialog(null, "User Name");
    }//GEN-LAST:event_studentItem1ActionPerformed

    private void studentItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentItemActionPerformed
        //new UserCreation(false, true).setVisible(true);
        titleName.setText("Hello "+JOptionPane.showInputDialog(null, "User Name"));
    }//GEN-LAST:event_studentItemActionPerformed

    private void intructorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intructorItemActionPerformed
        //new UserCreation(true, true).setVisible(true);
        titleName.setText("Hello "+JOptionPane.showInputDialog(null, "User Name"));
    }//GEN-LAST:event_intructorItemActionPerformed

    private void intructorItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intructorItem1ActionPerformed
        //new UserCreation(true, false).setVisible(true);
        JOptionPane.showInputDialog(null, "User Name");
    }//GEN-LAST:event_intructorItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnEndurance;
    private javax.swing.JButton btnInfinite;
    private javax.swing.JButton btnPractice;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JButton btnTables;
    private javax.swing.JButton btnTest;
    private javax.swing.JMenu fileItem;
    private javax.swing.JMenuItem intructorItem;
    private javax.swing.JMenuItem intructorItem1;
    private javax.swing.JMenu loginItem;
    private javax.swing.JMenu registerItem;
    private javax.swing.JMenuItem studentItem;
    private javax.swing.JMenuItem studentItem1;
    private javax.swing.JLabel titleName;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables

}
