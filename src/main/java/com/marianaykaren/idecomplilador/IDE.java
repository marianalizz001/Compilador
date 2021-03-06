package com.marianaykaren.idecomplilador;

import java.awt.Dimension;
import javax.swing.ImageIcon;

public class IDE extends javax.swing.JFrame {
    
    private Dimension dim;
   
    private int contadorNuevo = 0;
    public static boolean creoNuevo = false;
    public static boolean abrioArchivo = false;

    public IDE() {
        initComponents();
        dim=super.getToolkit().getScreenSize();
        super.setSize(dim);
    }


    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jMenu3 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        epCodigo = new javax.swing.JEditorPane();
        lbl_nombre = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfNumeros = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        bmNuevo = new javax.swing.JMenuItem();
        bmAbrirArchivo = new javax.swing.JMenuItem();
        bmGuardar = new javax.swing.JMenuItem();
        bmGuardarComo = new javax.swing.JMenuItem();
        bmSalir = new javax.swing.JMenuItem();
        mEditar = new javax.swing.JMenu();
        bmHacer = new javax.swing.JMenuItem();
        bmDeshacer = new javax.swing.JMenuItem();
        bmCortar = new javax.swing.JMenuItem();
        bmCopiar = new javax.swing.JMenuItem();
        bmPegar = new javax.swing.JMenuItem();
        mCompEjec = new javax.swing.JMenu();
        bmCompilar = new javax.swing.JMenuItem();
        bmEjecutar = new javax.swing.JMenuItem();
        mCompEjec5 = new javax.swing.JMenu();
        mCompEjec6 = new javax.swing.JMenu();
        mCompEjec7 = new javax.swing.JMenu();
        mCompEjec1 = new javax.swing.JMenu();
        mCompEjec2 = new javax.swing.JMenu();
        mCompEjec3 = new javax.swing.JMenu();
        mCompEjec4 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        epCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                epCodigoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(epCodigo);

