package calculadora;

public class Calculadora extends javax.swing.JFrame {

    double[] numeros = new double[2];

    boolean decimal = false;
    boolean division = false;
    boolean multiplicacion = false;
    boolean resta = false;
    boolean suma = false;

    boolean porcentaje = false;

    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTxtOperacion = new javax.swing.JLabel();
        jLabelTxtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonSiete = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonEliminarCaracterPorCaracter = new javax.swing.JButton();
        jButtonPorcentaje = new javax.swing.JButton();
        jButtonNueve = new javax.swing.JButton();
        jButtonOcho = new javax.swing.JButton();
        jButtonComa = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonCuatro = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonCero = new javax.swing.JButton();
        jButtonDos = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonRestar = new javax.swing.JButton();
        jButtonSumar = new javax.swing.JButton();
        jButtonUno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(46, 57, 81));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTxtOperacion.setBackground(new java.awt.Color(242, 246, 183));
        jLabelTxtOperacion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelTxtOperacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTxtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTxtOperacion.setToolTipText("");
        jPanel1.add(jLabelTxtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 40));

        jLabelTxtResultado.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTxtResultado.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabelTxtResultado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTxtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabelTxtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 280, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 140));

        jPanel2.setBackground(new java.awt.Color(46, 57, 81));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSiete.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSiete.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonSiete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSiete.setText("7");
        jButtonSiete.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSieteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        jButtonC.setBackground(new java.awt.Color(204, 204, 204));
        jButtonC.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonC.setForeground(new java.awt.Color(51, 51, 51));
        jButtonC.setText("AC");
        jButtonC.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jButtonIgual.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        jButtonIgual.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonIgual.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3_dark.png"))); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonIgual.setFocusPainted(false);
        jButtonIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3_dark.png"))); // NOI18N
        jButtonIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3_pressed_dark.png"))); // NOI18N
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        jButtonEliminarCaracterPorCaracter.setBackground(new java.awt.Color(204, 204, 204));
        jButtonEliminarCaracterPorCaracter.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonEliminarCaracterPorCaracter.setForeground(new java.awt.Color(51, 51, 51));
        jButtonEliminarCaracterPorCaracter.setText("<-");
        jButtonEliminarCaracterPorCaracter.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonEliminarCaracterPorCaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCaracterPorCaracterActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEliminarCaracterPorCaracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        jButtonPorcentaje.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPorcentaje.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonPorcentaje.setForeground(new java.awt.Color(51, 51, 51));
        jButtonPorcentaje.setText("%");
        jButtonPorcentaje.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        jButtonNueve.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNueve.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonNueve.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNueve.setText("9");
        jButtonNueve.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNueveActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        jButtonOcho.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOcho.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonOcho.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOcho.setText("8");
        jButtonOcho.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOchoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        jButtonComa.setBackground(new java.awt.Color(204, 204, 204));
        jButtonComa.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonComa.setForeground(new java.awt.Color(102, 102, 102));
        jButtonComa.setText(".");
        jButtonComa.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonComa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 50, 50));

        jButtonSeis.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSeis.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonSeis.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSeis.setText("6");
        jButtonSeis.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeisActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 50));

        jButtonCinco.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCinco.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonCinco.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCinco.setText("5");
        jButtonCinco.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCincoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 50));

        jButtonCuatro.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCuatro.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonCuatro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCuatro.setText("4");
        jButtonCuatro.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuatroActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        jButtonTres.setBackground(new java.awt.Color(102, 102, 102));
        jButtonTres.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonTres.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTres.setText("3");
        jButtonTres.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTresActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        jButtonCero.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCero.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonCero.setForeground(new java.awt.Color(102, 102, 102));
        jButtonCero.setText("0");
        jButtonCero.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCeroActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 50));

        jButtonDos.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDos.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonDos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDos.setText("2");
        jButtonDos.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDosActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        jButtonDivision.setBackground(new java.awt.Color(255, 188, 2));
        jButtonDivision.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonDivision.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDivision.setText("/");
        jButtonDivision.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        jButtonMultiplicar.setBackground(new java.awt.Color(255, 188, 2));
        jButtonMultiplicar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMultiplicar.setText("*");
        jButtonMultiplicar.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        jButtonRestar.setBackground(new java.awt.Color(255, 188, 2));
        jButtonRestar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonRestar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRestar.setText("-");
        jButtonRestar.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 50));

        jButtonSumar.setBackground(new java.awt.Color(255, 188, 2));
        jButtonSumar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonSumar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSumar.setText("+");
        jButtonSumar.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        jButtonUno.setBackground(new java.awt.Color(102, 102, 102));
        jButtonUno.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButtonUno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUno.setText("1");
        jButtonUno.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 330, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSieteActionPerformed
        jLabelTxtOperacion.setText(jLabelTxtOperacion.getText() + "7");
    }//GEN-LAST:event_jButtonSieteActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        jLabelTxtOperacion.setText("");
        jLabelTxtResultado.setText("");
        decimal = false;
        division = false;
        multiplicacion = false;
        resta = false;
        suma = false;
        porcentaje = false;
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed

        double resultado;
        String entero;
        try {
            numeros[1] = Double.parseDouble(jLabelTxtOperacion.getText());
            if (division == true) {

                if (numeros[1] == 0) {
                    jLabelTxtOperacion.setText("Error");

                } else {
                    resultado = numeros[0] / numeros[1];
                    if (resultado % 1 == 0) {
                        entero = Double.toString(resultado);
                        jLabelTxtResultado.setText(entero.substring(0, entero.length() - 2));
                    } else {
                        jLabelTxtResultado.setText(Double.toString(resultado));
                    }
                }
            } else if (multiplicacion == true) {
                resultado = numeros[0] * numeros[1];
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    jLabelTxtResultado.setText(entero.substring(0, entero.length() - 2));
                } else {
                    jLabelTxtResultado.setText(Double.toString(resultado));
                }
            } else if (resta == true) {
                resultado = numeros[0] - numeros[1];
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    jLabelTxtResultado.setText(entero.substring(0, entero.length() - 2));
                } else {
                    jLabelTxtResultado.setText(Double.toString(resultado));
                }
            } else if (suma == true) {
                resultado = numeros[0] + numeros[1];
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    jLabelTxtResultado.setText(entero.substring(0, entero.length() - 2));
                } else {
                    jLabelTxtResultado.setText(Double.toString(resultado));
                }
            } else if (porcentaje == true) {
                resultado = numeros[1] * (numeros[0] / 100.0);
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    jLabelTxtResultado.setText(entero.substring(0, entero.length() - 2));
                } else {
                    jLabelTxtResultado.setText(Double.toString(resultado));
                }
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonEliminarCaracterPorCaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCaracterPorCaracterActionPerformed
        String cadena;
        cadena = jLabelTxtOperacion.getText();
        if (cadena.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            jLabelTxtOperacion.setText(cadena);
        }                    // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarCaracterPorCaracterActionPerformed

    private void jButtonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentajeActionPerformed
        try {
            numeros[0] = Double.parseDouble(jLabelTxtOperacion.getText());
            jLabelTxtOperacion.setText("");
            porcentaje = true;
            decimal = false;

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButtonPorcentajeActionPerformed

    private void jButtonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNueveActionPerformed
        jLabelTxtOperacion.setText(jLabelTxtOperacion.getText() + "9");       // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNueveActionPerformed

    private void jButtonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOchoActionPerformed
        jLabelTxtOperacion.setText(jLabelTxtOperacion.getText() + "8");       // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOchoActionPerformed

    private void jButtonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComaActionPerformed
        if (decimal == false) {
            jLabelTxtOperacion.setText(jLabelTxtOperacion.getText() + ".");

            decimal = true;// TODO add your handling code here:

        }
    }//GEN-LAST:event_jButtonComaActionPerformed

    public static String calculadora(String numero1, String numero2, String operacion) {
        Double resultado = 0.0;
        String respuesta;

        if (operacion.equals("-")) {
            resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
        }
        if (operacion.equals("+")) {
            resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
        }
        if (operacion.equals("*")) {
            resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
        }
        if (operacion.equals("/")) {
            resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
        }
        respuesta = resultado.toString();
        return respuesta;
    }

    public static boolean existePunto(String cadena) {
        Boolean resultado;
        resultado = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i + 1).equals(".")) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    private void jButtonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeisActionPerformed
        jLabelTxtOperacion.setText(jLabelTxtOperacion.getText() + "6");         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSeisActionPerformed

    private void jButtonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCincoActionPerformed
        jLabelTxtOperacion.setText(jLabelTxtOperacion.getText() + "5");        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCincoActionPerformed

    private void jButtonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuatroActionPerformed
        jLabelTxtOperacion.setText(jLabelTxtOperacion.getText() + "4");                    // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCuatroActionPerformed

    private void jButtonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTresActionPerformed
        jLabelTxtOperacion.setText(jLabelTxtOperacion.getText() + "3");                    // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTresActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed

        try {
            numeros[0] = Double.parseDouble(jLabelTxtOperacion.getText());
            jLabelTxtOperacion.setText("");
            division = true;
            decimal = false;

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed

        try {
            numeros[0] = Double.parseDouble(jLabelTxtOperacion.getText());
            jLabelTxtOperacion.setText("");
            multiplicacion = true;
            decimal = false;

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestarActionPerformed

        try {
            numeros[0] = Double.parseDouble(jLabelTxtOperacion.getText());
            jLabelTxtOperacion.setText("");
            resta = true;
            decimal = false;

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonRestarActionPerformed

    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed

        try {
            numeros[0] = Double.parseDouble(jLabelTxtOperacion.getText());
            jLabelTxtOperacion.setText("");
            suma = true;
            decimal = false;

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButtonSumarActionPerformed

    private void jButtonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCeroActionPerformed
        jLabelTxtOperacion.setText(jLabelTxtOperacion.getText() + "0");      // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCeroActionPerformed

    private void jButtonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDosActionPerformed
        jLabelTxtOperacion.setText(jLabelTxtOperacion.getText() + "2");                   // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDosActionPerformed

    private void jButtonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnoActionPerformed
        jLabelTxtOperacion.setText(jLabelTxtOperacion.getText() + "1");

    }//GEN-LAST:event_jButtonUnoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonCero;
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonComa;
    private javax.swing.JButton jButtonCuatro;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonDos;
    private javax.swing.JButton jButtonEliminarCaracterPorCaracter;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonNueve;
    private javax.swing.JButton jButtonOcho;
    private javax.swing.JButton jButtonPorcentaje;
    private javax.swing.JButton jButtonRestar;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSiete;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUno;
    private javax.swing.JLabel jLabelTxtOperacion;
    private javax.swing.JLabel jLabelTxtResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
