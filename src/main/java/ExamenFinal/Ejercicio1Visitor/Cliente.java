package ExamenFinal.Ejercicio1Visitor;

public class Cliente {
    public static void main(String[] args){
        LaPaz laPaz = new LaPaz("La Paz", 26, 3597853, "Frio", 700);
        Cochabamba cochabamba = new Cochabamba("Cochabamba", 17, 3000999, "Caluroso", 500);
        SantaCruz santaCruz = new SantaCruz("SantaCruz", 33, 5999377, "Caluroso", 1000);
        Turista turista = new Turista("Pedro", 70000000, 6725678);

        laPaz.accept(turista);
        cochabamba.accept(turista);
        santaCruz.accept(turista);
    }
}
