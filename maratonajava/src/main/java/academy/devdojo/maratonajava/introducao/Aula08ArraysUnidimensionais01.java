package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysUnidimensionais01 {
    public static void main(String[] args) {
//             1,2,3.. = meses
//             31, 28, 29.. = dias
        int[][] dias = new int[3][3];
        System.out.println(dias[0]);

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 28;
        dias[1][1] = 30;
        dias[1][2] = 27;

//        for (int i = 0; i < dias.length ; i++) {
//            for (int j = 0; j < dias[i].length ; j++) {
//                System.out.println(dias[i][j]);
//            }
        System.out.println("--------");
        for (int[] dia : dias) {
            for (int num : dia) {
                System.out.println(num);
            }

        }
    }
}
