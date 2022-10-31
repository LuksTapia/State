package State;

public class Tamagochi {

    private Estado estado;

    public Tamagochi(){
        estado = new EstadoHambriento();
    }

    public String getEstado() {
        System.out.println(estado.nombre());
        return estado.nombre();
    }

    private void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void pegar() {

        estado = estado.serPegado();
    }
    public void alimentar() {
        estado = estado.comer();
    }
    public void acariciar() {
        estado = estado.serAcariciado();
    }

    public void darBeber(){
        estado = estado.beber();
    }

    public void cambiarASed() {
        estado = new EstadoSediento();
    }

    public void conHambre() {
        estado = new EstadoHambriento();
    }



}
