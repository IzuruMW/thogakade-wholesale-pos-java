/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.thogakade.view;

/**
 *
 * @author izuru_mw
 */
public class PlaceOrderForm extends javax.swing.JFrame {

    /**
     * Creates new form PlaceOrderForm
     */
    public PlaceOrderForm() {
        initComponents();
        loadAllCustomerIds();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        orderid = new javax.swing.JLabel();
        cbic = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtcs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        txtcn = new javax.swing.JTextField();
        txtcad = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        cbcid = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtqtyhand = new javax.swing.JTextField();
        txtup = new javax.swing.JTextField();
        txtdes = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        btnplaceorder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        total = new javax.swing.JLabel();
        lable1 = new javax.swing.JLabel();
        addtocart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Place Order Form");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place Order Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 570, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 860, 10));

        date.setBackground(new java.awt.Color(0, 102, 102));
        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 204));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("2022-5-22");
        date.setOpaque(true);
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 170, 30));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 50, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 850, 10));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Order ID");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 90, 30));

        orderid.setBackground(new java.awt.Color(0, 102, 102));
        orderid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderid.setForeground(new java.awt.Color(255, 255, 204));
        orderid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderid.setText("OD-001");
        orderid.setOpaque(true);
        jPanel1.add(orderid, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 170, 30));

        cbic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(cbic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Customer Salary");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 130, 20));

        txtcs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcs.setEnabled(false);
        jPanel1.add(txtcs, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Item Code");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Customer Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 130, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Customer Address");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 130, 20));

        remove.setBackground(new java.awt.Color(255, 51, 51));
        remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 102));
        remove.setText("Remove Item");
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, 40));

        txtcn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcn.setEnabled(false);
        jPanel1.add(txtcn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 160, 30));

        txtcad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcad.setEnabled(false);
        jPanel1.add(txtcad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 160, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 850, 10));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Customer ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 20));

        cbcid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(cbcid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("Description");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 130, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("Unit Price");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 130, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("QTY on Hand");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 130, 20));

        txtqtyhand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtqtyhand.setEnabled(false);
        jPanel1.add(txtqtyhand, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 130, 30));

        txtup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtup.setEnabled(false);
        jPanel1.add(txtup, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 160, 30));

        txtdes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdes.setEnabled(false);
        jPanel1.add(txtdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 140, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("QTY ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 100, 20));

        txtqty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtqty.setEnabled(false);
        jPanel1.add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 150, 30));

        btnnew.setBackground(new java.awt.Color(0, 51, 102));
        btnnew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnew.setForeground(new java.awt.Color(255, 255, 102));
        btnnew.setText("+ New Customer");
        jPanel1.add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, 40));

        btnplaceorder.setBackground(new java.awt.Color(0, 51, 102));
        btnplaceorder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnplaceorder.setForeground(new java.awt.Color(255, 255, 102));
        btnplaceorder.setText("Place Order");
        jPanel1.add(btnplaceorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 620, -1, 40));

        tbl1.setBackground(new java.awt.Color(0, 51, 102));
        tbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbl1.setForeground(new java.awt.Color(255, 255, 255));
        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Description", "QTY", "Unit  Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 830, 160));

        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 102));
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("0");
        total.setOpaque(true);
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, 60, 30));

        lable1.setBackground(new java.awt.Color(0, 0, 102));
        lable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lable1.setForeground(new java.awt.Color(255, 153, 0));
        lable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lable1.setText("Total :");
        lable1.setOpaque(true);
        jPanel1.add(lable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 60, 30));

        addtocart.setBackground(new java.awt.Color(0, 51, 102));
        addtocart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addtocart.setForeground(new java.awt.Color(255, 255, 102));
        addtocart.setText("Add to Cart");
        jPanel1.add(addtocart, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtocart;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnplaceorder;
    private javax.swing.JComboBox<String> cbcid;
    private javax.swing.JComboBox<String> cbic;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lable1;
    private javax.swing.JLabel orderid;
    private javax.swing.JButton remove;
    private javax.swing.JTable tbl1;
    private javax.swing.JLabel total;
    private javax.swing.JTextField txtcad;
    private javax.swing.JTextField txtcn;
    private javax.swing.JTextField txtcs;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtqtyhand;
    private javax.swing.JTextField txtup;
    // End of variables declaration//GEN-END:variables

    private void loadAllCustomerIds() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}