package parcial2;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    
    public Vehiculo(String marca, String modelo, int año){
        this.año = año;
        this.marca = marca;
        this.modelo = modelo;
}

    public String setMarca(){
     
        return (marca);
    }
    
    public String setModelo(){
     
        return (modelo);
    }
    
    public int setAño(){
     
        return (año);
    }
    
    public String getMarca(){
     
        return (setMarca());
    }
    
    public String getModelo(){
     
        return (setModelo());
    }
    
    public int getAño(){
     
        return (setAño());
    }
    
    public String imprimirInformacion(){
        
        return (marca + modelo + año);
    }
    
}
