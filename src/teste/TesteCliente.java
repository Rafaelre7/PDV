/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import DAO.DAOCliente;

/**
 *
 * @author Miguel Jhúnnior
 */
public class TesteCliente {
    public static void main(String[] args) {
        DAOCliente daoCLiente = new DAOCliente();
        
        daoCLiente.excluirClienteDAO(2);
        
    }
}
