package vista;

import controlador.ControlSistema;
import exception.Notificaciones;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegistroReclamo extends javax.swing.JPanel {

    private ControlSistema controlSistema;
    private FramePrincipal vPrincipal;
    private String tipoMenu;
    private int dni;
    
    public RegistroReclamo(ControlSistema controlSistema, FramePrincipal vPrincipal, String tipoMenu) {
        this.controlSistema = controlSistema;
        this.vPrincipal= vPrincipal;
        this.tipoMenu= tipoMenu;
        initComponents();
        BotonAceptar.setVisible(false);
        ComboClasificación.setVisible(false);
        ComboServicio.setVisible(false);
        ComboTipoReclamo.setVisible(false);
        TextoDescripcion.setVisible(false);
        TextoEstado.setVisible(false);
        jLabel6TipoReclamo.setVisible(false);
        jLabelClasificacion.setVisible(false);
        jLabelDescripcion.setVisible(false);
        jLabelEstado.setVisible(false);
        jLabelServicio.setVisible(false);
        this.vPrincipal.revalidate();
        this.vPrincipal.repaint();
        this.vPrincipal.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegistroReclamo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNumeroCliente = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelServicio = new javax.swing.JLabel();
        jLabel6TipoReclamo = new javax.swing.JLabel();
        jLabelClasificacion = new javax.swing.JLabel();
        TextoNumeroCliente = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        ComboServicio = new javax.swing.JComboBox<>();
        ComboTipoReclamo = new javax.swing.JComboBox<>();
        ComboClasificación = new javax.swing.JComboBox<>();
        TextoEstado = new javax.swing.JTextField();
        BotonCancelar = new javax.swing.JButton();
        BotonAceptar = new javax.swing.JButton();
        jLabelDescripcion = new javax.swing.JLabel();
        TextoDescripcion = new javax.swing.JTextField();

        PanelRegistroReclamo.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registrar un reclamo");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabelNumeroCliente.setBackground(new java.awt.Color(204, 204, 204));
        jLabelNumeroCliente.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelNumeroCliente.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNumeroCliente.setText("Dni cliente:");

        jLabelEstado.setBackground(new java.awt.Color(204, 204, 204));
        jLabelEstado.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(51, 51, 51));
        jLabelEstado.setText("Estado:");

        jLabelServicio.setBackground(new java.awt.Color(204, 204, 204));
        jLabelServicio.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelServicio.setForeground(new java.awt.Color(51, 51, 51));
        jLabelServicio.setText("Servicio:");

        jLabel6TipoReclamo.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6TipoReclamo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6TipoReclamo.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6TipoReclamo.setText("Tipo reclamo:");

        jLabelClasificacion.setBackground(new java.awt.Color(204, 204, 204));
        jLabelClasificacion.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelClasificacion.setForeground(new java.awt.Color(51, 51, 51));
        jLabelClasificacion.setText("Clasificación:");

        TextoNumeroCliente.setBackground(new java.awt.Color(153, 153, 153));
        TextoNumeroCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        BotonBuscar.setBackground(new java.awt.Color(102, 102, 102));
        BotonBuscar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonBuscar.setForeground(new java.awt.Color(51, 51, 51));
        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        ComboServicio.setBackground(new java.awt.Color(153, 153, 153));
        ComboServicio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ComboServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));

        ComboTipoReclamo.setBackground(new java.awt.Color(153, 153, 153));
        ComboTipoReclamo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ComboTipoReclamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));

        ComboClasificación.setBackground(new java.awt.Color(153, 153, 153));
        ComboClasificación.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ComboClasificación.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Crítico", "Urgente" }));

        TextoEstado.setEditable(false);
        TextoEstado.setBackground(new java.awt.Color(153, 153, 153));
        TextoEstado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TextoEstado.setText("Alta");

        BotonCancelar.setBackground(new java.awt.Color(102, 102, 102));
        BotonCancelar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonCancelar.setForeground(new java.awt.Color(51, 51, 51));
        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonAceptar.setBackground(new java.awt.Color(102, 102, 102));
        BotonAceptar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonAceptar.setForeground(new java.awt.Color(51, 51, 51));
        BotonAceptar.setText("Aceptar");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        jLabelDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        jLabelDescripcion.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDescripcion.setText("Descripción:");

        TextoDescripcion.setBackground(new java.awt.Color(153, 153, 153));
        TextoDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelRegistroReclamoLayout = new javax.swing.GroupLayout(PanelRegistroReclamo);
        PanelRegistroReclamo.setLayout(PanelRegistroReclamoLayout);
        PanelRegistroReclamoLayout.setHorizontalGroup(
            PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNumeroCliente)
                            .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelServicio)
                                .addComponent(jLabel6TipoReclamo)
                                .addComponent(jLabelClasificacion)
                                .addComponent(jLabelEstado)
                                .addComponent(jLabelDescripcion)))
                        .addGap(22, 22, 22)
                        .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboClasificación, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboTipoReclamo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                                .addComponent(ComboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(TextoNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonBuscar)
                                .addGap(30, 30, 30))))
                    .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(BotonCancelar)
                        .addGap(27, 27, 27)
                        .addComponent(BotonAceptar)))
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroReclamoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(335, 335, 335))
        );
        PanelRegistroReclamoLayout.setVerticalGroup(
            PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroReclamoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroCliente)
                    .addComponent(TextoNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar))
                .addGap(38, 38, 38)
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelServicio))
                .addGap(18, 18, 18)
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboTipoReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6TipoReclamo))
                .addGap(18, 18, 18)
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboClasificación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClasificacion))
                .addGap(18, 18, 18)
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado))
                .addGap(18, 18, 18)
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(PanelRegistroReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonAceptar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistroReclamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistroReclamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        List<String> ListaServicios;
        List<String> ListaTipoReclamo;
        
        
        try {
            dni = Integer.parseInt(TextoNumeroCliente.getText());
            ListaServicios = controlSistema.getListaServicios(dni);
            for (String s: ListaServicios){
                ComboServicio.addItem(s);
            }
            ListaTipoReclamo = controlSistema.getListaTipoReclamo();
            for (String tr: ListaTipoReclamo){
                ComboTipoReclamo.addItem(tr);
            }
            BotonBuscar.setVisible(false);
            BotonAceptar.setVisible(true);
            ComboClasificación.setVisible(true);
            ComboServicio.setVisible(true);
            ComboTipoReclamo.setVisible(true);
            TextoDescripcion.setVisible(true);
            TextoEstado.setVisible(true);
            jLabel6TipoReclamo.setVisible(true);
            jLabelClasificacion.setVisible(true);
            jLabelDescripcion.setVisible(true);
            jLabelEstado.setVisible(true);
            jLabelServicio.setVisible(true);
            this.vPrincipal.revalidate();
            this.vPrincipal.repaint();
            this.vPrincipal.pack();
        }catch(NumberFormatException badnumber){
            JOptionPane.showMessageDialog(this, "Por favor ingrese un número."); 
        }catch(Notificaciones ex){
            JOptionPane.showMessageDialog(this, ex.getMessage()); 
        }   
    }//GEN-LAST:event_BotonBuscarActionPerformed
    
    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        if(tipoMenu.equalsIgnoreCase("Supervisor")){
            this.vPrincipal.atrasReclamoSupervisor();
        }else{
            this.vPrincipal.atrasReclamoEmpleado();
        }
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        if(ComboClasificación.getSelectedIndex()==0 || ComboServicio.getSelectedIndex()==0 || ComboTipoReclamo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(vPrincipal, "Por favor seleccione una opcion.");
        }else{
            String urgencia= (String) ComboClasificación.getSelectedItem();
            String servicio= (String) ComboServicio.getSelectedItem();
            String tipoReclamo= (String) ComboTipoReclamo.getSelectedItem();
            String descripcion= TextoDescripcion.getText();
            try{
                this.controlSistema.agregarReclamo(dni, servicio, descripcion, urgencia, tipoReclamo);
            }catch(Notificaciones ex){
                JOptionPane.showMessageDialog(this.vPrincipal, ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_BotonAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JComboBox<String> ComboClasificación;
    private javax.swing.JComboBox<String> ComboServicio;
    private javax.swing.JComboBox<String> ComboTipoReclamo;
    private javax.swing.JPanel PanelRegistroReclamo;
    private javax.swing.JTextField TextoDescripcion;
    private javax.swing.JTextField TextoEstado;
    private javax.swing.JTextField TextoNumeroCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6TipoReclamo;
    private javax.swing.JLabel jLabelClasificacion;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNumeroCliente;
    private javax.swing.JLabel jLabelServicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
