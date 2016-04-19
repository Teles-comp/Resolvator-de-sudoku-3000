package sudoku;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
/**
 *
 * @author Teles
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class resolvator_de_sudoku {

    public static void main(String[] args) {
        //testes();
        solve sudoku = new solve();
        testes();
    }

    //serve só pra ficar testando as funções que criei (vai ser removido na versão final)
    static void testes() {
        solve sudoku = new solve();
        /*
                    MANUAL
        para se usar algum teste apenas insira uma barra antes do "\*" ao lado esquerdo do título
         */
        //-------------------------------------
        /* TESNTANDO O NÍVEL DIFÍCIL
        //
        sudoku.zerar();
        sudoku.iniciar_teste_3();
        sudoku.tentar_resolver();
        //
        //ainda não resolveu :c (usando fantasma)
        // */
        //-------------------------------------
        //* TESNTANDO O OPTION PANE
        //
        sudoku.zerar();
        sudoku.tentar_resolver();
        //
        //ainda não resolveu :c (usando fantasma)
        // */
    }
}

class solve {

    int[][] questão = new int[9][9];
    int[][] solução = new int[9][9];
    boolean[][][] impossível = new boolean[9][9][9];
    char resp;

    //
    //
    //FUNÇÕES BASICAS
    //zera as matrizes
    void zerar() {
        //reinicia as matrizes questão e solução
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.questão[i][j] = 0;
                this.solução[i][j] = 0;
            }
        }

        //reinicia mtriz impossível
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    this.impossível[i][j][k] = false;
                }
            }
        }
    }

    //serve pra inserir um novo sudoku
    void insert() {
        int l;
        int c;
        int val;
        System.out.print("\nl=Linha (de 1 a 9)\nc=Coluna (de 1 a 9)\nv=valor\nQuando terminar de inserir digite 's'");
        resp = 's';
        do {
            try {
                Scanner sc_i = new Scanner(System.in);
                //sc_i.nextInt();

                //tem que inserir junto linha coluna e valor, depois dar enter
                System.out.print("\nInserção (lcv):\n");
                val = sc_i.nextInt();

                //separa a centena(l), dezena(c) e unidade(val)
                l = val / 100;
                c = (val - (l * 100)) / 10;
                val = (val - (l * 100)) - (c * 10);

                //ajusta linha e coluna pra serem usadas na matriz
                l = l - 1;
                c = c - 1;
                questão[l][c] = val;

            } catch (Exception e) {
                Scanner sc_c = new Scanner(System.in);
                //resp = sc_c.next().charAt(0);

                exibir_questão();
                System.out.print("\nDeseja salvar e parar de inserir (s)\n"
                        + "Ou continuar inserindo (c) ?\n(s/c)\n");
                resp = sc_c.next().charAt(0);
                if (resp == 's') {
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            this.solução[i][j] = this.questão[i][j];
                        }
                    }
                    resp = 'n';
                } else {
                    resp = 's';
                }
            }
        } while (resp == 's');
    }

    //exibe a matriz "questão" de um sudoku já inserido (não deve ser modificada durante execução do codigo)
    void exibir_questão() {
        System.out.print("\nQuestão:\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (questão[i][j] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(questão[i][j] + " ");
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

    //exibe a matriz "solução" (será modificada durante o código)
    void exibir_solução() {
        String sol = "\n~~(não cole muito :D)~~\n\n                   ~~Solução~~\n\n";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (solução[i][j] == 0) {
                    sol += "  ..  ";
                } else {
                    sol = sol + "  " + solução[i][j] + "  ";
                }
                if (j == 8) {
                    sol += "\n";
                }
                if (j == 2 || j == 5) {
                    sol += "  |  ";
                }
                if (j == 8 && (i == 2 || i == 5)) {
                    sol += " ---------------|-----------------|--------------\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, sol);
    }

    //retorna se um numero está em determinada linha(de 1 a 9)
    boolean num_na_lin(int numero, int linha) {
        boolean x = false;
        for (int i = 0; i < 9; i++) {
            if (solução[linha - 1][i] == numero) {
                x = true;
            }
        }
        return x;
    }

    //retorna se um numero está em determinada coluna(de 1 a 9)
    boolean num_na_col(int numero, int coluna) {
        boolean x = false;
        for (int i = 0; i < 9; i++) {
            if (solução[i][coluna - 1] == numero) {
                x = true;
            }
        }
        return x;
    }

    //retorna se um numero está em determinado bloco
    boolean num_no_blc(int numero, int bloco) {
        boolean x = false;

        //pega as coordenadas que vai precisar de acordo com o bloco
        int l = bloco_coord(bloco)[0];
        int c = bloco_coord(bloco)[1];
        int pl = bloco_coord(bloco)[2];
        int pc = bloco_coord(bloco)[3];

        for (int i = l; i < pl; i++) {
            for (int j = c; j < pc; j++) {
                if (solução[i][j] == numero) {
                    x = true;
                }
            }
        }
        return x;
    }

    //retorna array com coordenadas de um bloco pra serem usadas em um 'for' que verifique somente esse bloco
    public int[] bloco_coord(int bloco) {
        /*
            Para cada bloco (de 1 a 9) essas devem ser as coordenadas iniciais:
                1-00 | 2-03 | 3-06
                ---- ---- ----
                4-30 | 5-33 | 6-36
                ---- ---- ----
                7-60 | 8-63 | 9-66
         */

        int l = 0;
        int c = 6;
        if (bloco > 3) {
            l = l + 3;
            if (bloco > 6) {
                l = l + 3;
            }
        }
        for (int i = 0; i < bloco; i++) {
            if (c == 6) {
                c = 0;
            } else if (c == 0) {
                c = 3;
            } else if (c == 3) {
                c = 6;
            }
        }
        /*
            E essas devem ser as finais:
                1-00 | 2-03 | 3-06
                ---- ---- ----
                4-30 | 5-33 | 6-36
                ---- ---- ----
                7-60 | 8-63 | 9-66
         */
        int pl = l + 3;
        int pc = c + 3;
        int[] coord = {l, c, pl, pc};
        return coord;
    }

    //retorna em que bloco está determinada coordenada
    public int coord_bloco(int linha, int coluna) {
        int bloco = 0;
        for (int i = 1; i < 10; i++) {
            int l = bloco_coord(i)[0];
            int c = bloco_coord(i)[1];
            int pl = bloco_coord(i)[2];
            int pc = bloco_coord(i)[3];
            for (int j = l; j < pl; j++) {
                for (int k = c; k < pc; k++) {
                    if ((linha - 1) == j && (coluna - 1) == k) {
                        bloco = i;
                    }
                }
            }
        }
        return bloco;
    }

    //
    /*
    Numeração dos blocos:
        1 | 2 | 3
        -----------
        4 | 5 | 6
        -----------
        7 | 8 | 9
     */
    //
    //
    //
    //POSSÍVEIS e IMPOSSÍVEIS
    //retorna se é possível determinado numero em uma posição (analizando somente a "questão")
    boolean poss(int numero, int linha, int coluna) {
        boolean x = true;
        if (num_na_lin(numero, linha)) {
            x = false;
        }
        if (num_na_col(numero, coluna)) {
            x = false;
        }
        if (num_no_blc(numero, coord_bloco(linha, coluna))) {
            x = false;
        }
        if (solução[(linha - 1)][(coluna - 1)] != 0) {
            x = false;
        }
        return x;
    }

    //insere na matriz "impossóvel" quaisquer números em uma posição
    void inserir_imposs(int numero, int linha, int coluna) {
        this.impossível[(linha - 1)][(coluna - 1)][(numero - 1)] = true;
    }

    //coloca na matriz "impossível" quais valores não podem ser inseridos e em que posição
    //(reinicia a matriz sempre que chamado)
    void verificar_imposs() {
        //linhas
        for (int l = 1; l < 10; l++) {
            //colunas
            for (int c = 1; c < 10; c++) {
                //números
                for (int n = 1; n < 10; n++) {
                    if (poss(n, l, c) == false) {
                        inserir_imposs(n, l, c);
                    }
                }
            }
        }
    }

    //exibe a matriz "impossível" de algum valor
    void exibir_imposs(int numero) {
        System.out.print("\nImpossível de " + numero + ":\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (impossível[i][j][(numero - 1)] == false) {
                    System.out.print(". ");
                } else {
                    System.out.print(numero + " ");
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

    //
    //
    //
    //FANTASMA
    //lógica de um números em duas localizações possíveis
    void criar_fantasma() {
        for (int b = 1; b < 10; b++) {
            int l = bloco_coord(b)[0];
            int c = bloco_coord(b)[1];
            int pl = bloco_coord(b)[2];
            int pc = bloco_coord(b)[3];
            for (int n = 0; n < 9; n++) {
                int repetições = 0;
                for (int i = l; i < pl; i++) {
                    for (int j = c; j < pc; j++) {
                        if (this.impossível[i][j][n] == true) {
                            repetições++;
                        }
                    }
                }
                if (repetições == 7) {
                    int[] fant_l = new int[2];
                    int[] fant_c = new int[2];
                    int aux = 0;
                    for (int i = l; i < pl; i++) {
                        for (int j = c; j < pc; j++) {
                            //guarda onde no bloco o mesmo número é possível duas vezes
                            if (this.impossível[i][j][n] == false) {
                                fant_l[aux] = i;
                                fant_c[aux] = j;
                                aux++;
                            }
                        }
                    }

                    //se eles estiverem na mesma linha
                    if (fant_l[0] == fant_l[1]) {
                        for (int j = 0; j < 9; j++) {
                            //todos nessa linha exceto esses dois se tornam impossíveis
                            if (j != fant_c[0] && j != fant_c[1]) {
                                this.impossível[fant_l[0]][j][n] = true;
                            }
                        }
                    }

                    //se eles estiverem na mesma coluna
                    if (fant_c[0] == fant_c[1]) {
                        for (int i = 0; i < 9; i++) {
                            //todos nessa coluna exceto esses dois se tornam impossíveis
                            if (i != fant_l[0] && i != fant_l[1]) {
                                this.impossível[i][fant_c[0]][n] = true;
                            }
                        }
                    }
                }
            }
        }
    }

    //lógica de dois números possíveis nas mesmas duas localizações (inserção de 0 a 8)
    void dois_fantasmas(int num_1, int num_2, int bloco) {
        int l = bloco_coord(bloco)[0];
        int c = bloco_coord(bloco)[1];
        int pl = bloco_coord(bloco)[2];
        int pc = bloco_coord(bloco)[3];
        int repet_1 = 0;
        int repet_2 = 0;
        for (int i = l; i < pl; i++) {
            for (int j = c; j < pc; j++) {
                if (this.impossível[i][j][num_1] == true) {
                    repet_1++;
                }
            }
        }
        for (int i = l; i < pl; i++) {
            for (int j = c; j < pc; j++) {
                if (this.impossível[i][j][num_2] == true) {
                    repet_2++;
                }
            }
        }
        if (repet_1 == repet_2 && repet_1 == 7) {
            int[] l_num_1 = new int[2];
            int[] c_num_1 = new int[2];
            int[] l_num_2 = new int[2];
            int[] c_num_2 = new int[2];
            int aux1 = 0;
            int aux2 = 0;
            for (int i = l; i < pl; i++) {
                for (int j = c; j < pc; j++) {
//guarda as posições de onde no bloco os dois números são possíveis
                    if (this.impossível[i][j][num_1] == false) {
                        l_num_1[aux1] = i;
                        c_num_1[aux1] = j;
                        aux1++;
                    }
                    if (this.impossível[i][j][num_2] == false) {
                        l_num_2[aux2] = i;
                        c_num_2[aux2] = j;
                        aux2++;
                    }
                }
            }
            if (/* */l_num_1[0] == l_num_2[0]
                    && c_num_1[0] == c_num_2[0]
                    && l_num_1[1] == l_num_2[1]
                    && c_num_1[1] == c_num_2[1]) {

                for (int n = 0; n < 9; n++) {
                    if (n != num_1 && n != num_2) {
                        this.impossível[l_num_1[0]][c_num_1[0]][n] = true;
                        this.impossível[l_num_1[1]][c_num_1[1]][n] = true;
                    }
                }
            }
        }
    }

    //testas "dois_fantasmas" para todas as combinações possíveis
    void aux_fantasma() {
        for (int b = 0; b < 9; b++) {
            for (int n1 = 0; n1 < 9; n1++) {
                for (int n2 = n1; n2 < 9; n2++) {
                    if (n1 != n2) {
                        dois_fantasmas(n1, n2, b);
                    }
                }
            }
        }
    }

    //
    //
    //
    //RESOLUÇÕES
    //insere valores onde forem possívels
    //
    void insert_p_bloco() {
        for (int b = 1; b < 10; b++) {
            int l = bloco_coord(b)[0];
            int c = bloco_coord(b)[1];
            int pl = bloco_coord(b)[2];
            int pc = bloco_coord(b)[3];
            for (int n = 0; n < 9; n++) {
                int repetições = 0;
                for (int i = l; i < pl; i++) {
                    for (int j = c; j < pc; j++) {
                        if (this.impossível[i][j][n] == true) {
                            repetições++;
                        }
                    }
                }
                if (repetições == 8) {
                    for (int i = l; i < pl; i++) {
                        for (int j = c; j < pc; j++) {
                            if (this.impossível[i][j][n] == false && this.solução[i][j] == 0) {
                                solução[i][j] = (n + 1);
                                verificar_imposs();
                            }
                        }
                    }
                }
            }
        }
    }

    void insert_p_linha() {
        for (int l = 0; l < 9; l++) {
            for (int n = 0; n < 9; n++) {
                int repetições = 0;
                for (int c = 0; c < 9; c++) {
                    if (this.impossível[l][c][n] == true) {
                        repetições++;
                    }
                }
                if (repetições == 8) {
                    for (int c = 0; c < 9; c++) {
                        if (this.impossível[l][c][n] == false && this.solução[l][c] == 0) {
                            solução[l][c] = (n + 1);
                            verificar_imposs();
                        }
                    }
                }
            }
        }
    }

    void insert_p_coluna() {
        for (int c = 0; c < 9; c++) {
            for (int n = 0; n < 9; n++) {
                int repetições = 0;
                for (int l = 0; l < 9; l++) {
                    if (this.impossível[l][c][n] == true) {
                        repetições++;
                    }
                }
                if (repetições == 8) {
                    for (int l = 0; l < 9; l++) {
                        if (this.impossível[l][c][n] == false && this.solução[l][c] == 0) {
                            solução[l][c] = (n + 1);
                            verificar_imposs();
                        }
                    }
                }
            }
        }
    }

    //tenta resolver o sudoku aplicando os metodos até agora
    void tentar_resolver() {
        int x = 0;
        int verif[][] = new int[9][9];
        boolean result = true;
        verificar_imposs();
        while (x != 81) {
            x = 0;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    verif[i][j] = solução[i][j];
                }
            }
            insert_p_bloco();
            insert_p_linha();
            insert_p_coluna();
            criar_fantasma();
            insert_p_bloco();
            aux_fantasma();
            insert_p_bloco();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (solução[i][j] == verif[i][j]) {
                        x++;
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (solução[i][j] == 0) {
                    result = false;
                    i = 10;
                    j = 10;
                }
            }
        }
        if (result) {
            exibir_solução();
        } else {
            JOptionPane.showMessageDialog(null, ""
                    + "PPPPP         EEEEEEEEE      RRRRR         DDDD            IIII\n"
                    + "PP   PPP      EEEEEEEEE      RR   RRR      DD  DD          IIII\n"
                    + "PP      PP      EE                      RR      RR      DD    DD        IIII\n"
                    + "PP   PPP      EEEEE               RR   RRR       DD      DD      IIII\n"
                    + "PPPPP         EEEEE               RRRR             DD      DD      IIII\n"
                    + "PP                 EE                      RR  RR           DD    DD        IIII\n"
                    + "PP                 EEEEEEEE        RR    RR         DD  DD          IIII\n"
                    + "PP                 EEEEEEEE        RR      RR       DDDD            IIII\n");
            JOptionPane.showMessageDialog(null, "ATENÇÃO:\n"
                    + "é provável que o seu sudoku não possua\n"
                    + " um solução ou possua mais de uma solução\n"
                    + "possível, de modo que ele não pôde ser\n"
                    + "resolvido até o final\n\n"
                    + ".                <!!!>\n"
                    + ".   Mals, não consegui\n"
                    + ".Mas cheguei até aqui ó:");
            exibir_solução();
        }
    }
    
    boolean verif_resol() {
        int x = 0;
        int verif[][] = new int[9][9];
        boolean result = true;
        verificar_imposs();
        while (x != 81) {
            x = 0;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    verif[i][j] = solução[i][j];
                }
            }
            insert_p_bloco();
            insert_p_linha();
            insert_p_coluna();
            criar_fantasma();
            insert_p_bloco();
            aux_fantasma();
            insert_p_bloco();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (solução[i][j] == verif[i][j]) {
                        x++;
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (solução[i][j] == 0) {
                    result = false;
                    i = 10;
                    j = 10;
                }
            }
        }
        return result;
    }

    //
    //
    //
    //MATRIZES DE TESTE
    //inicializa um sudoku predefinido
    //
    //fácil:
    void iniciar_teste() {
        System.out.print("\n"
                + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-"
                + "\n\nTESTE 1\n(nivel fácil)\n");
        int l;
        int c;
        int val;
        int[] sudok = {121, 134, 229, 256, 263, 284, 298, 338, 347, 364, 375, 393, 427, 439, 476, 522, 587, 636, 679, 681, 717, 732, 741, 766, 773, 816, 823, 844, 859, 888, 974, 982};
        for (int i = 0; i < sudok.length; i++) {
            val = sudok[i];
            l = val / 100;
            c = (val - (l * 100)) / 10;
            val = (val - (l * 100)) - (c * 10);
            l = l - 1;
            c = c - 1;
            questão[l][c] = val;
        }
        this.solução = this.questão;
        exibir_questão();
        Scanner sc_c = new Scanner(System.in);
//resp = sc_c.next().charAt(0);
        System.out.print("\nContinuar?\n");
        resp = sc_c.next().charAt(0);
    }

    //médio:
    void iniciar_teste_2() {
        System.out.print("\n"
                + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-"
                + "\n\nTESTE 2\n(nivel médio)\n");
        int l;
        int c;
        int val;
        int[] sudok = {141, 211, 227, 289, 296, 316, 328, 352, 384, 395, 498, 533, 542, 569, 575, 612, 713, 725, 754, 787, 799, 818, 821, 885, 894, 967};
        for (int i = 0; i < sudok.length; i++) {
            val = sudok[i];
            l = val / 100;
            c = (val - (l * 100)) / 10;
            val = (val - (l * 100)) - (c * 10);
            l = l - 1;
            c = c - 1;
            questão[l][c] = val;
        }
        this.solução = this.questão;
        exibir_questão();
        Scanner sc_c = new Scanner(System.in);
//resp = sc_c.next().charAt(0);
        System.out.print("\nContinuar?\n");
        resp = sc_c.next().charAt(0);
    }

    //difíceis:
    void iniciar_teste_3() {
        System.out.print("\n"
                + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-"
                + "\n\nTESTE 3\n(nivel difícil)\n");
        int l;
        int c;
        int val;
        int[] sudok = {151, 186, 219, 222, 253, 281, 335, 347, 373, 479, 512, 521, 555, 584, 597, 634, 733, 769, 776, 828, 852, 883, 899, 929, 956};
        for (int i = 0; i < sudok.length; i++) {
            val = sudok[i];
            l = val / 100;
            c = (val - (l * 100)) / 10;
            val = (val - (l * 100)) - (c * 10);
            l = l - 1;
            c = c - 1;
            questão[l][c] = val;
        }
        this.solução = this.questão;
        exibir_questão();
        Scanner sc_c = new Scanner(System.in);

        //resp = sc_c.next().charAt(0);
        System.out.print("\nContinuar?\n");
        resp = sc_c.next().charAt(0);
    }

    void iniciar_teste_4() {
        System.out.print("\n"
                + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-"
                + "\n\nTESTE 3\n(nivel  muito difícil)\n");
        int l;
        int c;
        int val;
        int[] sudok = {111, 139, 174, 195, 342, 354, 368, 436, 452, 478, 532, 544, 563, 576, 633, 651, 677, 745, 756, 769, 914, 938, 979, 993};
        for (int i = 0; i < sudok.length; i++) {
            val = sudok[i];
            l = val / 100;
            c = (val - (l * 100)) / 10;
            val = (val - (l * 100)) - (c * 10);
            l = l - 1;
            c = c - 1;
            questão[l][c] = val;
        }
        this.solução = this.questão;
        exibir_questão();
        Scanner sc_c = new Scanner(System.in);

        //resp = sc_c.next().charAt(0);
        System.out.print("\nContinuar?\n");
        resp = sc_c.next().charAt(0);
    }
}
