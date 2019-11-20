package CientoCincuenta;

public class Juego {
	private Mazo mazo;
	private Ciclo ciclo;

	public void repartir() {

		for (Jugador x : jugadores)
			x.repartir(new Mano(mazo.sacar(), mazo.sacar(), mazo.sacar(), mazo.sacar(), mazo.sacar()));
	}

}

//public static void main(String[] args) {

//}