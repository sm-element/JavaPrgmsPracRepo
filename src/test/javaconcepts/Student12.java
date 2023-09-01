package test.javaconcepts;

//@Data
public class Student12 {
	
		int rollno;
		String name;
		int age;

		public Student12(int rollno, String name, int age) {
			this.rollno = rollno;
			this.name = name;
			this.age = age;
		}

		public Student12( String name2, int age2) {
			this.name= name2;
			this.age= age2;
		}

		public Student12() {
			// TODO Auto-generated constructor stub
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		 public String toString(){
			    return "Student Rollno:"+this.rollno
			    		+"Student Name:"+this.name
			      +"Student Age:"+this.age;
			  }
		 
	@Override
		  public boolean equals(Object obj) {
		     if (obj == this) {
		       return true;
		     }
		     if (!(obj instanceof Student12)) {
		       return false;
		     }
		     Student12 studentObj = (Student12) obj;
		       return this.age==studentObj.age
		         && this.name.equalsIgnoreCase(studentObj.name);
		  }
		  @Override
		  public int hashCode() {
		    int hash = 1;
		    hash = hash * 17 + this.name.hashCode();
		    hash = hash * 31 + this.age;
		    return hash;

	}
}
