package ExamenFinal.Ejercicio1Visitor;

public class Cochabamba extends IDepartamento{
    public Cochabamba(String name, int numeroDeProvincias, int numeroHabitantes, String clima, int dineroTurismo) {
        super(name, numeroDeProvincias, numeroHabitantes, clima, dineroTurismo);
    }

    @Override
    public void accept(ITurista turista) {
        turista.visit(this);
    }
}
