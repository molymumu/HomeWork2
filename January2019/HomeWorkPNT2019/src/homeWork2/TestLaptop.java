package homeWork2;

public class TestLaptop {

	public static void main(String[] args) {
		Laptop hamid = new Laptop();
		hamid.setLaptopSize(13);
		int hamidLaptopSizeBefore =hamid.getLaptopSize();
		System.out.println("hamid's Laptop size :" + hamidLaptopSizeBefore );
		hamid.setLaptopModel("apple");
        Laptop sumon =new Laptop();
        sumon.setLaptopSize(15);
        //int sumonLaptopSize =sumon.getLaptopSize();
        
    int sumonLaptopSizeAfter =sumon.getLaptopSize();
    System.out.println("sumon's laptop size :" + sumonLaptopSizeAfter);
	sumon.moveLaptopColore();
	//Laptop.moveLaptopColore();
	//hamid.moveLaptopColore();
	}
	
}
