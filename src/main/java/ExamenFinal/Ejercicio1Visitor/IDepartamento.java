package ExamenFinal.Ejercicio1Visitor;

public abstract class IDepartamento {
    protected String name;
    protected int numeroDeProvincias;
    protected int numeroHab;
    protected String clima;
    protected int dineroTurismo;

    public IDepartamento(String name, int numeroDeProvincias, int numeroHab, String clima, int dineroT) {
        this.name = name;
        this.numeroDeProvincias = numeroDeProvincias;
        this.numeroHab = numeroHab;
        this.clima = clima;
        this.dineroTurismo = dineroT;
    }

    public abstract void accept(ITurista turista);
}
