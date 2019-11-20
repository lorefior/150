package CientoCincuenta;

import java.util.ArrayList;
import java.util.List;

public class Ciclo {
	private List<Ronda> rondas;
	private List<Jugador> jugadores;

	public Ciclo(Jugador... algunosJugadores) {
		rondas = new ArrayList<Ronda>();
		rondas.add(new Ronda());

		jugadores = new ArrayList<Jugador>();
		for (Jugador x : algunosJugadores)
			jugadores.add(x);
	}

	public Jugador getGanador() {
		List<Jugador> jugadores = new ArrayList<Jugador>();
		List<Integer> contadores = new ArrayList<Integer>();

		contarRondasGanadas(jugadores, contadores);

		for (int i = 0; i < jugadores.size(); i++)
			if (contadores.get(i) >= 2)
				return jugadores.get(i);

		return null;
	}

	private void contarRondasGanadas(List<Jugador> jugadores, List<Integer> contadores) {
		for (Ronda x : rondas) {
			Jugador ganadorDeRonda = x.getGanador();

			if (jugadores.contains(ganadorDeRonda)) {
				Integer i = jugadores.indexOf(ganadorDeRonda);
				contadores.set(i, contadores.get(i) + 1);
			} else {
				jugadores.add(ganadorDeRonda);
				contadores.add(1);
			}
		}
	}

	public Ronda getRonda(int numeroDeRonda) {
		return rondas.get(numeroDeRonda - 1);
	}

	public void jugar(Jugador unJugador, Carta unaCarta)
    {
        if (! jugadores.contains(unJugador))
            throw new RuntimeException("Jugador no registrado.");
        
        Ronda ultimaRonda = rondas.get(rondas.size() - 1);
        
        ultimaRonda.jugar(unJugador, unaCarta);
        if (ultimaRonda.getGanador() != null)
            rondas.add(new Ronda());
    }
}