
public class Player1 {
	private String name;
	private String weapon;
	private int heath;
	
	
	// create constructor : alt shift S
	public Player1(String name, String weapon, int heath) {
		super();
		this.name = name;
		this.weapon = weapon;
		this.heath = heath;
	}
	
	// create a method
	public void damagebygun1() {
		this.heath -= 30;
		if ( this.heath <= 0) {
			this.heath = 0;
		}
		
		//sysout + ctrl space
		System.out.println("got hit by gun 1." + " new heath is "+ this.heath );
		
		
	}
	
	

}
