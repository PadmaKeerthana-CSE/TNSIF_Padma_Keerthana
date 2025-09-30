package com.Tnsif.entityclass;

public  class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setId(101);
		c1.setCname("raja");
		c1.setCity("villupuram");
		System.out.println("id:"+c1.getId()+"name:"+c1.getCname()+"city:"+c1.getCity());
		Customer c2=new Customer();
		c2.setId(102);
		c2.setCname("kee");
		c2.setCity("pondy");
		System.out.println("id:"+c2.getId()+"name:"+c2.getCname()+"city:"+c2.getCity());
		

	}

}
