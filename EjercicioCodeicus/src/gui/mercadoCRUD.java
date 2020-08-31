package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mercadoCRUD extends javax.swing.JFrame {
    private static Connection conexion;
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String usuario="root";
    private static final String contraseña="tatengues";
    private static final String url="jdbc:mysql://localhost:3306/codeicus?useTimezone=true&serverTimezone=UTC";
    private PreparedStatement miSt;
    private ResultSet miRs;
    private DefaultTableModel modelo=new DefaultTableModel();;
    
    public mercadoCRUD() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdArticulo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtMedida = new javax.swing.JTextField();
        txtContenido = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jbtAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdActualizar = new javax.swing.JTextField();
        jbtActualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        jbtEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jbtMostrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtDetalle = new javax.swing.JTextField();
        jbtBuscar = new javax.swing.JButton();
        jbtMasCaro = new javax.swing.JButton();
        jbtMasBarato = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbArticulos = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración lista de artículos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edición de lista de artículos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Código del artículo:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Unidad de medida:");

        jLabel4.setText("Contenido:");

        jLabel5.setText("Precio:");

        jbtAgregar.setText("Agregar");
        jbtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregarActionPerformed(evt);
            }
        });

        jLabel6.setText("Código del artículo:");

        jbtActualizar.setText("Actualizar");
        jbtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActualizarActionPerformed(evt);
            }
        });

        jLabel8.setText("Código del artículo:");

        jbtEliminar.setText("Eliminar");
        jbtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminarActionPerformed(evt);
            }
        });

        jLabel7.setText("(Completar todos los campos antes de Actualizar)");

        jbtMostrar.setText("Mostrar lista de artículos");
        jbtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jbtActualizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(txtMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContenido)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jbtAgregar)))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtMostrar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jbtEliminar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAgregar)
                    .addComponent(jbtMostrar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Otras operaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de artículo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtDetalle.setText("Ingrese código del artículo...");

        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jbtBuscar)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscar))
                .addGap(12, 12, 12))
        );

        jbtMasCaro.setText("Artículo más caro");
        jbtMasCaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMasCaroActionPerformed(evt);
            }
        });

        jbtMasBarato.setText("Artículo más barato");
        jbtMasBarato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMasBaratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jbtMasCaro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtMasBarato)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtMasCaro)
                    .addComponent(jbtMasBarato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jtbArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código de Artículo", "Artículo", "Unidad de medida", "Contenido", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbArticulos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Connection getConexion() {
        conexion=null;
        try {
            Class.forName(driver);
            conexion=DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException|SQLException e) {
            JOptionPane.showMessageDialog(null, "No se conecto...\n"+e, "ERROR", 0);
        }
        return conexion;
    }
    public Connection desconectar(){
        conexion=null;
        return conexion;
    }
    
    private void vaciarCajasDeTexto(){
        txtIdArticulo.setText(null);
        txtNombre.setText(null);
        txtMedida.setText(null);
        txtContenido.setText(null);
        txtPrecio.setText(null);
        txtIdActualizar.setText(null);
        txtEliminar.setText(null);
        txtDetalle.setText(null);
    }
    
    private void jbtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMostrarActionPerformed
        try {
            this.modelo=new DefaultTableModel();
            conexion=getConexion();
            jtbArticulos.setModel(modelo);
            miSt=conexion.prepareStatement("SELECT nombre FROM articulos");
            miRs=miSt.executeQuery();
            ResultSetMetaData rsMd=miRs.getMetaData();
            int numColumnas=rsMd.getColumnCount();
            modelo.addColumn("Artículo");
            
            while (miRs.next()){
                Object[] filas=new Object[numColumnas];
                for (int i=0; i<numColumnas; i++) {
                    filas[i]=miRs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "ERROR", 0);
        }
        conexion=desconectar();
    }//GEN-LAST:event_jbtMostrarActionPerformed

    private void jbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarActionPerformed
        try {
            conexion=getConexion();
            miSt=conexion.prepareStatement("INSERT INTO articulos (id_articulos, nombre, unidad_de_medida, contenido, precio) VALUES(?, ?, ?, ?, ?)");
            miSt.setInt(1, Integer.valueOf(txtIdArticulo.getText()));
            miSt.setString(2, txtNombre.getText());
            miSt.setString(3, txtMedida.getText());
            miSt.setDouble(4, Double.valueOf(txtContenido.getText()));
            miSt.setDouble(5, Double.valueOf(txtPrecio.getText()));
            miSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se agregó correctamente");
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se agrego el nuevo artículo!\n"+e, "ERROR", 0);
        }
        vaciarCajasDeTexto();
        conexion=desconectar();
    }//GEN-LAST:event_jbtAgregarActionPerformed

    private void jbtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActualizarActionPerformed
        try {
            conexion=getConexion();
            miSt=conexion.prepareStatement("UPDATE articulos SET nombre=?, unidad_de_medida=?, contenido=?, precio=? WHERE id_articulos=?");
            miSt.setString(1, txtNombre.getText());
            miSt.setString(2, txtMedida.getText());
            miSt.setDouble(3, Double.valueOf(txtContenido.getText()));
            miSt.setDouble(4, Double.valueOf(txtPrecio.getText()));
            miSt.setInt(5, Integer.valueOf(txtIdActualizar.getText()));
            int control=miSt.executeUpdate();
            
            if(control>0){
                JOptionPane.showMessageDialog(null, "Actualización exitosa");
            }else{
               JOptionPane.showMessageDialog(null, "Actualización fallida", "ERROR",0);
            }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR", 0);
        }
        vaciarCajasDeTexto();
        conexion=desconectar();
    }//GEN-LAST:event_jbtActualizarActionPerformed

    private void jbtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminarActionPerformed
        try {
            conexion=getConexion();
            miSt=conexion.prepareStatement("DELETE FROM articulos WHERE id_articulos=?");
            miSt.setInt(1, Integer.valueOf(txtEliminar.getText()));
            int control=miSt.executeUpdate();
            
            if(control>0){
            JOptionPane.showMessageDialog(null, "Artículo eliminado");
            }else{
               JOptionPane.showMessageDialog(null, "No se eliminó ningún artículo con ese código");
               
            }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR", 0);
        }
        vaciarCajasDeTexto();
        conexion=desconectar();
    }//GEN-LAST:event_jbtEliminarActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed
        try {
            this.modelo=new DefaultTableModel();
            conexion=getConexion();
            jtbArticulos.setModel(modelo);
            miSt=conexion.prepareStatement("SELECT * FROM articulos WHERE id_articulos=?");
            miSt.setInt(1, Integer.valueOf(txtDetalle.getText()));
            miRs=miSt.executeQuery();
            ResultSetMetaData rsMd=miRs.getMetaData();
            int numColumnas=rsMd.getColumnCount();
            modelo.addColumn("ID de artículo");
            modelo.addColumn("Artículo");
            modelo.addColumn("Unidad de medida");
            modelo.addColumn("Contenido");
            modelo.addColumn("Precio");
            
            while (miRs.next()){
                    Object[] filas=new Object[numColumnas];
                    for (int i=0; i<numColumnas; i++) {
                    filas[i]=miRs.getObject(i+1);
                }
                modelo.addRow(filas);
                
                }
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "ERROR", 0);
        }
        vaciarCajasDeTexto();
        conexion=desconectar();
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jbtMasCaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMasCaroActionPerformed
        try {
            this.modelo=new DefaultTableModel();
            conexion=getConexion();
            jtbArticulos.setModel(modelo);
            miSt=conexion.prepareStatement("SELECT nombre, precio FROM articulos WHERE precio=(SELECT MAX(precio) FROM articulos)");
            miRs=miSt.executeQuery();
            ResultSetMetaData rsMd=miRs.getMetaData();
            int numColumnas=rsMd.getColumnCount();
            modelo.addColumn("Artículo");
            modelo.addColumn("Precio");
            
            while (miRs.next()){
                Object[] filas=new Object[numColumnas];
                for (int i=0; i<numColumnas; i++) {
                    filas[i]=miRs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "ERROR", 0);
        }
        conexion=desconectar();
    }//GEN-LAST:event_jbtMasCaroActionPerformed

    private void jbtMasBaratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMasBaratoActionPerformed
        try {
            this.modelo=new DefaultTableModel();
            conexion=getConexion();
            jtbArticulos.setModel(modelo);
            miSt=conexion.prepareStatement("SELECT nombre, precio FROM articulos WHERE precio=(SELECT MIN(precio) FROM articulos)");
            miRs=miSt.executeQuery();
            ResultSetMetaData rsMd=miRs.getMetaData();
            int numColumnas=rsMd.getColumnCount();
            modelo.addColumn("Artículo");
            modelo.addColumn("Precio");
            
            while (miRs.next()){
                Object[] filas=new Object[numColumnas];
                for (int i=0; i<numColumnas; i++) {
                    filas[i]=miRs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "ERROR", 0);
        }
        conexion=desconectar();
    }//GEN-LAST:event_jbtMasBaratoActionPerformed

   
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
            java.util.logging.Logger.getLogger(mercadoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mercadoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mercadoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mercadoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mercadoCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtActualizar;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtEliminar;
    private javax.swing.JButton jbtMasBarato;
    private javax.swing.JButton jbtMasCaro;
    private javax.swing.JButton jbtMostrar;
    private javax.swing.JTable jtbArticulos;
    private javax.swing.JTextField txtContenido;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtIdActualizar;
    private javax.swing.JTextField txtIdArticulo;
    private javax.swing.JTextField txtMedida;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
