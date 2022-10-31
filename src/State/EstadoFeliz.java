package State;

public class EstadoFeliz extends Estado {

    @Override
    public Estado comer() {
        System.out.println("Comí, pero estoy como antes...... FELIZ");
        return this;
    }


    @Override
    public Estado serPegado() {
        System.out.println("¿Por que?. Ya no estoy FELIZ");
        return new EstadoTriste();

    }

    @Override
    public Estado serAcariciado() {
        System.out.println("Estoy super feliz por el Mimo. FELIZ");
        return this;

    }

    @Override
    public String nombre() {
        return "Feliz";
    }

    @Override
    public Estado beber() {
        System.out.println("Estoy feliz y bebiendo algo");
        return this;
    }
}
