package patron_decorator_java;

class Leche extends DecoradorCafe {
    public Leche(Cafe cafe) {
        super(cafe);
    }

    public String Descripcion() {
        return cafeDecorado.Descripcion() + ", Leche";
    }

    public double Costo() {
        return cafeDecorado.Costo() + 2.0;
    }
}
