package multbrain;
import java.util.ArrayList;

public class selectNumbers extends javax.swing.JFrame {

    private static ArrayList<Integer> selectedNumbers = new ArrayList<>();
    
    public selectNumbers() {
        initComponents();
        btnOne.setSelected(selectedNumbers.contains(1));
        btnTwo.setSelected(selectedNumbers.contains(2));
        btnThree.setSelected(selectedNumbers.contains(3));
        btnFour.setSelected(selectedNumbers.contains(4));
        btnFive.setSelected(selectedNumbers.contains(5));
        btnSix.setSelected(selectedNumbers.contains(6));
        btnSeven.setSelected(selectedNumbers.contains(7));
        btnEight.setSelected(selectedNumbers.contains(8));
        btnNine.setSelected(selectedNumbers.contains(9));
        btnTen.setSelected(selectedNumbers.contains(10));
        btnEleven.setSelected(selectedNumbers.contains(11));
        btnTwelve.setSelected(selectedNumbers.contains(12));
    }

    public static ArrayList<Integer> getSelectedNumbers (){
        return selectedNumbers;
    }
    
    public static void setSelectedNumbers (ArrayList<Integer> newlist){
        selectedNumbers = newlist;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        titleTable = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        btnOne = new javax.swing.JToggleButton();
        btnTwo = new javax.swing.JToggleButton();
        btnThree = new javax.swing.JToggleButton();
        btnFour = new javax.swing.JToggleButton();
        btnFive = new javax.swing.JToggleButton();
        btnSix = new javax.swing.JToggleButton();
        btnSeven = new javax.swing.JToggleButton();
        btnEight = new javax.swing.JToggleButton();
        btnNine = new javax.swing.JToggleButton();
        btnTen = new javax.swing.JToggleButton();
        btnEleven = new javax.swing.JToggleButton();
        btnTwelve = new javax.swing.JToggleButton();
        btnSubmit = new javax.swing.JButton();
        btnAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tables");

        titleTable.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        titleTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleTable.setText("Choose Your Tables");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleTable, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleTable, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bottomPanel.setLayout(new java.awt.GridLayout(2, 6));

        btnOne.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnOne);

        btnTwo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnTwo);

        btnThree.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnThree);

        btnFour.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnFour);

        btnFive.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnFive);

        btnSix.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnSix);

        btnSeven.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnSeven);

        btnEight.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnEight);

        btnNine.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnNine);

        btnTen.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnTen.setText("10");
        btnTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnTen);

        btnEleven.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnEleven.setText("11");
        btnEleven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnEleven);

        btnTwelve.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnTwelve.setText("12");
        btnTwelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedButton(evt);
            }
        });
        bottomPanel.add(btnTwelve);

        btnSubmit.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnAll.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnAll.setText("ALL");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnAll, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        selectedNumbers.clear();
        
        if(btnOne.isSelected()){
            selectedNumbers.add(1);
        }
        if(btnTwo.isSelected()){
            selectedNumbers.add(2);
        }
        if(btnThree.isSelected()){
            selectedNumbers.add(3);
        }
        if(btnFour.isSelected()){
            selectedNumbers.add(4);
        }
        if(btnFive.isSelected()){
            selectedNumbers.add(5);
        }
        if(btnSix.isSelected()){
            selectedNumbers.add(6);
        }
        if(btnSeven.isSelected()){
            selectedNumbers.add(7);
        }
        if(btnEight.isSelected()){
            selectedNumbers.add(8);
        }
        if(btnNine.isSelected()){
            selectedNumbers.add(9);
        }
        if(btnTen.isSelected()){
            selectedNumbers.add(10);
        }
        if(btnEleven.isSelected()){
            selectedNumbers.add(11);
        }
        if(btnTwelve.isSelected()){
            selectedNumbers.add(12);
        }
        
        this.dispose();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void selectedButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedButton
        
    }//GEN-LAST:event_selectedButton

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        selectedNumbers.clear();
        
        for(int i=0; i<13; i++){
            selectedNumbers.add(i);
        }
        
        this.dispose();
    }//GEN-LAST:event_btnAllActionPerformed

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
            java.util.logging.Logger.getLogger(selectNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new selectNumbers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnAll;
    private javax.swing.JToggleButton btnEight;
    private javax.swing.JToggleButton btnEleven;
    private javax.swing.JToggleButton btnFive;
    private javax.swing.JToggleButton btnFour;
    private javax.swing.JToggleButton btnNine;
    private javax.swing.JToggleButton btnOne;
    private javax.swing.JToggleButton btnSeven;
    private javax.swing.JToggleButton btnSix;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JToggleButton btnTen;
    private javax.swing.JToggleButton btnThree;
    private javax.swing.JToggleButton btnTwelve;
    private javax.swing.JToggleButton btnTwo;
    private javax.swing.JLabel titleTable;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
