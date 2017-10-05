
package main;
import dto.*;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class InterfazABM extends javax.swing.JFrame {
    DefaultTableModel modeloTabla;
    private Controlador controlador;
    private List<String> listCombox;
            
    
    public InterfazABM(Controlador controlador) {
        initComponents();
        modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Habilitado");
        this.TablaTipoImpuesto.setModel(modeloTabla);
        this.controlador = controlador;
        
       /* 
        List<DTOTipoImpuesto> dtoList = controlador.BuscarTipoImpuesto(a, b);
        actualizarComboTipoImpuesto(dtoList);*/
    }
    
    private DefaultListModel modelList(List<String> listaString)
        {
            DefaultListModel<String> model = new DefaultListModel<>();
        
            for(String string : listaString)
                {
                model.addElement(string);
                //modelList();
                }
            return model;
        }
    
    private void actualizarComboTipoImpuesto(List<DTOTipoImpuesto> dtoList)
        {
            
        }
    
    public InterfazABM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ABMTipoImpuesto = new javax.swing.JInternalFrame();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CheckHabilitado = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BotonBuscar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaTipoImpuesto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frames0"); // NOI18N

        ABMTipoImpuesto.setResizable(true);
        ABMTipoImpuesto.setTitle("ABMTipoImpuesto");
        ABMTipoImpuesto.setVisible(true);

        BotonModificar.setText("Modificar");
        BotonModificar.setToolTipText("");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Filtro");

        CheckHabilitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckHabilitadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Por Nombre:");

        jLabel3.setText("Habilitado:");

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        TablaTipoImpuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaTipoImpuesto);

        javax.swing.GroupLayout ABMTipoImpuestoLayout = new javax.swing.GroupLayout(ABMTipoImpuesto.getContentPane());
        ABMTipoImpuesto.getContentPane().setLayout(ABMTipoImpuestoLayout);
        ABMTipoImpuestoLayout.setHorizontalGroup(
            ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckHabilitado)
                            .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                                .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(BotonBuscar))))
                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        ABMTipoImpuestoLayout.setVerticalGroup(
            ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(BotonBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABMTipoImpuestoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckHabilitado)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                        .addComponent(BotonModificar)
                        .addGap(47, 47, 47)
                        .addComponent(BotonEliminar)
                        .addGap(51, 51, 51)
                        .addComponent(BotonAgregar))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ABMTipoImpuesto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ABMTipoImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        String a = TextoNombre.getText();
        Boolean b = CheckHabilitado.isSelected();
        String []Datos = new String[3];
        List<DTOTipoImpuesto> dtoList = controlador.BuscarTipoImpuesto(a,b);
        for (int i = 0; i < TablaTipoImpuesto.getRowCount(); i++) 
        {
            modeloTabla.removeRow(i);
            i-=1;
        }
        for(DTOTipoImpuesto dtotipo : dtoList)
        {
            Datos[0]=dtotipo.getCodigoDTOTipoImpuesto();
            Datos[1]=dtotipo.getNombreDTOTipoImpuesto();
            Datos[2]=dtotipo.getFecha();
            modeloTabla.addRow(Datos);
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void CheckHabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckHabilitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckHabilitadoActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        InterfazTipoImpuesto nuevaInterfaz3 = new InterfazTipoImpuesto(controlador, this);
        nuevaInterfaz3.setVisible(true);
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        int filaSeleccionada= TablaTipoImpuesto.getSelectedRow();
        if(filaSeleccionada>=0 && TablaTipoImpuesto.getValueAt(filaSeleccionada, 2).toString() == "SI"){
            String []Dato = new String[3];
            DTOImpuestoSeleccionado DTOEliminado = new DTOImpuestoSeleccionado();
            DTOEliminado.setCodigo(modeloTabla.getValueAt(filaSeleccionada, 0).toString());
            DTOEliminado.setNombre(modeloTabla.getValueAt(filaSeleccionada, 1).toString());
            modeloTabla.removeRow(filaSeleccionada);
            this.controlador.EliminarTipoImpuesto(DTOEliminado);
            String a = TextoNombre.getText();
            Boolean b = CheckHabilitado.isSelected();
            String []Datos = new String[3];

            List<DTOTipoImpuesto> dtoList = controlador.BuscarTipoImpuesto(a,b);

            for (int i = 0; i < TablaTipoImpuesto.getRowCount(); i++) {
                modeloTabla.removeRow(i);
                i-=1;
            }

            for(DTOTipoImpuesto dtotipo : dtoList)
                {
                Datos[0]=dtotipo.getCodigoDTOTipoImpuesto();
                Datos[1]=dtotipo.getNombreDTOTipoImpuesto();
                Datos[2]=dtotipo.getFecha();
                modeloTabla.addRow(Datos);
            }
        }
        else{ JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun Tipo Impuesto o el seleccionado esta ya Inhabilitado.");
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        int fila = TablaTipoImpuesto.getSelectedRow();
        if (fila>0)
        {DTOImpuestoSeleccionado dtoIS = new DTOImpuestoSeleccionado();
        dtoIS.setCodigo(modeloTabla.getValueAt(fila, 0).toString());
        dtoIS.setNombre(modeloTabla.getValueAt(fila, 1).toString());
        
        InterfazTipoImpuesto newInterfaz = new InterfazTipoImpuesto(controlador, this, dtoIS);
        newInterfaz.setVisible(true);
        }
        else { JOptionPane.showMessageDialog(null, "No ha seleccionado ningun Tipo Impuesto para modificar.");}
    }//GEN-LAST:event_BotonModificarActionPerformed

    private boolean findInString(String word, String text)
    {
        return text.indexOf(word) > -1;
    }    
    public void GuardarTipoImpuestoAA(DTOEstructuraTipoImpuesto dtoEstructura, boolean Agregar)
    {
        controlador.GuardarTipoImpuestoAA(dtoEstructura, Agregar);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new InterfazABM().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame ABMTipoImpuesto;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JCheckBox CheckHabilitado;
    private javax.swing.JTable TablaTipoImpuesto;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    
    public Controlador getControlador() {
        return controlador;
    }

    
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
}
