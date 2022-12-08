/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import br.com.hospital.Connection.ClienteDAO;
import br.com.hospital.model.Cadcliente;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class ListaDeClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaDeClientes
     */
    public ListaDeClientes() {
        initComponents();
         ClienteDAO cDAO = new ClienteDAO();
        
        DefaultTableModel tabela = new DefaultTableModel();
        this.jtabelaCliente.setModel(tabela);
        
        tabela.addColumn("CPF");
        tabela.addColumn("NOME");
        tabela.addColumn("PLANO");
        tabela.addColumn("CELULAR");
        tabela.addColumn("EMAIL");
        
        for (Cadcliente c : cDAO.getTodosClientes()){
            tabela.addRow(
            new Object[]{       
                c.getCpf(),
                c.getNome(),
                c.getTipoplano(),
                c.getCelular(),
                c.getEmail()
                
            }
            );
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabelaCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jtabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "PLANO", "CELULAR", "EMAIL"
            }
        ));
        jScrollPane1.setViewportView(jtabelaCliente);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lista de clientes cadastrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabelaCliente;
    // End of variables declaration//GEN-END:variables
}