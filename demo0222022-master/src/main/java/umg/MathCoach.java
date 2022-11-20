package umg;

public class MathCoach implements ICoach {
    public String trabajoDiario(){
        return "practica todos los dias las opereciones aritmeticas";
    }
    //definir un campo privado para la depencia
    private FService fService;
    //definir el constructor para la dependencia inyeccion.
    public MathCoach(FService theFService)
    {
        fService= theFService;
    }
    @Override
    public String getFortuneDiario() {
        return fService.getFortune();
    }


}
