import java.util.Scanner;
public class exer1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //armazenar as 4 notas do ano de 4 alunos.

        double [][] notasAlunos = new double[30][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        notasAlunos[3][0] = 7;
        notasAlunos[3][1] = 10;
        notasAlunos[3][2] = 5.5;
        notasAlunos[3][3] = 8;

    }
}