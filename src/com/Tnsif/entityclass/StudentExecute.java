package com.Tnsif.entityclass;

public class StudentExecute {

	public static void main(String[] args) {
		Student c1=new Student();
		c1.setId(101);
		c1.setCname("raja");
		c1.setCity("villupuram");
		System.out.println("id:"+c1.getId()+"name:"+c1.getCname()+"city:"+c1.getCity());
		Student c2=new Student();
		c2.setId(102);
		c2.setCname("kee");
		c2.setCity("pondy");
		System.out.println("id:"+c2.getId()+"name:"+c2.getCname()+"city:"+c2.getCity());

	}

	@Override
	public String toString() {
		return "StudentExecute [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
