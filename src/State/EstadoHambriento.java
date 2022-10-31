package State;

public class EstadoHambriento extends Estado {


    @Override
    public Estado comer() {
        System.out.println("COMI y no tengo HAMBRE");
        return new EstadoFeliz();
    }

    @Override
    public Estado serPegado() {
        System.out.println("Me pegaste, estoy triste sin HAMBRE");
        return new EstadoTriste();
    }

    @Override
    public Estado serAcariciado() {
        System.out.println("Gracias por el mimo, pero sigo con HAMBRE");
        return this;
    }

    @Override
    public String nombre() {
        return "Hambriento";
    }

    @Override
    public Estado beber() {
        System.out.println("Estoy con hambre pero sin sed");
        return this;
    }
}
