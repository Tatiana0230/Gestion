/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmedica.medica.tipodecita;

import gestionmedica.medica.Atencion.atencion;
import gestionmedica.medica.Unovital.Unotvital;
import gestionmedica.medica.consulta.consulta;
import gestionmedica.medica.emergencia.emergencia;
import gestionmedica.medica.medica.citamedica;
import gestionmedica.medica.odontologica.citaodontologica;
import gestionmedica.medica.prioritaria.citaprioritaria;
import gestionmedica.medica.urgencia.urgencia;

/**
 *
 * @author juan
 */
public class tipodecita extends javax.swing.JInternalFrame {

    /**
     * Creates new form tipodecita
     */
    public tipodecita() {
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

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnmedica = new javax.swing.JRadioButtonMenuItem();
        btnodontologia = new javax.swing.JMenuItem();
        btnprioritaria = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Memergencia = new javax.swing.JMenuItem();
        MUrgencia = new javax.swing.JMenuItem();
        MUrgenciN = new javax.swing.JMenuItem();
        Matencion = new javax.swing.JMenuItem();
        Mconsulta = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Accion que desea realizar\n");
        setPreferredSize(new java.awt.Dimension(1595, 619));

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1406, Short.MAX_VALUE)
        );

        jMenu2.setText("Tipo de cita");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnmedica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        btnmedica.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnmedica.setSelected(true);
        btnmedica.setText("Cita medica");
        btnmedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmedicaActionPerformed(evt);
            }
        });
        jMenu2.add(btnmedica);

        btnodontologia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        btnodontologia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnodontologia.setText("Cita odontológica");
        btnodontologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnodontologiaActionPerformed(evt);
            }
        });
        jMenu2.add(btnodontologia);

        btnprioritaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        btnprioritaria.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnprioritaria.setText("Cita prioritaria");
        btnprioritaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprioritariaActionPerformed(evt);
            }
        });
        jMenu2.add(btnprioritaria);

        jMenu1.setText("Urgencias");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Memergencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        Memergencia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Memergencia.setText("Emergencia (Triage I)");
        Memergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemergenciaActionPerformed(evt);
            }
        });
        jMenu1.add(Memergencia);

        MUrgencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        MUrgencia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MUrgencia.setText("Urgencia (Triage II)");
        MUrgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUrgenciaActionPerformed(evt);
            }
        });
        jMenu1.add(MUrgencia);

        MUrgenciN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        MUrgenciN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MUrgenciN.setText("Urgencia no vital (Triage IIIA)");
        MUrgenciN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUrgenciNActionPerformed(evt);
            }
        });
        jMenu1.add(MUrgenciN);

        Matencion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        Matencion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Matencion.setText("Atención prioritaria (Triage IIIB)");
        Matencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatencionActionPerformed(evt);
            }
        });
        jMenu1.add(Matencion);

        Mconsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        Mconsulta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Mconsulta.setText("Consulta Externa (Triage IV)");
        Mconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MconsultaActionPerformed(evt);
            }
        });
        jMenu1.add(Mconsulta);

        jMenu2.add(jMenu1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmedicaActionPerformed
        citamedica  Cm= new citamedica();
        desktop.add(Cm);
        Cm.show();
    }//GEN-LAST:event_btnmedicaActionPerformed

    private void btnodontologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnodontologiaActionPerformed
     citaodontologica  Co= new citaodontologica();
        desktop.add(Co);
        Co.show();
    }//GEN-LAST:event_btnodontologiaActionPerformed

    private void btnprioritariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprioritariaActionPerformed
        citaprioritaria  Cp= new citaprioritaria();
        desktop.add(Cp);
        Cp.show();
    }//GEN-LAST:event_btnprioritariaActionPerformed

    private void MemergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemergenciaActionPerformed
        emergencia  E= new emergencia();
        desktop.add(E);
        E.show();
    }//GEN-LAST:event_MemergenciaActionPerformed

    private void MUrgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUrgenciaActionPerformed
         urgencia  U= new urgencia();
        desktop.add(U);
        U.show();
    }//GEN-LAST:event_MUrgenciaActionPerformed

    private void MUrgenciNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUrgenciNActionPerformed
     Unotvital  Un= new Unotvital();
        desktop.add(Un);
        Un.show();
    }//GEN-LAST:event_MUrgenciNActionPerformed

    private void MatencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatencionActionPerformed
         atencion  A= new atencion();
        desktop.add(A);
        A.show();
    }//GEN-LAST:event_MatencionActionPerformed

    private void MconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MconsultaActionPerformed
        consulta  Cn= new consulta();
        desktop.add(Cn);
        Cn.show();
    }//GEN-LAST:event_MconsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MUrgenciN;
    private javax.swing.JMenuItem MUrgencia;
    private javax.swing.JMenuItem Matencion;
    private javax.swing.JMenuItem Mconsulta;
    private javax.swing.JMenuItem Memergencia;
    private javax.swing.JRadioButtonMenuItem btnmedica;
    private javax.swing.JMenuItem btnodontologia;
    private javax.swing.JMenuItem btnprioritaria;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
