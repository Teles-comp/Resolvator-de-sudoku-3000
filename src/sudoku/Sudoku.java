package sudoku;

import java.awt.Toolkit;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sudoku extends javax.swing.JFrame {

    private int deducao = 0;
    private int linha = 0;
    private int coluna = 0;

    //aki eh onde fica as coisas do que acontece na primeira vez que abre o programa
    public Sudoku() {
        initComponents();
        setTitle("Sudoku");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("imagens/sudoku_dificil.jpg")));
        this.setLocationRelativeTo(null);
        gerar();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sud_interf[i][j] = getSudoku((i + 1), (j + 1));
            }
        }

    }

    //aki eh o metodo em que tu pega os numeros da interface
    public int getSudoku(int linha, int coluna) {
        try {
            if (linha == 1 && coluna == 1) {
                return Integer.parseInt(M11.getText());
            }
            if (linha == 1 && coluna == 2) {
                return Integer.parseInt(M12.getText());
            }
            if (linha == 1 && coluna == 3) {
                return Integer.parseInt(M13.getText());
            }
            if (linha == 1 && coluna == 4) {
                return Integer.parseInt(M14.getText());
            }
            if (linha == 1 && coluna == 5) {
                return Integer.parseInt(M15.getText());
            }
            if (linha == 1 && coluna == 6) {
                return Integer.parseInt(M16.getText());
            }
            if (linha == 1 && coluna == 7) {
                return Integer.parseInt(M17.getText());
            }
            if (linha == 1 && coluna == 8) {
                return Integer.parseInt(M18.getText());
            }
            if (linha == 1 && coluna == 9) {
                return Integer.parseInt(M19.getText());
            }
            if (linha == 2 && coluna == 1) {
                return Integer.parseInt(M21.getText());
            }
            if (linha == 2 && coluna == 2) {
                return Integer.parseInt(M22.getText());
            }
            if (linha == 2 && coluna == 3) {
                return Integer.parseInt(M23.getText());
            }
            if (linha == 2 && coluna == 4) {
                return Integer.parseInt(M24.getText());
            }
            if (linha == 2 && coluna == 5) {
                return Integer.parseInt(M25.getText());
            }
            if (linha == 2 && coluna == 6) {
                return Integer.parseInt(M26.getText());
            }
            if (linha == 2 && coluna == 7) {
                return Integer.parseInt(M27.getText());
            }
            if (linha == 2 && coluna == 8) {
                return Integer.parseInt(M28.getText());
            }
            if (linha == 2 && coluna == 9) {
                return Integer.parseInt(M29.getText());
            }
            if (linha == 3 && coluna == 1) {
                return Integer.parseInt(M31.getText());
            }
            if (linha == 3 && coluna == 2) {
                return Integer.parseInt(M32.getText());
            }
            if (linha == 3 && coluna == 3) {
                return Integer.parseInt(M33.getText());
            }
            if (linha == 3 && coluna == 4) {
                return Integer.parseInt(M34.getText());
            }
            if (linha == 3 && coluna == 5) {
                return Integer.parseInt(M35.getText());
            }
            if (linha == 3 && coluna == 6) {
                return Integer.parseInt(M36.getText());
            }
            if (linha == 3 && coluna == 7) {
                return Integer.parseInt(M37.getText());
            }
            if (linha == 3 && coluna == 8) {
                return Integer.parseInt(M38.getText());
            }
            if (linha == 3 && coluna == 9) {
                return Integer.parseInt(M39.getText());
            }
            if (linha == 4 && coluna == 1) {
                return Integer.parseInt(M41.getText());
            }
            if (linha == 4 && coluna == 2) {
                return Integer.parseInt(M42.getText());
            }
            if (linha == 4 && coluna == 3) {
                return Integer.parseInt(M43.getText());
            }
            if (linha == 4 && coluna == 4) {
                return Integer.parseInt(M44.getText());
            }
            if (linha == 4 && coluna == 5) {
                return Integer.parseInt(M45.getText());
            }
            if (linha == 4 && coluna == 6) {
                return Integer.parseInt(M46.getText());
            }
            if (linha == 4 && coluna == 7) {
                return Integer.parseInt(M47.getText());
            }
            if (linha == 4 && coluna == 8) {
                return Integer.parseInt(M48.getText());
            }
            if (linha == 4 && coluna == 9) {
                return Integer.parseInt(M49.getText());
            }
            if (linha == 5 && coluna == 1) {
                return Integer.parseInt(M51.getText());
            }
            if (linha == 5 && coluna == 2) {
                return Integer.parseInt(M52.getText());
            }
            if (linha == 5 && coluna == 3) {
                return Integer.parseInt(M53.getText());
            }
            if (linha == 5 && coluna == 4) {
                return Integer.parseInt(M54.getText());
            }
            if (linha == 5 && coluna == 5) {
                return Integer.parseInt(M55.getText());
            }
            if (linha == 5 && coluna == 6) {
                return Integer.parseInt(M56.getText());
            }
            if (linha == 5 && coluna == 7) {
                return Integer.parseInt(M57.getText());
            }
            if (linha == 5 && coluna == 8) {
                return Integer.parseInt(M58.getText());
            }
            if (linha == 5 && coluna == 9) {
                return Integer.parseInt(M59.getText());
            }
            if (linha == 6 && coluna == 1) {
                return Integer.parseInt(M61.getText());
            }
            if (linha == 6 && coluna == 2) {
                return Integer.parseInt(M62.getText());
            }
            if (linha == 6 && coluna == 3) {
                return Integer.parseInt(M63.getText());
            }
            if (linha == 6 && coluna == 4) {
                return Integer.parseInt(M64.getText());
            }
            if (linha == 6 && coluna == 5) {
                return Integer.parseInt(M65.getText());
            }
            if (linha == 6 && coluna == 6) {
                return Integer.parseInt(M66.getText());
            }
            if (linha == 6 && coluna == 7) {
                return Integer.parseInt(M67.getText());
            }
            if (linha == 6 && coluna == 8) {
                return Integer.parseInt(M68.getText());
            }
            if (linha == 6 && coluna == 9) {
                return Integer.parseInt(M69.getText());
            }
            if (linha == 7 && coluna == 1) {
                return Integer.parseInt(M71.getText());
            }
            if (linha == 7 && coluna == 2) {
                return Integer.parseInt(M72.getText());
            }
            if (linha == 7 && coluna == 3) {
                return Integer.parseInt(M73.getText());
            }
            if (linha == 7 && coluna == 4) {
                return Integer.parseInt(M74.getText());
            }
            if (linha == 7 && coluna == 5) {
                return Integer.parseInt(M75.getText());
            }
            if (linha == 7 && coluna == 6) {
                return Integer.parseInt(M76.getText());
            }
            if (linha == 7 && coluna == 7) {
                return Integer.parseInt(M77.getText());
            }
            if (linha == 7 && coluna == 8) {
                return Integer.parseInt(M78.getText());
            }
            if (linha == 7 && coluna == 9) {
                return Integer.parseInt(M79.getText());
            }
            if (linha == 8 && coluna == 1) {
                return Integer.parseInt(M81.getText());
            }
            if (linha == 8 && coluna == 2) {
                return Integer.parseInt(M82.getText());
            }
            if (linha == 8 && coluna == 3) {
                return Integer.parseInt(M83.getText());
            }
            if (linha == 8 && coluna == 4) {
                return Integer.parseInt(M84.getText());
            }
            if (linha == 8 && coluna == 5) {
                return Integer.parseInt(M85.getText());
            }
            if (linha == 8 && coluna == 6) {
                return Integer.parseInt(M86.getText());
            }
            if (linha == 8 && coluna == 7) {
                return Integer.parseInt(M87.getText());
            }
            if (linha == 8 && coluna == 8) {
                return Integer.parseInt(M88.getText());
            }
            if (linha == 8 && coluna == 9) {
                return Integer.parseInt(M89.getText());
            }
            if (linha == 9 && coluna == 1) {
                return Integer.parseInt(M91.getText());
            }
            if (linha == 9 && coluna == 2) {
                return Integer.parseInt(M92.getText());
            }
            if (linha == 9 && coluna == 3) {
                return Integer.parseInt(M93.getText());
            }
            if (linha == 9 && coluna == 4) {
                return Integer.parseInt(M94.getText());
            }
            if (linha == 9 && coluna == 5) {
                return Integer.parseInt(M95.getText());
            }
            if (linha == 9 && coluna == 6) {
                return Integer.parseInt(M96.getText());
            }
            if (linha == 9 && coluna == 7) {
                return Integer.parseInt(M97.getText());
            }
            if (linha == 9 && coluna == 8) {
                return Integer.parseInt(M98.getText());
            }
            if (linha == 9 && coluna == 9) {
                return Integer.parseInt(M99.getText());
            }
        } catch (NumberFormatException e) {
            return 0;
        }
        return 0;
    }

    //aki eh onde tu coloca os valores na interface, usa eles como a tua matriz q vai mostrar a soluçao
    public void setSudoku(int linha, int coluna, int numero) {
        if (numero != 0) {
            if (linha == 1 && coluna == 1) {
                M11.setText(Integer.toString(numero));
            }
            if (linha == 1 && coluna == 2) {
                M12.setText(Integer.toString(numero));
            }
            if (linha == 1 && coluna == 3) {
                M13.setText(Integer.toString(numero));
            }
            if (linha == 1 && coluna == 4) {
                M14.setText(Integer.toString(numero));
            }
            if (linha == 1 && coluna == 5) {
                M15.setText(Integer.toString(numero));
            }
            if (linha == 1 && coluna == 6) {
                M16.setText(Integer.toString(numero));
            }
            if (linha == 1 && coluna == 7) {
                M17.setText(Integer.toString(numero));
            }
            if (linha == 1 && coluna == 8) {
                M18.setText(Integer.toString(numero));
            }
            if (linha == 1 && coluna == 9) {
                M19.setText(Integer.toString(numero));
            }
            if (linha == 2 && coluna == 1) {
                M21.setText(Integer.toString(numero));
            }
            if (linha == 2 && coluna == 2) {
                M22.setText(Integer.toString(numero));
            }
            if (linha == 2 && coluna == 3) {
                M23.setText(Integer.toString(numero));
            }
            if (linha == 2 && coluna == 4) {
                M24.setText(Integer.toString(numero));
            }
            if (linha == 2 && coluna == 5) {
                M25.setText(Integer.toString(numero));
            }
            if (linha == 2 && coluna == 6) {
                M26.setText(Integer.toString(numero));
            }
            if (linha == 2 && coluna == 7) {
                M27.setText(Integer.toString(numero));
            }
            if (linha == 2 && coluna == 8) {
                M28.setText(Integer.toString(numero));
            }
            if (linha == 2 && coluna == 9) {
                M29.setText(Integer.toString(numero));
            }
            if (linha == 3 && coluna == 1) {
                M31.setText(Integer.toString(numero));
            }
            if (linha == 3 && coluna == 2) {
                M32.setText(Integer.toString(numero));
            }
            if (linha == 3 && coluna == 3) {
                M33.setText(Integer.toString(numero));
            }
            if (linha == 3 && coluna == 4) {
                M34.setText(Integer.toString(numero));
            }
            if (linha == 3 && coluna == 5) {
                M35.setText(Integer.toString(numero));
            }
            if (linha == 3 && coluna == 6) {
                M36.setText(Integer.toString(numero));
            }
            if (linha == 3 && coluna == 7) {
                M37.setText(Integer.toString(numero));
            }
            if (linha == 3 && coluna == 8) {
                M38.setText(Integer.toString(numero));
            }
            if (linha == 3 && coluna == 9) {
                M39.setText(Integer.toString(numero));
            }
            if (linha == 4 && coluna == 1) {
                M41.setText(Integer.toString(numero));
            }
            if (linha == 4 && coluna == 2) {
                M42.setText(Integer.toString(numero));
            }
            if (linha == 4 && coluna == 3) {
                M43.setText(Integer.toString(numero));
            }
            if (linha == 4 && coluna == 4) {
                M44.setText(Integer.toString(numero));
            }
            if (linha == 4 && coluna == 5) {
                M45.setText(Integer.toString(numero));
            }
            if (linha == 4 && coluna == 6) {
                M46.setText(Integer.toString(numero));
            }
            if (linha == 4 && coluna == 7) {
                M47.setText(Integer.toString(numero));
            }
            if (linha == 4 && coluna == 8) {
                M48.setText(Integer.toString(numero));
            }
            if (linha == 4 && coluna == 9) {
                M49.setText(Integer.toString(numero));
            }
            if (linha == 5 && coluna == 1) {
                M51.setText(Integer.toString(numero));
            }
            if (linha == 5 && coluna == 2) {
                M52.setText(Integer.toString(numero));
            }
            if (linha == 5 && coluna == 3) {
                M53.setText(Integer.toString(numero));
            }
            if (linha == 5 && coluna == 4) {
                M54.setText(Integer.toString(numero));
            }
            if (linha == 5 && coluna == 5) {
                M55.setText(Integer.toString(numero));
            }
            if (linha == 5 && coluna == 6) {
                M56.setText(Integer.toString(numero));
            }
            if (linha == 5 && coluna == 7) {
                M57.setText(Integer.toString(numero));
            }
            if (linha == 5 && coluna == 8) {
                M58.setText(Integer.toString(numero));
            }
            if (linha == 5 && coluna == 9) {
                M59.setText(Integer.toString(numero));
            }
            if (linha == 6 && coluna == 1) {
                M61.setText(Integer.toString(numero));
            }
            if (linha == 6 && coluna == 2) {
                M62.setText(Integer.toString(numero));
            }
            if (linha == 6 && coluna == 3) {
                M63.setText(Integer.toString(numero));
            }
            if (linha == 6 && coluna == 4) {
                M64.setText(Integer.toString(numero));
            }
            if (linha == 6 && coluna == 5) {
                M65.setText(Integer.toString(numero));
            }
            if (linha == 6 && coluna == 6) {
                M66.setText(Integer.toString(numero));
            }
            if (linha == 6 && coluna == 7) {
                M67.setText(Integer.toString(numero));
            }
            if (linha == 6 && coluna == 8) {
                M68.setText(Integer.toString(numero));
            }
            if (linha == 6 && coluna == 9) {
                M69.setText(Integer.toString(numero));
            }
            if (linha == 7 && coluna == 1) {
                M71.setText(Integer.toString(numero));
            }
            if (linha == 7 && coluna == 2) {
                M72.setText(Integer.toString(numero));
            }
            if (linha == 7 && coluna == 3) {
                M73.setText(Integer.toString(numero));
            }
            if (linha == 7 && coluna == 4) {
                M74.setText(Integer.toString(numero));
            }
            if (linha == 7 && coluna == 5) {
                M75.setText(Integer.toString(numero));
            }
            if (linha == 7 && coluna == 6) {
                M76.setText(Integer.toString(numero));
            }
            if (linha == 7 && coluna == 7) {
                M77.setText(Integer.toString(numero));
            }
            if (linha == 7 && coluna == 8) {
                M78.setText(Integer.toString(numero));
            }
            if (linha == 7 && coluna == 9) {
                M79.setText(Integer.toString(numero));
            }
            if (linha == 8 && coluna == 1) {
                M81.setText(Integer.toString(numero));
            }
            if (linha == 8 && coluna == 2) {
                M82.setText(Integer.toString(numero));
            }
            if (linha == 8 && coluna == 3) {
                M83.setText(Integer.toString(numero));
            }
            if (linha == 8 && coluna == 4) {
                M84.setText(Integer.toString(numero));
            }
            if (linha == 8 && coluna == 5) {
                M85.setText(Integer.toString(numero));
            }
            if (linha == 8 && coluna == 6) {
                M86.setText(Integer.toString(numero));
            }
            if (linha == 8 && coluna == 7) {
                M87.setText(Integer.toString(numero));
            }
            if (linha == 8 && coluna == 8) {
                M88.setText(Integer.toString(numero));
            }
            if (linha == 8 && coluna == 9) {
                M89.setText(Integer.toString(numero));
            }
            if (linha == 9 && coluna == 1) {
                M91.setText(Integer.toString(numero));
            }
            if (linha == 9 && coluna == 2) {
                M92.setText(Integer.toString(numero));
            }
            if (linha == 9 && coluna == 3) {
                M93.setText(Integer.toString(numero));
            }
            if (linha == 9 && coluna == 4) {
                M94.setText(Integer.toString(numero));
            }
            if (linha == 9 && coluna == 5) {
                M95.setText(Integer.toString(numero));
            }
            if (linha == 9 && coluna == 6) {
                M96.setText(Integer.toString(numero));
            }
            if (linha == 9 && coluna == 7) {
                M97.setText(Integer.toString(numero));
            }
            if (linha == 9 && coluna == 8) {
                M98.setText(Integer.toString(numero));
            }
            if (linha == 9 && coluna == 9) {
                M99.setText(Integer.toString(numero));
            }
        } else {
            if (linha == 1 && coluna == 1) {
                M11.setText("");
            }
            if (linha == 1 && coluna == 2) {
                M12.setText("");
            }
            if (linha == 1 && coluna == 3) {
                M13.setText("");
            }
            if (linha == 1 && coluna == 4) {
                M14.setText("");
            }
            if (linha == 1 && coluna == 5) {
                M15.setText("");
            }
            if (linha == 1 && coluna == 6) {
                M16.setText("");
            }
            if (linha == 1 && coluna == 7) {
                M17.setText("");
            }
            if (linha == 1 && coluna == 8) {
                M18.setText("");
            }
            if (linha == 1 && coluna == 9) {
                M19.setText("");
            }
            if (linha == 2 && coluna == 1) {
                M21.setText("");
            }
            if (linha == 2 && coluna == 2) {
                M22.setText("");
            }
            if (linha == 2 && coluna == 3) {
                M23.setText("");
            }
            if (linha == 2 && coluna == 4) {
                M24.setText("");
            }
            if (linha == 2 && coluna == 5) {
                M25.setText("");
            }
            if (linha == 2 && coluna == 6) {
                M26.setText("");
            }
            if (linha == 2 && coluna == 7) {
                M27.setText("");
            }
            if (linha == 2 && coluna == 8) {
                M28.setText("");
            }
            if (linha == 2 && coluna == 9) {
                M29.setText("");
            }
            if (linha == 3 && coluna == 1) {
                M31.setText("");
            }
            if (linha == 3 && coluna == 2) {
                M32.setText("");
            }
            if (linha == 3 && coluna == 3) {
                M33.setText("");
            }
            if (linha == 3 && coluna == 4) {
                M34.setText("");
            }
            if (linha == 3 && coluna == 5) {
                M35.setText("");
            }
            if (linha == 3 && coluna == 6) {
                M36.setText("");
            }
            if (linha == 3 && coluna == 7) {
                M37.setText("");
            }
            if (linha == 3 && coluna == 8) {
                M38.setText("");
            }
            if (linha == 3 && coluna == 9) {
                M39.setText("");
            }
            if (linha == 4 && coluna == 1) {
                M41.setText("");
            }
            if (linha == 4 && coluna == 2) {
                M42.setText("");
            }
            if (linha == 4 && coluna == 3) {
                M43.setText("");
            }
            if (linha == 4 && coluna == 4) {
                M44.setText("");
            }
            if (linha == 4 && coluna == 5) {
                M45.setText("");
            }
            if (linha == 4 && coluna == 6) {
                M46.setText("");
            }
            if (linha == 4 && coluna == 7) {
                M47.setText("");
            }
            if (linha == 4 && coluna == 8) {
                M48.setText("");
            }
            if (linha == 4 && coluna == 9) {
                M49.setText("");
            }
            if (linha == 5 && coluna == 1) {
                M51.setText("");
            }
            if (linha == 5 && coluna == 2) {
                M52.setText("");
            }
            if (linha == 5 && coluna == 3) {
                M53.setText("");
            }
            if (linha == 5 && coluna == 4) {
                M54.setText("");
            }
            if (linha == 5 && coluna == 5) {
                M55.setText("");
            }
            if (linha == 5 && coluna == 6) {
                M56.setText("");
            }
            if (linha == 5 && coluna == 7) {
                M57.setText("");
            }
            if (linha == 5 && coluna == 8) {
                M58.setText("");
            }
            if (linha == 5 && coluna == 9) {
                M59.setText("");
            }
            if (linha == 6 && coluna == 1) {
                M61.setText("");
            }
            if (linha == 6 && coluna == 2) {
                M62.setText("");
            }
            if (linha == 6 && coluna == 3) {
                M63.setText("");
            }
            if (linha == 6 && coluna == 4) {
                M64.setText("");
            }
            if (linha == 6 && coluna == 5) {
                M65.setText("");
            }
            if (linha == 6 && coluna == 6) {
                M66.setText("");
            }
            if (linha == 6 && coluna == 7) {
                M67.setText("");
            }
            if (linha == 6 && coluna == 8) {
                M68.setText("");
            }
            if (linha == 6 && coluna == 9) {
                M69.setText("");
            }
            if (linha == 7 && coluna == 1) {
                M71.setText("");
            }
            if (linha == 7 && coluna == 2) {
                M72.setText("");
            }
            if (linha == 7 && coluna == 3) {
                M73.setText("");
            }
            if (linha == 7 && coluna == 4) {
                M74.setText("");
            }
            if (linha == 7 && coluna == 5) {
                M75.setText("");
            }
            if (linha == 7 && coluna == 6) {
                M76.setText("");
            }
            if (linha == 7 && coluna == 7) {
                M77.setText("");
            }
            if (linha == 7 && coluna == 8) {
                M78.setText("");
            }
            if (linha == 7 && coluna == 9) {
                M79.setText("");
            }
            if (linha == 8 && coluna == 1) {
                M81.setText("");
            }
            if (linha == 8 && coluna == 2) {
                M82.setText("");
            }
            if (linha == 8 && coluna == 3) {
                M83.setText("");
            }
            if (linha == 8 && coluna == 4) {
                M84.setText("");
            }
            if (linha == 8 && coluna == 5) {
                M85.setText("");
            }
            if (linha == 8 && coluna == 6) {
                M86.setText("");
            }
            if (linha == 8 && coluna == 7) {
                M87.setText("");
            }
            if (linha == 8 && coluna == 8) {
                M88.setText("");
            }
            if (linha == 8 && coluna == 9) {
                M89.setText("");
            }
            if (linha == 9 && coluna == 1) {
                M91.setText("");
            }
            if (linha == 9 && coluna == 2) {
                M92.setText("");
            }
            if (linha == 9 && coluna == 3) {
                M93.setText("");
            }
            if (linha == 9 && coluna == 4) {
                M94.setText("");
            }
            if (linha == 9 && coluna == 5) {
                M95.setText("");
            }
            if (linha == 9 && coluna == 6) {
                M96.setText("");
            }
            if (linha == 9 && coluna == 7) {
                M97.setText("");
            }
            if (linha == 9 && coluna == 8) {
                M98.setText("");
            }
            if (linha == 9 && coluna == 9) {
                M99.setText("");
            }
        }
    }

    //aki eh para bloquear o uso do usuario a mexer em certos numeros
    public void sudokuEditable(int linha, int coluna, boolean editavel) {
        if (linha == 1 && coluna == 1) {
            M11.setEditable(editavel);
        }
        if (linha == 1 && coluna == 2) {
            M12.setEditable(editavel);
        }
        if (linha == 1 && coluna == 3) {
            M13.setEditable(editavel);
        }
        if (linha == 1 && coluna == 4) {
            M14.setEditable(editavel);
        }
        if (linha == 1 && coluna == 5) {
            M15.setEditable(editavel);
        }
        if (linha == 1 && coluna == 6) {
            M16.setEditable(editavel);
        }
        if (linha == 1 && coluna == 7) {
            M17.setEditable(editavel);
        }
        if (linha == 1 && coluna == 8) {
            M18.setEditable(editavel);
        }
        if (linha == 1 && coluna == 9) {
            M19.setEditable(editavel);
        }
        if (linha == 2 && coluna == 1) {
            M21.setEditable(editavel);
        }
        if (linha == 2 && coluna == 2) {
            M22.setEditable(editavel);
        }
        if (linha == 2 && coluna == 3) {
            M23.setEditable(editavel);
        }
        if (linha == 2 && coluna == 4) {
            M24.setEditable(editavel);
        }
        if (linha == 2 && coluna == 5) {
            M25.setEditable(editavel);
        }
        if (linha == 2 && coluna == 6) {
            M26.setEditable(editavel);
        }
        if (linha == 2 && coluna == 7) {
            M27.setEditable(editavel);
        }
        if (linha == 2 && coluna == 8) {
            M28.setEditable(editavel);
        }
        if (linha == 2 && coluna == 9) {
            M29.setEditable(editavel);
        }
        if (linha == 3 && coluna == 1) {
            M31.setEditable(editavel);
        }
        if (linha == 3 && coluna == 2) {
            M32.setEditable(editavel);
        }
        if (linha == 3 && coluna == 3) {
            M33.setEditable(editavel);
        }
        if (linha == 3 && coluna == 4) {
            M34.setEditable(editavel);
        }
        if (linha == 3 && coluna == 5) {
            M35.setEditable(editavel);
        }
        if (linha == 3 && coluna == 6) {
            M36.setEditable(editavel);
        }
        if (linha == 3 && coluna == 7) {
            M37.setEditable(editavel);
        }
        if (linha == 3 && coluna == 8) {
            M38.setEditable(editavel);
        }
        if (linha == 3 && coluna == 9) {
            M39.setEditable(editavel);
        }
        if (linha == 4 && coluna == 1) {
            M41.setEditable(editavel);
        }
        if (linha == 4 && coluna == 2) {
            M42.setEditable(editavel);
        }
        if (linha == 4 && coluna == 3) {
            M43.setEditable(editavel);
        }
        if (linha == 4 && coluna == 4) {
            M44.setEditable(editavel);
        }
        if (linha == 4 && coluna == 5) {
            M45.setEditable(editavel);
        }
        if (linha == 4 && coluna == 6) {
            M46.setEditable(editavel);
        }
        if (linha == 4 && coluna == 7) {
            M47.setEditable(editavel);
        }
        if (linha == 4 && coluna == 8) {
            M48.setEditable(editavel);
        }
        if (linha == 4 && coluna == 9) {
            M49.setEditable(editavel);
        }
        if (linha == 5 && coluna == 1) {
            M51.setEditable(editavel);
        }
        if (linha == 5 && coluna == 2) {
            M52.setEditable(editavel);
        }
        if (linha == 5 && coluna == 3) {
            M53.setEditable(editavel);
        }
        if (linha == 5 && coluna == 4) {
            M54.setEditable(editavel);
        }
        if (linha == 5 && coluna == 5) {
            M55.setEditable(editavel);
        }
        if (linha == 5 && coluna == 6) {
            M56.setEditable(editavel);
        }
        if (linha == 5 && coluna == 7) {
            M57.setEditable(editavel);
        }
        if (linha == 5 && coluna == 8) {
            M58.setEditable(editavel);
        }
        if (linha == 5 && coluna == 9) {
            M59.setEditable(editavel);
        }
        if (linha == 6 && coluna == 1) {
            M61.setEditable(editavel);
        }
        if (linha == 6 && coluna == 2) {
            M62.setEditable(editavel);
        }
        if (linha == 6 && coluna == 3) {
            M63.setEditable(editavel);
        }
        if (linha == 6 && coluna == 4) {
            M64.setEditable(editavel);
        }
        if (linha == 6 && coluna == 5) {
            M65.setEditable(editavel);
        }
        if (linha == 6 && coluna == 6) {
            M66.setEditable(editavel);
        }
        if (linha == 6 && coluna == 7) {
            M67.setEditable(editavel);
        }
        if (linha == 6 && coluna == 8) {
            M68.setEditable(editavel);
        }
        if (linha == 6 && coluna == 9) {
            M69.setEditable(editavel);
        }
        if (linha == 7 && coluna == 1) {
            M71.setEditable(editavel);
        }
        if (linha == 7 && coluna == 2) {
            M72.setEditable(editavel);
        }
        if (linha == 7 && coluna == 3) {
            M73.setEditable(editavel);
        }
        if (linha == 7 && coluna == 4) {
            M74.setEditable(editavel);
        }
        if (linha == 7 && coluna == 5) {
            M75.setEditable(editavel);
        }
        if (linha == 7 && coluna == 6) {
            M76.setEditable(editavel);
        }
        if (linha == 7 && coluna == 7) {
            M77.setEditable(editavel);
        }
        if (linha == 7 && coluna == 8) {
            M78.setEditable(editavel);
        }
        if (linha == 7 && coluna == 9) {
            M79.setEditable(editavel);
        }
        if (linha == 8 && coluna == 1) {
            M81.setEditable(editavel);
        }
        if (linha == 8 && coluna == 2) {
            M82.setEditable(editavel);
        }
        if (linha == 8 && coluna == 3) {
            M83.setEditable(editavel);
        }
        if (linha == 8 && coluna == 4) {
            M84.setEditable(editavel);
        }
        if (linha == 8 && coluna == 5) {
            M85.setEditable(editavel);
        }
        if (linha == 8 && coluna == 6) {
            M86.setEditable(editavel);
        }
        if (linha == 8 && coluna == 7) {
            M87.setEditable(editavel);
        }
        if (linha == 8 && coluna == 8) {
            M88.setEditable(editavel);
        }
        if (linha == 8 && coluna == 9) {
            M89.setEditable(editavel);
        }
        if (linha == 9 && coluna == 1) {
            M91.setEditable(editavel);
        }
        if (linha == 9 && coluna == 2) {
            M92.setEditable(editavel);
        }
        if (linha == 9 && coluna == 3) {
            M93.setEditable(editavel);
        }
        if (linha == 9 && coluna == 4) {
            M94.setEditable(editavel);
        }
        if (linha == 9 && coluna == 5) {
            M95.setEditable(editavel);
        }
        if (linha == 9 && coluna == 6) {
            M96.setEditable(editavel);
        }
        if (linha == 9 && coluna == 7) {
            M97.setEditable(editavel);
        }
        if (linha == 9 && coluna == 8) {
            M98.setEditable(editavel);
        }
        if (linha == 9 && coluna == 9) {
            M99.setEditable(editavel);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CRIAR = new javax.swing.JButton();
        CHECAR = new javax.swing.JButton();
        SOLUCAO = new javax.swing.JButton();
        INSERIR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LIMPAR = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane37 = new javax.swing.JScrollPane();
        M41 = new javax.swing.JTextPane();
        jScrollPane38 = new javax.swing.JScrollPane();
        M42 = new javax.swing.JTextPane();
        jScrollPane39 = new javax.swing.JScrollPane();
        M43 = new javax.swing.JTextPane();
        jScrollPane40 = new javax.swing.JScrollPane();
        M51 = new javax.swing.JTextPane();
        jScrollPane41 = new javax.swing.JScrollPane();
        M52 = new javax.swing.JTextPane();
        jScrollPane42 = new javax.swing.JScrollPane();
        M53 = new javax.swing.JTextPane();
        jScrollPane44 = new javax.swing.JScrollPane();
        M62 = new javax.swing.JTextPane();
        jScrollPane45 = new javax.swing.JScrollPane();
        M63 = new javax.swing.JTextPane();
        jScrollPane43 = new javax.swing.JScrollPane();
        M61 = new javax.swing.JTextPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane64 = new javax.swing.JScrollPane();
        M71 = new javax.swing.JTextPane();
        jScrollPane65 = new javax.swing.JScrollPane();
        M72 = new javax.swing.JTextPane();
        jScrollPane66 = new javax.swing.JScrollPane();
        M73 = new javax.swing.JTextPane();
        jScrollPane67 = new javax.swing.JScrollPane();
        M81 = new javax.swing.JTextPane();
        jScrollPane68 = new javax.swing.JScrollPane();
        M82 = new javax.swing.JTextPane();
        jScrollPane69 = new javax.swing.JScrollPane();
        M83 = new javax.swing.JTextPane();
        jScrollPane70 = new javax.swing.JScrollPane();
        M91 = new javax.swing.JTextPane();
        jScrollPane71 = new javax.swing.JScrollPane();
        M92 = new javax.swing.JTextPane();
        jScrollPane72 = new javax.swing.JScrollPane();
        M93 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane46 = new javax.swing.JScrollPane();
        M44 = new javax.swing.JTextPane();
        jScrollPane47 = new javax.swing.JScrollPane();
        M45 = new javax.swing.JTextPane();
        jScrollPane49 = new javax.swing.JScrollPane();
        M54 = new javax.swing.JTextPane();
        jScrollPane50 = new javax.swing.JScrollPane();
        M55 = new javax.swing.JTextPane();
        jScrollPane51 = new javax.swing.JScrollPane();
        M56 = new javax.swing.JTextPane();
        jScrollPane52 = new javax.swing.JScrollPane();
        M64 = new javax.swing.JTextPane();
        jScrollPane53 = new javax.swing.JScrollPane();
        M65 = new javax.swing.JTextPane();
        jScrollPane54 = new javax.swing.JScrollPane();
        M66 = new javax.swing.JTextPane();
        jScrollPane48 = new javax.swing.JScrollPane();
        M46 = new javax.swing.JTextPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane73 = new javax.swing.JScrollPane();
        M74 = new javax.swing.JTextPane();
        jScrollPane74 = new javax.swing.JScrollPane();
        M75 = new javax.swing.JTextPane();
        jScrollPane75 = new javax.swing.JScrollPane();
        M76 = new javax.swing.JTextPane();
        jScrollPane76 = new javax.swing.JScrollPane();
        M84 = new javax.swing.JTextPane();
        jScrollPane77 = new javax.swing.JScrollPane();
        M85 = new javax.swing.JTextPane();
        jScrollPane78 = new javax.swing.JScrollPane();
        M86 = new javax.swing.JTextPane();
        jScrollPane79 = new javax.swing.JScrollPane();
        M94 = new javax.swing.JTextPane();
        jScrollPane80 = new javax.swing.JScrollPane();
        M95 = new javax.swing.JTextPane();
        jScrollPane81 = new javax.swing.JScrollPane();
        M96 = new javax.swing.JTextPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        M12 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        M13 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        M23 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        M22 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        M21 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        M31 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        M32 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        M33 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        M14 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        M15 = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        M16 = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        M24 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        M25 = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        M26 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        M34 = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        M35 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        M36 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        M17 = new javax.swing.JTextPane();
        jScrollPane29 = new javax.swing.JScrollPane();
        M18 = new javax.swing.JTextPane();
        jScrollPane30 = new javax.swing.JScrollPane();
        M19 = new javax.swing.JTextPane();
        jScrollPane31 = new javax.swing.JScrollPane();
        M27 = new javax.swing.JTextPane();
        jScrollPane32 = new javax.swing.JScrollPane();
        M28 = new javax.swing.JTextPane();
        jScrollPane33 = new javax.swing.JScrollPane();
        M29 = new javax.swing.JTextPane();
        jScrollPane34 = new javax.swing.JScrollPane();
        M37 = new javax.swing.JTextPane();
        jScrollPane35 = new javax.swing.JScrollPane();
        M38 = new javax.swing.JTextPane();
        jScrollPane36 = new javax.swing.JScrollPane();
        M39 = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane55 = new javax.swing.JScrollPane();
        M47 = new javax.swing.JTextPane();
        jScrollPane56 = new javax.swing.JScrollPane();
        M48 = new javax.swing.JTextPane();
        jScrollPane57 = new javax.swing.JScrollPane();
        M49 = new javax.swing.JTextPane();
        jScrollPane58 = new javax.swing.JScrollPane();
        M57 = new javax.swing.JTextPane();
        jScrollPane59 = new javax.swing.JScrollPane();
        M58 = new javax.swing.JTextPane();
        jScrollPane61 = new javax.swing.JScrollPane();
        M67 = new javax.swing.JTextPane();
        jScrollPane62 = new javax.swing.JScrollPane();
        M68 = new javax.swing.JTextPane();
        jScrollPane63 = new javax.swing.JScrollPane();
        M69 = new javax.swing.JTextPane();
        jScrollPane60 = new javax.swing.JScrollPane();
        M59 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane82 = new javax.swing.JScrollPane();
        M77 = new javax.swing.JTextPane();
        jScrollPane83 = new javax.swing.JScrollPane();
        M78 = new javax.swing.JTextPane();
        jScrollPane84 = new javax.swing.JScrollPane();
        M79 = new javax.swing.JTextPane();
        jScrollPane85 = new javax.swing.JScrollPane();
        M87 = new javax.swing.JTextPane();
        jScrollPane86 = new javax.swing.JScrollPane();
        M88 = new javax.swing.JTextPane();
        jScrollPane87 = new javax.swing.JScrollPane();
        M89 = new javax.swing.JTextPane();
        jScrollPane88 = new javax.swing.JScrollPane();
        M97 = new javax.swing.JTextPane();
        jScrollPane89 = new javax.swing.JScrollPane();
        M98 = new javax.swing.JTextPane();
        jScrollPane90 = new javax.swing.JScrollPane();
        M99 = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        CRIAR.setText("Criar novo Sudoku");
        CRIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRIARActionPerformed(evt);
            }
        });

        CHECAR.setText("Checar se está certo");
        CHECAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECARActionPerformed(evt);
            }
        });

        SOLUCAO.setText("Mostrar Solução");
        SOLUCAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOLUCAOActionPerformed(evt);
            }
        });

        INSERIR.setText("Inserir Sudoku");
        INSERIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERIRActionPerformed(evt);
            }
        });

        jLabel2.setText("Inserir");

        LIMPAR.setText("Limpar Sudoku");
        LIMPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPARActionPerformed(evt);
            }
        });

        jLabel11.setText("Checar");

        jLabel12.setText("Solução");

        jLabel13.setText("Gerar Sudoku");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LIMPAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CHECAR, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(SOLUCAO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CRIAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(INSERIR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(71, 71, 71))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CRIAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SOLUCAO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CHECAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LIMPAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INSERIR)
                .addGap(62, 62, 62))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        M41.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M41FocusLost(evt);
            }
        });
        jScrollPane37.setViewportView(M41);

        M42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M42FocusLost(evt);
            }
        });
        jScrollPane38.setViewportView(M42);

        M43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M43FocusLost(evt);
            }
        });
        jScrollPane39.setViewportView(M43);

        M51.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M51FocusLost(evt);
            }
        });
        jScrollPane40.setViewportView(M51);

        M52.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M52FocusLost(evt);
            }
        });
        jScrollPane41.setViewportView(M52);

        M53.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M53FocusLost(evt);
            }
        });
        jScrollPane42.setViewportView(M53);

        M62.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M62FocusLost(evt);
            }
        });
        jScrollPane44.setViewportView(M62);

        M63.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M63FocusLost(evt);
            }
        });
        jScrollPane45.setViewportView(M63);

        M61.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M61FocusLost(evt);
            }
        });
        jScrollPane43.setViewportView(M61);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        M71.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M71FocusLost(evt);
            }
        });
        jScrollPane64.setViewportView(M71);

        M72.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M72FocusLost(evt);
            }
        });
        jScrollPane65.setViewportView(M72);

        M73.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M73FocusLost(evt);
            }
        });
        jScrollPane66.setViewportView(M73);

        M81.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M81FocusLost(evt);
            }
        });
        jScrollPane67.setViewportView(M81);

        M82.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M82FocusLost(evt);
            }
        });
        jScrollPane68.setViewportView(M82);

        M83.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M83FocusLost(evt);
            }
        });
        jScrollPane69.setViewportView(M83);

        M91.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M91FocusLost(evt);
            }
        });
        jScrollPane70.setViewportView(M91);

        M92.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M92FocusLost(evt);
            }
        });
        jScrollPane71.setViewportView(M92);

        M93.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M93FocusLost(evt);
            }
        });
        jScrollPane72.setViewportView(M93);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/imagens/linha.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/imagens/linhah.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/imagens/linhah.png"))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        M44.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M44FocusLost(evt);
            }
        });
        jScrollPane46.setViewportView(M44);

        M45.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M45FocusLost(evt);
            }
        });
        jScrollPane47.setViewportView(M45);

        M54.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M54FocusLost(evt);
            }
        });
        jScrollPane49.setViewportView(M54);

        M55.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M55FocusLost(evt);
            }
        });
        jScrollPane50.setViewportView(M55);

        M56.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M56FocusLost(evt);
            }
        });
        jScrollPane51.setViewportView(M56);

        M64.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M64FocusLost(evt);
            }
        });
        jScrollPane52.setViewportView(M64);

        M65.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M65FocusLost(evt);
            }
        });
        jScrollPane53.setViewportView(M65);

        M66.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M66FocusLost(evt);
            }
        });
        jScrollPane54.setViewportView(M66);

        M46.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M46FocusLost(evt);
            }
        });
        jScrollPane48.setViewportView(M46);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        M74.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M74FocusLost(evt);
            }
        });
        jScrollPane73.setViewportView(M74);

        M75.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M75FocusLost(evt);
            }
        });
        jScrollPane74.setViewportView(M75);

        M76.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M76FocusLost(evt);
            }
        });
        jScrollPane75.setViewportView(M76);

        M84.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M84FocusLost(evt);
            }
        });
        jScrollPane76.setViewportView(M84);

        M85.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M85FocusLost(evt);
            }
        });
        jScrollPane77.setViewportView(M85);

        M86.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M86FocusLost(evt);
            }
        });
        jScrollPane78.setViewportView(M86);

        M94.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M94FocusLost(evt);
            }
        });
        jScrollPane79.setViewportView(M94);

        M95.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M95FocusLost(evt);
            }
        });
        jScrollPane80.setViewportView(M95);

        M96.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M96FocusLost(evt);
            }
        });
        jScrollPane81.setViewportView(M96);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        M11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M11FocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(M11);

        M12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M12FocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(M12);

        M13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M13FocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(M13);

        M23.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M23FocusLost(evt);
            }
        });
        jScrollPane6.setViewportView(M23);

        M22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M22FocusLost(evt);
            }
        });
        jScrollPane5.setViewportView(M22);

        M21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M21FocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(M21);

        M31.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M31FocusLost(evt);
            }
        });
        jScrollPane7.setViewportView(M31);

        M32.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M32FocusLost(evt);
            }
        });
        jScrollPane8.setViewportView(M32);

        M33.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M33FocusLost(evt);
            }
        });
        jScrollPane9.setViewportView(M33);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/imagens/linhah.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        M14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M14FocusLost(evt);
            }
        });
        jScrollPane10.setViewportView(M14);

        M15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M15FocusLost(evt);
            }
        });
        jScrollPane11.setViewportView(M15);

        M16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M16FocusLost(evt);
            }
        });
        jScrollPane12.setViewportView(M16);

        M24.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                M24FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                M24FocusLost(evt);
            }
        });
        jScrollPane13.setViewportView(M24);

        M25.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M25FocusLost(evt);
            }
        });
        jScrollPane14.setViewportView(M25);

        M26.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M26FocusLost(evt);
            }
        });
        jScrollPane15.setViewportView(M26);

        M34.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M34FocusLost(evt);
            }
        });
        jScrollPane16.setViewportView(M34);

        M35.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M35FocusLost(evt);
            }
        });
        jScrollPane17.setViewportView(M35);

        M36.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M36FocusLost(evt);
            }
        });
        jScrollPane18.setViewportView(M36);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/imagens/linhah.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/imagens/linha.png"))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        M17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M17FocusLost(evt);
            }
        });
        jScrollPane28.setViewportView(M17);

        M18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M18FocusLost(evt);
            }
        });
        jScrollPane29.setViewportView(M18);

        M19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M19FocusLost(evt);
            }
        });
        jScrollPane30.setViewportView(M19);

        M27.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M27FocusLost(evt);
            }
        });
        jScrollPane31.setViewportView(M27);

        M28.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M28FocusLost(evt);
            }
        });
        jScrollPane32.setViewportView(M28);

        M29.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M29FocusLost(evt);
            }
        });
        jScrollPane33.setViewportView(M29);

        M37.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M37FocusLost(evt);
            }
        });
        jScrollPane34.setViewportView(M37);

        M38.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M38FocusLost(evt);
            }
        });
        jScrollPane35.setViewportView(M38);

        M39.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M39FocusLost(evt);
            }
        });
        jScrollPane36.setViewportView(M39);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/imagens/linhah.png"))); // NOI18N

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        M47.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M47FocusLost(evt);
            }
        });
        jScrollPane55.setViewportView(M47);

        M48.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M48FocusLost(evt);
            }
        });
        jScrollPane56.setViewportView(M48);

        M49.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M49FocusLost(evt);
            }
        });
        jScrollPane57.setViewportView(M49);

        M57.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M57FocusLost(evt);
            }
        });
        jScrollPane58.setViewportView(M57);

        M58.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M58FocusLost(evt);
            }
        });
        jScrollPane59.setViewportView(M58);

        M67.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M67FocusLost(evt);
            }
        });
        jScrollPane61.setViewportView(M67);

        M68.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M68FocusLost(evt);
            }
        });
        jScrollPane62.setViewportView(M68);

        M69.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M69FocusLost(evt);
            }
        });
        jScrollPane63.setViewportView(M69);

        M59.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M59FocusLost(evt);
            }
        });
        jScrollPane60.setViewportView(M59);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/imagens/linhah.png"))); // NOI18N

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        M77.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M77FocusLost(evt);
            }
        });
        jScrollPane82.setViewportView(M77);

        M78.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M78FocusLost(evt);
            }
        });
        jScrollPane83.setViewportView(M78);

        M79.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M79FocusLost(evt);
            }
        });
        jScrollPane84.setViewportView(M79);

        M87.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M87FocusLost(evt);
            }
        });
        jScrollPane85.setViewportView(M87);

        M88.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M88FocusLost(evt);
            }
        });
        jScrollPane86.setViewportView(M88);

        M89.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M89FocusLost(evt);
            }
        });
        jScrollPane87.setViewportView(M89);

        M97.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M97FocusLost(evt);
            }
        });
        jScrollPane88.setViewportView(M97);

        M98.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M98FocusLost(evt);
            }
        });
        jScrollPane89.setViewportView(M98);

        M99.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                M99FocusLost(evt);
            }
        });
        jScrollPane90.setViewportView(M99);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane88, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane89, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane90, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane83, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane85, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane87, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane89, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku/imagens/SUDOKU1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //limpa o sudoku
    public void limpar() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                setSudoku(i, j, 0);
                sudokuEditable(i, j, true);
            }
        }
    }

    //o usuario escreve nas casinhas os numeros que ele quer e ai esse metodo bloqueia esses numeros se eles 
    //tiverem seguindo as regras do sudoku
    public void inserir() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (getSudoku(i, j) != 0) {
                    sudokuEditable(i, j, false);
                }
            }
        }
        checar();
        if (linha != 0 || coluna != 0) {
            JOptionPane.showMessageDialog(null, "Algum elemento errado na linha " + linha + " e coluna " + coluna);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Sudoku inserido com sucesso, boa sorte");
            deducao = 1;
        }
    }

    //checa as linhas
    public void checaLinhas() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    if (getSudoku(i, j) == 0) {
                    } else if (j == k) {
                    } else if (getSudoku(i, j) == getSudoku(i, k)) {
                        linha = i;
                        coluna = j;
                    }
                }
            }
        }
    }

    //checa as colunas
    public void checaColunas() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    if (getSudoku(j, i) == 0) {
                    } else if (j == k) {
                    } else if (getSudoku(j, i) == getSudoku(k, i)) {
                        linha = j;
                        coluna = i;
                    }
                }
            }
        }
    }

    //checa os blocos
    public void checaBlocos() {
        for (int i = 1; i < 10; i = i + 3) {
            for (int j = 1; j < 10; j = j + 3) {
                int[] vetor = {getSudoku(i, j), getSudoku(i, j + 1), getSudoku(i, j + 2), getSudoku(i + 1, j), getSudoku(i + 1, j + 1), getSudoku(i + 1, j + 2), getSudoku(i + 2, j), getSudoku(i + 2, j + 1), getSudoku(i + 2, j + 2)};
                for (int k = 0; k < 9; k++) {
                    for (int l = 0; l < 9; l++) {
                        if (k == l) {
                        } else if (vetor[k] == 0) {
                        } else if (vetor[k] == vetor[l]) {
                            if (k == 0) {
                                linha = i;
                                coluna = j;
                            } else if (k == 1) {
                                linha = i;
                                coluna = j + 1;
                            } else if (k == 2) {
                                linha = i;
                                coluna = j + 2;
                            } else if (k == 3) {
                                linha = i + 1;
                                coluna = j;
                            } else if (k == 4) {
                                linha = i + 1;
                                coluna = j + 1;
                            } else if (k == 5) {
                                linha = i + 1;
                                coluna = j + 2;
                            } else if (k == 6) {
                                linha = i + 2;
                                coluna = j;
                            } else if (k == 7) {
                                linha = i + 2;
                                coluna = j + 1;
                            } else if (k == 8) {
                                linha = i + 2;
                                coluna = j + 2;
                            }
                        }
                    }
                }
            }
        }
    }

    //checa tudo e zera a variavel de checagem
    public void checar() {
        linha = 0;
        coluna = 0;
        checaLinhas();
        checaColunas();
        checaBlocos();
    }

    //gera um numero aleaotio entre 1 e 9
    public int numero() {
        Random rand = new Random();
        int numero = rand.nextInt(9);
        return numero + 1;
    }

    //gera um numero aleatorio entre 1 e 3
    public int numeroMenor() {
        Random rand = new Random();
        int numero = rand.nextInt(3);
        return numero + 1;
    }

    //
    //
    //MÉTODOS DO RESOLVATOR DE SUDOKU
    //
    int[][] sud_interf = new int[9][9];

    //transfere o sudoku da interface para as matrizes do resolvator de sudoku    
    void transf(solve a) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                a.questão[i][j] = sud_interf[i][j];
                a.solução[i][j] = sud_interf[i][j];
            }
        }
    }

    public void resolver() {
        solve sud = new solve();
        sud.zerar();
        transf(sud);
        sud.tentar_resolver();
    }

    //
    //
    //
    //
    //
    int backup_teste[][] = new int[9][9];

    //*
    //faz o campo do sudoku
    public void doSudoku() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                backup_teste[i][j] = getSudoku((i + 1), (j + 1));
            }
        }

        solve sud = new solve();

        boolean refazer;

        do {
            //limpa alguns campos do tabuleiro para poder fazer o jogo
            for (int q = 0; q < 5; q++) {
                setSudoku(numeroMenor(), numeroMenor(), 0);
                setSudoku(numeroMenor(), numeroMenor() + 3, 0);
                setSudoku(numeroMenor(), numeroMenor() + 6, 0);
                setSudoku(numeroMenor() + 3, numeroMenor(), 0);
                setSudoku(numeroMenor() + 3, numeroMenor() + 3, 0);
                setSudoku(numeroMenor() + 3, numeroMenor() + 6, 0);
                setSudoku(numeroMenor() + 6, numeroMenor(), 0);
                setSudoku(numeroMenor() + 6, numeroMenor() + 3, 0);
                setSudoku(numeroMenor() + 6, numeroMenor() + 6, 0);
            }

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sud_interf[i][j] = getSudoku((i + 1), (j + 1));
                }
            }
            sud.zerar();
            transf(sud);

            debug_show();
            refazer = false;
            if (sud.verif_resol()) {
                refazer = false;
            } else {
                refazer = true;

                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        setSudoku((i + 1), (j + 1), backup_teste[i][j]);
                    }
                }
            }
        } while (refazer);
    }
    //*/

    /*
    //faz o campo do sudoku
    public void doSudoku() {
            //limpa alguns campos do tabuleiro para poder fazer o jogo
            for (int q = 0; q < 5; q++) {
                setSudoku(numeroMenor(), numeroMenor(), 0);
                setSudoku(numeroMenor(), numeroMenor() + 3, 0);
                setSudoku(numeroMenor(), numeroMenor() + 6, 0);
                setSudoku(numeroMenor() + 3, numeroMenor(), 0);
                setSudoku(numeroMenor() + 3, numeroMenor() + 3, 0);
                setSudoku(numeroMenor() + 3, numeroMenor() + 6, 0);
                setSudoku(numeroMenor() + 6, numeroMenor(), 0);
                setSudoku(numeroMenor() + 6, numeroMenor() + 3, 0);
                setSudoku(numeroMenor() + 6, numeroMenor() + 6, 0);
            }
    }
    //*/
    //codigo que muda linhas e colunas de lugar
    public void transmutar() {
        int[] linha1 = new int[9];              //ajuda para transmutaçao de linha e coluna
        int[] linha2 = new int[9];
        int a, b, c, d, e, f = 0;
        a = numeroMenor();
        b = numeroMenor();
        c = numeroMenor();
        d = numeroMenor();
        e = numeroMenor();
        f = numeroMenor();
        for (int i = 0; i < 9; i++) {                //1 quadrante linha
            linha1[i] = getSudoku(a, i + 1);
            linha2[i] = getSudoku(b, i + 1);
        }
        for (int i = 0; i < 9; i++) {
            setSudoku(b, i + 1, linha1[i]);
            setSudoku(a, i + 1, linha2[i]);
        }
        for (int i = 0; i < 9; i++) {                //2 quadrante linha
            linha1[i] = getSudoku(c + 3, i + 1);
            linha2[i] = getSudoku(d + 3, i + 1);
        }
        for (int i = 0; i < 9; i++) {
            setSudoku(d + 3, i + 1, linha1[i]);
            setSudoku(c + 3, i + 1, linha2[i]);
        }
        for (int i = 0; i < 9; i++) {                  //3 quadrante linha
            linha1[i] = getSudoku(e + 6, i + 1);
            linha2[i] = getSudoku(f + 6, i + 1);
        }
        for (int i = 0; i < 9; i++) {
            setSudoku(f + 6, i + 1, linha1[i]);
            setSudoku(e + 6, i + 1, linha2[i]);
        }
        for (int j = 0; j < 9; j++) {                     //1 quadrante coluna
            linha1[j] = getSudoku(j + 1, a);
            linha2[j] = getSudoku(j + 1, b);
        }
        for (int j = 0; j < 9; j++) {
            setSudoku(j + 1, b, linha1[j]);
            setSudoku(j + 1, a, linha2[j]);
        }
        for (int j = 0; j < 9; j++) {                    //2 quadrante coluna
            linha1[j] = getSudoku(j + 1, c + 3);
            linha2[j] = getSudoku(j + 1, d + 3);
        }
        for (int j = 0; j < 9; j++) {
            setSudoku(j + 1, d + 3, linha1[j]);
            setSudoku(j + 1, c + 3, linha2[j]);
        }
        for (int j = 0; j < 9; j++) {                    //3 quadrante coluna
            linha1[j] = getSudoku(j + 1, e + 6);
            linha2[j] = getSudoku(j + 1, f + 6);
        }
        for (int j = 0; j < 9; j++) {
            setSudoku(j + 1, f + 6, linha1[j]);
            setSudoku(j + 1, e + 6, linha2[j]);
        }
    }

    public void debug() {
        System.out.print("\n\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (getSudoku((i + 1), (j + 1)) == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print("# ");
                }
                if (j == 8) {
                    System.out.print("\n");
                }
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
                if (j == 8 && (i == 2 || i == 5)) {
                    System.out.print("----------------------\n");
                }
            }
        }
    }

    public void debug_show() {
        System.out.print("\n\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (getSudoku((i + 1), (j + 1)) == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(getSudoku((i + 1), (j + 1)) + " ");
                }
                if (j == 8) {
                    System.out.print("\n");
                }
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
                if (j == 8 && (i == 2 || i == 5)) {
                    System.out.print("----------------------\n");
                }
            }
        }
    }

    public void reset_linha(int l) {
        for (int c = 1; c < 10; c++) {
            setSudoku(l, c, 0);
        }

    }

    //aki eh onde entra o meu codigo
    public void gerar() {
        for (int l = 1; l < 10; l++) {

            boolean l_ok = false;
            while (l_ok == false) {
                l_ok = true;

                for (int c = 1; c < 10; c++) {
                    linha = 1;
                    int cont = 0;

                    while (coluna + linha != 0) {
                        setSudoku(l, c, numero());
                        checar();

                        if (cont == 13 + (l * 2)) {
                            reset_linha(l);  //reseta a linha (ooohh)
                            l_ok = false;
                            checar();
                            c = 10;
                        }

                        cont++;
                        debug();  //fica mostrando o progresso
                        //debug_show();  //fica mostrando o sudoku
                    }
                }
            }
        }
        //debug_show();     //se quiser ver apenas o resultado final

        doSudoku();

        //bloqueia as caxinhas do sudoku onde tem numero
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (getSudoku(i, j) == 0) {
                    sudokuEditable(i, j, true);
                } else {
                    sudokuEditable(i, j, false);
                }
            }
        }
    }

