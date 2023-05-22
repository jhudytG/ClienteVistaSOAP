/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controlador.Controlador;
import vista.Login;
import ws.Cajero_Service;

/**
 *
 * @author jhudy
 */
public class Main {

    public static void main(String[] args) {
        Login vista = new Login();
        Cajero_Service modelo = new Cajero_Service();
        Controlador controlador = new Controlador(vista, modelo);

    }
}
