/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ivan
 */
public class Usuario {
    private String nombre;
    private String nickname;
    private String clave;

     ArrayList<String> user = new ArrayList();
     public boolean guardarUsuarioList(String pnombre,String pnickname,String pclave){
     
        user.add(pnombre);
        user.add(pnickname);
        user.add(pclave);
        
        return true;  
     }
     Map<String, String> userMap = new HashMap();
     public boolean guardarUsuarioMap(String pnombre,String pnickname,String pclave){
     
        userMap.put("nombre",pnombre);
        userMap.put("nickname",pnickname);
        userMap.put("clave",clave);
         return true;
        }
    public ArrayList<String> listarUsuarioList(){
       return user; 
    }
    
    public Map<String, String> listarUsuarioMap(){
       return userMap; 
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;    
   }
}
