import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float c;
        System.out.println("Advance Calculator");
        System.out.println("--------------------------");
        System.out.print("enter value of a = ");
        float a = in.nextFloat();
        System.out.print("enter value of b = ");
        float b = in.nextFloat();
        System.out.println("choose case ( 1,2,3,4)");
        int num = in.nextInt();

        switch (num){
            case 1:
                c = a+b;
                System.out.println("ans = "+c);
                break;
            case 2:
                c = a-b;
                System.out.println("ans = "+c);
                break;
            case 3:
                c = a*b;
                System.out.println("ans = "+c);
                break;
            case 4:
                c = a/b;
                System.out.println("ans = "+c);
                break;
            default:
                System.out.println("wrong input");
        }
    }
}




