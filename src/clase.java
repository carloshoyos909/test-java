import java.util.Random;


public class clase{


   //Función para llenar la pirámide
    public static boolean[][] fillPyramid(int size) {
        //Declaramos una matriz de booleanos
        //De momento la usaremos cuadrada, es decir, de n x n
        boolean[][] pyramid = new boolean[size][size];
        //Este flag nos servirá para saber cuantos espacios vacíos hay
        int flag;
        //Entramos a recorrer las filas de la matriz con i
        for (int i = 0; i < size; i++) {
            //En cada fila debemos iniciar con flag = 0
            flag=0;
            //Hacemos un for en cada fila para los espacios vacíos
            for (int x = 0; x < size - (i + 1); x++) {
                //Los espacios vacíos se traducen como false
                //Por lo que los llenamos con false, sin embargo...
                //podrían no tocarse, ya que por defecto son false
                pyramid[i][x] = false;
                //Aumentamos la flag de espacios
                flag++;
            }
            for (int y = 0; y < i + 1; y++) {
                //Por otro lado, cuando hay * se traduce a true
                pyramid[i][flag] = true;
                //Acá igual actualizamos flag para que el llenado sea correcto
                flag++;
            }
        }
        //Finalmente retornamos la matriz
        return pyramid;
    }

    //Esta es la función para pintar la matriz en pantalla
    public static void printPyramid(boolean[][] pyramid) {
        for (int i = 0; i < pyramid.length; i++) {
            //Simplemente i representa las filas
            for (int x = 0; x < pyramid[i].length; x++) {
                //Y x representa las columnas
                //Entonces evaluamos el valor booleano
                //de nuestra matriz en la fila i y la columna x
                if (pyramid[i][x]) {
                    //Y si es verdadero pintamos espacio y *
                    //Para pintarla en la misma línea usamos print en vez de println
                    System.out.print(" ");
                    System.out.print("*");
                } else {
                    //En caso contrario sólo se pinta el espacio en blanco
                    System.out.print(" ");
                }
            }
            //Al finalizar cada ciclo de filas (i)
            //pintamos un salto de línea con println()
            System.out.println();
        }
    }

    //Esta es la función para obtener una frase a partir de las palabras
    public static StringBuilder getPrhase(String[] words){
        //Recibimos un array de Strings y los usamos para armar la frase
        StringBuilder phrase = new StringBuilder();
        //Usamos StringBuilder para la concatenación con append
        //Nota: repasar la inmutabilidad de String
        for (String word : words) {
            //Esto es un ciclo forEach, es decir,
            //va a recorrer todo nuestro array de words
            //y va a tomar su valor (word) en cada iteración
            phrase.append(word);
            //De ese modo podemos concatenar el valor en cada posición
            phrase.append(" ");
            //y también concatenamos un espacio vacío
        }
        //Finalmente retornamos la frase armada
        return phrase;
    }

    //Esta es la función para obtener las palabras a partir de la piramide
    public static String[] getWords(boolean[][] pyramid){
        //Primero declaramos los arrays necesarios 
        String[] oneLetter = {
            "a",
            "y",
        };
        String[] twoLetters = {
            "la",
            "el",
            "un",
            "de",
            "en",
        };
        String[] trheeLetters ={
            "tin",
            "mar",
            "ola",
            "luz",
        };
        String[] fourLetters = {
            "para",
            "este",
            "esta",
        };
        String[] fiveLetters = {
            "vivir",
            "lucir",
            "medir",
            "poder",
        };
        String[] sixLetters = {
            "bacano",
            "humana",
            "pesado",
            "rimado",
        };
        //luego los usamos para armar nuestra matriz de posibles palabras
        //Esto nos facilitará su manejo en el ciclo de armado
        //Nota: recuerda que una matriz es un array de arrays, por lo que
        //en la siguiente notació simplemente estamos diciéndole que 
        //vamos a llenar la matriz con cada uno de los arrays de letras
        String[][] possibleWords = {
            oneLetter,
            twoLetters,
            trheeLetters,
            fourLetters,
            fiveLetters,
            sixLetters,
        };
        
        //Declaramos rand y le damos la instancia de Random para
        //Manejar números aleatorios. Esta es simplemente otra forma
        //de hacerlo, respecto a Math.random()
        Random rand = new Random();

        //Declaramos nuestro array de string de words 
        //Para luego llenarlo en el ciclo
        String[] words = new String[pyramid.length];
        for (int i = 0; i < pyramid.length; i++) {
            //En este ciclo i representa cada fila de la piramide
            //necesitamos formar una palabra a partir de cada una de ellas
            for(int y =0; y<pyramid[i].length; y++){
                //En este ciclo y representa entonces cada columna
                //Es decir, cada posición dentro de cada array de pyramid
                if(pyramid[i][y]){
                    //Finalmente validamos si es true (es decir, si tiene contenido)
                    //y de ser así le asignamos un valor de nuestra matriz de palabras posibles
                    //En ella tenemos que i representará las filas 
                    //y luego tomaremos aleatoriamente cualquier valor posible del array de esa fila
                    words[i] = possibleWords[i][rand.nextInt(possibleWords[i].length)];
                }
            }
        }
        //Finalmente retornamos la lista de palabras
        return words;
    }

    public static void main(String[] args) {
        //Ejemplo de uso

        //declaramos nuestra piramide y llamamos a la función de llenado
        //para inicializarla
        boolean[][] pyramid = fillPyramid(6);
        
        //declaramos nuestro array de palabras
        //y llamamos a la función de obtención usando la piramide
        String[] words = getWords(pyramid);

        //Declaramos e inicializamos nuestra frase a partir
        //de las palabras antes obtenidas
        StringBuilder phrase = getPrhase(words);

        //pintamos la piramide
        printPyramid(pyramid);

        //Pintamos la frase
        System.out.println(phrase);
    }
}