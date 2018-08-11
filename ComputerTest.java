package myprograms;

/*
Input:
PC					Laptop
Intel					Intel

Output:
I am INTEL of type PC			I am Intel of type Laptop
*/

interface Computer{
	void compute();
}
abstract class AbstractComputer implements Computer{
	private String type;
	private String name;

	public AbstractComputer(String type, String name){
		//Add your code here
		this.type=type;
		this.name=name;
	}
	@Override
	public void compute() {
		
	}

	public String toString(){
		return "I am " + name + " of type " + type;
	}
}
//Your code here
class PC extends AbstractComputer{
	public PC(String type, String name){
		super(type,name);
	}
	@Override
	public void compute(){
		//Add necessary code
		System.out.println(this);
	}
}

//your code here
class Laptop extends AbstractComputer{
	public Laptop(String type, String name){
		super(type,name);	
	}
	@Override
	public void compute(){
		System.out.println(this);
	}
}
class ComputerTest{
	public static void main(String[] args){
		PC pc = new PC("Intel", "PC");
		pc.compute();

		Laptop lappy = new Laptop("Intel", "Laptop");
		lappy.compute();
	}
}