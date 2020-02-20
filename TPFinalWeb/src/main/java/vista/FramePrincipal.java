package vista;

import controlador.ControlSistema;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class FramePrincipal extends javax.swing.JFrame {

    private ControlSistema controlSistema;
    private MenuPrincipalSupervisor menuPrincipalSupervisor;
    private MenuPrincipalEmpleado menuPrincipalEmpleado;
    private RegistroReclamo vNuevoReclamo;
    private FinalizacionReclamo vFinalizarReclamo;
    private TransferenciaReclamo vTransferenciaReclamo;
    private ConsultaReclamoCliente vConsultaReclamo;
    
    public FramePrincipal(ControlSistema controlSistema) {
        initComponents();
        this.controlSistema= controlSistema;
        this.setLayout(new FlowLayout());
        this.pack();
    }
    
    public FramePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 915, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }
    
    public void finalizarReclamo(String menuPrincipal){
        this.vFinalizarReclamo= new FinalizacionReclamo(controlSistema,this, menuPrincipal);
        if(menuPrincipal.equalsIgnoreCase("Supervisor")){
            this.remove(menuPrincipalSupervisor);
        }else{
            this.remove(menuPrincipalEmpleado);
        }
        this.add(vFinalizarReclamo,BorderLayout.CENTER);
        this.pack();
    }
    
    
    public void crearSupervisor(){
        this.setVisible(true);
        this.menuPrincipalSupervisor= new MenuPrincipalSupervisor(this);
        this.add(menuPrincipalSupervisor,BorderLayout.CENTER);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    public void crearEmpComun(){
        this.setVisible(true);
        this.menuPrincipalEmpleado = new MenuPrincipalEmpleado(this);
        this.add(this.menuPrincipalEmpleado,BorderLayout.CENTER);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    public void registroReclamo(String menuPrincipal){
        vNuevoReclamo= new RegistroReclamo(controlSistema, this, menuPrincipal);
        if(menuPrincipal.equalsIgnoreCase("Supervisor")){
            this.remove(menuPrincipalSupervisor);
        }else{
            this.remove(menuPrincipalEmpleado);
        }
        this.add(vNuevoReclamo,BorderLayout.CENTER);
        this.pack();
    }
    
    public void transferenciaReclamo (String menuPrincipal){
        vTransferenciaReclamo = new TransferenciaReclamo(controlSistema, this, menuPrincipal);
         if(menuPrincipal.equalsIgnoreCase("Supervisor")){
            this.remove(menuPrincipalSupervisor);
        }else{
            this.remove(menuPrincipalEmpleado);
        }
        this.add(vTransferenciaReclamo,BorderLayout.CENTER);
        this.pack();
    }
    
    public void atrasTransferenciaSupervisor() {
        this.remove(vTransferenciaReclamo);
        this.add(menuPrincipalSupervisor);
        this.pack();
    }
    
     public void atrasTransferenciaEmpleado() {
        this.remove(vTransferenciaReclamo);
        this.add(menuPrincipalEmpleado);
        this.pack();
    }
    
     public void ConsultaReclamoCliente (String menuPrincipal){
        vConsultaReclamo = new ConsultaReclamoCliente(controlSistema, this, menuPrincipal);
         if(menuPrincipal.equalsIgnoreCase("Supervisor")){
            this.remove(menuPrincipalSupervisor);
        }else{
            this.remove(menuPrincipalEmpleado);
        }
        this.add(vConsultaReclamo,BorderLayout.CENTER);
        this.pack();
    }
    
     public void atrasConsultaReclamoClienteSupervisor(){
        this.remove(vConsultaReclamo);
        this.add(menuPrincipalSupervisor);
        this.pack();
     }
     
     public void atrasConsultaReclamoClienteEmpleado(){
        this.remove(vConsultaReclamo);
        this.add(menuPrincipalEmpleado);
        this.pack();
     }
     
    public void atrasReclamoSupervisor(){
        this.remove(vNuevoReclamo);
        this.add(menuPrincipalSupervisor);
        this.pack();
    }
    
    public void atrasReclamoEmpleado(){
        this.remove(vNuevoReclamo);
        this.add(menuPrincipalEmpleado);
        this.pack();
    }
    
    public void atrasFinalizarSupervisor(){
        this.remove(vFinalizarReclamo);
        this.add(menuPrincipalSupervisor);
        this.pack();
    }
    
    public void atrasFinalizarEmpleado(){
        this.remove(vFinalizarReclamo);
        this.add(menuPrincipalEmpleado);
        this.pack();
    }
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
