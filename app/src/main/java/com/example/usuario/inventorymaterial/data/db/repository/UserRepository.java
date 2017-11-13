package com.example.usuario.inventorymaterial.data.db.repository;

import com.example.usuario.inventorymaterial.data.db.model.Sector;
import com.example.usuario.inventorymaterial.data.db.model.User;

import java.util.ArrayList;

/**
 * Almacena los datos de usuario
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see Sector
 */
public class UserRepository {

    /*DECLARACIÓN*/
    private ArrayList<User> users;
    private static UserRepository userRepository;
    static { userRepository = new UserRepository(); }

    /*INICIALIZACIÓN*/
    //De esta forma inicializa los atributos de ámbito estático o de clase
    //Es la forma alternativa aunque puede ser costoso y se puede evitar
    /**
     * Constructor privado que garantiza una instancia única de la clase
     */
    private UserRepository() {
        this.users = new ArrayList<>();
        initialize();
    }

    /*MÉTODOS*/

    /**
     * Inicializa la estructura de datos DependencyRepository
     */
    private void initialize() {
        saveUser(new User(1, "Lourdes", "lourdes","Lourdes Rodríguez",
                "moronlu18@gmail.com", true, true));
        saveUser(new User(2, "Jesús", "jesus","Jesús Rodríguez",
                "jesus2@gmail.com", false, false));
        saveUser(new User(3, "Ángela", "angela", "Ángela Rodríguez",
                "angela16@gmail.com", false, false));
    }
    /**
     * Accesor de la clase SectorRepository
     * @return Devuelve la instancia de la clase como objeto SectorRepository
     */
    public static UserRepository getInstance(){
        if (userRepository == null)
            userRepository = new UserRepository();
        return userRepository;
    }
    /**
     * Método que añade un nuevo sector
     * @param user Objeto de clase Sector
     */
    private void saveUser(User user) { users.add(user); }
    /**
     * Devuelve la referencia al objeto
     * @return referencia al objeto ArrayList
     */
    public ArrayList<User> getUsers() {
        return users;
    }
    /**
     * Comprueba si un usuario existe en la base de datos
     * @param newuser Usuario que se quiere buscar en la BD
     * @return true si existe en la BD
     */
    public boolean isUserExists(User newuser) {
        return true;
    }
    public boolean validateCredentials(String name, String password) {
        User user = new User(0, name, password, null, null, false, false);
        return users.get(users.indexOf(user)).getPassword().equals(password);
    }
}
