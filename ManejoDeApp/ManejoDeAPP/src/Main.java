
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ivan
 */
public class Main {
    public static void main(String[] args) {
        //CrearArchivoListas();
        //LeerArchivoLista();
        
        String ARCHIVO_JSON = "datos.json";
        
        Map<String,String> usuario = new HashMap();
        usuario.put("Nombre", "Ivan");
        usuario.put("Apellido", "Castro");
        usuario.put("username", "name12");
        usuario.put("clave", "1234");
        
        //CrearArchivoMapas(usuario,ARCHIVO_JSON);
        Map<String,String> Usuarios = LeerArchivoMapas(ARCHIVO_JSON);
        System.out.println("Esto son los datos en el archivo: " + Usuarios);
        
        CrearArchivoMapas(usuario, ARCHIVO_JSON );
    }

    
    private static void CrearArchivoListas() {
        List<String> lineas = Arrays.asList(
                "Ivan",
                "David",
                "Castro",
                "Jimenez");
        try (BufferedWriter Writer = new BufferedWriter(new FileWriter("Archivo.txt"))) {

            for (String linea : lineas) {
                Writer.write(linea);
                Writer.newLine();
            }
            System.out.println("Archivo Escrito Correctamente");

        } catch (IOException e) {
            System.out.println("Error Al Escribir El Archivo" + e.getMessage());
        }
    }
    
    
    private static void CrearArchivoMapas(Map<String,String> datos, String Archivo){
        Gson gson = new Gson();
        
        try(FileWriter Writer = new FileWriter(Archivo)){
          gson.toJson(datos, Writer);
            System.out.println("Datos escritos correctamente en: "+Archivo);
            
}catch (IOException e){
            System.out.println("Error Al Escribir Archivo: " +e.getMessage());
        }
    }
    

    private static void LeerArchivoLista() {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("Archivo.txt"))) {

            String linea;

            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el Archivo" + e.getMessage());
        }
        System.out.println("Contenido del archivo: ");
        for (String linea : lineas) {
            System.out.println(linea);
        }
    }
    
    
    private static Map<String,String> LeerArchivoMapas(String archivo){
       Gson gson = new Gson();
       try (FileReader reader = new FileReader(archivo)) {
            Type tipoMapa = new TypeToken<HashMap<String, String>>() {}.getType();
            Map<String, String> datos = gson.fromJson(reader, tipoMapa);
            System.out.println("Datos leidos correctamente desde " + archivo);
            return datos;
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return new HashMap<>();
        }      
   }    
}

