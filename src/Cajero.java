public class Cajero {

    private double saldo;
    private String[] historialtransacciones;
    private int contadorTransacciones;

    public Cajero(double saldoInicial) {
        this.saldo = saldoInicial;
        this.historialtransacciones = new String[10];
        this.contadorTransacciones=0;
    }
//DEposito
    public void deposito(double monto){
        saldo += monto;
        registrarTransaccion("Deposito de $ "+ monto);
        System.out.println("Deposito realizado con extio .Su saldo actual es de : $"+ saldo);

    }
//REtiro(incompleto)
    public void retiro(double monto){
        if(monto>saldo){
            System.out.println("Error salfo insuficiente.Su saldo actual es de : "+saldo);
        }else {}

    }


//Metodo para registrar
    private void registrarTransaccion(String descripcion ){


        if(contadorTransacciones<historialtransacciones.length){
            historialtransacciones[contadorTransacciones]=descripcion;
            contadorTransacciones++;

        }else{
            System.out.println("Historuall lleno ,ya no puede egistrar mas =");


        }
    }
    //Mostrar historial
    public void mostrarHistorial(){
        System.out.println("n/-------- historial transaccion..-------");
        for(int i=0 ;i< contadorTransacciones;i++){
            System.out.println((i+1)+"-" + historialtransacciones[i]);
        }
    }
    }

