class StudentCons{
	int roll;
	String name;

	public StudentCons(int r,String n){
	roll = r;
	name = n;
}
	void show(){
	System.out.println(roll+"\n "+name);
}


	public static void main(String[] args){
	StudentCons st = new StudentCons(123,"manah");
	st.show();
	System.out.println(roll);
	
}
}