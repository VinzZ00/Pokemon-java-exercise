import java.util.Vector;

public abstract class pokemon {

	private int health;
	private String namapokemon;
	private String element;
	private String weakness;
	
	
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getNamapokemon() {
		return namapokemon;
	}

	public void setNamapokemon(String namapokemon) {
		this.namapokemon = namapokemon;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	

	public pokemon(int health, String namapokemon, String element, String weakness) {
		this.health = health;
		this.namapokemon = namapokemon;
		this.element = element;
		this.weakness = weakness;
	}

	public abstract Vector<Object> skill1();
	
	public abstract Vector<Object> skill2();
	
	public abstract Vector<Object> skill3();

}
