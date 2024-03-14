package api.h;

public class RecordsRunner {
	
	record Person(String name , String email , String phoneNumber) {
		Person{
			
			if (name.isEmpty() ==true) {
				throw new IllegalArgumentException("name is empty");	
			}
			
		}
		@Override
		public String name() {
			System.out.print("Name is : ");
			return name;
		}
	}

	public static void main(String[] args) {
		
		
		Person person1 = new Person("Bekir", "bekiryildirim.2508@gmail.com", "02125568877");
		Person person2 = new Person("Bekir", "bekiryildirim.2508@gmail.com", "02125568877");
		Person person3 = new Person("Adem", "xoxoasdo.1455@gmail.com", "021233365847");
		
		System.out.println(person1);
		
		System.out.println(person1.equals(person2));
		
		System.out.println(person1.name.equals(person3.name));
		
		System.out.println(person1.name());

	}

}
