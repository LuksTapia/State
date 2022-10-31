package State;

public class EstadoTriste extends Estado {

    @Override
    public Estado comer() {
        System.out.println("Comí pero estoy TRISTE");
        return this;
    }



    @Override
    public Estado serPegado() {
        System.out.println("¿Por que?. Sigo más TRISTE");
        return this;

    }

    @Override
    public Estado serAcariciado() {
        System.out.println("Mimo.... gracias, dejo de estar TRISTE");
        return new EstadoFeliz();

    }

    @Override
    public String nombre() {
        return "Estoy tiiishte";
    }

    @Override
    public Estado beber() {
        System.out.println("Malo, no necesito agua. Sigo TRISTE");
        return this;
    }
}
