package patron_decorator_java;

abstract class  DecoradorCafe implements Cafe {
    protected Cafe cafeDecorado;

    public DecoradorCafe(Cafe cafe) {
        this.cafeDecorado = cafe;
    }

    public String Descripcion() {
        return cafeDecorado.Descripcion();
    }

    public double Costo() {
        return cafeDecorado.Costo();
    }
}