package Queen777;

import java.util.ArrayList;
import java.util.Scanner;

public class Programm {

    public static boolean findPosition(int queenAmount, ArrayList<Position> queens) {
        if (queens.size()>= queenAmount) {
            return true;
        }

        int row = queens.size()+1;
        for (int column =1; column <= queenAmount; column++) {
            Position queenCheck =new Position(row, column);
            
            boolean attack = false;
            for (Position queen : queens) {
                if(queen.Attak(queenCheck)){
                    attack =true;
                    break;
                }
            }
            if (attack) {
                continue;
            }

            queens.add(queenCheck);
            if(findPosition(queenAmount, queens)){
                return true;
            } else {
                queens.remove(queenCheck);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        // Поля + кол ферзей
        Scanner queenScanner = new Scanner(System.in);
        System.out.println("Введи свое количество ферзей: от [4] до [8]");
        int queenAmount = queenScanner.nextInt();

        if(queenAmount<4 || queenAmount >8){
            System.out.println("Ошибка!! -->> Введи свое количество ферзей: от [4] до [8] ");
            return;
        }


        // Расчет координат для задан кол-ва ферзей
        ArrayList<Position> queenPositions = new ArrayList<>();
        boolean okey = findPosition(queenAmount, queenPositions);
        if(!okey) {
            System.out.println("Не удается разместить Королев!!");
            return;
        }


        // Матрица. Визуал
        char[][] doska =  new char[queenAmount][queenAmount];
        for(int i=0; i < queenAmount; i++){
            for (int j=0; j<queenAmount; j++){
                doska[i][j]= '-';
            }
        }

        // Заполнение ферзями
        for (Position queen : queenPositions) {
            doska[queen.getRow()-1][queen.getColumn()-1] = '+';            
        }

        // вывод на экран
        for(int i = 0; i <queenAmount; i++){
            for (int j =0; j < queenAmount; j++){
                System.out.print(doska[i][j]);
            }
            System.out.println();
        }

    }
    
}
