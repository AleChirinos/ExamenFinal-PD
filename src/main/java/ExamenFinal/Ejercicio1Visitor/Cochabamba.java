package ExamenFinal.Ejercicio1Visitor;

public class Cochabamba extends IDepartamento{
    public Cochabamba(String name, int numeroDeProvincias, int numeroHab, String clima, int dineroT) {
        super(name, numeroDeProvincias, numeroHab, clima, dineroT);
    }

    @Override
    public void accept(ITurista turista) {
        turista.visit(this);
    }
}
