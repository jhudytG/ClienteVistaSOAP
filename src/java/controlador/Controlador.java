/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.Cuenta;
import vista.Login;
import vista.Registro;

/**
 *
 * @author jhudy
 */
public class Controlador {

    Registro vregistro = new Registro();
    Login vlogin = new Login();
    Cuenta vcuenta = new Cuenta();

    public Controlador(Login vlogin) {
        this.vlogin = vlogin;
        vlogin.setVisible(true);
        vlogin.setLocationRelativeTo(null);
        vcuenta.setLocationRelativeTo(null);
        vregistro.setLocationRelativeTo(null);
        iniciarControl();
    }

    private void iniciarControl() {

        vregistro.getBtnRegistrarNuevoUsu().addActionListener(l -> regiatrarNuevo());
        vlogin.getBtnIngresar().addActionListener(l -> ingresar());
        vlogin.getBtnRegistrar().addActionListener(l -> registrar());
        vcuenta.getBtnRegistrarProceso().addActionListener(l -> realizarTransaccion());
    }

    private void regiatrarNuevo() {
        System.out.println("Creandooo");
    }

    private void ingresar() {
        System.out.println("Ingresandooo");
    }

    private void registrar() {
        System.out.println("Se va al jframe de registro");
        vregistro.setVisible(true);
        
    }

    private void realizarTransaccion() {
        System.out.println("Transacción exitosa");
    }

}
