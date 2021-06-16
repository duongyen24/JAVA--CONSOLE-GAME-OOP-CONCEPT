
public class Player2 extends Player1 {
	
	private int heath;
	private boolean armour;
	
	//constructor
	public Player2(String name, String weapon, int heath, boolean armour) {
		super(name, weapon, heath);
		this.heath = heath;
		this.armour = armour;
	}

	@Override
	public void damagebygun1() {
		
		if(armour) { // armour on
			this.heath -= 20;
			if(this.heath <= 0) {
				this.heath = 0;
				System.out.println("armour on, got hit by gun 1, reduce 20 " + "new heath is" + this.heath);
			}
		}
		if (!armour) {
			this.heath -= 30;
			if(this.heath <= 0) {
				this.heath = 0;
				System.out.println("armour off, got hit by gun 1, reduce 30 " + "new heath is" + this.heath);
			}
		}
		
		if(this.heath == 0) {
			System.out.println(getName()+ " is dead");
		}
	
	}
	
	@Override
	public void damagebygun2() {
		
		if(armour) { // armour on
			this.heath -= 40;
			if(this.heath <= 0) {
				this.heath = 0;
				System.out.println("armour on, got hit by gun 1, reduce 40 " + "new heath is" + this.heath);
			}
		}
		if (!armour) {
			this.heath -= 50;
			if(this.heath <= 0) {
				this.heath = 0;
				System.out.println("armour off, got hit by gun 1, reduce 50 " + "new heath is" + this.heath);
			}
		}
		
		if(this.heath == 0) {
			System.out.println(getName()+ " is dead");
		}
	
	}
	


}
