package patron_flyweight_java;

class Caracter {
    private char simbolo;

    public Caracter(char simbolo) {
        this.simbolo = simbolo;
    }

    public void mostrar() {
        System.out.println("Carácter: " + simbolo);
    }
}

