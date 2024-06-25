/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.grafico.test;

import com.google.gson.Gson;
import pe.edu.upeu.grafico.dao.EscuelaDao;
import pe.edu.upeu.grafico.daolmpt.EscueDaolmpl;

/**
 *
 * @author USUARIO
 */
public class Test {
static Gson g = new Gson();
static EscuelaDao edao = new EscueDaolmpl();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(g.toJson(edao.getEscuelas()));
        System.out.println(g.toJson(edao.getCantidad()));
    }
    
}
