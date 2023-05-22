/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import vista.Cuenta;
import vista.Login;
import vista.Registro;
import ws.Cajero;
import ws.Cajero_Service;

/**
 *
 * @author jhudy
 */
public class Controlador {

    Login vlogin;
    Registro vregistro;
    Cuenta vcuenta;

    //Web service
    Cajero_Service servicio;
    Cajero cliente;

    ValidarCampos validados = new ValidarCampos();

    String username;

    public Controlador(Login vlogin, Cajero_Service servicio) {
        this.vlogin = vlogin;
        this.servicio = servicio;
        this.cliente = servicio.getCajeroPort();
        this.vregistro = new Registro();
        this.vcuenta = new Cuenta();
        vlogin.setVisible(true);
        vlogin.setLocationRelativeTo(null);
        vcuenta.setLocationRelativeTo(null);
        vregistro.setLocationRelativeTo(null);
        iniciarControl();
        vlogin.getLblFormularioAcceso().setText("");

    }

    private void iniciarControl() {

        vregistro.getBtnRegistrarNuevoUsu().addActionListener(l -> regiatrarNuevo());
        vlogin.getBtnIngresar().addActionListener(l -> ingresar());
        vlogin.getBtnRegistrar().addActionListener(l -> registrar());
        vcuenta.getBtnRegistrarProceso().addActionListener(l -> realizarTransaccion());
    }

    //Metodo vista Login
    private void ingresar() {
        String user = vlogin.getTxtUsuario().getText();
        String pass = vlogin.getTxtpssClave().getText();
        if (validarDatosEntrada()) {
            if (cliente.login(user, pass)) {
                vlogin.dispose();
                vcuenta.getLblCuentadeUsuario().setText("");
                username = user;
                vcuenta.getLblNombreUsu().setText(username);
                actualizarSaldoUsuario();
                vcuenta.setVisible(true);
            } else {
                vlogin.getLblFormularioAcceso().setText("<html><center>Usuario no existe o las credenciales son incorrectas");
            }
        }
    }

    private void registrar() {
        vlogin.dispose();
        vregistro.getLblRegistroUsuario().setText("");
        vregistro.setVisible(true);
    }

    public boolean validarDatosEntrada() {

        String username = vlogin.getTxtUsuario().getText();
        String clave = vlogin.getTxtpssClave().getText();

        if (username.isEmpty()) {
            vlogin.getLblFormularioAcceso().setText("<html><center>Campo Usuario se encuentra vacío");
            vlogin.getLblFormularioAcceso().setForeground(Color.red);
            return false;
        }

        if (!validados.validarNombre(username)) {
            vlogin.getLblFormularioAcceso().setText("<html><center>Ingrese un nombre de username válido (Ejemplo: carlosc123)");
            vlogin.getLblFormularioAcceso().setForeground(Color.red);
            return false;
        }

        if (clave.isEmpty()) {
            vlogin.getLblFormularioAcceso().setText("<html><center>Campo Clave se encuentra vacío");
            vlogin.getLblFormularioAcceso().setForeground(Color.red);
            return false;
        }

        if (!validados.validarContrasena(clave)) {
            vlogin.getLblFormularioAcceso().setText("<html><center>Contraseña inválida. Debe contener al menos una letra minúscula, una letra mayúscula, un número, un carácter especial y tener una longitud entre 8 y 20 caracteres.");
            vlogin.getLblFormularioAcceso().setForeground(Color.red);
            return false;
        }

        return true;
    }

    //Metodos de vista registro
    private void regiatrarNuevo() {

        if (validarDatosEntradaRegistro()) {
            String rUser = vregistro.getTxtUsuarioNuevo().getText();
            String rPass = vregistro.getTxtpssClaveNueva().getText();
            String rRepPass = vregistro.getTxtpssClaveNuevaRepetir().getText();
            float rsaldo = Float.parseFloat(vregistro.getTxtsaldoinicial().getText());
            cliente.registro(rUser, rPass, rRepPass, rsaldo);
            vregistro.getLblRegistroUsuario().setForeground(Color.BLUE);
            vregistro.getLblRegistroUsuario().setText("<html><center>Usuario registrado con éxito");
            vlogin.setVisible(true);
        }

    }

