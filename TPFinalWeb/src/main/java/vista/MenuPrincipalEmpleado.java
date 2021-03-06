package vista;


public class MenuPrincipalEmpleado extends javax.swing.JPanel {

    private FramePrincipal principal;
    private String menuPrincipal = "Empleado";
    
    public MenuPrincipalEmpleado(FramePrincipal principal){
        initComponents();
        this.principal= principal;
    }
    
    public MenuPrincipalEmpleado(){
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenuPrincipalEmpleado = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BotonRegistrarReclamo = new javax.swing.JButton();
        BotonFinalizarReclamo = new javax.swing.JButton();
        BotonTransferirReclamo = new javax.swing.JButton();
        BotonConsultarHistorialReclamosDeClientes = new javax.swing.JButton();

        PanelMenuPrincipalEmpleado.setBackground(new java.awt.Color(204, 204, 204));

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

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Menú Principal");

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

        BotonRegistrarReclamo.setBackground(new java.awt.Color(102, 102, 102));
        BotonRegistrarReclamo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonRegistrarReclamo.setForeground(new java.awt.Color(51, 51, 51));
        BotonRegistrarReclamo.setText("Registrar un reclamo");
        BotonRegistrarReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarReclamoActionPerformed(evt);
            }
        });

        BotonFinalizarReclamo.setBackground(new java.awt.Color(102, 102, 102));
        BotonFinalizarReclamo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonFinalizarReclamo.setForeground(new java.awt.Color(51, 51, 51));
        BotonFinalizarReclamo.setText("Finalizar un reclamo");
        BotonFinalizarReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalizarReclamoActionPerformed(evt);
            }
        });

        BotonTransferirReclamo.setBackground(new java.awt.Color(102, 102, 102));
        BotonTransferirReclamo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonTransferirReclamo.setForeground(new java.awt.Color(51, 51, 51));
        BotonTransferirReclamo.setText("Transferir un reclamo");
        BotonTransferirReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTransferirReclamoActionPerformed(evt);
            }
        });

        BotonConsultarHistorialReclamosDeClientes.setBackground(new java.awt.Color(102, 102, 102));
        BotonConsultarHistorialReclamosDeClientes.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonConsultarHistorialReclamosDeClientes.setForeground(new java.awt.Color(51, 51, 51));
        BotonConsultarHistorialReclamosDeClientes.setText("Consultar sobre historial reclamos de clientes");
        BotonConsultarHistorialReclamosDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarHistorialReclamosDeClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuPrincipalEmpleadoLayout = new javax.swing.GroupLayout(PanelMenuPrincipalEmpleado);
        PanelMenuPrincipalEmpleado.setLayout(PanelMenuPrincipalEmpleadoLayout);
        PanelMenuPrincipalEmpleadoLayout.setHorizontalGroup(
            PanelMenuPrincipalEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelMenuPrincipalEmpleadoLayout.createSequentialGroup()
                .addGroup(PanelMenuPrincipalEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuPrincipalEmpleadoLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel1))
                    .addGroup(PanelMenuPrincipalEmpleadoLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(BotonRegistrarReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMenuPrincipalEmpleadoLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(BotonFinalizarReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMenuPrincipalEmpleadoLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(BotonTransferirReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMenuPrincipalEmpleadoLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(BotonConsultarHistorialReclamosDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        PanelMenuPrincipalEmpleadoLayout.setVerticalGroup(
            PanelMenuPrincipalEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuPrincipalEmpleadoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(BotonRegistrarReclamo)
                .addGap(49, 49, 49)
                .addComponent(BotonFinalizarReclamo)
                .addGap(51, 51, 51)
                .addComponent(BotonTransferirReclamo)
                .addGap(51, 51, 51)
                .addComponent(BotonConsultarHistorialReclamosDeClientes)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuPrincipalEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuPrincipalEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarReclamoActionPerformed
        this.principal.registroReclamo(menuPrincipal);
    }//GEN-LAST:event_BotonRegistrarReclamoActionPerformed

    private void BotonTransferirReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTransferirReclamoActionPerformed
        this.principal.transferenciaReclamo(menuPrincipal);
    }//GEN-LAST:event_BotonTransferirReclamoActionPerformed
    private void BotonFinalizarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinalizarReclamoActionPerformed
        this.principal.finalizarReclamo(menuPrincipal);
    }//GEN-LAST:event_BotonFinalizarReclamoActionPerformed

    private void BotonConsultarHistorialReclamosDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarHistorialReclamosDeClientesActionPerformed
        this.principal.ConsultaReclamoCliente(menuPrincipal);
    }//GEN-LAST:event_BotonConsultarHistorialReclamosDeClientesActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultarHistorialReclamosDeClientes;
    private javax.swing.JButton BotonFinalizarReclamo;
    private javax.swing.JButton BotonRegistrarReclamo;
    private javax.swing.JButton BotonTransferirReclamo;
    private javax.swing.JPanel PanelMenuPrincipalEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
