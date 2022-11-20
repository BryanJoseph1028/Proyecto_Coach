package umg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClass {
    public static void  main(String [] args){
        //cargar el file appContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //crear el bean del spring cont
        ICoach theCoach = context.getBean("miCoach", ICoach.class);
        //llamar al metodos
        System.out.println(theCoach.trabajoDiario());

        //crear otro mensaje para llamar el metodo de la dependencia
        System.out.println(theCoach.getFortuneDiario());


        //cerrar el contexto
        context.close();
    }
}
