/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseperro;

/**
 *
 * @author Sofia
 */
public class Claseperro {
    
    public int edad;
    public String nombre;
    public String colorOjos;
    
    //Constructor
    
    Claseperro(int edad, String nombre, String colorOjos){
    this.edad = edad;
    this.nombre = nombre;
    this.colorOjos = colorOjos;
    }
    
    //metodos
    
    public void ladrar (){
    System.out.println("Gua Gua");
    }
    
    public void saludar (){
    System.out.println("Hola mi nombre es" + nombre);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Claseperro miPerro1 = new Claseperro(5, "Miguel", "Azules");
    Claseperro miPerro2 = new Claseperro(6, "Dingo", "Negros"); 
    
    System.out.println(miPerro1.edad);
    System.out.println(miPerro2.edad);
    miPerro1.saludar();
    miPerro2.ladrar();
        // TODO code application logic here
    }
    
}
