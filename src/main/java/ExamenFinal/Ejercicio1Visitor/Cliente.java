package ExamenFinal.Ejercicio1Visitor;

public class Cliente {
    public static void main(String[] args){
        LaPaz laPaz = new LaPaz("La Paz", 12, 1000000, "Frio", 500);
        Cochabamba cochabamba = new Cochabamba("Cochabamba", 10, 900000, "Templado", 300);
        SantaCruz santaCruz = new SantaCruz("SantaCruz", 15, 2000000, "Caluroso", 600);
        Turista turista = new Turista("Juan", 1000000, 12345);

        laPaz.accept(turista);
        cochabamba.accept(turista);
        santaCruz.accept(turista);
    }
}
