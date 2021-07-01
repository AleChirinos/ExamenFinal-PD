package ExamenFinal.Ejercicio1Visitor;

public class LaPaz extends IDepartamento{
    public LaPaz(String name, int numeroDeProvincias, int numeroHab, String clima, int dineroT) {
        super(name, numeroDeProvincias, numeroHab, clima, dineroT);
    }

    @Override
    public void accept(ITurista turista) {
        turista.visit(this);
    }
}
