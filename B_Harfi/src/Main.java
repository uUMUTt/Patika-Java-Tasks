
public class Main {

    public static void main(String[] args) {
        String[][] letter = new String[7][4];
        int len = letter.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < letter[i].length - 1; j++) {
                if (i % 3 == 0) {
                    letter[i][j] = "*  ";
                } else {
                    letter[i][0] = "*";
                    letter[i][3] = "*";
                }
            }
        }
        for (String[] row : letter) {
            for (String col : row) {
                if (col == null) {
                    System.out.print("   ");
                } else {
                    System.out.print(col);
                }
            }
            System.out.println();
        }
    }
}
