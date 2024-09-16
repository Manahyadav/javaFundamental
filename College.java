class College{
	private String name;	
	private String roll;
	private int mark;
	private char grade;
 	private double fly;

	public void setName(String name){
	this.name = name;
}
	public String getName(){
	return name;
}

	public void setRoll(String roll){
	this.roll = roll;	
}
	public String getRoll(){
	return roll;
}

	public void setMark(int mark){
	this.mark = mark;	
}
	public int getMark(){
	return mark;
}

	public void setGrade(char grade){
	this.grade = grade;	
}
	public char getGrade(){
	return grade;
}

	public void setFloat(double fly){
	this.fly = fly;	
}
	public double getFloat(){
	return fly;
}


	public static void main(String[] args){
	College coll = new College();
	coll.setName("Manah");
	System.out.println(coll.getName());
	coll.setRoll("30");
	System.out.println("this is string " + coll.getRoll());
	coll.setMark(30);
	System.out.println(coll.getMark());
	coll.setGrade('A');
	System.out.println(coll.getGrade());
	coll.setFloat(2.23);
	System.out.println(coll.getFloat());
	

}
}