/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TrabajoPractico_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       
        try {
            //1)_CARGAR EL DRIVER
            Class.forName("org.mariadb.jdbc.Driver");
            
            // 2)_CONEXION A LA BASE DE DATOS.
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajopractico13","root", "");
           
           //3)_ INSERTAR 3 ALUMNOS. 
           // ALUMNO 1.
         /*  String sql = "INSERT INTO alumno (dni,apellido,nombre,fechanacimiento,estado)"
                   + "VALUES (42799970,'Padilla','Facundo','2000-06-03',true)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Cantidad de filas afectadas "+registro); */
         
           //ALUMNO 2. 
           /* String sql = "INSERT INTO alumno (dni,apellido,nombre,fechanacimiento,estado)"
                   + "VALUES (45116524,'Ramirez','Lucia','2003-09-10',true)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */
           
           // ALUMNO 3. 
            /* String sql = "INSERT INTO alumno (dni,apellido,nombre,fechanacimiento,estado)"
                   + "VALUES (40234632,'Solari','Pablo','2001-04-11',true)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */
           
            // 4)_ INSERTAR 4 MATERIAS. 
            // MATERIA 1
            /*  String sql = "INSERT INTO materia(nombre,año,estado)"
                   + "VALUES ('Laboratorio1','2',true)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */
            
            // MATERIA 2.  
               /* String sql = "INSERT INTO materia(nombre,año,estado)"
                   + "VALUES ('Programacion1','1',true)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */
           
            // MATERIA 3. 
              /*  String sql = "INSERT INTO materia(nombre,año,estado)"
                   + "VALUES ('Matematica','1',true)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */
              
           // MATERIA 4. 
           
           /* String sql = "INSERT INTO materia(nombre,año,estado)"
                   + "VALUES ('Web1','2',true)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */
            
            // 5) INSCRIBIR A LOS 3 ALUMNOS EN 2 MATERIAS CADA UNO. 
            // ALUMNO 1 MATERIA 1
              /*  String sql = "INSERT INTO inscripcion(nota,idalumno,idmateria)"
                   + "VALUES ('9','1',2)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */
            
            // ALUMNO 1 MATERIA 2
                /* String sql = "INSERT INTO inscripcion(nota,idalumno,idmateria)"
                   + "VALUES ('7','1',3)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */
           
           //ALUMNO 2 MATERIA 1 
                /*   String sql = "INSERT INTO inscripcion(nota,idalumno,idmateria)"
                   + "VALUES ('8','2',1)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */
           
           // ALUMNO 2 MATERIA 2 
                 /*  String sql = "INSERT INTO inscripcion(nota,idalumno,idmateria)"
                   + "VALUES ('6','2',2)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */
            
            // ALUMNO 3 MATERIA 1 
                  /*  String sql = "INSERT INTO inscripcion(nota,idalumno,idmateria)"
                   + "VALUES ('10','3',1)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */
            
            // ALUMNO 3 MATERIA 2 
                  /*  String sql = "INSERT INTO inscripcion(nota,idalumno,idmateria)"
                   + "VALUES ('5','3',3)"; 
           PreparedStatement ps = conexion.prepareStatement(sql);
           int registro = ps.executeUpdate();
            System.out.println("Filas afectadas "+registro); */ 
                  
           // 6)_LISTAR LOS DATOS DE LOS ALUMNOS CON CALIFICACIONES SUPERIORES A 8     
         /*  String sql = "SELECT* FROM alumno JOIN inscripcion ON alumno.idAlumno = inscripcion.idAlumno WHERE inscripcion.nota > 8;";
           PreparedStatement ps = conexion.prepareStatement(sql);
           ResultSet resultado = ps.executeQuery();
           while(resultado.next()){
               System.out.println("DNI: "+resultado.getInt("dni"));
               System.out.println("Apellido: "+resultado.getString("apellido"));
               System.out.println("Nombre: "+resultado.getString("nombre"));
               System.out.println("Fecha de nacimiento: "+resultado.getDate("fechanacimiento"));
               System.out.println("Estado: "+resultado.getBoolean("estado"));
           } */
         // 7)_ Desinscribir un alumno de una de la materias.
         String sql = "DELETE FROM inscripcion WHERE idAlumno=3 AND idMateria=3";
         PreparedStatement ps = conexion.prepareStatement(sql);
         int registro = ps.executeUpdate();
            System.out.println(registro);
         
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Error al cargar el driver.");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al conectar base de datos.");
        }
    }
    
}
