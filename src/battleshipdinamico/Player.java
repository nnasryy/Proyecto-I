/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battleshipdinamico;

/**
 *
 * @author nasry
 */
public class Player {

    private String username;
    private String password;
    private int puntos;
    private String[] logs;

    //Constructos de Datos Principales del Jugador 
    public Player(String username, String password) {
        this.username = username;
        this.password = password;
        this.puntos = 0;
        this.logs = new String[10];
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }

}
