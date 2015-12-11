/*
 * Design a Person class implements Comparable interface. 
 * In the Person class, you should have at least firstName and lastName attributes, 
 * getters/setters about them, override compareTo(), equals(), hashCode(), toString() 
 * functions based on them. Please follow the google java coding style to finish it.
 */
public class Person implements Comparable<Person> {
   
	

	private String firstName;
	private String lastName;
	
	Person(String F, String L){
		this.setfirstName(F);
		this.setlastName(L);
	}
   
	private void setlastName(String lastName) {
		this.lastName=lastName;
		
	}

	private void setfirstName(String firstName) {
		this.firstName=firstName;
		
	}
	public String getlastName() {
		return this.lastName;
	}
	public String getfirstName() {
		return this.firstName;
	}
	public Person() {
		
	}

	@Override
	// this is wrong, hashcode cannot be used to compare which one is larger. -2
	public int compareTo(Person P){
	
		if(this.hashCode()>P.hashCode()){
			return 1;
		}
		if(this.hashCode()<P.hashCode()){
			return -1;
		}
		return 0;
		
	}

	@Override
	public int hashCode(){
		int code=13;
		code=31*code+firstName.hashCode();
		code=31*code+lastName.hashCode();
		return code;
	}
	//where is @Override? -3
	public boolean equals(Person P){
		
		if(this.getfirstName().equals(P.getfirstName())&&this.getlastName().equals(P.getlastName())){
			return true;
		}
		return false;
		
	}
	public String tostring(){
		
		return this.getfirstName()+this.getlastName();
		
	}
}

