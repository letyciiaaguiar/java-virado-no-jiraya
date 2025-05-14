
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
       // int, double, float, char, byte, short, long, boolean
        int idade = 20; // quando for criar uma variavel, sempre colocar o tipo dela
        double altura = 1.74; //sempre usar ponto
        float peso = 85.5f; // sempre colocar o f no final 
        char caractere = 'B'; //sempre usar aspas simples e só pode ser um caractere
        byte idadeByte= 127; //-128 a 127
        short idadeShort= 15; // -32768 a 32767
        long numeroGrande= 66456L; // sempre colocar o l no final
        boolean verdadeiro = true; // ou false

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);   
        System.out.println("Peso: " + peso);
        System.out.println("Caractere: " + caractere);
        System.out.println("Idade Byte: " + idadeByte);
        System.out.println("Idade Short: " + idadeShort);
        System.out.println("Numero Grande: " + numeroGrande);
        System.out.println("Verdadeiro: " + verdadeiro);
        // String
    }


}