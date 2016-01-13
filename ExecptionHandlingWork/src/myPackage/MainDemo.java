package myPackage;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add = new Add();
		try{
			add.add();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}		
	}

}
