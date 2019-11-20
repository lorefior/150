package CientoCincuenta;

import java.util.Map;
import java.util.HashMap;

public class Ronda {
	private Map<Carta, Jugador> cartaJugador = new HashMap<Carta, Jugador>();

	public void jugar(Jugador j, Carta c) {
		cartaJugador.put(c, j);
	}

	public Jugador getGanador() {

		return null;
	}
}
