package State;

public class EstadoSediento extends Estado{
    @Override
    public Estado comer() {
        System.out.println("Comi pero tengo sed");
        return this;
    }

    @Override
    public Estado serPegado() {
        System.out.println("AIA, estaba con sed y me pegaste");
        return new EstadoTriste();
    }

    @Override
    public Estado serAcariciado() {
        System.out.println("Estoy con sed pero gracias por los mimos");
        return this;
    }

    @Override
    public String nombre() {
        return "Con sed";
    }

    @Override
    public Estado beber() {
        System.out.println("Gracias, queria tomar algo :)");
        return new EstadoFeliz();
    }
}
