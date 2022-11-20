package umg;

public class Coach implements ICoach {
    public String trabajoDiario(){
        return "practica diariamente";
    }

    @Override
    public String getFortuneDiario() {
        return null;
    }


}
