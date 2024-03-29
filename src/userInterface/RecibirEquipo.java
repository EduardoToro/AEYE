/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import data.Equipo;
import data.Inventario;
import data.Laboratorista;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduar
 */
public class RecibirEquipo extends javax.swing.JFrame {

    
    private void aplicarSancion(){
        int respuesta=JOptionPane.showConfirmDialog(null, "¿El equipo se encuentra en buen estado?", "Aplicar Sancion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); 
        if(respuesta==0){
               
        }else{
            for(int i=0; i<Laboratorista.estudiantes.size();i++){
                Laboratorista.estudiantes.get(i).setSancion("Si");
                JOptionPane.showMessageDialog(this, "Sancion aplicada",
                        "Aplicar Sancion", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
    DefaultTableModel modelo;
    String buscarTexto;
  
    public void mostrarDatos() {
        String calamar="Prestado";
        int i=0;
        
        
        String[] titulos = {"EQUIPO", "MARCA", "CÓDIGO", "ESTADO", "DISPONIBILIDAD"};
        String[] registro = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        while(i<Inventario.equipos.size()){
        for (Equipo ft : Inventario.equipos) {
            if(calamar.equals(Inventario.equipos.get(i).getDisposicion())){
            registro[0] = ft.getEquipo();
            registro[1] = ft.getMarca();
            registro[2] = ft.getCodigo();
            registro[3] = ft.getEstado();
            registro[4] = ft.getDisposicion();
            modelo.addRow(registro);
            }
        }
        
       i++;
    }
        this.tblDatosEquipos.setModel(modelo);
    }
    /**
     * Creates new form ListaEquipos
     */
    public RecibirEquipo() {
        initComponents();
        mostrarDatos();
        //aplicarSancion();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("../imagen/Buho.png")).getImage());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosEquipos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        txtDevolver = new javax.swing.JTextField();
        btnPrestar = new javax.swing.JButton();
        btnSancion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Almacén De Equipos Eléctricos Y Electrónicos");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recibir Equipos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 18))); // NOI18N

        tblDatosEquipos.setBackground(new java.awt.Color(255, 0, 0));
        tblDatosEquipos.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        tblDatosEquipos.setForeground(new java.awt.Color(255, 255, 255));
        tblDatosEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDatosEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosEquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatosEquipos);

        txtBuscar.setBackground(new java.awt.Color(153, 153, 153));
        txtBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 153, 0)));

        btnBuscar.setBackground(new java.awt.Color(255, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lupa-herramienta.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Equipo");

        btnRegresar.setBackground(new java.awt.Color(255, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtDevolver.setBackground(new java.awt.Color(102, 102, 102));
        txtDevolver.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtDevolver.setForeground(new java.awt.Color(255, 255, 255));
        txtDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDevolverActionPerformed(evt);
            }
        });

        btnPrestar.setBackground(new java.awt.Color(255, 0, 0));
        btnPrestar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnPrestar.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestar.setText("Recibir");
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });

        btnSancion.setBackground(new java.awt.Color(255, 0, 0));
        btnSancion.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnSancion.setForeground(new java.awt.Color(255, 255, 255));
        btnSancion.setText("Sancion");
        btnSancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSancionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSancion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(89, 89, 89))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscar))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSancion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuLaboratorista ml = new MenuLaboratorista();
        ml.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDevolverActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDevolverActionPerformed

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed
         
         int k = 0;
        String prestar = txtDevolver.getText();
        for (int i = 0; i < Inventario.equipos.size(); i++) {
            if (prestar.equals(Inventario.equipos.get(i).getCodigo())) {
                Inventario.equipos.get(i).setDisposicion("Disponible");
                k = i+5;
                JOptionPane.showMessageDialog(this, "Equipo recibido",
                     "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
       
        if (k == 0) {
            JOptionPane.showMessageDialog(this, "El equipo no existe",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
         RecibirEquipo ventanaI = new RecibirEquipo();
                ventanaI.setVisible(true);
                dispose();
    }//GEN-LAST:event_btnPrestarActionPerformed

    private void tblDatosEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosEquiposMouseClicked
        // TODO add your handling code here:
        int seleccion=tblDatosEquipos.rowAtPoint(evt.getPoint());
        txtDevolver.setText(String.valueOf(tblDatosEquipos.getValueAt(seleccion,2)));
    }//GEN-LAST:event_tblDatosEquiposMouseClicked

    private void btnSancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSancionActionPerformed
       //aplicarSancion();
    }//GEN-LAST:event_btnSancionActionPerformed

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
            java.util.logging.Logger.getLogger(RecibirEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecibirEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecibirEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecibirEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecibirEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSancion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatosEquipos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDevolver;
    // End of variables declaration//GEN-END:variables
}
