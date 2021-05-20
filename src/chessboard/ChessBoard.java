package chessboard;

public class ChessBoard {

    public static void main(String[] args) {
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if(i % 2 == 0) {
//                    if(j % 2 == 0) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("   ");
//                    }
//                    
//                } else {
//                    if(j % 2 == 0) {
//                        System.out.print("   ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                }
//            }
//            
//            System.out.println();
//        }

        Table.drawTable();
        Table.printNumbers();
    }
}

class Table {

    public static void drawTable() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                } else {
                    if (j % 2 == 0) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }

                if (i == 5 && j == 5) {
                    System.out.print("Q");
                }

                if (i == 3 && j == 3) {
                    System.out.print("P");
                }
            }

            System.out.println();
        }
    }

    public static void printNumbers() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i == j) {
                    System.out.print("P     ");
                } else if (j > i) {
                    System.out.print("H     ");
                } else {
                    System.out.print("(" + i + ", " + j + ")");
                }
            }
            System.out.println();
        }
    }
}
