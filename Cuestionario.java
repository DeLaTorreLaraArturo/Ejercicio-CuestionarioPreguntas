import java.util.Scanner;

public class Cuestionario
{
    public void aplicarPregunta(Pregunta p)
    {
        p.imprimete();
        System.out.println("Respuesta: ");
        Scanner entrada = new Scanner(System.in);
        String respuesta = entrada.redLine();
        
        if(p.checarRespuesta)
        {
        }
    }
}
