package parcial2;

public class Motocicleta extends Vehiculo{
    private TipoMotocicleta tipoMotocicleta;
    
    public Motocicleta(String marca, int año, String modelo, TipoMotocicleta tipoMotocicleta){
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta;
        
    }
    
     public TipoMotocicleta getTipoMotocicleta(){
     
        return (tipoMotocicleta);
    }
    
    @Override
     public String imprimirInformacion(){
        
        return (marca + modelo + año + getTipoMotocicleta());
    }
     
    
}
