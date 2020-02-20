package vista;

import controlador.ControlSistema;
import exception.Notificaciones;
import javax.swing.JOptionPane;

public class FinalizacionReclamo extends javax.swing.JPanel {

    private ControlSistema controlSistema;
    private FramePrincipal vPrincipal;
    private String tipoMenu;
    private int numeroReclamo;
    
    public FinalizacionReclamo(ControlSistema controlSistema, FramePrincipal vPrincipal, String tipoMenu) {
        this.controlSistema= controlSistema;
        this.vPrincipal= vPrincipal;
        this.tipoMenu= tipoMenu;
        initComponents();
        BotonAceptar.setVisible(false);
        jLabelDescripcion.setVisible(false);
        jLabelEstado.setVisible(false);
        jTextArea1.setVisible(false);
        jTextEstado.setVisible(false);
        jScrollPane1.setVisible(false);
        this.vPrincipal.pack();
    }
    
    public FinalizacionReclamo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAsignacionReclamo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelNumReclamo = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        TextoNumeroReclamo = new javax.swing.JTextField();
        BotonCancelar = new javax.swing.JButton();
        BotonAceptar = new javax.swing.JButton();
        jTextEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botonBuscarReclamo = new javax.swing.JButton();

        PanelAsignacionReclamo.setBackground(new java.awt.Color(204, 204, 204));

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

        jLabelTitulo.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTitulo.setText("Finalizar un reclamo");

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabelNumReclamo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelNumReclamo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNumReclamo.setText("Número reclamo:");

        jLabelEstado.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(51, 51, 51));
        jLabelEstado.setText("Estado:");

        jLabelDescripcion.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDescripcion.setText("Descripción:");

        TextoNumeroReclamo.setBackground(new java.awt.Color(153, 153, 153));
        TextoNumeroReclamo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

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

        jTextEstado.setEditable(false);
        jTextEstado.setBackground(new java.awt.Color(153, 153, 153));
        jTextEstado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextEstado.setText("Finalizado");

        jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        botonBuscarReclamo.setBackground(new java.awt.Color(102, 102, 102));
        botonBuscarReclamo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        botonBuscarReclamo.setForeground(new java.awt.Color(51, 51, 51));
        botonBuscarReclamo.setText("Buscar Reclamo");
        botonBuscarReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarReclamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAsignacionReclamoLayout = new javax.swing.GroupLayout(PanelAsignacionReclamo);
        PanelAsignacionReclamo.setLayout(PanelAsignacionReclamoLayout);
        PanelAsignacionReclamoLayout.setHorizontalGroup(
            PanelAsignacionReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelAsignacionReclamoLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAsignacionReclamoLayout.createSequentialGroup()
                .addGap(0, 179, Short.MAX_VALUE)
                .addGroup(PanelAsignacionReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAsignacionReclamoLayout.createSequentialGroup()
                        .addComponent(jLabelNumReclamo)
                        .addGap(37, 37, 37)
                        .addComponent(TextoNumeroReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(botonBuscarReclamo))
                    .addGroup(PanelAsignacionReclamoLayout.createSequentialGroup()
                        .addGroup(PanelAsignacionReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEstado)
                            .addComponent(jLabelDescripcion))
                        .addGap(77, 77, 77)
                        .addGroup(PanelAsignacionReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelAsignacionReclamoLayout.createSequentialGroup()
                                .addComponent(BotonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonAceptar))
                            .addComponent(jTextEstado)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(140, 140, 140))
        );
        PanelAsignacionReclamoLayout.setVerticalGroup(
            PanelAsignacionReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAsignacionReclamoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(PanelAsignacionReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumReclamo)
                    .addComponent(TextoNumeroReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarReclamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(PanelAsignacionReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAsignacionReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelAsignacionReclamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonAceptar))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAsignacionReclamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAsignacionReclamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarReclamoActionPerformed
        try{
            numeroReclamo= Integer.parseInt(TextoNumeroReclamo.getText());
            controlSistema.vistaExisteReclamo(numeroReclamo);
            botonBuscarReclamo.setVisible(false);
            BotonAceptar.setVisible(true);
            jLabelDescripcion.setVisible(true);
            jLabelEstado.setVisible(true);
            jTextArea1.setVisible(true);
            jTextEstado.setVisible(true);
            jScrollPane1.setVisible(true);
            vPrincipal.pack();
        }catch(NumberFormatException badnumber){
            JOptionPane.showMessageDialog(this, "Por favor ingrese un número."); 
        }catch(Notificaciones ex){
            JOptionPane.showMessageDialog(this, ex.getMessage()); 
        }
    }//GEN-LAST:event_botonBuscarReclamoActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        if(tipoMenu.equalsIgnoreCase("Supervisor")){
            this.vPrincipal.atrasFinalizarSupervisor();
        }else{
            this.vPrincipal.atrasFinalizarEmpleado();
        }
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        String descripcion= jTextArea1.getText();
        try{
            controlSistema.finalizarReclamo(numeroReclamo, descripcion);
        }catch(Notificaciones ex){
            JOptionPane.showMessageDialog(this, ex.getMessage()); 
        }
    }//GEN-LAST:event_BotonAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JPanel PanelAsignacionReclamo;
    private javax.swing.JTextField TextoNumeroReclamo;
    private javax.swing.JButton botonBuscarReclamo;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNumReclamo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextEstado;
    // End of variables declaration//GEN-END:variables
}
