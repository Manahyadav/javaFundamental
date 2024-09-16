import java.util.*;
class StudentScanner{
	void show(){
	System.out.println("Hello");
}

	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	System.out.print("enter your name :");
	String name = in.nextLine();
	System.out.print("enter your roll :");
	int rollno = in.nextInt();
	System.out.print("enter your marks :");
	int marks = in.nextInt();
	System.out.print("enter your grade :");
	char grade = in.next().charAt(0);
	System.out.println("Your name is "+ name +" and roll is "+ rollno +" and marks"+ marks + "and grade" + grade);
	
	
}
}