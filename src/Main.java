import java.util.Scanner;

public class Main{

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        Cajero cajero=new Cajero(41000);

        boolean continuar=true;
        while(continuar){
            try{
                System.out.println("/n Seleccione una operacion:");
                System.out.println("/n Deposito:");
                System.out.println("/n Retiro:");
                System.out.println("/n Consultar Saldo:");
                System.out.println("/n Mostrar Historial:");
                System.out.println("/n Salir");

                int opcion=scanner.nextInt();
                Operacion operacion=null;

                switch (opcion){
                    case 1:
                        operacion=Operacion.DEPOSITO;
                        break;
                    case  2:
                        operacion=Operacion.RETIRO;
                        break;

                    case  3:
                        operacion=Operacion.RETIRO;
                        break;
                    case  4:
                        operacion=Operacion.RETIRO;
                        break;
                    case  5:
                        operacion=Operacion.RETIRO;
                        break;
                }
            }catch (Exception e){
                throw new RuntimeException()
            }
        }

    }
}