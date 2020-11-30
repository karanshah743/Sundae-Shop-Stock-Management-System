/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp;

import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author karan
 */
public class MenuWindow extends javax.swing.JFrame {

    /**
     * Creates new form MenuWindow
     */
    
    //Table Model is declared
    
    DefaultTableModel model;
    
    //array of object is created
    MenuWindow[] sundaes;
    
    //neccessary variables are declared
    private int scoops, sundaeCnt;
    private int index;
    double cost, totalCost;
    String flavour;
    boolean nuts;
    
    //default constructor
    public MenuWindow() {
        initComponents();
        pnlNewOrder.setVisible(true);
        pnlChangeOrder.setVisible(true);
        pnlTableList.setVisible(true);
        pnlReceipt.setVisible(true);
        tblList.setVisible(true);
        displayItems(false);
        btnChangeOrder.setVisible(false);
        btnListSundaes.setVisible(false);
        btnVerifySundae.setVisible(false);
        lblHelpAndInfo.setVisible(false);
        model = (DefaultTableModel) tblList.getModel();
    }
    
    //parameterised constructor
    //contains 4 parameters - number of scoops, flavour, nuts, cost and total cost (cost including tax)
    public MenuWindow(int numScoops, String flavour, boolean hasNuts, double cost, double totalCost){
        this.flavour = flavour;
        this.scoops = numScoops;
        this.nuts = hasNuts;
        this.cost = cost;
        this.totalCost = totalCost;
    }
    
    //setter methods
    public void setScoops(int scoops){
        this.scoops = scoops;
    }
    
    public void setFlavour(String flavour){
        this.flavour = flavour;
    }
    
    public void setHasNuts(boolean hasNuts){
        this.nuts = hasNuts;
    }
    
    public void setCalCost(int cost){
        this.cost = cost;
    }
    
    @Override
    public String toString(){
        String str = "\n Sundae with "+scoops+" scoops of "+flavour+" with ";
        if(nuts){
            str += "nuts for a cost of Rs. "+cost;
        }
        else{
            str += "for a cost of Rs. "+cost;
        }
        return str;
    }
    
    //print receipt function
    /*Prints receipt if nuts are selected*/
    public void ifNutsPrintReceipt(){
        
        //in-built function to get date and time 
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
        tDate.format(timer.getTime());
        
        txtaReceipt.append("\t    Kre8 Sundae Parlour     \n"
            + "\nDate: "+tDate.format(timer.getTime())
            + "\nTime: "+tTime.format(timer.getTime())
            + "\n\n----------------------------------------"
            + "\n\t      Order No. : "+(index+1)
            + "\n----------------------------------------"
            + "\n\n     ITEMS           VALUE"
            + "\n\n     Scoops          "+txtfNoScoops.getText()
            + "\n     Flavour         "+flavour
            + "\n     Nuts            Yes"
            + "\n\n----------------------------------------"
            + "\n   Cost                    "+cost+" Rs."
            + "\n   Tax                        18%"
            + "\n----------------------------------------"
            + "\n   Total Cost              "+totalCost+" Rs."
        );
    }
    
    //print receipt function
    //Prints receipt if nuts are not selected
    public void ifNoNutsPrintReceipt(){
        
        //in-built function to get date and time
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
        tDate.format(timer.getTime());
        
        txtaReceipt.append("\t    Kre8 Sundae Parlour     \n"
            + "\nDate: "+tDate.format(timer.getTime())
            + "\nTime: "+tTime.format(timer.getTime())
            + "\n\n----------------------------------------"
            + "\n\t      Order No. : "+(index+1)
            + "\n----------------------------------------"
            + "\n\n     ITEMS           VALUE"
            + "\n\n     Scoops          "+txtfNoScoops.getText()
            + "\n     Flavour         "+flavour
            + "\n     Nuts            No"
            + "\n\n----------------------------------------"
            + "\n   Cost                    "+cost+" Rs."
            + "\n   Tax                        18%"
            + "\n----------------------------------------"
            + "\n   Total Cost              "+totalCost+" Rs."
        );
    }
    
