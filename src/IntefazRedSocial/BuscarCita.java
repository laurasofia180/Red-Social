/**
 * 
 */
public class BuscarCita extends javax.swing.JFrame {

    /**
     * Creates new form BuscarCita
     */
    public BuscarCita() {
        initComponents();
    }

    private void initComponents() {

        Buscador = new javax.swing.JLabel();
        OpcionCita = new javax.swing.JLabel();
        TextoOpcionCita = new javax.swing.JTextField();
        Grupos = new javax.swing.JLabel();
        BuscarGrupos = new javax.swing.JLabel();
        TextoBuscar = new javax.swing.JTextField();
        Estudio = new javax.swing.JRadioButton();
        Diversion = new javax.swing.JRadioButton();
        ToqueMusical = new javax.swing.JRadioButton();
        Enviar = new javax.swing.JButton();

        setTitle("Buscador");

        Buscador.setFont(new java.awt.Font("Tahoma", 0, 24));
        Buscador.setText("Buscador");

        OpcionCita.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        OpcionCita.setText("Opcion de cita");

        Grupos.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        Grupos.setText("Grupos");

        BuscarGrupos.setFont(new java.awt.Font("Tahoma", 0, 14));
        BuscarGrupos.setText("Buscar Grupos");

        Estudio.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Estudio.setText("Estudio");

        Diversion.setFont(new java.awt.Font("Tahoma", 0, 14));
        Diversion.setText("Diversion");

        ToqueMusical.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        ToqueMusical.setText("Toque Musical");

        Enviar.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        Enviar.setText("Enviar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Grupos)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Buscador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OpcionCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(TextoOpcionCita, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BuscarGrupos)
                                .addGap(18, 18, 18)
                                .addComponent(TextoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Estudio)
                                .addGap(16, 16, 16)
                                .addComponent(Diversion)
                                .addGap(18, 18, 18)
                                .addComponent(ToqueMusical, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Buscador)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpcionCita)
                    .addComponent(TextoOpcionCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(Grupos)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarGrupos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estudio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Diversion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToqueMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(Enviar)
                .addGap(21, 21, 21))
        );

        pack();
    }
    private javax.swing.JLabel Buscador;
    private javax.swing.JLabel BuscarGrupos;
    private javax.swing.JRadioButton Diversion;
    private javax.swing.JButton Enviar;
    private javax.swing.JRadioButton Estudio;
    private javax.swing.JLabel Grupos;
    private javax.swing.JLabel OpcionCita;
    private javax.swing.JTextField TextoBuscar;
    private javax.swing.JTextField TextoOpcionCita;
    private javax.swing.JRadioButton ToqueMusical;
}
