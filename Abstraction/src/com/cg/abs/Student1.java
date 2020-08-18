package com.cg.abs;

public class Student1 {
	
	int rollNo;
	String stuName;

	public Student1(int rollNo, String stuName) {
		super();
		this.rollNo = rollNo;
		this.stuName = stuName;
	}
		

@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return rollNo+stuName.hashCode();
		
		
	}


@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", stuName=" + stuName + "]";
	}


    @Override
public boolean equals(Object o) {
    	Student1 s= (Student1) o;
    	if(this.rollNo == s.rollNo &&  this.stuName.equals(s.stuName)) {
	return true;
    	}
	else
		return false;		
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	Student1 stud1= new Student1(222,"gayu");
    	Student1 stud2= new Student1(222,"indhu");
    	Student1 stud3= new Student1(224,"vikas");
    	Student1 stud4= new Student1(225,"gayu");
    	
    	 System.out.println(stud1.rollNo + " " + stud1.stuName + " " +stud1.hashCode()+ "\t" + System.identityHashCode(stud1));
         System.out.println(stud2.rollNo + " " + stud2.stuName+ " " +stud2.hashCode()+"\t" + System.identityHashCode(stud2));
         System.out.println(stud3.rollNo + " " + stud3.stuName+ " " +stud3.hashCode()+ "\t" + System.identityHashCode(stud3));
         System.out.println(stud4.rollNo + " " + stud4.stuName+ " " +stud4.hashCode()+ "\t" + System.identityHashCode(stud4));
         System.out.println(stud1.rollNo==stud2.rollNo);
         System.out.println(stud3.equals(stud4));
         System.out.println(stud1.equals(stud4));
         
    	
    	
    	//System.out.println(stu1.toString());

	}

}
