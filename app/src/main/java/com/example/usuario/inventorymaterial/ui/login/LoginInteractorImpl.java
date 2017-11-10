package com.example.usuario.inventorymaterial.ui.login;

/**
 * Clase interactor del presentador de la vista Login.
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see LoginInteractor
 * @see LoginInteractor.OnLoginFinishedListener
 *
 */


public class LoginInteractorImpl {

    //Las clases interactor no tienen contrato con nadie, se les pasa
    //por parámetro una interfaz
    public void validateCredentials(String user, String password,
                                    LoginInteractor.OnLoginFinishedListener onLoginFinishedListener) {
        //Realiza todas las comprobaciones
        if (true)
            onLoginFinishedListener.onPasswordEmptyError();
        else if (true)
            onLoginFinishedListener.onUserEmptyError();
        else if (true)
            onLoginFinishedListener.ontPasswordError();
        else
            //Y es correcto
            onLoginFinishedListener.onSuccess();
    }
}
