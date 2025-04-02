public class ExemploArrayObjeto {
    public static void main(String[] args) {
        // Criando um array de inteiros
        int[] numeros = new int[5];

        // O array é um objeto, logo podemos verificar a classe do objeto
        System.out.println("Classe do array: " + numeros.getClass());

        // Atribuindo valores ao array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 10; // Atribuindo valores aos elementos
        }

        // Exibindo os valores do array
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Verificando o 'length' do array
        System.out.println("Tamanho do array: " + numeros.length);
    }
}
