package Examples.ReCoupling1;

public class Boton extends Tv{
    private boolean state;

    public Boton() {
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void presionar(boolean state){
        if (state){
            System.out.println("La TV esta encendida");
        }else {
            System.out.println("La Tv esta apagada");
        }
    }
}
