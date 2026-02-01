/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battleshipdinamico;

import java.util.ArrayList;

/**
 *
 * @author nasry
 */
public class Player {

    private static ArrayList<Player> players = new ArrayList<>();

    private String username;
    private String password;

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Validar user y password length
    public static boolean lengthValido(String text) {
        return text.length() >= 3 && text.length() <= 20;
    }

    public static boolean usernameExists(String username) {
        for (Player p : players) {
            if (p.username.equals(username)) {
                return true;
            }
        }
        return false;
    }

//Para Sign Up
    public static boolean registrar(String username, String password) {
        if (!lengthValido(username) || !lengthValido(password)) {
            return false;
        }
        if (usernameExists(username)) {
            return false;
        }
        players.add(new Player(username, password));
        return true;
    }

    //Para Log In
    public static Player login(String username, String password) {
        for (Player p : players) {
            if (p.username.equals(username) && p.password.equals(password)) {
                return p;
            }
        }
        return null;
    }

}
