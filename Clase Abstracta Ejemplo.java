package claseabstracta;

abstract class AbstractClase {
    private int atributo1;
    private String atributo2;
    private double atributo3;
    
    public AbstractClase(int atributo1, String atributo2, double atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }
    
    abstract void metodoAbstracto1();
    abstract void metodoAbstracto2();
}
