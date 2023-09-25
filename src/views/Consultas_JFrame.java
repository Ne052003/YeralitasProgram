package views;

import controllers.QueryController;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JTable;

import resources.Colors;
import resources.GeneralMethods;
import resources.QueryFrameProperties;

//Products
public class Consultas_JFrame extends javax.swing.JFrame {

    public Consultas_JFrame(QueryController controller, QueryFrameProperties frameProperties) {
        this.frameProperties = frameProperties;
        this.controller = controller.setVistaConsulta(this);
        initComponents();
        this.setLocationRelativeTo(null);
        if (GeneralMethods.getRole() == 'G') {
            cmbxQuery.addItem("Manufactures");
            cmbxQuery.addItem("Employees");

        } else if (GeneralMethods.getRole() == 'A') {
            cmbxQuery.addItem("Manufactures");
            cmbxQuery.addItem("Employees");
            cmbxQuery.addItem("Gerents");
            cmbxQuery.addItem("Areas");

        }
        controller.traerTodo();
        btnBuscar.addActionListener(controller);
    }

    @Override
    public Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Logox800.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel bigPanel = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        javax.swing.JButton btnMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JLabel lblFilter = new javax.swing.JLabel();
        javax.swing.JLabel lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cmbxFilter = new javax.swing.JComboBox<>(frameProperties.getCmbxFilterString());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(frameProperties.getTitle());
        setIconImage(getIconImage());
        setResizable(false);

        bigPanel.setBackground(Colors.FONDO);

        lblHeader.setBackground(Colors.FONDO);
        lblHeader.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lblHeader.setForeground(Colors.LETRAFONDO);
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("<html>" + frameProperties.getHeader() + "<hr/></html>");

        btnMenu.setBackground(Colors.FONDOBOTONES);
        btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMenu.setForeground(Colors.LETRABOTONES);
        btnMenu.setText("Menu");
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        table = new javax.swing.JTable() {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex
            ) {
                return false;
            }
        };
        table.setColumnSelectionAllowed(true);
        table.setRowHeight(22);
        table.setSelectionBackground(Colors.FONDOBOTONES);
        table.setSelectionForeground(Colors.LETRABOTONES);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        lblFilter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFilter.setForeground(Colors.LETRAFONDO);
        lblFilter.setText("Filter by:");

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblData.setForeground(Colors.LETRAFONDO);
        lblData.setText("Data:");

        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_datoKeyPressed(evt);
            }
        });

        btnBuscar.setBackground(Colors.FONDOBOTONES);
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(Colors.LETRABOTONES);
        btnBuscar.setText("Search");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cmbxQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_consultaActionPerformed(evt);
            }
        });

        actionPanel = new ActionsPanel(this);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(bigPanel);
        bigPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnMenu)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnBuscar))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(78, 78, 78)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cmbxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 543, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(601, 601, 601)
                                                                .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                                                .addComponent(cmbxQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25))
                        .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnMenu)
                                                        .addComponent(cmbxQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmbxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblFilter))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblData)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnBuscar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bigPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bigPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_datoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_datoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_txt_datoKeyPressed

    private void btn_menuActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menu_JFrame.getMenu().setVisible(true);
        this.dispose();
    } // GEN-LAST:event_jButton1ActionPerformed

    private void combox_consultaActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_combox_consultaActionPerformed
        int registro = cmbxQuery.getSelectedIndex();
        if (cmbxQuery.getSelectedIndex() != 0 && seleccionado != registro) {
            seleccionado = cmbxQuery.getSelectedIndex();
            GeneralMethods.openQueryFrame(seleccionado);
            this.dispose();
        }
    }

    public void setTable(JTable table) {
        table.setColumnSelectionAllowed(true);
        table.setRowHeight(22);
        table.setSelectionBackground(Colors.FONDOBOTONES);
        table.setSelectionForeground(Colors.LETRABOTONES);
        table.getTableHeader().setReorderingAllowed(false);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        table.setModel(this.table.getModel());
        this.table = table;
        this.table.setModel(table.getModel());
        jScrollPane1.setViewportView(this.table);
    }

    public JTable getNotEditableTable() {
        return new javax.swing.JTable() {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex
            ) {
                return false;
            }
        };
    }

    // Variables declaration - do not modify  
    private int seleccionado;
    public QueryController controller;
    public QueryFrameProperties frameProperties;
    public ActionsPanel actionPanel;
    public String[] cmbxQueryStrings = {"--Select--", "Inventory", "Sales", "Clients"};
    public javax.swing.JComboBox<String> cmbxQuery = new javax.swing.JComboBox<>(cmbxQueryStrings);
    public javax.swing.JTable table;
    public javax.swing.JComboBox<String> cmbxFilter;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JLabel lblHeader;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtData;
    // End of variables declaration                   
}
