/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author jhudy
 */
public class ValidarCampos {

    public boolean validarNombre(String texto) {
        String regex = "^[a-zA-Zá-úÁ-Ú\\s0-9]+$";

        // Verifica si el texto coincide con la expresión regular
        boolean esValido = texto.matches(regex);

        // Verifica la longitud del nombre de usuario
        boolean longitudValida = texto.length() >= 3 && texto.length() <= 20;

        return esValido && longitudValida;
    }

    public boolean validarContrasena(String contrasena) {
        // Expresión regular para validar la contraseña: 
        // al menos una letra minúscula, una letra mayúscula, un número, un carácter especial y longitud entre 8 y 20 caracteres.
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$";
        return contrasena.matches(regex);
    }

    public boolean validarNumeroFloat(String texto) {
        try {
            float numero = Float.parseFloat(texto);
            return true;
        } catch (NumberFormatException e) {

            return false;
        }
    }
}
