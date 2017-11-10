package com.example.usuario.inventorymaterial.ui.login;

/**
 * Clase presententador de las vistas Login
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see LoginPresenter
 * @see LoginInteractorImpl
 */
public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnLoginFinishedListener {

    private LoginView loginView;
    private LoginInteractorImpl loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        //Cada presentador tiene UN objeto de su Interactor
        loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateCredentials(String user, String password) {
        loginInteractor.validateCredentials(user, password, this);
    }
    @Override
    public void onUserEmptyError() {
        loginView.setUserEmptyError();
    }
    @Override
    public void onPasswordEmptyError() {
        loginView.setPasswordEmptyError();
    }
    @Override
    public void ontPasswordError() {
        loginView.setPasswordError();
    }
    @Override
    public void onSuccess() {

    }

}
