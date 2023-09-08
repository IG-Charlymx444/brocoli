/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.negocio;

/**
 *Contiene métodos para trabajar con cadena de String.
 * @author Carlos Cadena Rivera 
 */
public class Operacion {
 /** 
* Separa una cadena de texto a partir de una expresion de guion medio.
* @param valor Cadena de texto que sera separada a partir de la expresion dada.
* @return Array de string n donde cada posicion representa una division de la cadena de texto.
*/
public String[] separar(String valor){ 
String[] elementos = valor.split("-");
return elementos;}
}
   
