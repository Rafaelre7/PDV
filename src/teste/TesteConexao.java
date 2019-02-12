/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import conexoes.ConexaoMySql;


/**
 *
 * @author AlexArraes
 */
public class TesteConexao {
    
    public static void main(String[] args) {
        ConexaoMySql con = new ConexaoMySql();
        System.out.print(con.conectar());
    
    }
    
}
