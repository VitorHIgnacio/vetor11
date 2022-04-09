import java.util.Scanner;
class Main {
  public static void main(String[] args) {


   Scanner leitor = new Scanner(System.in);

        int linha = 2;
        int coluna = 3;

        int lMaior = 0;
        int cMaior = 0;
        int lMenor = 0;
        int cMenor = 0;


        int matriz[][] = new int[linha][coluna], maior,menor;


        System.out.println("\n\n:::Receber Matriz:::\n");

        for (int l = 0; l < linha; l++) {//recebe matriz
            for (int c = 0; c < coluna; c++) {
                System.out.print("Digite o elemento da linha " + (l + 1) + " da coluna " + (c + 1) + ":");
                matriz[l][c] = leitor.nextInt();
            }
        }

        System.out.println("\n\n:::Matriz:::\n");

        for (int l = 0; l < linha; l++) {//imprimi matriz
            for (int c = 0; c < coluna; c++) {
                System.out.print("|" + matriz[l][c] + "|\t");

            }
            System.out.println();
        }

        maior = matriz[0][0];
        menor = matriz[0][0];
        ;
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                if (matriz[l][c] > maior) {
                    maior = matriz[l][c];
                    lMaior = l;
                    cMaior = c;
                }
                if (matriz[l][c] < menor) {
                    menor = matriz[l][c];
                    lMenor = l;
                    cMenor = c;
                }
            }
        }

        System.out.println("\n\nMaior número da matriz: " + maior);
        System.out.println("Posição, linha: " + (lMaior+1) + " coluna: " + (cMaior+1));

        System.out.println("\n\nMenor número da matriz " + menor);
        System.out.println("Posição, linha: "+ (lMenor+1) +" coluna: "+(cMenor+1));








  }
}