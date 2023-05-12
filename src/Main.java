import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Ve hinh chu nhat");
        System.out.println("2. Ve hinh tam giac vuong");
        System.out.println("3. Ve hinh tam giac can");
        System.out.println("4. Thoat chuong trinh");

        int choice;
        do {
            System.out.printf("Nhap vao lua chon: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 4;i++){
                        for (int j = 0; j < 7; j++){
                            System.out.printf("*  ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 2:
                    for(int i = 5; i > 0; i--){
                        for (int j = 0; j < i; j++){
                            System.out.printf("*   ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    for (int i = 1; i < 5; i++){
                        for(int j = 0; j < 4 - i; j++){
                            System.out.printf("  ");
                        }
                        for(int j = 0; j < (2 * i -1); j++){
                            System.out.printf("* ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 4:
                    System.out.printf("Ban da thoat khoi chuong trinh");
                    break;
                default:
                    System.out.printf("Chon sai nhap lai");
            }
        }while ( choice != 4 );

    }
}