import java.util.Scanner;

public class tinhNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thang: ");
        byte thang = scanner.nextByte();
        switch (thang) {
            case 2:
                System.out.println(" 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("The month '" + thang + "' has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + thang + "' has 30 days!");
                break;
            default:
                System.out.print("Invalid input!");
                break;
        }
    }
}

