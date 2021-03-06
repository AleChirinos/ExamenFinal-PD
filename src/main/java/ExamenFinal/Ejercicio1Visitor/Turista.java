package ExamenFinal.Ejercicio1Visitor;

import java.util.Random;

public class Turista extends ITurista{
    public Turista(String name, int monto, int ci) {
        super(name, monto, ci);
    }

    @Override
    public void visit(LaPaz laPaz) {
        Random random = new Random();
        System.out.println("------ ESTAMOS EN LA PAZ ------");
        System.out.println("Nombre: " + laPaz.nombre);
        int montoneg = random.nextInt(monto/2);
        System.out.println("Dinero gastado: " + montoneg);
        monto-=montoneg;
        System.out.println("Saldo: " + monto);
    }

    @Override
    public void visit(Cochabamba cochabamba) {
        System.out.println("------ ESTAMOS EN COCHABAMBA ------");
        System.out.println("Nombre: " + cochabamba.nombre);
        System.out.println("Dinero gastado: " + cochabamba.numeroHabitantes*0.10);
        monto-=cochabamba.numeroHabitantes*0.10;
        System.out.println("Saldo: " + monto);
    }

    @Override
    public void visit(SantaCruz santaCruz) {
        System.out.println("------ ESTAMOS EN SANTA CRUZ ------");
        System.out.println("Nombre: " + santaCruz.nombre);
        System.out.println("Dinero gastado: " + santaCruz.numeroDeProvincias/2);
        monto-=santaCruz.numeroDeProvincias/2;
        System.out.println("Saldo: " + monto);
    }
}