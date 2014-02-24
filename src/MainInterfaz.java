
/**
 *
 * @author Laura Sofia Muñoz Montoya
 */
public class MainInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form MainInterfaz
     */
    public MainInterfaz() {
        initComponents();
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Registro = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        Genero = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        TextoApellidos = new javax.swing.JTextField();
        TextoCodigo = new javax.swing.JTextField();
        Masculino = new javax.swing.JRadioButton();
        Femenino = new javax.swing.JRadioButton();
        Gustos = new javax.swing.JLabel();
        Rumba = new javax.swing.JCheckBox();
        Bailar = new javax.swing.JCheckBox();
        Paseo = new javax.swing.JCheckBox();
        Habitos = new javax.swing.JLabel();
        Leer = new javax.swing.JCheckBox();
        Estudiar = new javax.swing.JCheckBox();
        Deporte = new javax.swing.JCheckBox();
        CrearUsuario = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Estudiantes");

        Registro.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        Registro.setText("Registro Estudiante");

        Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Nombre.setText("Nombre:");

        Apellidos.setFont(new java.awt.Font("Tahoma", 0, 14));
        Apellidos.setText("Apellidos:");

        Codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Codigo.setText("Codigo Estudiante:");

        Genero.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Genero.setText("Genero:");

        Masculino.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Masculino.setText("Masculino");

        Femenino.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Femenino.setText("Femenino");

        Gustos.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Gustos.setText("Gustos:");

        Rumba.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Rumba.setText("Rumba");

        Bailar.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Bailar.setText("Bailar");

        Paseo.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Paseo.setText("Paseo");

        Habitos.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Habitos.setText("Habitos:");

        Leer.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Leer.setText("Leer");

        Estudiar.setFont(new java.awt.Font("Tahoma", 0, 14));
        Estudiar.setText("Estudiar");

        Deporte.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        Deporte.setText("Deporte");

        CrearUsuario.setFont(new java.awt.Font("Tahoma", 0, 14));
        CrearUsuario.setText("Crear Usuario");

        Buscar.setFont(new java.awt.Font("Tahoma", 0, 14));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre)
                                    .addComponent(Apellidos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextoApellidos)
                                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Genero)
                                    .addComponent(Registro))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Codigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gustos)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Habitos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(Estudiar)
                                        .addGap(122, 122, 122)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Paseo)
                                            .addComponent(Leer))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(Rumba)
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Deporte)
                                        .addComponent(Bailar))
                                    .addGap(77, 77, 77))))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Masculino)
                        .addGap(82, 82, 82)
                        .addComponent(Femenino)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(Buscar))
                    .addComponent(CrearUsuario))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Registro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellidos)
                    .addComponent(TextoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo)
                    .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Genero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Masculino)
                    .addComponent(Femenino))
                .addGap(18, 18, 18)
                .addComponent(Gustos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rumba)
                    .addComponent(Bailar)
                    .addComponent(Paseo))
                .addGap(18, 18, 18)
                .addComponent(Habitos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estudiar)
                    .addComponent(Deporte)
                    .addComponent(Leer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearUsuario)
                    .addComponent(Buscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {
        new BuscarCita().setVisible(true);
    }
    
    public static void main(String args[]) {
       
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainInterfaz().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel Apellidos;
    private javax.swing.JCheckBox Bailar;
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Codigo;
    private javax.swing.JButton CrearUsuario;
    private javax.swing.JCheckBox Deporte;
    private javax.swing.JCheckBox Estudiar;
    private javax.swing.JRadioButton Femenino;
    private javax.swing.JLabel Genero;
    private javax.swing.JLabel Gustos;
    private javax.swing.JLabel Habitos;
    private javax.swing.JCheckBox Leer;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.JLabel Nombre;
    private javax.swing.JCheckBox Paseo;
    private javax.swing.JLabel Registro;
    private javax.swing.JCheckBox Rumba;
    private javax.swing.JTextField TextoApellidos;
    private javax.swing.JTextField TextoCodigo;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.ButtonGroup buttonGroup1;
}
