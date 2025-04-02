public class Array {
    public static void main(String[] args) {
        // Criando um array de inteiros
        int[] numeros = new int[5];
        /*
         * Entendendo o array:
         * 1. Array: Um array é uma estrutura de dados que pode armazenar múltiplos valores do mesmo tipo em uma única variável.
         * 2. Tipo de dado: O tipo de dado do array é definido entre colchetes (int[]), indicando que o array armazenará inteiros.
         * 3. Tamanho do array: O tamanho do array é definido entre parênteses (new int[5]), indicando que o array terá 5 elementos. 
         * Explicações mais "técnicas":
         * Criação do Array: Quando você cria o array numeros com new int[5], você está instanciando um objeto da classe int[]. 
         * Mesmo que a variável numeros seja um tipo de dado primitivo (um tipo de array de inteiros), a JVM o trata como um objeto. 
        */

        // O array é um objeto, logo podemos verificar a classe do objeto
        System.out.println("Classe do array: " + numeros.getClass());
        /*
         * Verificando a Classe do Array:
         * Usamos getClass() para verificar que o array é, de fato, um objeto.
         * O método getClass() retorna a classe do objeto e o nome dessa classe
         *  A saída será class [I.
         * "[" é a representação  de um array 
         * "I" é a representação  de inteiros (int)
        */

        // Atribuindo valores ao array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 10; // Atribuindo valores aos elementos
        }
        // O loop for é usado para iterar sobre os índices do array e atribuir valores a cada elemento.
        // O array é inicializado com valores múltiplos de 10, começando de 0 até 40 (0, 10, 20, 30, 40).

        // Exibindo os valores do array
        for (int numero : numeros) { 
            System.out.println(numero); // Usando o loop for-each para percorrer o array e imprimir os valores
        }
        /* O loop for-each é uma maneira mais simples e legível de iterar sobre os elementos de um array ou coleção em Java.
        Embora esteja numa única linha, fica "difícil" de ler, então o ideal é usar o for-each em múltiplas linhas. */

        // Exibindo os valores do array em múltiplas linhas
        for (int numero : numeros) { // Usando o loop for-each para percorrer o array e imprimir os valores
            System.out.println(numero); // Exibindo cada número em uma nova linha
        }
        
        // Verificando o 'length' do array
        System.out.println("Tamanho do array: " + numeros.length);
        // 'length' é o único campo fixo que todos os arrays possuem!
        // O Atributo 'length' é um campo da classe java.lang.Object, que é a classe base de todos os objetos em Java. 
        // No caso dos arrays, 'length' é uma propriedade final e é um campo primitivo que não pode ser alterado após a criação do array.

        /*
         * Por que isso é importante?
         *
         * Por ser um objeto, o array possui referências. Ou seja, se você passar um array para um método, 
         * você estará passando uma referência ao objeto, não uma cópia dos dados. (Acredite, isso pode ser confuso no início)
         * Isso significa que qualquer alteração feita dentro do método afetará o array original, 
         * o que pode ser uma característica importante a ser lembrada quando estamos lidando com arrays.
         */

        // Arrays podem ser nulos: Como arrays são objetos, uma variável de array pode ser nula. 
        // Isso pode causar exceções como o NullPointerException se você tentar acessar o array sem inicializá-lo corretamente.
        
        int[] arrayNull = null;

        // Tentando acessar um array nulo - Isso causará um NullPointerException!
        // A linha abaixo está comentada porque se for descomentada, causará a exceção.
        // System.out.println(arrayNull.length); // Descomente para ver a exceção.

        // Para evitar o erro, vamos verificar se o array é nulo antes de acessar
        if (arrayNull != null) {
            System.out.println("Tamanho do array nulo: " + arrayNull.length);
        } else {
            System.out.println("O array é nulo e não pode ser acessado.");
        }

        /*
         * Arrays e Garbage Collection: Como qualquer objeto em Java, os arrays também são sujeitos ao garbage collection (GC). 
         * Quando um array não é mais referenciado por nenhuma variável, ele pode ser coletado automaticamente pelo GC, liberando memória.
         * 
         * PS: Em Java (diferente de C), não precisamos nos preocupar com a liberação de memória, o garbage collector cuida disso para você.
         */

        // Métodos e Arrays: Como o array é um objeto, ele pode ser passado para métodos ou retornado a partir de métodos. 
        // Por exemplo, você pode criar um método que manipula ou modifica os dados de um array, e o efeito será refletido 
        // fora do método, porque o array é passado como referência.

        int[] arrayReference = {10, 20, 30};

        // Passando o array para um método
        adicionarValor(arrayReference);

        // A alteração no array será refletida aqui
        for (int numero : arrayReference) {
            System.out.println(numero);
        }
    }

    public static void adicionarValor(int[] array) {
        array[0] = 100; // Modificando o primeiro elemento do array
        // Isso afetará o array original, pois estamos passando a referência do array para o método.
        // O array original agora terá o primeiro elemento alterado para 100.
    }
}