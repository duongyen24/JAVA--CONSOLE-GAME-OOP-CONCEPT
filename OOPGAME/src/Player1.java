
public class Player1 {
	private String name;
	private String weapon;
	private int heath;
	
	
	// create constructor : alt shift S
	public Player1(String name, String weapon, int heath) {
		
		this.name = name;
		this.weapon = weapon;
		// limit user access heath by using encapsulation
		if(heath < 0 || heath >100 ) {
			this.heath = 100;
		}else this.heath = heath;
	}
	
	// create a method
	public void damagebygun1() {
		this.heath -= 30;
		if ( this.heath <= 0) {
			this.heath = 0;
		}
		
		//sysout + ctrl space
		System.out.println("got hit by gun 1." + " new heath is "+ this.heath );
		
		if( this.heath ==0) {
			System.out.println(getName()+ "dead");
		}
		
	}
	
	public void damagebygun2() {
		this.heath -= 50;
		if ( this.heath <= 0) {
			this.heath = 0;
		}
		
		//sysout + ctrl space
		System.out.println("got hit by gun 2." + " new heath is "+ this.heath );
		
		if( this.heath ==0) {
			System.out.println(getName()+ "dead");
		}
		
	}

	// heal method
	public void heal() {
		if(this.heath <= 0 ) System.out.println("heal is impossible");
		else {
			this.heath = 100;
			System.out.println("heath is " + this.heath);
		}
	}
	
	//generate getter and setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHeath() {
		return heath;
	}

	public void setHeath(int heath) {
		this.heath = heath;
	}
	
	
	
	

}
