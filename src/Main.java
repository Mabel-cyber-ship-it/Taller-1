import java.util.Scanner;
void main(String[]args) {

    //Se utiliza para que el usuario pueda escribir

    Scanner teclado = new Scanner(System.in);


    Clase c1 = new Clase();

    c1.setNumCuenta("ABC123");
    c1.setFranquicia("MASTERCARD");
    c1.setSaldo(125.000);
    System.out.println(c1.toString());

    //Crear un objeto desde el constructor
    Clase c2 = new Clase ("XYZ987", "DEBITO", 350.000);

    // Crear los datos ingresados por el usuario
    Clase c3 = new Clase();

    System.out.println("Ingrese el numero de cuenta: ");
    c3.setNumCuenta(teclado.next());

    System.out.println("Ingrese la franquicia: ");
    c3.setSaldo(teclado.nextDouble());

    System.out.println("Ingrese la franquicia: ");
    c3.setSaldo(teclado.nextDouble());

// sumar el saldo de las tres cuentas
    double sumarsaldo;
    sumarsaldo = (c1.getSaldo()+c2.getSaldo()+c3.getSaldo());
    System.out.println("El saldo de las cuentas suman: "+ sumarsaldo);

}