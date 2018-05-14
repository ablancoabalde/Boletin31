package boletin31;

import java.util.ArrayList;

public class XZona extends Empregados {

    private Despacho des;
    private Secretario sec;
    private ArrayList<Vendedor> lv=new ArrayList();
    private Coche coche;
    private static final double incremento=0.20;

    public void cmSecretaria(Secretario sect1) {
        this.setSec(sect1);
    }

    public void cambiarCoche(Coche coche1) {
        this.setCoche(coche1);

    }
    
    public void addVendedor(Vendedor v1){
        lv.add(v1);
    }
    
    public void removeVendedor(Vendedor v1){
        lv.remove(v1);
    }

    @Override
    public void amosar() {
        System.out.println(super.toString()+" "+this.toString());
    }

    @Override
    public void inSalario() {
        super.setSalario((this.getSalario()*incremento)*super.getAntiguedad());
    }

    @Override
    public void cmSupervisor(Empregados xefeNuevo) {
    }

    public XZona(Despacho des, Coche coche, String nome, String apelidos, String dni, String direcc, int antiguedad, String telf, double salario) {
        super(nome, apelidos, dni, direcc, antiguedad, telf, salario);
        this.des=des;
        this.sec=sec;
        this.coche=coche;
    }

    public Despacho getDes() {
        return des;
    }

    public void setDes(Despacho des) {
        this.des=des;
    }

    public Secretario getSec() {
        return sec;
    }

    public void setSec(Secretario sec) {
        this.sec=sec;
    }

    public ArrayList<Vendedor> getLv() {
        return lv;
    }

    public void setLv(ArrayList<Vendedor> lv) {
        this.lv=lv;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche=coche;
    }

    @Override
    public String toString() {
        return "XZona{"+"des="+des+", sec="+sec+", lv="+lv+", coche="+coche+'}';
    }

}
