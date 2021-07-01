package ExamenFinal.Ejercicio1Visitor;

import java.util.Random;

public class Turista extends ITurista{
    public Turista(String name, int monto, int ci) {
        super(name, monto, ci);
    }

    @Override
    public void visit(LaPaz laPaz) {
        Random random = new Random();
        System.out.println("Visitando " + laPaz.name);
        int montoneg = random.nextInt(monto/2);
        System.out.println("El monto de dinero que gastare es de " + montoneg + "bs");
        monto-=montoneg;
        System.out.println("Saldo restante: " + monto);
    }

    @Override
    public void visit(Cochabamba cochabamba) {
        System.out.println("Visitando " + cochabamba.name);
        System.out.println("El monto de dinero que gastare es de " + 10*cochabamba.numeroHab/100 + "bs");
        monto-=10*cochabamba.numeroHab/100;
        System.out.println("Saldo restante: " + monto);
    }

    @Override
    public void visit(SantaCruz santaCruz) {
        System.out.println("Visitando " + santaCruz.name);
        System.out.println("El monto de dinero que gastare es de " + santaCruz.numeroDeProvincias/2 + "bs");
        monto-=santaCruz.numeroDeProvincias/2;
        System.out.println("Saldo restante: " + monto);
    }
}