
package main;
import dto.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mari
 */
public class InterfazAtributoAdicional extends javax.swing.JFrame {
private Controlador controlador;
    DefaultTableModel modeloTabla;
    int valorFila = 0;
    InterfazTipoImpuesto pantallaSecundaria;
    public InterfazAtributoAdicional() 
    {
        initComponents();
    }
    public InterfazAtributoAdicional(Controlador control, InterfazTipoImpuesto c) 
    {
        this.pantallaSecundaria=c;
        initComponents();
        modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Nombre");
        this.TablaAtributoAdicional.setModel(modeloTabla);
        this.controlador = control;
        List<DTOAA> listAA = controlador.ObtenerAributoAdicional();
        String []Datos = new String[2];
        for (int i = 0; i < TablaAtributoAdicional.getRowCount(); i++) {
            modeloTabla.removeRow(i);
            i-=1;
            }
        for(DTOAA dtoAA : listAA)
            {
                Datos[0]=dtoAA.getCodigo();
                Datos[1]=dtoAA.getNombre();
                modeloTabla.addRow(Datos);        
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaAtributoAdicional = new javax.swing.JTable();
        BotonAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TextoOrden = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("Atributo Adicional");
        jInternalFrame1.setVisible(true);

        TablaAtributoAdicional.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaAtributoAdicional.setEditingColumn(0);
        TablaAtributoAdicional.setEditingRow(0);
        jScrollPane4.setViewportView(TablaAtributoAdicional);

        BotonAceptar.setText("Aceptar");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese Orden");

        jLabel2.setText("Seleccione Atributo Adicional e ingrese orden correspondiente.");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(TextoOrden)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAceptar)
                        .addGap(219, 219, 219))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(88, Short.MAX_VALUE))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAceptar)
                    .addComponent(jLabel1)
                    .addComponent(TextoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    
    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        DTOAA dtoAce = null;
        int filaSeleccionada= TablaAtributoAdicional.getSelectedRow();
        if(filaSeleccionada>=0)
        {
            DTOAA dtoAceptado = new DTOAA(); 
            dtoAceptado.setCodigo(modeloTabla.getValueAt(filaSeleccionada, 0).toString());
            dtoAceptado.setNombre(modeloTabla.getValueAt(filaSeleccionada, 1).toString());
            dtoAceptado.setOrden(Integer.parseInt(TextoOrden.getText()));
            modeloTabla.removeRow(filaSeleccionada);
            dtoAce = dtoAceptado;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Tabla vacia o no se selecciono ninguna fila.");
        }
        pantallaSecundaria.ConfirmarAtributoAdicional(dtoAce, valorFila);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazAtributoAdicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAtributoAdicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAtributoAdicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAtributoAdicional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAtributoAdicional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JTable TablaAtributoAdicional;
    private javax.swing.JTextField TextoOrden;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
