package CientoCincuenta;


public class Carta{
    private Palo palo;
    private int valor;
    
    public Carta(Palo p, int v)
    {
        setPalo(p);
        setValor(v);
    }

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	} 
}