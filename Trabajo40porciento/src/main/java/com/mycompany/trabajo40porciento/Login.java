/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo40porciento;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

public class Login {
    private List<Usuario> usuarios = new ArrayList<>();

    public Login() {
        cargarUsuariosDesdeArchivo(); // Cargar usuarios desde el archivo al iniciar
    }

    public boolean autenticar(String nombre, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getContraseña().equals(contraseña)) {
                return true; // Autenticación exitosa
            }
        }
        return false; // Autenticación fallida
    }

    public void eliminarUsuario(String nombre, String contraseña) {
        usuarios.removeIf(usuario -> 
            usuario.getNombre().equals(nombre) && usuario.getContraseña().equals(contraseña)
        );
    }

    public void registrarUsuario(String nombre, String correo, String contraseña) {
        Usuario usuario = new Usuario(nombre, correo, contraseña);
        usuarios.add(usuario);

        // Guardar en el archivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
            bw.write(nombre + "," + correo + "," + contraseña);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar el usuario: " + e.getMessage());
        }
    }

    // Método para cargar los usuarios desde el archivo
    public void cargarUsuariosDesdeArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    String nombre = datos[0];
                    String correo = datos[1];
                    String contraseña = datos[2];
                    usuarios.add(new Usuario(nombre, correo, contraseña));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los usuarios: " + e.getMessage());
        }
    }
}