    public void displayItems(boolean di){
        btnBill.setVisible(di);
        btnCancelOrder.setVisible(di);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfSundaeNo = new javax.swing.JTextField();
        btnNewOrder = new javax.swing.JButton();
        btnChangeOrder = new javax.swing.JButton();
        btnListSundaes = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblQuestionIcon = new javax.swing.JLabel();
        lblHelpAndInfo = new javax.swing.JLabel();
        pnlChangeOrder = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtfChangeSundae = new javax.swing.JTextField();
        btnVerifySundae = new javax.swing.JButton();
        scrlpnlModifyOrder = new javax.swing.JScrollPane();
        pnlModifyOrder = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblDisplaySundae = new javax.swing.JLabel();
        lblDisplaySundae2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtfModifyScoops = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combModifyRegularFlavour = new javax.swing.JComboBox<>();
        combModifyPremiumFlavour = new javax.swing.JComboBox<>();
        rbtnModifyNuts = new javax.swing.JRadioButton();
        rbtnModifyNoNuts = new javax.swing.JRadioButton();
        btnModifySundae = new javax.swing.JButton();
        pnlNewOrder = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtfNoScoops = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbtnNuts = new javax.swing.JRadioButton();
        rbtnNoNuts = new javax.swing.JRadioButton();
        btnBill = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        combRegularFlavour = new javax.swing.JComboBox<>();
        combPremiumFlavour = new javax.swing.JComboBox<>();
        pnlTableList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        pnlReceipt = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaReceipt = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sundae Parlor");
        setBackground(new java.awt.Color(254, 250, 212));
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(254, 250, 212));

        jPanel2.setBackground(new java.awt.Color(254, 250, 212));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("How many Sundaes you will make today?");

        txtfSundaeNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfSundaeNoActionPerformed(evt);
            }
        });
        txtfSundaeNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfSundaeNoKeyTyped(evt);
            }
        });

        btnNewOrder.setBackground(new java.awt.Color(254, 250, 212));
        btnNewOrder.setText("Order a new Sunduae");
        btnNewOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });

        btnChangeOrder.setText("Change information of a specific order");
        btnChangeOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeOrderActionPerformed(evt);
            }
        });

        btnListSundaes.setText("Print Sundaes");
        btnListSundaes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListSundaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListSundaesActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgp/images/letter-x2.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        lblQuestionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgp/images/question1.png"))); // NOI18N
        lblQuestionIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuestionIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuestionIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuestionIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuestionIconMouseExited(evt);
            }
        });

        lblHelpAndInfo.setText("Help and Info");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuestionIcon)
                .addGap(389, 389, 389)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(txtfSundaeNo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnChangeOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewOrder)
                .addGap(290, 290, 290)
                .addComponent(btnListSundaes)
                .addGap(105, 105, 105))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHelpAndInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lblQuestionIcon))
                        .addGap(1, 1, 1)
                        .addComponent(lblHelpAndInfo)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNewOrder)
                            .addComponent(btnChangeOrder)
                            .addComponent(btnListSundaes)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtfSundaeNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlChangeOrder.setBackground(new java.awt.Color(254, 250, 212));
        pnlChangeOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setText("Which Sundae do you wish to modify ?");

        txtfChangeSundae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfChangeSundaeActionPerformed(evt);
            }
        });
        txtfChangeSundae.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfChangeSundaeKeyTyped(evt);
            }
        });

        btnVerifySundae.setText("Verify Sundae");
        btnVerifySundae.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerifySundae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifySundaeActionPerformed(evt);
            }
        });

        scrlpnlModifyOrder.setBackground(new java.awt.Color(254, 250, 212));

        pnlModifyOrder.setBackground(new java.awt.Color(254, 250, 212));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Modify:");

        lblDisplaySundae.setText("Sundae");

        lblDisplaySundae2.setText("Display");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Number of Scoops :");

        txtfModifyScoops.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfModifyScoopsKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Icream Flavour :");

        combModifyRegularFlavour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular Flavours", "Roasted Almond", "Rasberry Rose", "Cranberry Caramel", "Pepermint Brownie", "French Chocolate", "Hot Fudge", "Caramel Apple", "Lemon Curd Pistachio" }));

        combModifyPremiumFlavour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Premium Flavours", "Fruity Pebbles", "Chocolate Chip Cookie", "Caramel Popcorn and Butterscotch", "Blackberry and Hazelnut Maringue", "Neapolitan", "Whiskey Maple", "Cherry Bakewell", "Banana Split" }));

        rbtnModifyNuts.setBackground(new java.awt.Color(254, 250, 212));
        rbtnModifyNuts.setText("With Nuts");

        rbtnModifyNoNuts.setBackground(new java.awt.Color(254, 250, 212));
        rbtnModifyNoNuts.setText("Without Nuts");

        btnModifySundae.setText("Modify Sundae");
        btnModifySundae.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModifySundae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifySundaeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlModifyOrderLayout = new javax.swing.GroupLayout(pnlModifyOrder);
        pnlModifyOrder.setLayout(pnlModifyOrderLayout);
        pnlModifyOrderLayout.setHorizontalGroup(
            pnlModifyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifyOrderLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlModifyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDisplaySundae2)
                    .addGroup(pnlModifyOrderLayout.createSequentialGroup()
                        .addGroup(pnlModifyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(rbtnModifyNuts))
                        .addGroup(pnlModifyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlModifyOrderLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(pnlModifyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfModifyScoops, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combModifyRegularFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combModifyPremiumFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlModifyOrderLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rbtnModifyNoNuts)))))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(pnlModifyOrderLayout.createSequentialGroup()
                .addGroup(pnlModifyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModifyOrderLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblDisplaySundae))
                    .addGroup(pnlModifyOrderLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnModifySundae))
                    .addGroup(pnlModifyOrderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlModifyOrderLayout.setVerticalGroup(
            pnlModifyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifyOrderLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDisplaySundae)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDisplaySundae2)
                .addGap(56, 56, 56)
                .addGroup(pnlModifyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtfModifyScoops, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combModifyRegularFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(combModifyPremiumFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(pnlModifyOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnModifyNuts)
                    .addComponent(rbtnModifyNoNuts))
                .addGap(18, 18, 18)
                .addComponent(btnModifySundae)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        scrlpnlModifyOrder.setViewportView(pnlModifyOrder);

        javax.swing.GroupLayout pnlChangeOrderLayout = new javax.swing.GroupLayout(pnlChangeOrder);
        pnlChangeOrder.setLayout(pnlChangeOrderLayout);
        pnlChangeOrderLayout.setHorizontalGroup(
            pnlChangeOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChangeOrderLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(txtfChangeSundae, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(pnlChangeOrderLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnVerifySundae)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(scrlpnlModifyOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnlChangeOrderLayout.setVerticalGroup(
            pnlChangeOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChangeOrderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlChangeOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfChangeSundae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnVerifySundae)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrlpnlModifyOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pnlNewOrder.setBackground(new java.awt.Color(254, 250, 212));
        pnlNewOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("How many Scoops ?");

        txtfNoScoops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNoScoopsActionPerformed(evt);
            }
        });
        txtfNoScoops.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfNoScoopsKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("What flavour ?");

        rbtnNuts.setBackground(new java.awt.Color(254, 250, 212));
        rbtnNuts.setText("Nuts");
        rbtnNuts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnNuts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNutsActionPerformed(evt);
            }
        });

        rbtnNoNuts.setBackground(new java.awt.Color(254, 250, 212));
        rbtnNoNuts.setText("No Nuts");
        rbtnNoNuts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnNoNuts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNoNutsActionPerformed(evt);
            }
        });

        btnBill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBill.setText("Print Bill");
        btnBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillActionPerformed(evt);
            }
        });

        btnCancelOrder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        combRegularFlavour.setBackground(new java.awt.Color(254, 250, 212));
        combRegularFlavour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular Flavours", "Roasted Almond", "Rasberry Rose", "Cranberry Caramel", "Pepermint Brownie", "French Chocolate", "Hot Fudge", "Caramel Apple", "Lemon Curd Pistachio", " " }));
        combRegularFlavour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combRegularFlavourActionPerformed(evt);
            }
        });

        combPremiumFlavour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Premium Flavours", "Fruity Pebbles", "Chocolate Chip Cookie", "Caramel Popcorn and Butterscotch", "Blackberry and Hazelnut Maringue", "Neapolitan", "Whiskey Maple", "Cherry Bakewell", "Banana Split" }));

        javax.swing.GroupLayout pnlNewOrderLayout = new javax.swing.GroupLayout(pnlNewOrder);
        pnlNewOrder.setLayout(pnlNewOrderLayout);
        pnlNewOrderLayout.setHorizontalGroup(
            pnlNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNewOrderLayout.createSequentialGroup()
                        .addGroup(pnlNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewOrderLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(rbtnNuts))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(45, 45, 45)
                        .addGroup(pnlNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewOrderLayout.createSequentialGroup()
                                .addComponent(rbtnNoNuts)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelOrder)
                                .addContainerGap())
                            .addGroup(pnlNewOrderLayout.createSequentialGroup()
                                .addComponent(combRegularFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addComponent(btnBill)
                                .addGap(23, 23, 23))
                            .addGroup(pnlNewOrderLayout.createSequentialGroup()
                                .addComponent(combPremiumFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlNewOrderLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(txtfNoScoops, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlNewOrderLayout.setVerticalGroup(
            pnlNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewOrderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfNoScoops, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNewOrderLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combRegularFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBill)))
                .addGap(18, 18, 18)
                .addComponent(combPremiumFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlNewOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnNoNuts)
                    .addComponent(rbtnNuts)
                    .addComponent(btnCancelOrder))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pnlTableList.setBackground(new java.awt.Color(254, 250, 212));
        pnlTableList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblList.setAutoCreateRowSorter(true);
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No.", "Scoop", "Flavour", "Nuts / No Nuts", "Cost"
            }
        ));
        tblList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblList.getTableHeader().setResizingAllowed(false);
        tblList.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblList);

        javax.swing.GroupLayout pnlTableListLayout = new javax.swing.GroupLayout(pnlTableList);
        pnlTableList.setLayout(pnlTableListLayout);
        pnlTableListLayout.setHorizontalGroup(
            pnlTableListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        pnlTableListLayout.setVerticalGroup(
            pnlTableListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );

        pnlReceipt.setBackground(new java.awt.Color(254, 250, 212));
        pnlReceipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtaReceipt.setEditable(false);
        txtaReceipt.setColumns(20);
        txtaReceipt.setRows(5);
        txtaReceipt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaReceiptKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtaReceipt);

        javax.swing.GroupLayout pnlReceiptLayout = new javax.swing.GroupLayout(pnlReceipt);
        pnlReceipt.setLayout(pnlReceiptLayout);
        pnlReceiptLayout.setHorizontalGroup(
            pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        pnlReceiptLayout.setVerticalGroup(
            pnlReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnlChangeOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlNewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlTableList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlChangeOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnlNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTableList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Cancel Order function
    //This function will clear all the entries entered for the particular order
    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        txtfNoScoops.setText("");
        rbtnNuts.setSelected(false);
        rbtnNoNuts.setSelected(false);
        displayItems(false);
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    //Print Bill function
    //prints bill as the information provided by the user
    //also shows pop-up message if any error is encountered
    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
        MenuWindow sundae = null;
        if(txtfNoScoops.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(MenuWindow.this, "Please enter the details.");
            txtfNoScoops.setFocusable(true);
        }
        else{
            //pop-up will shw up if index will be greater than sundaeCnt
            if(index>=sundaeCnt){
                JOptionPane.showMessageDialog(MenuWindow.this, "No more sundaes can be prepared");
            }
            else{
                //if any regular flavour is selected
                if(combRegularFlavour.getSelectedIndex() != 0){
                    if(combRegularFlavour.getSelectedIndex()==0){
                        JOptionPane.showMessageDialog(MenuWindow.this, "Select flavour");
                    }
                    else{
                        //if nuts are selected
                        if(rbtnNuts.isSelected()){
                            scoops = Integer.parseInt(txtfNoScoops.getText());
                            flavour = (String) combRegularFlavour.getSelectedItem();
                            cost = (scoops * 60) + 25;
                            totalCost = cost + ((cost*18)/100);
                            sundae = new MenuWindow(scoops, flavour, true, cost, totalCost); //calls the parameterised constructor
                            JOptionPane.showMessageDialog(MenuWindow.this, "Sundae "+index+"\n\nSundae with "+txtfNoScoops.getText()+" scoops of "+flavour+" with nuts for a  cost of Rs. "+totalCost);
                            ifNutsPrintReceipt();
                            
                            //adding values to the table 
                            model.insertRow(tblList.getRowCount(), new Object[]{
                                index,
                                txtfNoScoops.getText(),
                                combRegularFlavour.getSelectedItem(),
                                "Yes",
                                totalCost
                            });
                        }
                        //if nuts are not selected
                        else{
                            scoops = Integer.parseInt(txtfNoScoops.getText());
                            flavour = (String) combRegularFlavour.getSelectedItem();
                            cost = scoops * 60;
                            totalCost = cost + ((cost*18)/100);
                            sundae = new MenuWindow(scoops, flavour, false, cost, totalCost);//calls the parameterised constructor
                            JOptionPane.showMessageDialog(MenuWindow.this, "Sundae "+index+"\n\nSundae with "+txtfNoScoops.getText()+" scoops of "+flavour+" without nuts for a cost of Rs. "+totalCost);
                            ifNoNutsPrintReceipt();
                            
                            //adding values to the table
                            model.insertRow(tblList.getRowCount(), new Object[]{
                                index,
                                txtfNoScoops.getText(),
                                combRegularFlavour.getSelectedItem(),
                                "No",
                                totalCost
                            });
                        }
                        //adds sundae to the array of object created initially
                        sundaes[index] = sundae;
                        ++index;
                    }
                }
                //if any premium flavour is selected
                else if(combPremiumFlavour.getSelectedIndex()!=0){
                    if(combPremiumFlavour.getSelectedIndex()==0){
                        JOptionPane.showMessageDialog(MenuWindow.this, "Select flavour");
                    }
                    else{
                        //if nuts are selected
                        if(rbtnNuts.isSelected()){
                            scoops = Integer.parseInt(txtfNoScoops.getText());
                            flavour = (String) combPremiumFlavour.getSelectedItem();
                            cost = (scoops * 80) + 25;
                            totalCost = cost + ((cost*18)/100);
                            sundae = new MenuWindow(scoops, flavour, true, cost, totalCost);//calls the parameterised constructor
                            JOptionPane.showMessageDialog(MenuWindow.this, "Sundae "+index+"\n\nSundae with "+txtfNoScoops.getText()+" scoops of "+flavour+" with nuts for a  cost of Rs. "+totalCost);
                            ifNutsPrintReceipt();
                            
                            //adding values to the table
                            model.insertRow(tblList.getRowCount(), new Object[]{
                                index,
                                txtfNoScoops.getText(),
                                combPremiumFlavour.getSelectedItem(),
                                "Yes",
                                totalCost
                            });
                        }
                        //if nuts are not selected
                        else{
                            scoops = Integer.parseInt(txtfNoScoops.getText());
                            flavour = (String) combPremiumFlavour.getSelectedItem();
                            cost = scoops * 80;
                            totalCost = cost + ((cost*18)/100);
                            sundae = new MenuWindow(scoops, flavour, false, cost, totalCost);//calls the parameterised constructor
                            JOptionPane.showMessageDialog(MenuWindow.this, "Sundae "+index+"\n\nSundae with "+txtfNoScoops.getText()+" scoops of "+flavour+" without nuts for a cost of Rs. "+totalCost);
                            ifNoNutsPrintReceipt();
                            
                            //adding values to the table
                            model.insertRow(tblList.getRowCount(), new Object[]{
                                index,
                                txtfNoScoops.getText(),
                                combPremiumFlavour.getSelectedItem(),
                                "No",
                                totalCost
                            });
                        }
                        //adds sundae to the array of object created initially
                        sundaes[index] = sundae;
                        ++index;
                    }
                }
                //pop-up will show up if no flavour is selected 
                else{
                    JOptionPane.showMessageDialog(MenuWindow.this, "Select any flavour");
                }
            }
        }
        //after ordering a sundae
        //and pressing Print Bill button
        //all the values entered will get cleared
        txtfNoScoops.setText("");
        combRegularFlavour.setSelectedIndex(0);
        combPremiumFlavour.setSelectedIndex(0);
        rbtnNuts.setSelected(false);
        rbtnNoNuts.setSelected(false);
        displayItems(false);
    }//GEN-LAST:event_btnBillActionPerformed

    //initially if No Nuts button is selected
    //this function will deselect it
    private void rbtnNoNutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNoNutsActionPerformed
        if(rbtnNoNuts.isSelected()){
            rbtnNuts.setSelected(false);
        }
    }//GEN-LAST:event_rbtnNoNutsActionPerformed

    //initially if Nuts button is selected
    //this function will deselect it
    private void rbtnNutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNutsActionPerformed
        if(rbtnNuts.isSelected()){
            rbtnNoNuts.setSelected(false);
        }
    }//GEN-LAST:event_rbtnNutsActionPerformed

    //this function will Modify the last added sundae
    private void btnModifySundaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifySundaeActionPerformed
        int ch = Integer.parseInt(txtfChangeSundae.getText()), scoop = 0;
        String flavor = sundaes[ch].flavour;
        
        if(txtfModifyScoops.getText().isEmpty()==false){
            scoop = Integer.parseInt(txtfModifyScoops.getText());
            sundaes[ch].setScoops(scoop);
        }
        
        //in-built function to get Date and Time
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
        tDate.format(timer.getTime());
        
        //if Regular Flavour is selected
        if(combModifyRegularFlavour.getSelectedIndex()!=0){
            flavor = (String) combModifyRegularFlavour.getSelectedItem();
            sundaes[ch].setFlavour(flavor);
            if(rbtnModifyNuts.isSelected()){
               sundaes[ch].setHasNuts(true);
                cost = (scoop * 60) + 25;
                totalCost = cost + ((cost*18)/100);
                JOptionPane.showMessageDialog(MenuWindow.this, "Sundae "+ch+"\n\nSundae with "+scoop+" of "+flavor+" with nuts for a cost of Rs. "+totalCost); 
                
                //clears the text of the last entered sundae in the receipt 
                txtaReceipt.setText("");
                
                txtaReceipt.append("\t    Kre8 Sundae Parlour     \n"
                    + "\nDate: "+tDate.format(timer.getTime())
                    + "\nTime: "+tTime.format(timer.getTime())
                    + "\n\n----------------------------------------"
                    + "\n\t      Order No. : "+(ch+1)
                    + "\n----------------------------------------"
                    + "\n\n     ITEMS           VALUE"
                    + "\n\n     Scoops          "+scoop
                    + "\n     Flavour         "+flavor
                    + "\n     Nuts            Yes"
                    + "\n\n----------------------------------------"
                    + "\n   Cost                    "+cost+" Rs."
                    + "\n   Tax                        18%"
                    + "\n----------------------------------------"
                    + "\n   Total Cost              "+totalCost+" Rs."
                );
                
                //removes the last row from the table
                model.removeRow(ch);
                
                //adds the modified sundae to the table with same index
                model.insertRow(tblList.getRowCount(), new Object[]{
                    ch,
                    scoop,
                    flavor,
                    "Yes",
                    totalCost
                });
            }
            //if nuts are not selected
            else{
                sundaes[ch].setHasNuts(false);
                cost = scoop * 60;
                totalCost = cost + ((cost*18)/100);
                JOptionPane.showMessageDialog(MenuWindow.this, "Sundae "+ch+"\n\nSundae with "+scoop+" of "+flavor+" without nuts for a cost of Rs. "+totalCost);
                
                //clears the text of the last entered sundae in the receipt 
                txtaReceipt.setText("");
                
                txtaReceipt.append("\t    Kre8 Sundae Parlour     \n"
                    + "\nDate: "+tDate.format(timer.getTime())
                    + "\nTime: "+tTime.format(timer.getTime())
                    + "\n\n----------------------------------------"
                    + "\n\t      Order No. : "+(ch+1)
                    + "\n----------------------------------------"
                    + "\n\n     ITEMS           VALUE"
                    + "\n\n     Scoops          "+scoop
                    + "\n     Flavour         "+flavor
                    + "\n     Nuts            No"
                    + "\n\n----------------------------------------"
                    + "\n   Cost                    "+cost+" Rs."
                    + "\n   Tax                        18%"
                    + "\n----------------------------------------"
                    + "\n   Total Cost              "+totalCost+" Rs."
                );
                
                //removes the last row from the table
                model.removeRow(ch);
                
                //adds the modified sundae to the table with same index
                model.insertRow(tblList.getRowCount(), new Object[]{
                    ch,
                    scoop,
                    flavor,
                    "No",
                    totalCost
                });
            }
        }
        //if premium flavour is selected
        else if(combModifyPremiumFlavour.getSelectedIndex()!=0){
            flavor = (String) combModifyPremiumFlavour.getSelectedItem();
            sundaes[ch].setFlavour(flavor);
            if(rbtnModifyNuts.isSelected()){
               sundaes[ch].setHasNuts(true);
                cost = (scoop * 80) + 25;
                totalCost = cost + ((cost*18)/100);
                JOptionPane.showMessageDialog(MenuWindow.this, "Sundae "+ch+"\n\nSundae with "+scoop+" of "+flavor+" with nuts for a cost of Rs. "+totalCost); 
                
                //clears the text of the last entered sundae in the receipt
                txtaReceipt.setText("");
                
                txtaReceipt.append("\t    Kre8 Sundae Parlour     \n"
                    + "\nDate: "+tDate.format(timer.getTime())
                    + "\nTime: "+tTime.format(timer.getTime())
                    + "\n\n----------------------------------------"
                    + "\n\t      Order No. : "+(ch+1)
                    + "\n----------------------------------------"
                    + "\n\n     ITEMS           VALUE"
                    + "\n\n     Scoops          "+scoop
                    + "\n     Flavour         "+flavor
                    + "\n     Nuts            Yes"
                    + "\n\n----------------------------------------"
                    + "\n   Cost                    "+cost+" Rs."
                    + "\n   Tax                        18%"
                    + "\n----------------------------------------"
                    + "\n   Total Cost              "+totalCost+" Rs."
                );
                
                //removes the last row from the table
                model.removeRow(ch);
                
                //adds the modified sundae to the table with same index
                model.insertRow(tblList.getRowCount(), new Object[]{
                    ch,
                    scoop,
                    flavor,
                    "Yes",
                    totalCost
                });
            }
            //if nuts are not selected in premium flavour
            else{
                sundaes[ch].setHasNuts(false);
                cost = scoop * 80;
                totalCost = cost + ((cost*18)/100);
                totalCost = cost + ((cost*18)/100);
                JOptionPane.showMessageDialog(MenuWindow.this, "Sundae "+ch+"\n\nSundae with "+scoop+" of "+flavor+" without nuts for a cost of Rs. "+totalCost);
                
                //clears the text of the last entered sundae in the receipt
                txtaReceipt.setText("");
                
                txtaReceipt.append("\t    Kre8 Sundae Parlour     \n"
                    + "\nDate: "+tDate.format(timer.getTime())
                    + "\nTime: "+tTime.format(timer.getTime())
                    + "\n\n----------------------------------------"
                    + "\n\t      Order No. : "+(ch+1)
                    + "\n----------------------------------------"
                    + "\n\n     ITEMS           VALUE"
                    + "\n\n     Scoops          "+scoop
                    + "\n     Flavour         "+flavor
                    + "\n     Nuts            No"
                    + "\n\n----------------------------------------"
                    + "\n   Cost                    "+cost+" Rs."
                    + "\n   Tax                        18%"
                    + "\n----------------------------------------"
                    + "\n   Total Cost              "+totalCost+" Rs."
                );
                
                //removes the last row from the table
                model.removeRow(ch);
                
                //adds the modified sundae to the table with same index
                model.insertRow(tblList.getRowCount(), new Object[]{
                    ch,
                    scoop,
                    flavor,
                    "No",
                    totalCost
                });
            }
        } 
        //after modifing the sundae
        //this will clear all the enteries 
        txtfChangeSundae.setText("");
        txtfModifyScoops.setText("");
        combModifyRegularFlavour.setSelectedIndex(0);
        combModifyPremiumFlavour.setSelectedIndex(0);
        rbtnModifyNuts.setSelected(false);
        rbtnModifyNoNuts.setSelected(false);
        pnlModifyOrder.setVisible(true);
        scrlpnlModifyOrder.setVisible(true);
    }//GEN-LAST:event_btnModifySundaeActionPerformed

    //this function will check 
    //whether the entered sundae exist or not
    private void btnVerifySundaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifySundaeActionPerformed
        int ch = Integer.parseInt(txtfChangeSundae.getText());
        if(ch>=index){
            JOptionPane.showMessageDialog(MenuWindow.this, "Sorry no such Sundae.");
            txtfChangeSundae.setText("");
        }
        //if the sundae exists
        //than window for modifing the sundae will get appear
        else{
            scrlpnlModifyOrder.setVisible(true);
            pnlModifyOrder.setVisible(true);
            lblDisplaySundae.setText("Sundae "+ch);
            if(sundaes[ch].nuts){
                lblDisplaySundae2.setText("Sundae with "+sundaes[ch].scoops+" scoops of "+sundaes[ch].flavour+" with nuts for a cost of Rs. "+sundaes[ch].totalCost);
            }
            else{
                lblDisplaySundae2.setText("Sundae with "+sundaes[ch].scoops+" scoops of "+sundaes[ch].flavour+" without nuts for a cost of Rs. "+sundaes[ch].totalCost);
            }
            txtfModifyScoops.grabFocus();
        }
    }//GEN-LAST:event_btnVerifySundaeActionPerformed

    //On pressing Change Order button
    //window for verifing the sundae will get open
    private void btnChangeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeOrderActionPerformed
        pnlChangeOrder.setVisible(true);
        txtfChangeSundae.grabFocus();
        btnVerifySundae.setVisible(true);
    }//GEN-LAST:event_btnChangeOrderActionPerformed

    //This is New Order button function
    //It will let you enter a new sundae order
    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        if(txtfSundaeNo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(MenuWindow.this, "Please enter the number od sundaes.");
            txtfSundaeNo.grabFocus();
        }
        else{
            pnlNewOrder.setVisible(true);
            txtfNoScoops.setText("");
            txtfNoScoops.grabFocus();
            rbtnNuts.setSelected(false);
            rbtnNoNuts.setSelected(false);
            txtaReceipt.setText("");
            displayItems(true);
            btnChangeOrder.setVisible(true);
            btnListSundaes.setVisible(true);
            sundaeCnt = Integer.parseInt(txtfSundaeNo.getText());
            sundaes = new MenuWindow[sundaeCnt];
        }
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void combRegularFlavourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combRegularFlavourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combRegularFlavourActionPerformed

    private void txtfChangeSundaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfChangeSundaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfChangeSundaeActionPerformed

    private void txtfSundaeNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfSundaeNoActionPerformed

    }//GEN-LAST:event_txtfSundaeNoActionPerformed

   
    //This is List Sundaes button
    //This will let you create a .pdf file 
    //for all the sundaes prepared with their specifications
    private void btnListSundaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListSundaesActionPerformed
        try{
            boolean complete = tblList.print();
            if(complete){
                JOptionPane.showMessageDialog(null, "Done Printing", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Printing!!", "Printer", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(PrinterException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnListSundaesActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    //KeyTyped Event for Sundae Number
    //only numbers can be taken as an input
    //anything rather numbers will be typed than a sound like beep will be produced
    private void txtfSundaeNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfSundaeNoKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtfSundaeNoKeyTyped

    private void txtfNoScoopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNoScoopsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNoScoopsActionPerformed

    //KeyTyped Event for Sundae Number
    //only numbers can be taken as an input
    //anything rather numbers will be typed than a sound like beep will be produced
    private void txtfNoScoopsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfNoScoopsKeyTyped
        char s = evt.getKeyChar();
        if(!(Character.isDigit(s)) || s == KeyEvent.VK_BACK_SPACE || s == KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtfNoScoopsKeyTyped

    //KeyTyped Event for Sundae Number
    //only numbers can be taken as an input
    //anything rather numbers will be typed than a sound like beep will be produced
    private void txtfChangeSundaeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfChangeSundaeKeyTyped
        char v = evt.getKeyChar();
        if(!(Character.isDigit(v)) || v == KeyEvent.VK_BACK_SPACE || v == KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtfChangeSundaeKeyTyped

    //KeyTyped Event for Sundae Number
    //only numbers can be taken as an input
    //anything rather numbers will be typed than a sound like beep will be produced
    private void txtfModifyScoopsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfModifyScoopsKeyTyped
        char m = evt.getKeyChar();
        if(!(Character.isDigit(m)) || m == KeyEvent.VK_BACK_SPACE || m == KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtfModifyScoopsKeyTyped

    private void lblQuestionIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuestionIconMouseEntered
        lblHelpAndInfo.setVisible(true);
    }//GEN-LAST:event_lblQuestionIconMouseEntered

    private void lblQuestionIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuestionIconMouseExited
        lblHelpAndInfo.setVisible(false);
    }//GEN-LAST:event_lblQuestionIconMouseExited

    private void lblQuestionIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuestionIconMouseClicked
        new HelpandInfo().setVisible(true);
    }//GEN-LAST:event_lblQuestionIconMouseClicked

    private void txtaReceiptKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaReceiptKeyTyped
        char m = evt.getKeyChar();
        if(m == KeyEvent.VK_BACK_SPACE || m == KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
        getToolkit().beep();
        evt.consume();
    }//GEN-LAST:event_txtaReceiptKeyTyped

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnChangeOrder;
    private javax.swing.JButton btnListSundaes;
    private javax.swing.JButton btnModifySundae;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnVerifySundae;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> combModifyPremiumFlavour;
    private javax.swing.JComboBox<String> combModifyRegularFlavour;
    private javax.swing.JComboBox<String> combPremiumFlavour;
    private javax.swing.JComboBox<String> combRegularFlavour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDisplaySundae;
    private javax.swing.JLabel lblDisplaySundae2;
    private javax.swing.JLabel lblHelpAndInfo;
    private javax.swing.JLabel lblQuestionIcon;
    private javax.swing.JPanel pnlChangeOrder;
    private javax.swing.JPanel pnlModifyOrder;
    private javax.swing.JPanel pnlNewOrder;
    private javax.swing.JPanel pnlReceipt;
    private javax.swing.JPanel pnlTableList;
    private javax.swing.JRadioButton rbtnModifyNoNuts;
    private javax.swing.JRadioButton rbtnModifyNuts;
    private javax.swing.JRadioButton rbtnNoNuts;
    private javax.swing.JRadioButton rbtnNuts;
    private javax.swing.JScrollPane scrlpnlModifyOrder;
    private javax.swing.JTable tblList;
    private javax.swing.JTextArea txtaReceipt;
    private javax.swing.JTextField txtfChangeSundae;
    private javax.swing.JTextField txtfModifyScoops;
    private javax.swing.JTextField txtfNoScoops;
    private javax.swing.JTextField txtfSundaeNo;
    // End of variables declaration//GEN-END:variables
}
