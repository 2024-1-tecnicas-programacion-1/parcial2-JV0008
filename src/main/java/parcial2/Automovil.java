package parcial2;

public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;
    
    public Automovil(String marca, int año, String modelo, int numeroPuertas, TipoCombustible tipoCombustible){
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
    
    public int getNumeroPuertas(){
     
        return (numeroPuertas);
    }
    
    public TipoCombustible getTipoCombustible(){
     
        return (tipoCombustible);
    }
    
    @Override
     public String imprimirInformacion(){
        
        return (tipoCombustible + marca + modelo + año + numeroPuertas);
    }
     
}
