
package boletin31;

public class Despacho {
    private String nombreDespacho;

    public Despacho(String nombreDespacho) {
        this.nombreDespacho=nombreDespacho;
    }

    public String getNombreDespacho() {
        return nombreDespacho;
    }

    public void setNombreDespacho(String nombreDespacho) {
        this.nombreDespacho=nombreDespacho;
    }

    @Override
    public String toString() {
        return "Despacho{"+"nombreDespacho="+nombreDespacho+'}';
    }

    
    
}
