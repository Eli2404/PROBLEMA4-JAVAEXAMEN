package examenjava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author ela24
 */
public class OrdenPaises {
    public static void main(String[] args) {
        List<String> pais = new ArrayList<>();
        pais.add("Sudafrica");
		pais.add("Egipto");
		pais.add("Turquia");
		pais.add("Rusia");
		pais.add("China");
		pais.add("India");
                System.out.println(pais);
        List<String> pais2 = new ArrayList<>();
		pais2.add("Francia");
		pais2.add("México");
		pais2.add("Australia");
		pais2.add("Italia");
		pais2.add("Argentina");
		pais2.add("Brasil");
                System.out.println(pais2);
                
                System.out.println("ORDEN ALFABETICO DE LAS 2 LISTAS: ");
                List<String> paisOrden3 = new ArrayList<>();
		
		paisOrden3.addAll(pais2);
		paisOrden3.addAll(pais);				
		Collections.sort(paisOrden3);
		System.out.println(paisOrden3);
    }
		
}