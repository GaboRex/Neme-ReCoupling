package Examples.ReCoupling1;

public class Tv {
    private int modelo;

    public Tv() {
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void InstalarSpotify(){
        if (modelo == 2022){
            System.out.println("Instalando spotify...");
        }else {
            System.out.println("Muy antigua tu tele ,choquito");
        }
    }


    public void InstalarNetflix(){
        if (modelo == 2022){
            System.out.println("Instalando netflix...");
        }else {
            System.out.println("Muy antigua tu tele ,choquito");
        }
    }

    public void InstalarHbo(){
        if (modelo == 2022){
            System.out.println("Instalando hbo...");
        }else {
            System.out.println("Muy antigua tu tele ,choquito");
        }
    }
}
