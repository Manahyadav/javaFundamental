class A{				//inheritance we can acess class A object/ methods in class B

void student(){
System.out.println("manah");
}
}


class B extends A{

void fee(){
System.out.println("5000");
} 
}

class StudentData {
public static void main(String[] args){
	B b = new B();
	b.student();
	b.fee();
}
}
