package multbrain;
import java.awt.event.KeyEvent;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class inputScreen extends javax.swing.JFrame {
    public static String question;
    private int mode;
    
    PracticeMode mD;
    TestMode tD;
    InfiniteMode iD;
//    EnduranceMode eD;
    
    inputScreen(){}
    
    inputScreen(int mode) {
        int mixTable = 0;
        initComponents();
        this.mode = mode;
        
        switch(mode){
            case 0:
                mD = new PracticeMode("Dog");
                break;
            case 1:
                tD = new TestMode("Doggt");
                break;
            case 2:
                iD = new InfiniteMode("Dogget");
                break;
            case 3:
                //eD = new EnduranceMode();
                break;
        }
        
        mixTable = JOptionPane.showConfirmDialog(null, 
                "Would you like to randomize?","Randmozie?",mixTable);
        if(mixTable == 0){
            shuffleList();
        }
        
        testUser("q", false);      
    }
    
    private void shuffleList(){
        ArrayList<String> tempArray;
        
        switch(mode){
            case 0:
                tempArray = mD.getQuestionList();
                Collections.shuffle(tempArray);
                mD.setQuestionList(tempArray);
                break;
            case 1:                
                tempArray = tD.getQuestionList();
                Collections.shuffle(tempArray);
                tD.setQuestionList(tempArray);
                break;
            case 2:              
                tempArray = iD.getQuestionList();
                Collections.shuffle(tempArray);
                iD.setQuestionList(tempArray);
                break;
            case 3:   /*             
                tempArray = eD.getQuestionList();
                Collections.shuffle(tempArray);
                eD.setQuestionList(tempArray);
                break;*/
        }
    }
    
    private void testUser(String a, boolean check){
        
        switch(mode){
            case 0:
                mD.testMe(a, check);
                break;
            case 1:
                tD.testMe(a, check);
                break;
            case 2:
                iD.testMe(a, check);
                break;
            case 3:
                //eD.testMe("q", true);
                break;
        }
        outputText.setText(question);
    } 
    
    private void CheckIfDone(){
        switch(mode){
            case 0:
                if(mD.getExcersieDone())
                {
                    mD.setExcersieDone(false);
                    question = "";
                    this.dispose();
                }
                break;
            case 1:
                if(tD.getExcersieDone())
                {
                    tD.setExcersieDone(false);
                    question = "";
                    tD.displayScore();
                    this.dispose();
                }
                break;
            case 2:/*
                if(iD.getExcersieDone())
                {
                    iD.setExcersieDone(false);
                    question = "";
                    this.dispose();
                }
                break;*/
            case 3:
                /*
                if(tD.getExcersieDone())
                {
                    tD.setExcersieDone(false);
                    question = "";
                    this.dispose();
                }
                break;*/
        }

    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        outputText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        inputText = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        outputText.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        outputText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputText, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outputText, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        inputText.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        inputText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputTextKeyPressed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputText, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuit))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String[] fQuestion = question.split("x");
        Boolean answer;
        
        try{
            answer = Integer.parseInt(inputText.getText()) ==
                Integer.parseInt(fQuestion[0]) * Integer.parseInt(fQuestion[1]);
            if (answer){
                lblStatus.setText("CORRECT!");
                testUser("q", true);
            }else{
                lblStatus.setText("INCORRECT!");
                testUser("q", false);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Wrong input, please input only numbers");
            return;
        }
        
        inputText.setText("");
        inputText.requestFocusInWindow();
        CheckIfDone();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnQuitActionPerformed

    private void inputTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTextKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnSubmit.doClick();
        }
    }//GEN-LAST:event_inputTextKeyPressed
    
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
            java.util.logging.Logger.getLogger(inputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputScreen(0).setVisible(true);
            }
        });   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField inputText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel outputText;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
