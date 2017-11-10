package com.example.usuario.inventorymaterial;

import com.example.usuario.inventorymaterial.data.db.model.User;
import com.example.usuario.inventorymaterial.data.db.repository.UserRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    //Base de datos de prueba
    private ArrayList<User> users;

    @Mock   //Notación Mock para que esté compartido por los tests (si no, da NullPointerEx.)
    private UserRepository userRepository;

    @Before //Este decorador hace que se ejecute antes de cualquier método de prueba
    public void initialize() {
        //Añadimos el objeto virtual
        userRepository = mock(UserRepository.class);
        users = new ArrayList<User>();
        users.add(new User(1, "lourdes", "Lourdes", "Lourdes Rodríguez",
                "moronlu18@gmail.com", true, true));
        users.add(new User(2, "maría", "maría", "María Serrano",
                "maría20@gmail.com", false, false));
        users.add(new User(3, "angela", "Ángela", "Ángela Rodríguez",
                "angela16@gmail.com", false, false));
    }

    //3. El usuario/email existe en la base de datos (Repository)
    /**
     * Para realizar esta prueba se tienen que comparar dos objetos User
     * Debemos sobrecargar el método equals en User con las reglas usuario/email en la BD
     */
    @Test
    public void isUserExists_isCorrect() {
        //Cuando se llame al método isUserExists, devuelve un valor predeterminado a mano
        when(userRepository.isUserExists(users.get(0))).thenReturn(true);
        assertTrue(userRepository.isUserExists(users.get(0)));
    }

    @Test
    public void getUsers_isCorrect() {
        when(userRepository.getUsers()).thenReturn(users);
        assertEquals(users.get(0), userRepository.getUsers().get(0));
    }

    //4. La contraseña sea correcta (Repository)
    @Test
    public void password_isCorrect() {
        when(userRepository.getUsers()).thenReturn(users);
        assertEquals(users.get(0).getPassword(), userRepository.getUsers().get(0).getPassword());
    }

    @Test
    public void signIn_isCorrect() throws Exception {

    }

    @Test
    public void signUp_isCorrect() throws Exception {

    }


    /**
     * Ejemplo de prueba donde se ve el conjunto de pruebas posibles.
     */
    @Test
    public void testAssertions() {
        //Compara si dos objetos son iguales
        User user1 = new User(1, "lourdes", "Lourdes", "Lourdes Rodríguez",
                "moronlu18@gmail.com", true, true);
        assertEquals(user1, users.get(0));
        //Compara si un objeto es nulo
        User user2 = null;
        User user3 = user1;
        assertNull(user2);
        //Un objeto no es unilo
        assertNotNull(user1);
        //Dos objetos apuntan a la misma referencia
        assertSame(user1, user3);

        //assertTrue, etc.
    }
}