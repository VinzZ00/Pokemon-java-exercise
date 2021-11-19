import java.util.Vector;

public class Pikachu extends pokemon{

	public Pikachu() {
		super(100, "Pikachu", "Listrik", "Rumput");
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
		detailpokemon.add("Vinewhip");
		detailpokemon.add(30);
		return detailpokemon;
	}

	@Override
	public Vector<Object> skill3() {
		// TODO Auto-generated method stub
		Vector<Object> detailpokemon = new Vector<Object>();
		detailpokemon.add("Razorleaf");
		detailpokemon.add(40);
		return detailpokemon;
	}

}
