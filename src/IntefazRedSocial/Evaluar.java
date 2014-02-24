
/**
 *
 */
public class Evaluar extends javax.swing.JFrame {

    /**
     * Creates new form Evaluar
     */
    public Evaluar() {
        initComponents();
    }

    private void initComponents() {

        Evaluacion = new javax.swing.JLabel();
        asistio = new javax.swing.JCheckBox();
        nuevoEncuentro = new javax.swing.JCheckBox();
        comparteGustos = new javax.swing.JCheckBox();
        aTiempo = new javax.swing.JCheckBox();
        Enviar = new javax.swing.JButton();

        setTitle("Evaluación");
        setAlwaysOnTop(true);

        Evaluacion.setFont(new java.awt.Font("Tahoma", 0, 24));
        Evaluacion.setText("Evaluación");

        asistio.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        asistio.setText("Asistio");

        nuevoEncuentro.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        nuevoEncuentro.setText("Nuevo encuentro");

        comparteGustos.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        comparteGustos.setText("Comparte Gustos");

        aTiempo.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        aTiempo.setText("LLego a tiempo");

        Enviar.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        Enviar.setText("Enviar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Evaluacion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comparteGustos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aTiempo)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Enviar)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(asistio)
                        .addGap(70, 70, 70)
                        .addComponent(nuevoEncuentro)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Evaluacion)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asistio)
                    .addComponent(nuevoEncuentro))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comparteGustos)
                    .addComponent(aTiempo))
                .addGap(56, 56, 56)
                .addComponent(Enviar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {
          new Aviso().setVisible(true);
    }
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel Evaluacion;
    private javax.swing.JCheckBox aTiempo;
    private javax.swing.JCheckBox asistio;
    private javax.swing.JCheckBox comparteGustos;
    private javax.swing.JCheckBox nuevoEncuentro;
    
}
