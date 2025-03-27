import java.util.List;
import java.util.stream.Collectors;

public class ternario {
    public static void main(String[] args) throws Exception {
        /*
         * Seja bem-vindo. Este é um arquivo de exemplo para demonstrar o uso do operador ternário em Java.
         * O operador ternário é uma forma concisa de escrever expressões condicionais.
         * Ele segue a sintaxe: condição ? valor_se_verdadeiro : valor_se_falso;
         * Cada exemplo abaixo demonstra como simplificar o código usando o operador ternário.
        */

        // 1. Encontrar o maior valor entre a, b e c
        int a = 10, b = 20, c = 30;
        int result;

        // Usando if-else para encontrar o maior valor
        if (a > b) {
            if (a > c) {
                result = a; // a é maior que b e c
            } else {
                result = c; // c é maior que a
            }
        } else {
            if (b > c) {
                result = b; // b é maior que a e c
            } else {
                result = c; // c é maior que b
            }
        }
        System.out.println(result); // Exibe o maior valor

        // Usando o operador ternário para simplificar o código acima
        int resultTernario = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(resultTernario); // Exibe o maior valor

        // 2. Retornar um Object com base em uma condição
        boolean condition = false; // Variável de condição
        Object resultObject;

        // Usando if-else para atribuir valores diferentes
        if (condition) {
            resultObject = "String"; // Se a condição for verdadeira
        } else {
            resultObject = 123; // Se a condição for falsa
        }
        System.out.println(resultObject);

        // Usando o operador ternário para simplificar
        Object resultObject2 = (condition) ? "String" : 123;
        System.out.println(resultObject2);

        // 3. Converter uma String para maiúsculas ou minúsculas
        String input = "Java"; // String de entrada
        boolean isUpperCase = false; // Condição para maiúsculas ou minúsculas
        String resultString;

        // Usando if-else para converter a String
        if (isUpperCase) {
            resultString = input.toUpperCase(); // Converte para maiúsculas
        } else {
            resultString = input.toLowerCase(); // Converte para minúsculas
        }
        System.out.println(resultString);

        // Usando o operador ternário para simplificar
        String resultString2 = (isUpperCase) ? input.toUpperCase() : input.toLowerCase();
        System.out.println(resultString2);

        // 4. Obter um valor de um array ou um valor padrão
        int[] array = {1, 2, 3}; // Array de inteiros
        int index = 2; // Índice que queremos acessar
        int value;

        // Usando if-else para verificar se o índice é válido
        if (index < array.length) {
            value = array[index]; // Obtém o valor do array
        } else {
            value = -1; // Retorna um valor padrão se o índice for inválido
        }
        System.out.println(value);

        // Usando o operador ternário para simplificar
        int valueTernary = (index < array.length) ? array[index] : -1;
        System.out.println(valueTernary);

        // 5. Atribuir uma tarefa Runnable com base em uma condição
        boolean isTaskA = true; // Condição para escolher a tarefa
        Runnable task;

        // Usando if-else para atribuir a tarefa
        if (isTaskA) {
            task = () -> System.out.println("Task A"); // Tarefa A
        } else {
            task = () -> System.out.println("Task B"); // Tarefa B
        }
        task.run(); // Executa a tarefa

        // Usando o operador ternário para simplificar
        Runnable taskTernary = (isTaskA) ? () -> System.out.println("Task A") : () -> System.out.println("Task B");
        taskTernary.run();

        // 6. Determinar o maior valor entre a, b e c e retornar uma string
        String resultString3;

        // Usando if-else para determinar o maior valor e retornar uma string
        if (a > b) {
            if (a > c) {
                resultString3 = "A"; // a é o maior
            } else {
                resultString3 = "C"; // c é o maior
            }
        } else {
            if (b > c) {
                resultString3 = "B"; // b é o maior
            } else {
                resultString3 = "C"; // c é o maior
            }
        }
        System.out.println(resultString3);

        // Usando o operador ternário para simplificar
        String resultStringTernary = (a > b) ? ((a > c) ? "A" : "C") : ((b > c) ? "B" : "C");
        System.out.println(resultStringTernary);

        // 7. Retornar uma string com base no status
        Status status = Status.ACTIVE; // Status atual
        String resultStatus;

        // Usando if-else para verificar o status
        if (status == Status.ACTIVE) {
            resultStatus = "Active"; // Status ativo
        } else {
            resultStatus = "Inactive"; // Status inativo
        }
        System.out.println(resultStatus);

        // Usando o operador ternário para simplificar
        String resultStatusTernary = (status == Status.ACTIVE) ? "Active" : "Inactive";
        System.out.println(resultStatusTernary);

        // 8. Executar um cálculo caro apenas se a condição for verdadeira
        int expensiveResult;

        // Usando if-else para executar o cálculo
        if (condition) {
            expensiveResult = expensiveCalculation(); // Executa o cálculo
        } else {
            expensiveResult = 0; // Retorna 0 se a condição for falsa
        }
        System.out.println(expensiveResult); // Volta false pois essa variável "condition" está false desde o exemplo 2

        // Usando o operador ternário para simplificar
        int expensiveResultTernary = (condition) ? expensiveCalculation() : 0;
        System.out.println(expensiveResultTernary);

        // 9. Retornar um valor padrão se a entrada for nula
        String resultDefault;

        // Usando if-else para verificar se a entrada é nula
        if (input != null) {
            resultDefault = input; // Retorna a entrada
        } else {
            resultDefault = "Default Value"; // Retorna o valor padrão
        }
        System.out.println(resultDefault);

        // Usando o operador ternário para simplificar
        String resultDefaultTernary = (input != null) ? input : "Default Value";
        System.out.println(resultDefaultTernary);

        // 10. Mapear uma lista de strings com base em uma condição
        List<String> list = List.of("Java", "", "Paga", "", "Meus", "", "Boletos"); // Lista de strings
        List<String> results = list.stream()
            .map(item -> {
                if (item.isEmpty()) {
                    return "Empty"; // Substitui strings vazias por "Empty"
                } else {
                    return item; // Mantém o valor original
                }
            })
            .collect(Collectors.toList());
        System.out.println(results);

        // Usando o operador ternário para simplificar
        List<String> resultsTernary = list.stream()
            .map(item -> item.isEmpty() ? "Empty" : item)
            .collect(Collectors.toList());
        System.out.println(resultsTernary);

        // 11. Comparar a soma de dois valores com um terceiro valor e retornar o maior dos dois primeiros
        int resultCompare;

        // Usando if-else para comparar a soma
        if (a + b > c) {
            resultCompare = a; // Retorna a
        } else {
            resultCompare = b; // Retorna b
        }
        System.out.println(resultCompare);

        // Usando o operador ternário para simplificar
        int resultCompareTernary = (a + b > c) ? a : b;
        System.out.println(resultCompareTernary);

        // 12. Retornar um valor inteiro ou null com base em uma condição
        Integer resultNullable;

        // Usando if-else para retornar um valor ou null
        if (condition) {
            resultNullable = 1; // Retorna 1
        } else {
            resultNullable = null; // Retorna null
        }
        System.out.println(resultNullable);

        // Usando o operador ternário para simplificar
        Integer resultNullableTernary = (condition) ? 1 : null;
        System.out.println(resultNullableTernary);

        // 13. Atribuir um valor final com base em uma condição
        final int finalValue;

        // Usando if-else para atribuir o valor final
        if (condition) {
            finalValue = 10; // Atribui 10
        } else {
            finalValue = 20; // Atribui 20
        }
        System.out.println(finalValue);

        // Usando o operador ternário para simplificar
        final int finalValueTernary = (condition) ? 10 : 20;
        System.out.println(finalValueTernary);
    }

    // Método auxiliar para simular um cálculo caro
    private static int expensiveCalculation() {
        return 42; // Simulação de cálculo caro
    }

    // Enumeração para representar o status
    enum Status {
        ACTIVE, INACTIVE
    }
}