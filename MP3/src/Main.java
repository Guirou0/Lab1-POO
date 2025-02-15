import java.util.Scanner;

class Animal {
    private int comida;

    public Animal(){
        comida = 0;
    }

    public void emitirSom() {
        System.out.println("Som de animal");
    }

    public void comer(String comida){
        this.comida++;
    }

    public int getComida(){
        return comida;
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    @Override
    public void comer(String comida){
        if(comida.equals("carne")){
            super.comer(comida);
        } else {
            System.out.println("Cachorro não gostou de " + comida);
        }
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida){
        if(comida.equals("peixe")){
            super.comer(comida);
        } else {
            System.out.println("Gato não gostou de " + comida);
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        gato.emitirSom();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma comida para o cachorro e o gato: ");
        String comida = scanner.nextLine();
        cachorro.comer(comida);
        gato.comer(comida);

        System.out.println("Nível de comida do cachorro: " + cachorro.getComida());
        System.out.println("Nível de comida do gato: " + gato.getComida());

        scanner.close();
    }
}
