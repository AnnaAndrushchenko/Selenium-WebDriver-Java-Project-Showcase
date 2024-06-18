package My_Maven.My_Maven;

public class MT_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MT_AddOL add = new MT_AddOL();
		
		System.out.println("Calling sum() without parameters:");
	    add.sum(); 
	    System.out.println();
		
		add.sum(5,15);

		add.sum(11.5, 23);

		add.sum(33, 0.5);

		add.sum(11,21,33);
		}

	}


