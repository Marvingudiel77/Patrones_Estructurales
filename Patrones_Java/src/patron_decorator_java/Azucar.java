package patron_decorator_java;

class Azucar extends DecoradorCafe {
    public Azucar(Cafe cafe) {
        super(cafe);
    }

    public String Descripcion() {
        return cafeDecorado.Descripcion() + ", Azúcar";
    }

    public double Costo() {
        return cafeDecorado.Costo() + 1.5;
    }
}