        lbl_nombre.setText("Aqui las lineas");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 204));
        jTabbedPane1.setForeground(new java.awt.Color(153, 153, 153));

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Léxico", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sintáctico", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Semántico", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Hash Table", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Código Intermedio", jPanel9);

        tfNumeros.setColumns(20);
        tfNumeros.setRows(5);
        jScrollPane2.setViewportView(tfNumeros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1422, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Errores", jPanel3);

        jPanel12.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1422, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Resultados", jPanel12);

        mArchivo.setText("Archivo");
        mArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mArchivoActionPerformed(evt);
            }
        });

        bmNuevo.setText("Nuevo");
        bmNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmNuevoActionPerformed(evt);
            }
        });
        mArchivo.add(bmNuevo);

        bmAbrirArchivo.setText("Abrir Archivo...");
        bmAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmAbrirArchivoActionPerformed(evt);
            }
        });
        mArchivo.add(bmAbrirArchivo);

        bmGuardar.setText("Guardar");
        bmGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmGuardarActionPerformed(evt);
            }
        });
        mArchivo.add(bmGuardar);

        bmGuardarComo.setText("Guardar como...");
        bmGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmGuardarComoActionPerformed(evt);
            }
        });
        mArchivo.add(bmGuardarComo);

        bmSalir.setText("Salir");
        bmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmSalirActionPerformed(evt);
            }
        });
        mArchivo.add(bmSalir);

        menu.add(mArchivo);

        mEditar.setText("Editar");

        bmHacer.setText("Hacer");
        mEditar.add(bmHacer);

        bmDeshacer.setText("Deshacer");
        mEditar.add(bmDeshacer);

        bmCortar.setText("Cortar");
        mEditar.add(bmCortar);

        bmCopiar.setText("Copiar");
        mEditar.add(bmCopiar);

        bmPegar.setText("Pegar");
        mEditar.add(bmPegar);

        menu.add(mEditar);

        mCompEjec.setText("Compilar & Ejecutar");

        bmCompilar.setText("Compilar");
        bmCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmCompilarActionPerformed(evt);
            }
        });
        mCompEjec.add(bmCompilar);

        bmEjecutar.setText("Debuguear");
        mCompEjec.add(bmEjecutar);

        menu.add(mCompEjec);

        mCompEjec5.setText("1");
        menu.add(mCompEjec5);

        mCompEjec6.setText("2");
        menu.add(mCompEjec6);

        mCompEjec7.setText("3");
        menu.add(mCompEjec7);

        mCompEjec1.setText("Léxico");
        menu.add(mCompEjec1);

        mCompEjec2.setText("Sintáctico");
        menu.add(mCompEjec2);

        mCompEjec3.setText("Semántico");
        menu.add(mCompEjec3);

        mCompEjec4.setText("Compilar");
        menu.add(mCompEjec4);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bmAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmAbrirArchivoActionPerformed
        // TODO add your handling code here:
        new Funciones().LeerFichero(this);
    }//GEN-LAST:event_bmAbrirArchivoActionPerformed

    private void bmCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmCompilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmCompilarActionPerformed

    private void mArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mArchivoActionPerformed

    private void bmNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmNuevoActionPerformed
        // TODO add your handling code here:
        contadorNuevo++;
        this.lbl_nombre.setText("Archivo" + contadorNuevo + ".txt");
        this.epCodigo.setText("");
        this.epCodigo.setEditable(true);
        this.epCodigo.requestFocus();
        creoNuevo = true;
        abrioArchivo = false;
    }//GEN-LAST:event_bmNuevoActionPerformed

    private void bmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmSalirActionPerformed

    private void bmGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmGuardarComoActionPerformed
        // TODO add your handling code here:
        if (abrioArchivo) {
            System.out.println("Existente");
            new Funciones().GuardarFichero(this.epCodigo.getText(), this.lbl_nombre.getText());
        }
        if (creoNuevo) {
            System.out.println("Nuevo");
            new Funciones().CrearFicheroNuevo(this, this.epCodigo.getText(), this.lbl_nombre.getText());
        }
        if (!creoNuevo && !abrioArchivo) {
            /*
            alertas.AlertInformation a = new AlertInformation(this, true);
            a.lblMensaje1.setText("Debes crear o abrir un archvo");
            a.lblMensaje2.setText("para poder guardarlo.");
            a.setVisible(true);
            */
        }
    }//GEN-LAST:event_bmGuardarComoActionPerformed

    private void bmGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmGuardarActionPerformed

    private void epCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_epCodigoKeyPressed
        // TODO add your handling code here:
        String aux2 = "1\n";
        int nLi = 0;
        for(int i=0; i<epCodigo.getText().length();i++){
            String caracter= String.valueOf(epCodigo.getText().charAt(i));
            if (caracter.equals("\n")){
                nLi=nLi+1;
                aux2 =aux2 + String.valueOf(nLi+1) + "\n";
                tfNumeros.setText(aux2);
            }
        }
        int aux = epCodigo.getText().split("\n").length;
        
        System.out.println(nLi);
    }//GEN-LAST:event_epCodigoKeyPressed

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
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bmAbrirArchivo;
    private javax.swing.JMenuItem bmCompilar;
    private javax.swing.JMenuItem bmCopiar;
    private javax.swing.JMenuItem bmCortar;
    private javax.swing.JMenuItem bmDeshacer;
    private javax.swing.JMenuItem bmEjecutar;
    private javax.swing.JMenuItem bmGuardar;
    private javax.swing.JMenuItem bmGuardarComo;
    private javax.swing.JMenuItem bmHacer;
    private javax.swing.JMenuItem bmNuevo;
    private javax.swing.JMenuItem bmPegar;
    private javax.swing.JMenuItem bmSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JEditorPane epCodigo;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JLabel lbl_nombre;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mCompEjec;
    private javax.swing.JMenu mCompEjec1;
    private javax.swing.JMenu mCompEjec2;
    private javax.swing.JMenu mCompEjec3;
    private javax.swing.JMenu mCompEjec4;
    private javax.swing.JMenu mCompEjec5;
    private javax.swing.JMenu mCompEjec6;
    private javax.swing.JMenu mCompEjec7;
    private javax.swing.JMenu mEditar;
    private javax.swing.JMenuBar menu;
    private javax.swing.JTextArea tfNumeros;
    // End of variables declaration//GEN-END:variables
}
