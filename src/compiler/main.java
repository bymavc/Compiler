/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Miguel Angel
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        jTabbedPane1.setEnabledAt(2, false);
        jTabbedPane1.setEnabledAt(3, false);
        setTitle("Compilador");
        Entrada.requestFocus();
    }
    //Variables para los metodos de documento
    int status;
    boolean isOpen = false;
    File FicherOpen;
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
    
    String semOp;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        textEditor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Entrada = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        alignLeft = new javax.swing.JButton();
        alignCenter = new javax.swing.JButton();
        alignRight = new javax.swing.JButton();
        copyFile = new javax.swing.JButton();
        cutFile = new javax.swing.JButton();
        pasteFile = new javax.swing.JButton();
        analisisLexico = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textLexico = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numLetras = new javax.swing.JTextField();
        sLetras = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        numNumeros = new javax.swing.JTextField();
        sNumeros = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        numOperadores = new javax.swing.JTextField();
        sOperadores = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        sSeparadores = new javax.swing.JComboBox();
        numSeparadores = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numEspeciales = new javax.swing.JTextField();
        sErrores = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        numErrores = new javax.swing.JTextField();
        sEspeciales = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lexAnalisis = new javax.swing.JButton();
        analisisSintactico = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        sPalabras = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        sSimples = new javax.swing.JComboBox();
        sCompuestas = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sVariables = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        sExpresiones = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        sComentarios = new javax.swing.JComboBox();
        sErrores2 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        expresionSeleccionada = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        sinAnalisis = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        semErrores = new javax.swing.JTextArea();
        semAnalisis = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        semExpresiones = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        expresiones = new javax.swing.JTextPane();
        semOperaciones = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        abrirArchivo = new javax.swing.JMenuItem();
        guardarArchivo = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        Ver = new javax.swing.JMenu();
        Tablas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(Entrada);

        alignLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/left-alignment.png"))); // NOI18N
        alignLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alignLeftActionPerformed(evt);
            }
        });

        alignCenter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/center-alignment.png"))); // NOI18N
        alignCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alignCenterActionPerformed(evt);
            }
        });

        alignRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/right-alignment.png"))); // NOI18N
        alignRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alignRightActionPerformed(evt);
            }
        });

        copyFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copy.png"))); // NOI18N
        copyFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyFileActionPerformed(evt);
            }
        });

        cutFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cut.png"))); // NOI18N
        cutFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutFileActionPerformed(evt);
            }
        });

        pasteFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paste-clipboard.png"))); // NOI18N
        pasteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alignLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alignCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(copyFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cutFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasteFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alignRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(copyFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cutFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pasteFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(alignCenter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alignLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alignRight)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout textEditorLayout = new javax.swing.GroupLayout(textEditor);
        textEditor.setLayout(textEditorLayout);
        textEditorLayout.setHorizontalGroup(
            textEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textEditorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addContainerGap())
        );
        textEditorLayout.setVerticalGroup(
            textEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textEditorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addGroup(textEditorLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Editor de Texto", textEditor);

        analisisLexico.setMaximumSize(new java.awt.Dimension(600, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Codigo sin Comentarios");

        jScrollPane1.setViewportView(textLexico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 255, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Letras");

        sLetras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sLetras.setMaximumSize(new java.awt.Dimension(100, 20));
        sLetras.setMinimumSize(new java.awt.Dimension(100, 20));

        jLabel2.setText("Numeros");

        sNumeros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Operadores");

        sOperadores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Separadores");

        sSeparadores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Especiales");

        sErrores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Errores");

        sEspeciales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Análisis de Caracteres");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(numOperadores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numLetras)
                                    .addComponent(numNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sNumeros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sLetras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(numErrores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(numEspeciales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sEspeciales, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(numSeparadores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sSeparadores, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numSeparadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sSeparadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numEspeciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sEspeciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numErrores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sErrores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lexAnalisis.setText("Analizar");
        lexAnalisis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lexAnalisisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout analisisLexicoLayout = new javax.swing.GroupLayout(analisisLexico);
        analisisLexico.setLayout(analisisLexicoLayout);
        analisisLexicoLayout.setHorizontalGroup(
            analisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(analisisLexicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(analisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lexAnalisis)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        analisisLexicoLayout.setVerticalGroup(
            analisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(analisisLexicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(analisisLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(analisisLexicoLayout.createSequentialGroup()
                        .addComponent(lexAnalisis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Análisis Léxico", analisisLexico);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Análisis de Palabras");

        sPalabras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Todas las Palabras");

        sSimples.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sCompuestas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Palabras Simples");

        jLabel12.setText("Palabras Compuestas");

        sVariables.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Variables Declaradas");

        sExpresiones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sExpresiones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sExpresionesItemStateChanged(evt);
            }
        });

        jLabel14.setText("Expresiones Matematicas");

        sComentarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sErrores2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Comentarios");

        jLabel16.setText("Errores Sintacticos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sSimples, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sCompuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sExpresiones, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sErrores2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sSimples, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sCompuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(sVariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(sExpresiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(sComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(sErrores2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setText("Expresión Seleccionada");

        jButton1.setText("Mostrar Árbol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(expresionSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jLabel18))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expresionSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        sinAnalisis.setText("Analizar");
        sinAnalisis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sinAnalisisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout analisisSintacticoLayout = new javax.swing.GroupLayout(analisisSintactico);
        analisisSintactico.setLayout(analisisSintacticoLayout);
        analisisSintacticoLayout.setHorizontalGroup(
            analisisSintacticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(analisisSintacticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(analisisSintacticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sinAnalisis)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        analisisSintacticoLayout.setVerticalGroup(
            analisisSintacticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(analisisSintacticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(analisisSintacticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(analisisSintacticoLayout.createSequentialGroup()
                        .addComponent(sinAnalisis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Análisis Sintáctico", analisisSintactico);

        jPanel7.setBackground(new java.awt.Color(254, 254, 254));

        jLabel17.setText("Errores detectados");

        semErrores.setColumns(20);
        semErrores.setRows(5);
        jScrollPane4.setViewportView(semErrores);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        semAnalisis.setText("Analizar");
        semAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semAnalisisActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(254, 254, 254));

        jLabel19.setText("Operaciones");

        jLabel20.setText("Expresiones matematicas");

        semExpresiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        semExpresiones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semExpresionesItemStateChanged(evt);
            }
        });

        jScrollPane5.setViewportView(expresiones);

        semOperaciones.setText("Mostrar Operaciones");
        semOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semOperacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(semExpresiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(semOperaciones)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(11, 11, 11)
                .addComponent(semExpresiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(semOperaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semAnalisis)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(semAnalisis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Análisis Semántico", jPanel6);

        Archivo.setText("Archivo");

        abrirArchivo.setText("Abrir");
        abrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirArchivoActionPerformed(evt);
            }
        });
        Archivo.add(abrirArchivo);

        guardarArchivo.setText("Guardar");
        guardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarArchivoActionPerformed(evt);
            }
        });
        Archivo.add(guardarArchivo);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        Archivo.add(salir);

        jMenuBar1.add(Archivo);

        Ver.setText("Ver");

        Tablas.setText("Tablas");
        Tablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablasActionPerformed(evt);
            }
        });
        Ver.add(Tablas);

        jMenuBar1.add(Ver);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArchivoActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_abrirArchivoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void guardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarArchivoActionPerformed
        if(isOpen){
            guardarArchivo();
        }else{
            guardarComo();
        }
    }//GEN-LAST:event_guardarArchivoActionPerformed

    private void TablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablasActionPerformed
        Tablas table = new Tablas();
        table.setVisible(true);
    }//GEN-LAST:event_TablasActionPerformed

    private void sinAnalisisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sinAnalisisMouseClicked

        Sintactico sintactico = new Sintactico();
        String text = textLexico.getText();
        text = sintactico.expresiones(text);
        sintactico.getPalabras(text);
        sintactico.compareReservadas();

        //Mostrar listas obtenidas en cada clasificacion
        sPalabras.setModel(new DefaultComboBoxModel(sintactico.showPalabras().toArray()));
        sSimples.setModel(new DefaultComboBoxModel(sintactico.showSimples().toArray()));
        sCompuestas.setModel(new DefaultComboBoxModel(sintactico.showCompuestas().toArray()));
        sVariables.setModel(new DefaultComboBoxModel(sintactico.showVariables().toArray()));
        sExpresiones.setModel(new DefaultComboBoxModel(sintactico.showExpresiones().toArray()));
        semExpresiones.setModel(new DefaultComboBoxModel(sintactico.showExpresiones().toArray()));
        if(!sintactico.showExpresiones().isEmpty()){
            expresionSeleccionada.setText(sintactico.showExpresiones().get(0));
            semOp = sintactico.showExpresiones().get(0);
        }
        sErrores2.setModel(new DefaultComboBoxModel(sintactico.showErrores().toArray()));
        
        if(sintactico.showErrores().isEmpty()){
            jTabbedPane1.setEnabledAt(3, true);
        }else{
            jTabbedPane1.setEnabledAt(3, false);
        }

    }//GEN-LAST:event_sinAnalisisMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tree tree = new Tree();
        jTree1.setModel(tree.getTree(expresionSeleccionada.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sExpresionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sExpresionesItemStateChanged
        if(evt.getStateChange() == 1){
            String ecuacion_string = (String) evt.getItem();
            expresionSeleccionada.setText(ecuacion_string);
        }
    }//GEN-LAST:event_sExpresionesItemStateChanged

    private void alignCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alignCenterActionPerformed
        StyledDocument st = Entrada.getStyledDocument();
        SimpleAttributeSet bSet = new SimpleAttributeSet();
        StyleConstants.setAlignment(bSet, StyleConstants.ALIGN_CENTER);
        st.setParagraphAttributes(0, Entrada.getText().length(), bSet, false);
    }//GEN-LAST:event_alignCenterActionPerformed

    private void alignRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alignRightActionPerformed
        StyledDocument st = Entrada.getStyledDocument();
        SimpleAttributeSet bSet = new SimpleAttributeSet();
        StyleConstants.setAlignment(bSet, StyleConstants.ALIGN_RIGHT);
        st.setParagraphAttributes(0, Entrada.getText().length(), bSet, false);
    }//GEN-LAST:event_alignRightActionPerformed

    private void alignLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alignLeftActionPerformed
        StyledDocument st = Entrada.getStyledDocument();
        SimpleAttributeSet bSet = new SimpleAttributeSet();
        StyleConstants.setAlignment(bSet, StyleConstants.ALIGN_LEFT);
        st.setParagraphAttributes(0, Entrada.getText().length(), bSet, false);
    }//GEN-LAST:event_alignLeftActionPerformed

    private void lexAnalisisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lexAnalisisMouseClicked

        //Colocar codigo en cuadro de texto

        Lexico lexico = new Lexico();
        String text = Entrada.getText();
        text = lexico.comentarios(text);
        textLexico.setText(text);
        text = lexico.quitEspacios(text);
        lexico.compareSimples(text);

        //Mostrar Valores Numericos de la cantidad de cada tipo de caracter
        numLetras.setText(String.valueOf(lexico.showLetras().size()));
        numNumeros.setText(String.valueOf(lexico.showNumeros().size()));
        numOperadores.setText(String.valueOf(lexico.showOperadores().size()));
        numSeparadores.setText(String.valueOf(lexico.showSeparadores().size()));
        numEspeciales.setText(String.valueOf(lexico.showEspeciales().size()));
        numErrores.setText(String.valueOf(lexico.showErrores().size()));

        //Mostrar lista de caracteres en cada clasificacion
        sLetras.setModel(new DefaultComboBoxModel(lexico.showLetras().toArray()));
        sNumeros.setModel(new DefaultComboBoxModel(lexico.showNumeros().toArray()));
        sOperadores.setModel(new DefaultComboBoxModel(lexico.showOperadores().toArray()));
        sSeparadores.setModel(new DefaultComboBoxModel(lexico.showSeparadores().toArray()));
        sEspeciales.setModel(new DefaultComboBoxModel(lexico.showEspeciales().toArray()));
        sErrores.setModel(new DefaultComboBoxModel(lexico.showErrores().toArray()));
        sComentarios.setModel(new DefaultComboBoxModel(lexico.showComentarios().toArray()));

        //Habilitar analisis Sintactico
        if(lexico.showErrores().isEmpty()){
            jTabbedPane1.setEnabledAt(2, true);
        }else{
            jTabbedPane1.setEnabledAt(2, false);
        }
    }//GEN-LAST:event_lexAnalisisMouseClicked

    private void copyFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyFileActionPerformed
        Entrada.copy();
    }//GEN-LAST:event_copyFileActionPerformed

    private void cutFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutFileActionPerformed
        Entrada.cut();
    }//GEN-LAST:event_cutFileActionPerformed

    private void pasteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteFileActionPerformed
        Entrada.paste();
    }//GEN-LAST:event_pasteFileActionPerformed

    private void semAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semAnalisisActionPerformed
        Semantico semantico = new Semantico();
        Sintactico sintactico = new Sintactico();
        String text = textLexico.getText();
        text = sintactico.expresiones(text);
        semantico.verifyOrden(text);
        String arrayErrores = "";
        for(String error : semantico.errores){
            arrayErrores = arrayErrores+"\n"+error;
        }
        semErrores.setText(arrayErrores);
    }//GEN-LAST:event_semAnalisisActionPerformed

    private void semExpresionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semExpresionesItemStateChanged
        if(evt.getStateChange() == 1){
            semOp = (String) evt.getItem();
        }
    }//GEN-LAST:event_semExpresionesItemStateChanged

    private void semOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semOperacionesActionPerformed
        Tree operaciones = new Tree();
        operaciones.getTree(semOp);
        String arrayOperaciones = "";
        int i = 0;
        operaciones.analisisOperaciones();
        for(String operacion : operaciones.operations){
            i++;
            arrayOperaciones = arrayOperaciones+"\n"+"Op"+i+" = "+operacion;
        }
        expresiones.setText(arrayOperaciones);
    }//GEN-LAST:event_semOperacionesActionPerformed

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
            try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        }catch (Exception e){e.printStackTrace();} 
        }catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    
    //Metodo para abrir archivo
    private void abrirArchivo(){
        status = jFileChooser1.showOpenDialog(null);
        if(status == JFileChooser.APPROVE_OPTION){
            //Limpiar el area de texto
            Entrada.setText("");
            String aux = null;
            try{
                //Abrir archivo seleccionado
                File archivo = jFileChooser1.getSelectedFile();
                if(archivo != null){
                    FileReader file = new FileReader(archivo);
                    try (BufferedReader lee = new BufferedReader(file)){
                        while ((aux = lee.readLine()) != null){
                                Entrada.setText(Entrada.getText() +"\n"+ aux);
                        }
                    }
                    //Indicar que se abrio el archivo
                    isOpen = true;
                    //Guardar ruta del archivo
                    FicherOpen = jFileChooser1.getSelectedFile();
                    System.out.println(FicherOpen);
                }
            }catch (IOException ex){
                JOptionPane.showMessageDialog(null, ex +""+"No se ha encontrado el Archivo","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    //Metodo para guardar archivo existente
    private void guardarArchivo(){
        //Crear nombre para el nuevo fichero
        String newNombre = FicherOpen.getName() + "-Temporal.txt";
        //Crear objeto File para el nuevo fichero
        File newFichero = new File(newNombre);
        try{
            //Si existe fichero inicial
            if(FicherOpen.exists()){
                //Crear objeto FileWriter para escribir sobre el archivo
                try (FileWriter escribir = new FileWriter(newFichero, true)){
                    //Utilizar metodo write para escribir sobre el archivo
                    escribir.write(Entrada.getText());
                }
                //Borrar fichero inicial
                FicherOpen.delete();
                //Renombrar nuevo fichero como inicial
                newFichero.renameTo(FicherOpen);
            }else{
                System.out.println("Fichero no existe");
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    //Metodo para guardar nuevo archivo
    private void guardarComo(){
        status = jFileChooser1.showSaveDialog(jMenuBar1);
        if(status == JFileChooser.APPROVE_OPTION){
            try{
                //Crear objeto File para el nuevo fichero
                File newFichero = new File (jFileChooser1.getSelectedFile().toString() + ".txt");
                //Crear objeto FileWriter para escribir sobre el fichero
                FileWriter saveFichero = new FileWriter(newFichero);
                //Utilizar el metodo write para escribir sobre el archivo
                saveFichero.write(Entrada.getText());
                saveFichero.close();
                isOpen = true;
                FicherOpen = jFileChooser1.getSelectedFile();
                JOptionPane.showMessageDialog(null, "El archivo se ha guardado exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }catch (IOException ex){
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JTextPane Entrada;
    private javax.swing.JMenuItem Tablas;
    private javax.swing.JMenu Ver;
    private javax.swing.JMenuItem abrirArchivo;
    private javax.swing.JButton alignCenter;
    private javax.swing.JButton alignLeft;
    private javax.swing.JButton alignRight;
    private javax.swing.JPanel analisisLexico;
    private javax.swing.JPanel analisisSintactico;
    private javax.swing.JButton copyFile;
    private javax.swing.JButton cutFile;
    private javax.swing.JTextField expresionSeleccionada;
    private javax.swing.JTextPane expresiones;
    private javax.swing.JMenuItem guardarArchivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton lexAnalisis;
    private javax.swing.JTextField numErrores;
    private javax.swing.JTextField numEspeciales;
    private javax.swing.JTextField numLetras;
    private javax.swing.JTextField numNumeros;
    private javax.swing.JTextField numOperadores;
    private javax.swing.JTextField numSeparadores;
    private javax.swing.JButton pasteFile;
    private javax.swing.JComboBox sComentarios;
    private javax.swing.JComboBox sCompuestas;
    private javax.swing.JComboBox sErrores;
    private javax.swing.JComboBox sErrores2;
    private javax.swing.JComboBox sEspeciales;
    private javax.swing.JComboBox sExpresiones;
    private javax.swing.JComboBox sLetras;
    private javax.swing.JComboBox sNumeros;
    private javax.swing.JComboBox sOperadores;
    private javax.swing.JComboBox sPalabras;
    private javax.swing.JComboBox sSeparadores;
    private javax.swing.JComboBox sSimples;
    private javax.swing.JComboBox sVariables;
    private javax.swing.JMenuItem salir;
    private javax.swing.JButton semAnalisis;
    private javax.swing.JTextArea semErrores;
    private javax.swing.JComboBox<String> semExpresiones;
    private javax.swing.JButton semOperaciones;
    private javax.swing.JButton sinAnalisis;
    private javax.swing.JPanel textEditor;
    private javax.swing.JTextPane textLexico;
    // End of variables declaration//GEN-END:variables
}
