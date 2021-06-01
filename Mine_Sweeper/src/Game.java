
import java.util.Random;
import java.util.Scanner;

public class Game {

    public void run() {
        int row, col;
        boolean end;
        System.out.println("==========MAYIN TARLASI==========");
        Scanner inp = new Scanner(System.in);
        System.out.print("Satır Sayısını Giriniz : ");
        row = inp.nextInt();
        System.out.print("Sütun Sayısını Giriniz : ");
        col = inp.nextInt();
        if (row * col > 0) {
            int gameArea[][] = createMatrix(row, col);
            System.out.println("Mayınların Konumu :");
            printMineArea(gameArea);
            System.out.println("=============================");
            String strGameArea[][] = new String[row][col];
            createStringArea(strGameArea);
            do {
                System.out.println("=============================");
                System.out.print("Satır Sayısını Giriniz : ");
                row = inp.nextInt();
                System.out.print("Sütun Sayısını Giriniz : ");
                col = inp.nextInt();
                printGameArea(gameArea, strGameArea, row, col);
                end = control(gameArea, row, col);
            } while (end && controlEnd(strGameArea, gameArea));
            if (end) {
                System.out.println("Oyunu başarıyla tamamladınız");
            }
        } else {
            System.out.println("Hatalı Değerler!!!");
        }

    }

    public int[][] createMatrix(int row, int col) {
        int gameArea[][] = new int[row][col];
        pushMine(gameArea);
        pushNumber(gameArea);
        return gameArea;
    }

    public void pushNumber(int gameArea[][]) {
        int boundX = gameArea[0].length, boundY = gameArea.length;
        for (int i = 0; i < gameArea.length; i++) {
            for (int j = 0; j < gameArea[i].length; j++) {
                if (gameArea[i][j] == -2) {
                    int value = (i - 1) + (j - 1);
                    if (i - 1 >= 0 && j - 1 >= 0 && gameArea[i - 1][j - 1] > -2) {
                        gameArea[i - 1][j - 1]++;
                    }
                    if (i - 1 >= 0 && gameArea[i - 1][j] > -2) {
                        gameArea[i - 1][j]++;
                    }
                    if (i - 1 >= 0 && j + 1 < boundX && gameArea[i - 1][j + 1] > -2) {
                        gameArea[i - 1][j + 1]++;
                    }
                    if (j - 1 >= 0 && gameArea[i][j - 1] > -2) {
                        gameArea[i][j - 1]++;
                    }
                    if (j + 1 < boundX && gameArea[i][j + 1] > -2) {
                        gameArea[i][j + 1]++;
                    }
                    if (i + 1 < boundY && 0 <= j - 1 && gameArea[i + 1][j - 1] > -2) {
                        gameArea[i + 1][j - 1]++;
                    }
                    if (i + 1 < boundY && gameArea[i + 1][j] > -2) {
                        gameArea[i + 1][j]++;
                    }
                    if (i + 1 < boundY && j + 1 < boundX && gameArea[i + 1][j + 1] > -2) {
                        gameArea[i + 1][j + 1]++;
                    }
                }

            }
        }
    }

    public void pushMine(int gameArea[][]) {
        int rowLen = gameArea.length, colLen = gameArea[0].length;
        int mines = (rowLen * colLen) / 4, row, col;
        Random r = new Random();
        for (int i = 0; i < mines; i++) {
            row = r.nextInt(rowLen);
            col = r.nextInt(colLen);
            gameArea[row][col] = -2;
        }
    }

    public void printMineArea(int gameArea[][]) {
        for (int[] row : gameArea) {
            for (int col : row) {
                if (col == -2) {
                    System.out.print("# ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public boolean control(int gameArea[][], int x, int y) {
        if (gameArea[x][y] == -2) {
            System.out.println("Oyunu Kaybettiniz!!!");
            return false;
        }
        return true;
    }

    public boolean controlEnd(String strArea[][], int gameArea[][]) {
        boolean b = false;
        for (int i = 0; i < strArea.length; i++) {
            for (int j = 0; j < strArea[i].length; j++) {
                if (strArea[i][j] == "-") {
                    if (gameArea[i][j] != -2) {
                        b = true;
                    }
                }
            }
        }
        return b;
    }

    public void createStringArea(String gameArea[][]) {
        for (int i = 0; i < gameArea.length; i++) {
            for (int j = 0; j < gameArea[i].length; j++) {
                gameArea[i][j] = "-";
                System.out.print("- ");
            }
            System.out.println();
        }
    }

    public void printGameArea(int gameArea[][], String strArea[][], int x, int y) {
        for (int i = 0; i < gameArea.length; i++) {
            for (int j = 0; j < gameArea[i].length; j++) {
                if (x == i && y == j) {
                    if (gameArea[i][j] == -2) {
                        System.out.print("# ");
                    } else {
                        System.out.print(gameArea[i][j] + " ");
                        strArea[i][j] = String.valueOf(gameArea[i][j]);
                    }
                } else {
                    System.out.print(strArea[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
