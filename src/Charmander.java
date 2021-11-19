import java.util.Vector;

public class Charmander extends pokemon{

	
	
	public Charmander() {
		super(100, "Charmander", "Api", "Air");
	}

	@Override
	public Vector<Object> skill1() {
		// TODO Auto-generated method stub
		Vector<Object> detailpokemon = new Vector<Object>();
		detailpokemon.add("Takle");
		detailpokemon.add(20);
		return detailpokemon;
	}

	
	
	@Override
	public Vector<Object> skill2() {
		// TODO Auto-generated method stub
		Vector<Object> detailpokemon = new Vector<Object>();
		detailpokemon.add("Burst");
		detailpokemon.add(30);
		return detailpokemon;
	}

	
	
	@Override
	public Vector<Object> skill3() {
		// TODO Auto-generated method stub
		Vector<Object> detailpokemon = new Vector<Object>();
		detailpokemon.add("Flamethrower");
		detailpokemon.add(40);
		return detailpokemon;
	}

	

}