//chama o metodo inserir
    private void INSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERIRActionPerformed
        inserir();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sud_interf[i][j] = getSudoku((i + 1), (j + 1));
            }
        }
    }//GEN-LAST:event_INSERIRActionPerformed

    //chama o metodo resolver
    private void SOLUCAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOLUCAOActionPerformed
        resolver();
    }//GEN-LAST:event_SOLUCAOActionPerformed

    //chama o metodo checar e analisa se voce ganhou o jogo
    private void CHECARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECARActionPerformed
        boolean vazio = false;

        for (int l = 1; l < 10; l++) {
            for (int c = 1; c < 10; c++) {
                if (getSudoku(l, c) == 0) {
                    vazio = true;
                    l = 10;
                    c = 10;
                }
            }
        }

        if (vazio) {
            checar();
            if (linha != 0 || coluna != 0) {
                JOptionPane.showMessageDialog(null, "Seu sudoku ainda não está completo !\n\ndica: algum elemento está incorreto");
            } else {
                JOptionPane.showMessageDialog(null, "Seu sudoku ainda não está completo !\n\ndica: tudo ok até o momento");
            }
        } else {
            checar();
            if (linha != 0 || coluna != 0) {
                JOptionPane.showMessageDialog(null, "Algum elemento está incorreto");
            } else {
                JOptionPane.showMessageDialog(null, "Parabéns, você completou o sudoku\n\nYAAAAYY");
            }
        }
    }//GEN-LAST:event_CHECARActionPerformed

    //chama o metodo gerar
    private void CRIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRIARActionPerformed
        deducao = 0;
        limpar();
        gerar();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sud_interf[i][j] = getSudoku((i + 1), (j + 1));
            }
        }
    }//GEN-LAST:event_CRIARActionPerformed

    //chama o metodo limpar
    private void LIMPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPARActionPerformed
        deducao = 1;
        int x = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja limpar\n todo o sudoku para inserir um novo?");
        if (x == 0) {
            limpar();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sud_interf[i][j] = getSudoku((i + 1), (j + 1));
                }
            }
            JOptionPane.showMessageDialog(null, "Quando terminar de inserir clique em \n\"Inserir sudoku\" para salvar sua inserção");
        }
    }//GEN-LAST:event_LIMPARActionPerformed

    //os focus sao so para ninguem escrever 0, 10 ou uma letra no sudoku
    private void M11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M11FocusLost
        try {
            if (Integer.parseInt(M11.getText()) > 0 && Integer.parseInt(M11.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M11.setText("");
        }
    }//GEN-LAST:event_M11FocusLost

    private void M12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M12FocusLost
        try {
            if (Integer.parseInt(M12.getText()) > 0 && Integer.parseInt(M12.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M12.setText("");
        }
    }//GEN-LAST:event_M12FocusLost

    private void M13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M13FocusLost
        try {
            if (Integer.parseInt(M13.getText()) > 0 && Integer.parseInt(M13.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M13.setText("");
        }
    }//GEN-LAST:event_M13FocusLost

    private void M14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M14FocusLost
        try {
            if (Integer.parseInt(M14.getText()) > 0 && Integer.parseInt(M14.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M14.setText("");
        }
    }//GEN-LAST:event_M14FocusLost

    private void M15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M15FocusLost
        try {
            if (Integer.parseInt(M15.getText()) > 0 && Integer.parseInt(M15.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M15.setText("");
        }
    }//GEN-LAST:event_M15FocusLost

    private void M16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M16FocusLost
        try {
            if (Integer.parseInt(M16.getText()) > 0 && Integer.parseInt(M16.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M16.setText("");
        }
    }//GEN-LAST:event_M16FocusLost

    private void M17FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M17FocusLost
        try {
            if (Integer.parseInt(M17.getText()) > 0 && Integer.parseInt(M17.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M17.setText("");
        }
    }//GEN-LAST:event_M17FocusLost

    private void M18FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M18FocusLost
        try {
            if (Integer.parseInt(M18.getText()) > 0 && Integer.parseInt(M18.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M18.setText("");
        }
    }//GEN-LAST:event_M18FocusLost

    private void M19FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M19FocusLost
        try {
            if (Integer.parseInt(M19.getText()) > 0 && Integer.parseInt(M19.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M19.setText("");
        }
    }//GEN-LAST:event_M19FocusLost

    private void M21FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M21FocusLost
        try {
            if (Integer.parseInt(M21.getText()) > 0 && Integer.parseInt(M21.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M21.setText("");
        }
    }//GEN-LAST:event_M21FocusLost

    private void M22FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M22FocusLost
        try {
            if (Integer.parseInt(M22.getText()) > 0 && Integer.parseInt(M22.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M22.setText("");
        }
    }//GEN-LAST:event_M22FocusLost

    private void M23FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M23FocusLost
        try {
            if (Integer.parseInt(M23.getText()) > 0 && Integer.parseInt(M23.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M23.setText("");
        }
    }//GEN-LAST:event_M23FocusLost

    private void M24FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M24FocusGained

    }//GEN-LAST:event_M24FocusGained

    private void M24FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M24FocusLost
        try {
            if (Integer.parseInt(M24.getText()) > 0 && Integer.parseInt(M24.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M24.setText("");
        }
    }//GEN-LAST:event_M24FocusLost

    private void M25FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M25FocusLost
        try {
            if (Integer.parseInt(M25.getText()) > 0 && Integer.parseInt(M25.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M25.setText("");
        }
    }//GEN-LAST:event_M25FocusLost

    private void M26FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M26FocusLost
        try {
            if (Integer.parseInt(M26.getText()) > 0 && Integer.parseInt(M26.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M26.setText("");
        }
    }//GEN-LAST:event_M26FocusLost

    private void M27FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M27FocusLost
        try {
            if (Integer.parseInt(M27.getText()) > 0 && Integer.parseInt(M27.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M27.setText("");
        }
    }//GEN-LAST:event_M27FocusLost

    private void M28FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M28FocusLost
        try {
            if (Integer.parseInt(M28.getText()) > 0 && Integer.parseInt(M28.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M28.setText("");
        }
    }//GEN-LAST:event_M28FocusLost

    private void M29FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M29FocusLost
        try {
            if (Integer.parseInt(M29.getText()) > 0 && Integer.parseInt(M29.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M29.setText("");
        }
    }//GEN-LAST:event_M29FocusLost

    private void M31FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M31FocusLost
        try {
            if (Integer.parseInt(M31.getText()) > 0 && Integer.parseInt(M31.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M31.setText("");
        }
    }//GEN-LAST:event_M31FocusLost

    private void M32FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M32FocusLost
        try {
            if (Integer.parseInt(M32.getText()) > 0 && Integer.parseInt(M32.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M32.setText("");
        }
    }//GEN-LAST:event_M32FocusLost

    private void M33FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M33FocusLost
        try {
            if (Integer.parseInt(M33.getText()) > 0 && Integer.parseInt(M33.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M33.setText("");
        }
    }//GEN-LAST:event_M33FocusLost

    private void M34FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M34FocusLost
        try {
            if (Integer.parseInt(M34.getText()) > 0 && Integer.parseInt(M34.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M34.setText("");
        }
    }//GEN-LAST:event_M34FocusLost

    private void M35FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M35FocusLost
        try {
            if (Integer.parseInt(M35.getText()) > 0 && Integer.parseInt(M35.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M35.setText("");
        }
    }//GEN-LAST:event_M35FocusLost

    private void M36FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M36FocusLost
        try {
            if (Integer.parseInt(M36.getText()) > 0 && Integer.parseInt(M36.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M36.setText("");
        }
    }//GEN-LAST:event_M36FocusLost

    private void M37FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M37FocusLost
        try {
            if (Integer.parseInt(M37.getText()) > 0 && Integer.parseInt(M37.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M37.setText("");
        }
    }//GEN-LAST:event_M37FocusLost

    private void M38FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M38FocusLost
        try {
            if (Integer.parseInt(M38.getText()) > 0 && Integer.parseInt(M38.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M38.setText("");
        }
    }//GEN-LAST:event_M38FocusLost

    private void M39FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M39FocusLost
        try {
            if (Integer.parseInt(M39.getText()) > 0 && Integer.parseInt(M39.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M39.setText("");
        }
    }//GEN-LAST:event_M39FocusLost

    private void M41FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M41FocusLost
        try {
            if (Integer.parseInt(M41.getText()) > 0 && Integer.parseInt(M41.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M41.setText("");
        }
    }//GEN-LAST:event_M41FocusLost

    private void M42FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M42FocusLost
        try {
            if (Integer.parseInt(M42.getText()) > 0 && Integer.parseInt(M42.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M42.setText("");
        }
    }//GEN-LAST:event_M42FocusLost

    private void M43FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M43FocusLost
        try {
            if (Integer.parseInt(M43.getText()) > 0 && Integer.parseInt(M43.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M43.setText("");
        }
    }//GEN-LAST:event_M43FocusLost

    private void M44FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M44FocusLost
        try {
            if (Integer.parseInt(M44.getText()) > 0 && Integer.parseInt(M44.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M44.setText("");
        }
    }//GEN-LAST:event_M44FocusLost

    private void M45FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M45FocusLost
        try {
            if (Integer.parseInt(M45.getText()) > 0 && Integer.parseInt(M45.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M45.setText("");
        }
    }//GEN-LAST:event_M45FocusLost

    private void M46FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M46FocusLost
        try {
            if (Integer.parseInt(M46.getText()) > 0 && Integer.parseInt(M46.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M46.setText("");
        }
    }//GEN-LAST:event_M46FocusLost

    private void M47FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M47FocusLost
        try {
            if (Integer.parseInt(M47.getText()) > 0 && Integer.parseInt(M47.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M47.setText("");
        }
    }//GEN-LAST:event_M47FocusLost

    private void M48FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M48FocusLost
        try {
            if (Integer.parseInt(M48.getText()) > 0 && Integer.parseInt(M48.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M48.setText("");
        }
    }//GEN-LAST:event_M48FocusLost

    private void M49FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M49FocusLost
        try {
            if (Integer.parseInt(M49.getText()) > 0 && Integer.parseInt(M49.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M49.setText("");
        }
    }//GEN-LAST:event_M49FocusLost

    private void M51FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M51FocusLost
        try {
            if (Integer.parseInt(M51.getText()) > 0 && Integer.parseInt(M51.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M51.setText("");
        }
    }//GEN-LAST:event_M51FocusLost

    private void M52FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M52FocusLost
        try {
            if (Integer.parseInt(M52.getText()) > 0 && Integer.parseInt(M52.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M52.setText("");
        }
    }//GEN-LAST:event_M52FocusLost

    private void M53FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M53FocusLost
        try {
            if (Integer.parseInt(M53.getText()) > 0 && Integer.parseInt(M53.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M53.setText("");
        }
    }//GEN-LAST:event_M53FocusLost

    private void M54FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M54FocusLost
        try {
            if (Integer.parseInt(M54.getText()) > 0 && Integer.parseInt(M54.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M54.setText("");
        }
    }//GEN-LAST:event_M54FocusLost

    private void M55FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M55FocusLost
        try {
            if (Integer.parseInt(M55.getText()) > 0 && Integer.parseInt(M55.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M55.setText("");
        }
    }//GEN-LAST:event_M55FocusLost

    private void M56FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M56FocusLost
        try {
            if (Integer.parseInt(M56.getText()) > 0 && Integer.parseInt(M56.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M56.setText("");
        }
    }//GEN-LAST:event_M56FocusLost

    private void M57FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M57FocusLost
        try {
            if (Integer.parseInt(M57.getText()) > 0 && Integer.parseInt(M57.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M57.setText("");
        }
    }//GEN-LAST:event_M57FocusLost

    private void M58FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M58FocusLost
        try {
            if (Integer.parseInt(M58.getText()) > 0 && Integer.parseInt(M58.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M58.setText("");
        }
    }//GEN-LAST:event_M58FocusLost

    private void M59FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M59FocusLost
        try {
            if (Integer.parseInt(M59.getText()) > 0 && Integer.parseInt(M59.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M59.setText("");
        }
    }//GEN-LAST:event_M59FocusLost

    private void M61FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M61FocusLost
        try {
            if (Integer.parseInt(M61.getText()) > 0 && Integer.parseInt(M61.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M61.setText("");
        }
    }//GEN-LAST:event_M61FocusLost

    private void M62FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M62FocusLost
        try {
            if (Integer.parseInt(M62.getText()) > 0 && Integer.parseInt(M62.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M62.setText("");
        }
    }//GEN-LAST:event_M62FocusLost

    private void M63FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M63FocusLost
        try {
            if (Integer.parseInt(M63.getText()) > 0 && Integer.parseInt(M63.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M63.setText("");
        }
    }//GEN-LAST:event_M63FocusLost

    private void M64FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M64FocusLost
        try {
            if (Integer.parseInt(M64.getText()) > 0 && Integer.parseInt(M64.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M64.setText("");
        }
    }//GEN-LAST:event_M64FocusLost

    private void M65FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M65FocusLost
        try {
            if (Integer.parseInt(M65.getText()) > 0 && Integer.parseInt(M65.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M65.setText("");
        }
    }//GEN-LAST:event_M65FocusLost

    private void M66FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M66FocusLost
        try {
            if (Integer.parseInt(M66.getText()) > 0 && Integer.parseInt(M66.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M66.setText("");
        }
    }//GEN-LAST:event_M66FocusLost

    private void M67FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M67FocusLost
        try {
            if (Integer.parseInt(M67.getText()) > 0 && Integer.parseInt(M67.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M67.setText("");
        }
    }//GEN-LAST:event_M67FocusLost

    private void M68FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M68FocusLost
        try {
            if (Integer.parseInt(M68.getText()) > 0 && Integer.parseInt(M68.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M68.setText("");
        }
    }//GEN-LAST:event_M68FocusLost

    private void M69FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M69FocusLost
        try {
            if (Integer.parseInt(M69.getText()) > 0 && Integer.parseInt(M69.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M69.setText("");
        }
    }//GEN-LAST:event_M69FocusLost

    private void M71FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M71FocusLost
        try {
            if (Integer.parseInt(M71.getText()) > 0 && Integer.parseInt(M71.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M71.setText("");
        }
    }//GEN-LAST:event_M71FocusLost

    private void M72FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M72FocusLost
        try {
            if (Integer.parseInt(M72.getText()) > 0 && Integer.parseInt(M72.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M72.setText("");
        }
    }//GEN-LAST:event_M72FocusLost

    private void M73FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M73FocusLost
        try {
            if (Integer.parseInt(M73.getText()) > 0 && Integer.parseInt(M73.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M73.setText("");
        }
    }//GEN-LAST:event_M73FocusLost

    private void M74FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M74FocusLost
        try {
            if (Integer.parseInt(M74.getText()) > 0 && Integer.parseInt(M74.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M74.setText("");
        }
    }//GEN-LAST:event_M74FocusLost

    private void M75FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M75FocusLost
        try {
            if (Integer.parseInt(M75.getText()) > 0 && Integer.parseInt(M75.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M75.setText("");
        }
    }//GEN-LAST:event_M75FocusLost

    private void M76FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M76FocusLost
        try {
            if (Integer.parseInt(M76.getText()) > 0 && Integer.parseInt(M76.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M76.setText("");
        }
    }//GEN-LAST:event_M76FocusLost

    private void M77FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M77FocusLost
        try {
            if (Integer.parseInt(M77.getText()) > 0 && Integer.parseInt(M77.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M77.setText("");
        }
    }//GEN-LAST:event_M77FocusLost

    private void M78FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M78FocusLost
        try {
            if (Integer.parseInt(M78.getText()) > 0 && Integer.parseInt(M78.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M78.setText("");
        }
    }//GEN-LAST:event_M78FocusLost

    private void M79FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M79FocusLost
        try {
            if (Integer.parseInt(M79.getText()) > 0 && Integer.parseInt(M79.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M79.setText("");
        }
    }//GEN-LAST:event_M79FocusLost

    private void M81FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M81FocusLost
        try {
            if (Integer.parseInt(M81.getText()) > 0 && Integer.parseInt(M81.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M81.setText("");
        }
    }//GEN-LAST:event_M81FocusLost

    private void M82FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M82FocusLost
        try {
            if (Integer.parseInt(M82.getText()) > 0 && Integer.parseInt(M82.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M82.setText("");
        }
    }//GEN-LAST:event_M82FocusLost

    private void M83FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M83FocusLost
        try {
            if (Integer.parseInt(M83.getText()) > 0 && Integer.parseInt(M83.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M83.setText("");
        }
    }//GEN-LAST:event_M83FocusLost

    private void M84FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M84FocusLost
        try {
            if (Integer.parseInt(M84.getText()) > 0 && Integer.parseInt(M84.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M84.setText("");
        }
    }//GEN-LAST:event_M84FocusLost

    private void M85FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M85FocusLost
        try {
            if (Integer.parseInt(M85.getText()) > 0 && Integer.parseInt(M85.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M85.setText("");
        }
    }//GEN-LAST:event_M85FocusLost

    private void M86FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M86FocusLost
        try {
            if (Integer.parseInt(M86.getText()) > 0 && Integer.parseInt(M86.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M86.setText("");
        }
    }//GEN-LAST:event_M86FocusLost

    private void M87FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M87FocusLost
        try {
            if (Integer.parseInt(M87.getText()) > 0 && Integer.parseInt(M87.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M87.setText("");
        }
    }//GEN-LAST:event_M87FocusLost

    private void M88FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M88FocusLost
        try {
            if (Integer.parseInt(M88.getText()) > 0 && Integer.parseInt(M88.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M88.setText("");
        }
    }//GEN-LAST:event_M88FocusLost

    private void M89FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M89FocusLost
        try {
            if (Integer.parseInt(M89.getText()) > 0 && Integer.parseInt(M89.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M89.setText("");
        }
    }//GEN-LAST:event_M89FocusLost

    private void M91FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M91FocusLost
        try {
            if (Integer.parseInt(M91.getText()) > 0 && Integer.parseInt(M91.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M91.setText("");
        }
    }//GEN-LAST:event_M91FocusLost

    private void M92FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M92FocusLost
        try {
            if (Integer.parseInt(M92.getText()) > 0 && Integer.parseInt(M92.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M92.setText("");
        }
    }//GEN-LAST:event_M92FocusLost

    private void M93FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M93FocusLost
        try {
            if (Integer.parseInt(M93.getText()) > 0 && Integer.parseInt(M93.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M93.setText("");
        }
    }//GEN-LAST:event_M93FocusLost

    private void M94FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M94FocusLost
        try {
            if (Integer.parseInt(M94.getText()) > 0 && Integer.parseInt(M94.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M94.setText("");
        }
    }//GEN-LAST:event_M94FocusLost

    private void M95FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M95FocusLost
        try {
            if (Integer.parseInt(M95.getText()) > 0 && Integer.parseInt(M95.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M95.setText("");
        }
    }//GEN-LAST:event_M95FocusLost

    private void M96FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M96FocusLost
        try {
            if (Integer.parseInt(M96.getText()) > 0 && Integer.parseInt(M96.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M96.setText("");
        }
    }//GEN-LAST:event_M96FocusLost

    private void M97FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M97FocusLost
        try {
            if (Integer.parseInt(M97.getText()) > 0 && Integer.parseInt(M97.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M97.setText("");
        }
    }//GEN-LAST:event_M97FocusLost

    private void M98FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M98FocusLost
        try {
            if (Integer.parseInt(M98.getText()) > 0 && Integer.parseInt(M98.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M98.setText("");
        }
    }//GEN-LAST:event_M98FocusLost

    private void M99FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_M99FocusLost
        try {
            if (Integer.parseInt(M99.getText()) > 0 && Integer.parseInt(M99.getText()) < 10) {
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            M99.setText("");
        }
    }//GEN-LAST:event_M99FocusLost

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHECAR;
    private javax.swing.JButton CRIAR;
    private javax.swing.JButton INSERIR;
    private javax.swing.JButton LIMPAR;
    private final javax.swing.JTextPane M11 = new javax.swing.JTextPane();
    private javax.swing.JTextPane M12;
    private javax.swing.JTextPane M13;
    private javax.swing.JTextPane M14;
    private javax.swing.JTextPane M15;
    private javax.swing.JTextPane M16;
    private javax.swing.JTextPane M17;
    private javax.swing.JTextPane M18;
    private javax.swing.JTextPane M19;
    private javax.swing.JTextPane M21;
    private javax.swing.JTextPane M22;
    private javax.swing.JTextPane M23;
    private javax.swing.JTextPane M24;
    private javax.swing.JTextPane M25;
    private javax.swing.JTextPane M26;
    private javax.swing.JTextPane M27;
    private javax.swing.JTextPane M28;
    private javax.swing.JTextPane M29;
    private javax.swing.JTextPane M31;
    private javax.swing.JTextPane M32;
    private javax.swing.JTextPane M33;
    private javax.swing.JTextPane M34;
    private javax.swing.JTextPane M35;
    private javax.swing.JTextPane M36;
    private javax.swing.JTextPane M37;
    private javax.swing.JTextPane M38;
    private javax.swing.JTextPane M39;
    private javax.swing.JTextPane M41;
    private javax.swing.JTextPane M42;
    private javax.swing.JTextPane M43;
    private javax.swing.JTextPane M44;
    private javax.swing.JTextPane M45;
    private javax.swing.JTextPane M46;
    private javax.swing.JTextPane M47;
    private javax.swing.JTextPane M48;
    private javax.swing.JTextPane M49;
    private javax.swing.JTextPane M51;
    private javax.swing.JTextPane M52;
    private javax.swing.JTextPane M53;
    private javax.swing.JTextPane M54;
    private javax.swing.JTextPane M55;
    private javax.swing.JTextPane M56;
    private javax.swing.JTextPane M57;
    private javax.swing.JTextPane M58;
    private javax.swing.JTextPane M59;
    private javax.swing.JTextPane M61;
    private javax.swing.JTextPane M62;
    private javax.swing.JTextPane M63;
    private javax.swing.JTextPane M64;
    private javax.swing.JTextPane M65;
    private javax.swing.JTextPane M66;
    private javax.swing.JTextPane M67;
    private javax.swing.JTextPane M68;
    private javax.swing.JTextPane M69;
    private javax.swing.JTextPane M71;
    private javax.swing.JTextPane M72;
    private javax.swing.JTextPane M73;
    private javax.swing.JTextPane M74;
    private javax.swing.JTextPane M75;
    private javax.swing.JTextPane M76;
    private javax.swing.JTextPane M77;
    private javax.swing.JTextPane M78;
    private javax.swing.JTextPane M79;
    private javax.swing.JTextPane M81;
    private javax.swing.JTextPane M82;
    private javax.swing.JTextPane M83;
    private javax.swing.JTextPane M84;
    private javax.swing.JTextPane M85;
    private javax.swing.JTextPane M86;
    private javax.swing.JTextPane M87;
    private javax.swing.JTextPane M88;
    private javax.swing.JTextPane M89;
    private javax.swing.JTextPane M91;
    private javax.swing.JTextPane M92;
    private javax.swing.JTextPane M93;
    private javax.swing.JTextPane M94;
    private javax.swing.JTextPane M95;
    private javax.swing.JTextPane M96;
    private javax.swing.JTextPane M97;
    private javax.swing.JTextPane M98;
    private javax.swing.JTextPane M99;
    private javax.swing.JButton SOLUCAO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane61;
    private javax.swing.JScrollPane jScrollPane62;
    private javax.swing.JScrollPane jScrollPane63;
    private javax.swing.JScrollPane jScrollPane64;
    private javax.swing.JScrollPane jScrollPane65;
    private javax.swing.JScrollPane jScrollPane66;
    private javax.swing.JScrollPane jScrollPane67;
    private javax.swing.JScrollPane jScrollPane68;
    private javax.swing.JScrollPane jScrollPane69;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane70;
    private javax.swing.JScrollPane jScrollPane71;
    private javax.swing.JScrollPane jScrollPane72;
    private javax.swing.JScrollPane jScrollPane73;
    private javax.swing.JScrollPane jScrollPane74;
    private javax.swing.JScrollPane jScrollPane75;
    private javax.swing.JScrollPane jScrollPane76;
    private javax.swing.JScrollPane jScrollPane77;
    private javax.swing.JScrollPane jScrollPane78;
    private javax.swing.JScrollPane jScrollPane79;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane80;
    private javax.swing.JScrollPane jScrollPane81;
    private javax.swing.JScrollPane jScrollPane82;
    private javax.swing.JScrollPane jScrollPane83;
    private javax.swing.JScrollPane jScrollPane84;
    private javax.swing.JScrollPane jScrollPane85;
    private javax.swing.JScrollPane jScrollPane86;
    private javax.swing.JScrollPane jScrollPane87;
    private javax.swing.JScrollPane jScrollPane88;
    private javax.swing.JScrollPane jScrollPane89;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPane90;
    // End of variables declaration//GEN-END:variables
}
