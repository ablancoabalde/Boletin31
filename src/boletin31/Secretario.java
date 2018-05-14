package boletin31;

public class Secretario extends Empregados {
    
    private String fax;
    private Empregados xefe;
    private Despacho des;
    private static final double incremento=0.05;
    
    @Override
    public void amosar() {
        
        System.out.println(super.toString()+" "+this.toString());
        
    }
    
    @Override
    public void cmSupervisor(Empregados xefeNuevo) {
        this.setXefe(xefeNuevo);
    }
    
    @Override
    public void inSalario() {
        super.setSalario((this.getSalario()*incremento)*super.getAntiguedad());
        
    }

    
    public Secretario( String fax, Despacho des, String nome, String apelidos, String dni, String direcc, int antiguedad, String telf, double salario) {
        super(nome, apelidos, dni, direcc, antiguedad, telf, salario);
        this.fax=fax;
        this.des=des;
        this.xefe=xefe;
    }
    
    public String getFax() {
        return fax;
    }
    
    public void setFax(String fax) {
        this.fax=fax;
    }
    
    @Override
    public Empregados getXefe() {
        return xefe;
    }
    
    @Override
    public void setXefe(Empregados xefe) {
        this.xefe=xefe;
    }
    
    public Despacho getDes() {
        return des;
    }
    
    public void setDes(Despacho des) {
        this.des=des;
    }
    
    @Override
    public String toString() {
        return "Secretario{"+", fax="+fax+", xefe="+xefe+", des="+des+'}';
    }
    
}
