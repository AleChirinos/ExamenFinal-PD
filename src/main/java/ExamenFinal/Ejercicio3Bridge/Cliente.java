package ExamenFinal.Ejercicio3Bridge;

public class Cliente {
    public static void main(String[] args) {
        SistemaColegio sistema = new SistemaColegio("Colegio Amor de Dios", 10000, "nombre completo, libreta, codigo, matricula pagada");

        sistema.publicarEnRedSocial(new Facebook());
        sistema.publicarEnRedSocial(new Twiter());
        sistema.publicarEnRedSocial(new WhatsApp());
    }
}
