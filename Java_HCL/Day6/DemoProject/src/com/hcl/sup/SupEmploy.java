package com.hcl.sup;
class HclEmploy{
	String sapId;
	String Name;
	String gender;
	String designation;
	public HclEmploy(String sapId, String name, String gender, String designation) {
		super();
		this.sapId = sapId;
		Name = name;
		this.gender = gender;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "HclEmploy [sapId=" + sapId + ", Name=" + Name + ", gender=" + gender + ", designation=" + designation
				+ "]";
	}
	
}
class Nanditha extends HclEmploy{

	public Nanditha(String sapId, String name, String gender, String designation) {
		super(sapId, name, gender, designation);
		// TODO Auto-generated constructor stub
	}
	
}
class Monica extends HclEmploy{

	public Monica(String sapId, String name, String gender, String designation) {
		super(sapId, name, gender, designation);
		// TODO Auto-generated constructor stub
	}
	
}
class Anusha extends HclEmploy{

	public Anusha(String sapId, String name, String gender, String designation) {
		super(sapId, name, gender, designation);
		// TODO Auto-generated constructor stub
	}
	
}

public class SupEmploy {
	public static void main(String[] args) {
		HclEmploy employNanditha=new Nanditha("1222", "Nanditha", "Female", "SWE");
		HclEmploy employMonica=new Monica("1333","Monica","Female","SWE");
		HclEmploy employAnusha=new Anusha("1444","Anusha","Female","SWE");
	 HclEmploy[] arrHcl=
		 {
				 employNanditha,
				 employMonica,
				 employAnusha,
				 
		 };
	 for (HclEmploy hclEmploy : arrHcl) {
		 System.out.println(hclEmploy);
		
	}
		
	}
	

}