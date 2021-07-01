package ExamenFinal.Ejercicio1Visitor;

public abstract class ITurista {
    protected String name;
    protected int monto;
    protected int ci;

    public ITurista(String name, int monto, int ci) {
        this.name = name;
        this.monto = monto;
        this.ci = ci;
    }

    public abstract void visit(LaPaz laPaz);

    public abstract void visit(Cochabamba cochabamba);

    public abstract void visit(SantaCruz santaCruz);

}

