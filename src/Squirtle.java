import java.util.Vector;

public class Squirtle extends pokemon{

	public Squirtle() {
		super(100, "Squirtle", "Air", "Listrik");
		// TODO Auto-generated constructor stub
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
		detailpokemon.add("Waterball");
		detailpokemon.add(30);
		return detailpokemon;
	}

	@Override
	public Vector<Object> skill3() {
		// TODO Auto-generated method stub
		Vector<Object> detailpokemon = new Vector<Object>();
		detailpokemon.add("Watercanon");
		detailpokemon.add(40);
		return detailpokemon;
	}
	

}
