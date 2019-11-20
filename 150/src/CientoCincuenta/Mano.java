package CientoCincuenta;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;



public class Mano
{
    private Collection<Carta> cartasIniciales;
    private Collection<Carta> cartasEnMano;
    
    public Mano(Carta ... cartas)
    {
        Set<Carta> tmp = new HashSet<Carta>(Arrays.asList(cartas));
        
        if (cartas.length != tmp.size())
            throw new RuntimeException("Carta duplicada.");
        
        cartasIniciales = tmp;
        cartasEnMano = tmp;
    }
 

    public void jugar(Carta c)
    {
        if (! cartasEnMano.contains(c))
            throw new RuntimeException("Carta no esta en mano.");
        cartasEnMano.remove(c);
    }
    
    public Collection<Carta> getCartasEnMano()
    {
        return cartasEnMano;
    }
}
