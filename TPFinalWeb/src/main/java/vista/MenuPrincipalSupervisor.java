package vista;

public class MenuPrincipalSupervisor extends javax.swing.JPanel {

    private FramePrincipal principal;
    private String menuPrincipal = "Supervisor";
    
    public MenuPrincipalSupervisor(FramePrincipal principal) {
        initComponents();
        this.principal= principal;
    }
    
    public MenuPrincipalSupervisor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenuPrincipalSupervisor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonRegistrarReclamo = new javax.swing.JButton();
        BotonFinalizarReclamo = new javax.swing.JButton();
        BotonTransferirReclamo = new javax.swing.JButton();
        BotonConsultarHistorialReclamosCliente = new javax.swing.JButton();
        BotonConsultarReclamosPendientes = new javax.swing.JButton();
        ConsultarReclamosRealizados = new javax.swing.JButton();

        PanelMenuPrincipalSupervisor.setBackground(new java.awt.Color(204, 204, 204));

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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Menú Principal");

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

        BotonConsultarHistorialReclamosCliente.setBackground(new java.awt.Color(102, 102, 102));
        BotonConsultarHistorialReclamosCliente.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonConsultarHistorialReclamosCliente.setForeground(new java.awt.Color(51, 51, 51));
        BotonConsultarHistorialReclamosCliente.setText("Consultar sobre historial reclamos de clientes");
        BotonConsultarHistorialReclamosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarHistorialReclamosClienteActionPerformed(evt);
            }
        });

        BotonConsultarReclamosPendientes.setBackground(new java.awt.Color(102, 102, 102));
        BotonConsultarReclamosPendientes.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BotonConsultarReclamosPendientes.setForeground(new java.awt.Color(51, 51, 51));
        BotonConsultarReclamosPendientes.setText("Consultar sobre reclamos pendientes");
        BotonConsultarReclamosPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarReclamosPendientesActionPerformed(evt);
            }
        });

        ConsultarReclamosRealizados.setBackground(new java.awt.Color(102, 102, 102));
        ConsultarReclamosRealizados.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        ConsultarReclamosRealizados.setForeground(new java.awt.Color(51, 51, 51));
        ConsultarReclamosRealizados.setText("Consultar sobre reclamos realizados");
        ConsultarReclamosRealizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarReclamosRealizadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuPrincipalSupervisorLayout = new javax.swing.GroupLayout(PanelMenuPrincipalSupervisor);
        PanelMenuPrincipalSupervisor.setLayout(PanelMenuPrincipalSupervisorLayout);
        PanelMenuPrincipalSupervisorLayout.setHorizontalGroup(
            PanelMenuPrincipalSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelMenuPrincipalSupervisorLayout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuPrincipalSupervisorLayout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addGroup(PanelMenuPrincipalSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonRegistrarReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonFinalizarReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTransferirReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConsultarHistorialReclamosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConsultarReclamosPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarReclamosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(231, 231, 231))
        );
        PanelMenuPrincipalSupervisorLayout.setVerticalGroup(
            PanelMenuPrincipalSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuPrincipalSupervisorLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonRegistrarReclamo)
                .addGap(29, 29, 29)
                .addComponent(BotonFinalizarReclamo)
                .addGap(32, 32, 32)
                .addComponent(BotonTransferirReclamo)
                .addGap(34, 34, 34)
                .addComponent(BotonConsultarHistorialReclamosCliente)
                .addGap(32, 32, 32)
                .addComponent(BotonConsultarReclamosPendientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(ConsultarReclamosRealizados)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuPrincipalSupervisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuPrincipalSupervisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void BotonConsultarHistorialReclamosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarHistorialReclamosClienteActionPerformed
        this.principal.ConsultaReclamoCliente(menuPrincipal);
    }//GEN-LAST:event_BotonConsultarHistorialReclamosClienteActionPerformed

    private void BotonConsultarReclamosPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarReclamosPendientesActionPerformed
        this.principal.ConsultaReclamoCliente(menuPrincipal);
    }//GEN-LAST:event_BotonConsultarReclamosPendientesActionPerformed

    private void ConsultarReclamosRealizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarReclamosRealizadosActionPerformed
        this.principal.ConsultaReclamoCliente(menuPrincipal);
    }//GEN-LAST:event_ConsultarReclamosRealizadosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultarHistorialReclamosCliente;
    private javax.swing.JButton BotonConsultarReclamosPendientes;
    private javax.swing.JButton BotonFinalizarReclamo;
    private javax.swing.JButton BotonRegistrarReclamo;
    private javax.swing.JButton BotonTransferirReclamo;
    private javax.swing.JButton ConsultarReclamosRealizados;
    private javax.swing.JPanel PanelMenuPrincipalSupervisor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
