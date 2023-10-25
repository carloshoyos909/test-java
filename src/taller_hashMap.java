import java.util.HashMap;


public class taller_hashMap {

    public static void main(String[] args) {

         HashMap<String, Integer> catalogo = new HashMap<>();

        int[] costo = {20000, 30000, 50000};
        String[] barrio = {"floresta", "laureles", "palmas"};

        for (int i = 0; i < barrio.length; i++) {
            catalogo.put(barrio[i], costo[i]);
        }
        for(String perfil : catalogo.keySet()) {
             System.out.println(perfil + " : " + catalogo.get(perfil));  
        }
    }
}