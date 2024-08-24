package patron_decorator_java;

public class Ejecutar {
    public static void main(String Args[]){
        Cafe cafe = new CafeBasico();
        System.out.println(cafe.Descripcion() + " cuesta $" + cafe.Costo());

        // Añadir leche al café
        cafe = new Leche(cafe);
        System.out.println(cafe.Descripcion() + " cuesta $" + cafe.Costo());

        // Añadir azúcar al café con leche
        cafe = new Azucar(cafe);
        System.out.println(cafe.Descripcion() + " cuesta $" + cafe.Costo());
    }
}
