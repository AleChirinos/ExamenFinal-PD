package ExamenFinal.Ejercicio4Proxy;

public class Cliente {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Servidor1(), new Servidor2());

        proxy.register(6,"Rebeca", "Rebe", "def");
        proxy.register(7,"Sofia", "Sofi", "789");

        proxy.brindarAtencion(6, "def");
        proxy.brindarAtencion(7, "789");
    }
}
