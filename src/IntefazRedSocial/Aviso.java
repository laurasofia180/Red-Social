
/**
 *
 */
public class Aviso extends javax.swing.JFrame {

    /**
     * Creates new form Aviso
     */
    public Aviso() {
        initComponents();
    }

 
    private void initComponents() {

        respuestaEvaluacion = new javax.swing.JLabel();
        Ok = new javax.swing.JButton();

        respuestaEvaluacion.setFont(new java.awt.Font("Tahoma", 0, 14));
        respuestaEvaluacion.setText("Su evalución fue enviada con exito");

        Ok.setFont(new java.awt.Font("Tahoma", 0, 12));
        Ok.setText("Ok");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(respuestaEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(respuestaEvaluacion)
                .addGap(56, 56, 56)
                .addComponent(Ok)
                .addContainerGap())
        );

        pack();
    }
    private javax.swing.JButton Ok;
    private javax.swing.JLabel respuestaEvaluacion;
}
