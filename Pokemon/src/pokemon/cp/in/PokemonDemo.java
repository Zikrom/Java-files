package pokemon.cp.in;

public class PokemonDemo {

	public static void main(String[] args) {
		Pokemon p = new Pokemon(1, "Pikachu", "Electric", 90, 21, 6);
		p.calCP(p);
		p.disp(p);
		
		Pokemon q = new Pokemon(2, "Charizard", "Fire", 190, 51, 11);
		q.calCP(q);
		q.disp(q);

		Pokemon r = new Pokemon(3, "Articuno", "Ice", 3900, 521, 76);
		r.calCP(r);
		r.disp(r);

	}

}