    public boolean validarDatosEntradaRegistro() {
        String nuevoUser = vregistro.getTxtUsuarioNuevo().getText();
        String nuevaPass = vregistro.getTxtpssClaveNueva().getText();
        String nuevaRepPass = vregistro.getTxtpssClaveNuevaRepetir().getText();
        String nuevosaldo = vregistro.getTxtsaldoinicial().getText();

        if (nuevoUser.isEmpty()) {
            vregistro.getLblRegistroUsuario().setText("<html><center>Campo Usuario se encuentra vacío");
            vregistro.getLblRegistroUsuario().setForeground(Color.red);
            return false;
        }

        if (!validados.validarNombre(nuevoUser)) {
            vregistro.getLblRegistroUsuario().setText("<html><center>Ingrese un nombre de username válido");
            vregistro.getLblRegistroUsuario().setForeground(Color.red);
            return false;
        }

        if (nuevaPass.isEmpty()) {
            vregistro.getLblRegistroUsuario().setText("<html><center>Campo Clave se encuentra vacío");
            vregistro.getLblRegistroUsuario().setForeground(Color.red);
            return false;
        }

        if (!validados.validarContrasena(nuevaPass)) {
            vregistro.getLblRegistroUsuario().setText("<html><center>Contraseña inválida. Debe cumplir los requisitos.");
            vregistro.getLblRegistroUsuario().setForeground(Color.red);
            return false;
        }

        if (nuevaRepPass.isEmpty()) {
            vregistro.getLblRegistroUsuario().setText("<html><center>Campo Repetir clave se encuentra vacío");
            vregistro.getLblRegistroUsuario().setForeground(Color.red);
            return false;
        }

        if (!nuevaPass.equals(nuevaRepPass)) {
            vregistro.getLblRegistroUsuario().setText("<html><center>Las claves no coinciden");
            vregistro.getLblRegistroUsuario().setForeground(Color.red);
            return false;
        }

        if (nuevosaldo.isEmpty()) {
            vregistro.getLblRegistroUsuario().setText("<html><center>Campo Saldo se encuentra vacío");
            vregistro.getLblRegistroUsuario().setForeground(Color.red);
            return false;
        }

        if (!validados.validarNumeroFloat(nuevosaldo)) {
            vregistro.getLblRegistroUsuario().setText("<html><center>Ingrese un número correcto");
            vregistro.getLblRegistroUsuario().setForeground(Color.red);
            return false;
        }

        return true;
    }

    //Metodos de vista cuenta
    private void realizarTransaccion() {

        float valor = Float.parseFloat(vcuenta.getTxtValorProcesar().getText());

        if (vcuenta.getRbtnDeposito().isSelected()) {
            cliente.depositar(valor, username);
            actualizarSaldoUsuario();
            mostrarMensajeValidación("<html><center>Depósito realizado con éxito", new Color(49, 86, 153));
        } else {
            if (vcuenta.getRbtnRetiro().isSelected()) {
                if (valor <= cliente.saldo(username)) {
                    cliente.retirar(valor, username);
                    actualizarSaldoUsuario();
                    mostrarMensajeValidación("<html><center>Retiro realizado con éxito", new Color(49, 86, 153));
                } else {
                    mostrarMensajeValidación("<html><center>Saldo insuficiente", Color.red);
                }

            }
        }

    }

    public void actualizarSaldoUsuario() {
        float saldo = cliente.saldo(username);
        vcuenta.getLblSaldoUsu().setText(String.valueOf(saldo));
    }

    public void mostrarMensajeValidación(String mensaje, Color color) {
        vcuenta.getLblCuentadeUsuario().setForeground(color);
        vcuenta.getLblCuentadeUsuario().setText(mensaje);
    }

}
