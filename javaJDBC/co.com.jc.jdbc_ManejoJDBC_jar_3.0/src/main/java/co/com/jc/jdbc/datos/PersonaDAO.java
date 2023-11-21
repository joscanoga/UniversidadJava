/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.jc.jdbc.datos;

import co.com.jc.jdbc.domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author johan
 */
public interface PersonaDAO {
    public int insertar(PersonaDTO persona)throws SQLException;
    public int actualizarPersona(PersonaDTO persona)throws SQLException;
    public int Eliminar(PersonaDTO persona)throws SQLException;
    public List<PersonaDTO> selecionar()throws SQLException;
}
