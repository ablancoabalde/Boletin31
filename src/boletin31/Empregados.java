package boletin31;

public abstract class Empregados {

    private String nome;
    private String apelidos;
    private String dni;
    private String direcc;
    private int antiguedad;
    private String telf;
    private double salario;
    private Empregados xefe;

    public abstract void amosar();

    public abstract void cmSupervisor(Empregados xefe);

    public abstract void inSalario();

    public Empregados(String nome, String apelidos, String dni, String direcc, int antiguedad, String telf, double salario) {
        this.nome=nome;
        this.apelidos=apelidos;
        this.dni=dni;
        this.direcc=direcc;
        this.antiguedad=antiguedad;
        this.telf=telf;
        this.salario=salario;
    }

    public Empregados() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos=apelidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni=dni;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc=direcc;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad=antiguedad;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf=telf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario+=salario;
    }

    public Empregados getXefe() {
        return xefe;
    }

    public void setXefe(Empregados xefe) {
        this.xefe=xefe;
    }

    @Override
    public String toString() {
        return "Empregados{"+"nome="+nome+", apelidos="+apelidos+", dni="+dni+", direcc="+direcc+", antiguedad="+antiguedad+", telf="+telf+", salario="+salario+'}';
    }

    
    
}
