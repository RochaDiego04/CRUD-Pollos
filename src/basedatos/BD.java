
package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import backend.Cliente;
import backend.Empleado;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;



public class BD {
    
   Connection conexion;
   
   PreparedStatement stInsertarCliente;
   PreparedStatement stInsertarEmpleado;   
   
   PreparedStatement stConsultarCliente;
   PreparedStatement stConsultarEmpleado;   
   
   PreparedStatement stConsultarClientes;
   PreparedStatement stConsultarEmpleados;   
   
   PreparedStatement stActualizarCliente;
   PreparedStatement stActualizarEmpleado;   
   
   PreparedStatement stEliminarCliente;
   PreparedStatement stEliminarEmpleado;
  
   DefaultTableModel modeloCliente = new DefaultTableModel();
   DefaultTableModel modeloEmpleado = new DefaultTableModel();   
   
    public BD() {
      try{   
        Class.forName("com.mysql.cj.jdbc.Driver");  
      }catch(ClassNotFoundException ex){
        System.out.println(ex.getMessage());
        System.out.println("Error al cargar el driver");
      }
    }
   
   public void abrir_conexion(){
       try{
        conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/crudpollo?serverTimezone=GMT-5","root","");
        
        stInsertarCliente = conexion.prepareStatement("INSERT INTO Cliente Values (?,?,?,?,?,?,?)"); 
        stInsertarEmpleado = conexion.prepareStatement("INSERT INTO Empleado Values (?,?,?,?,?,?,?,?,?,?,?)");        
        
        stConsultarCliente = conexion.prepareStatement("SELECT * FROM Cliente WHERE Codigo =?");
        stConsultarEmpleado = conexion.prepareStatement("SELECT * FROM Empleado WHERE Codigo =?");
        
        stActualizarCliente = conexion.prepareStatement("UPDATE Cliente set Nombre=?,Apellido=?,Email=?,Edad=?,Telefono=? WHERE Codigo=?");
        stActualizarEmpleado = conexion.prepareStatement("UPDATE Empleado set Nombre=?,Apellido=?,Email=?,Edad=?,Telefono=?,HorasPorMes=?,PagoPorHora=?,Puesto=?,Sueldo=? WHERE Codigo=?");
                
        stEliminarCliente = conexion.prepareStatement("DELETE FROM Cliente WHERE Codigo =?");
        stEliminarEmpleado = conexion.prepareStatement("DELETE FROM Empleado WHERE Codigo =?");
   
        stConsultarEmpleados = conexion.prepareStatement("SELECT * FROM Empleado");
        stConsultarClientes = conexion.prepareStatement("SELECT * FROM Cliente");        

       }catch(SQLException ex){
           System.out.println(ex.getMessage());
           System.out.println("Error al establecer la conexión con MySQL");
       }  
    }
   
   public void cerrar_conexion(){
       try{
        conexion.close();
       }catch(SQLException ex){
           System.out.println(ex.getMessage());
           System.out.println("Error al cerrar la conexión con MySQL");
       }
    }
   
   public void insertar_cliente(Cliente ObjCliente){
       try{
            stInsertarCliente.setString(1, ObjCliente.getNombre());
            stInsertarCliente.setString(2, ObjCliente.getApellido());
            stInsertarCliente.setString(3, ObjCliente.getEmail());
            stInsertarCliente.setInt(4,ObjCliente.getEdad());
            stInsertarCliente.setString(5, ObjCliente.getNumDeTelefono());
            stInsertarCliente.setString(6, ObjCliente.getNumDeCliente());
            stInsertarCliente.setString(7, ObjCliente.getSexo());

            stInsertarCliente.executeUpdate();
        
       }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar un Cliente a la base de datos ");
       }
    }
      
    public void insertar_empleado(Empleado ObjEmpleado){
       try{
            stInsertarEmpleado.setString(1, ObjEmpleado.getNombre());
            stInsertarEmpleado.setString(2, ObjEmpleado.getApellido());
            stInsertarEmpleado.setString(3, ObjEmpleado.getEmail());
            stInsertarEmpleado.setInt(4,ObjEmpleado.getEdad());
            stInsertarEmpleado.setString(5, ObjEmpleado.getNumDeTelefono());
            stInsertarEmpleado.setString(6, ObjEmpleado.getSexo());
            stInsertarEmpleado.setDouble(7, ObjEmpleado.getHorasTrabajadasMensuales());
            stInsertarEmpleado.setDouble(8, ObjEmpleado.getPagoPorHora());
            stInsertarEmpleado.setString(9, ObjEmpleado.getNumeroDeEmpleado());
            stInsertarEmpleado.setString(10, ObjEmpleado.getPuesto());
            stInsertarEmpleado.setDouble(11,ObjEmpleado.getSueldo());
        
            stInsertarEmpleado.executeUpdate();
        
       }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar un Empleado a la base de datos ");
       }
    }
    
      
    public Cliente consultar_cliente(String numDeCliente){
       
       Cliente objCliente = null;
       ResultSet rs = null;
       
       try{
           
           stConsultarCliente.setString(1, numDeCliente);
           rs = stConsultarCliente.executeQuery(); //para que el set se ejecute en la base de datos
           
           if(rs.next()){
              objCliente = new Cliente();
              objCliente.setNombre(rs.getString("Nombre"));
              objCliente.setApellido(rs.getString("Apellido"));
              objCliente.setEmail(rs.getString("Email"));
              objCliente.setEdad(rs.getInt("Edad"));
              objCliente.setNumDeTelefono(rs.getString("Telefono"));
              objCliente.setNumDeCliente(rs.getString("Codigo"));
              objCliente.setSexo(rs.getString("Sexo"));
           }
           
       }catch(SQLException ex){
           System.out.println(ex.getMessage());
           System.out.println("Error al consultar al Cliente");
       }
       
       return objCliente;
    }

    public Empleado consultar_empleado(String numeroDeEmpleado){
       
       Empleado objEmpleado = null;
       ResultSet rs = null;
       
       try{
           
           stConsultarEmpleado.setString(1, numeroDeEmpleado);
           rs=stConsultarEmpleado.executeQuery(); 
           
           if(rs.next()){
              objEmpleado = new Empleado();
              objEmpleado.setNombre(rs.getString("Nombre"));
              objEmpleado.setApellido(rs.getString("Apellido"));
              objEmpleado.setEmail(rs.getString("Email"));
              objEmpleado.setEdad(rs.getInt("Edad"));
              objEmpleado.setNumDeTelefono(rs.getString("Telefono"));
              objEmpleado.setSexo(rs.getString("Sexo"));
              objEmpleado.setHorasTrabajadasMensuales(rs.getDouble("HorasPorMes"));
              objEmpleado.setPagoPorHora(rs.getDouble("PagoPorHora"));
              objEmpleado.setNumeroDeEmpleado(rs.getString("Codigo"));
              objEmpleado.setPuesto(rs.getString("Puesto"));
              objEmpleado.setSueldo(rs.getDouble("Sueldo"));
           }
           
       }catch(SQLException ex){
           System.out.println(ex.getMessage());
           System.out.println("Error al consultar al Empleado");
       }
       return objEmpleado;
    }

    public void actualizar_cliente(Cliente objCliente){
          
        try{
            stActualizarCliente.setString(1, objCliente.getNombre());
            stActualizarCliente.setString(2, objCliente.getApellido());
            stActualizarCliente.setString(3, objCliente.getEmail());
            stActualizarCliente.setInt(4, objCliente.getEdad());
            stActualizarCliente.setString(5, objCliente.getNumDeTelefono());
            stActualizarCliente.setString(6, objCliente.getNumDeCliente());
            stActualizarCliente.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("No se pudo actualizar un Cliente en la base de datos");
        }  
    }  
   
    public void actualizar_empleado(Empleado objEmpleado){
          
        try{
            stActualizarEmpleado.setString(1, objEmpleado.getNombre());
            stActualizarEmpleado.setString(2, objEmpleado.getApellido());
            stActualizarEmpleado.setString(3, objEmpleado.getEmail());
            stActualizarEmpleado.setInt(4, objEmpleado.getEdad());
            stActualizarEmpleado.setString(5, objEmpleado.getNumDeTelefono());
            stActualizarEmpleado.setDouble(6,objEmpleado.getHorasTrabajadasMensuales());
            stActualizarEmpleado.setDouble(7,objEmpleado.getPagoPorHora());
            stActualizarEmpleado.setString(8, objEmpleado.getPuesto());
            stActualizarEmpleado.setDouble(9, objEmpleado.getSueldo());
            stActualizarEmpleado.setString(10, objEmpleado.getNumeroDeEmpleado());
            stActualizarEmpleado.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("No se pudo actualizar un Empleado en la base de datos");
        }
    }  
    
   
    public void eliminar_cliente(Cliente objCliente){
        try{
            stEliminarCliente.setString(1, objCliente.getNumDeCliente());
            stEliminarCliente.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al eliminar un Cliente de la base de datos ");
        }
    } 
      
    public void eliminar_empleado(Empleado objEmpleado){
        try{
            stEliminarEmpleado.setString(1, objEmpleado.getNumeroDeEmpleado());
            stEliminarEmpleado.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al eliminar un Empleado de la base de datos ");
        }
    } 
    
      
    public DefaultTableModel consultar_cliente(String Codigo, DefaultTableModel modeloCliente){
           
        ResultSet rs = null;
        
        try{
            stConsultarCliente.setString(1, Codigo);
            rs = stConsultarCliente.executeQuery();
            if(rs.next() ){
                cargar_datos_modelo_cliente(rs, modeloCliente); 
            }else{
                modeloCliente.setRowCount(0);
            }
        }catch(SQLException ex){
            System.out.println("Error al consultar un Cliente en la base de datos");
            System.out.println(ex.getMessage());
        }
            return modeloCliente;  
    } 
      
    public DefaultTableModel consultar_cliente(DefaultTableModel modeloCliente){
           
        ResultSet rs = null;
           
        try{
            rs = stConsultarClientes.executeQuery();
            if(rs.next() ){
                cargar_datos_modelo_cliente(rs, modeloCliente); 
            }
        }catch(SQLException ex){
            System.out.println("Error al consultar un Cliente en la base de datos");
            System.out.println(ex.getMessage());
        }
            return modeloCliente;  
    } 
      
    private void cargar_datos_modelo_cliente(ResultSet rs, DefaultTableModel modeloCliente){
           
        borrar_modelo_cliente(modeloCliente);
        try{
            do{
                Object [] fila = new Object[7];
                for(int i=0;i<fila.length; i++){
                    fila[i] = rs.getObject(i+1);
                    System.out.println(fila[i]);
              }
            modeloCliente.addRow(fila);
            }while (rs.next());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al cargar el ResultSet al MOdelo");
        }
    }
    
    public DefaultTableModel crear_modelo_cliente(DefaultTableModel modeloEmpleado){
          modeloCliente.addColumn("Nombre");
          modeloCliente.addColumn("Apellido");
          modeloCliente.addColumn("Email");
          modeloCliente.addColumn("Edad");
          modeloCliente.addColumn("Telefono");
          modeloCliente.addColumn("Codigo");
          modeloCliente.addColumn("Sexo");
            
          return modeloCliente;
    }
    
    public DefaultTableModel crear_modelo_empleado(DefaultTableModel modeloEmpleado){
        modeloEmpleado.addColumn("Nombre");
        modeloEmpleado.addColumn("Apellido");
        modeloEmpleado.addColumn("Email");
        modeloEmpleado.addColumn("Edad");
        modeloEmpleado.addColumn("Telefono");
        modeloEmpleado.addColumn("Sexo");
        modeloEmpleado.addColumn("HorasPorMes");
        modeloEmpleado.addColumn("PagoPorHora");
        modeloEmpleado.addColumn("Codigo");
        modeloEmpleado.addColumn("Puesto");
        modeloEmpleado.addColumn("Sueldo");
            
        return modeloEmpleado;
           
    }
    
    public void borrar_modelo_cliente(DefaultTableModel modeloCliente){
        while(modeloCliente.getRowCount() >= 1){
            modeloCliente.removeRow(modeloCliente.getRowCount() -1);
        }      
    }

    public DefaultTableModel consultar_empleado(String Codigo, DefaultTableModel modeloEmpleado){
           
        ResultSet rs = null;
        try{
            stConsultarEmpleado.setString(1, Codigo);
            rs = stConsultarEmpleado.executeQuery();
            if(rs.next() ){
                cargar_datos_modelo_empleado(rs, modeloEmpleado); 
            } else{
                modeloEmpleado.setRowCount(0);
            }
        }catch(SQLException ex){
            System.out.println("Error al consultar un Cliente en la base de datos");
            System.out.println(ex.getMessage());
        }
        return modeloEmpleado;  
    } 
      
    public DefaultTableModel consultar_empleado(DefaultTableModel modeloEmpleado){
           
        ResultSet rs = null;
        try{
               
            rs = stConsultarEmpleados.executeQuery();
            if(rs.next() ){
                cargar_datos_modelo_empleado(rs, modeloEmpleado); 
            }
        }catch(SQLException ex){
            System.out.println("Error al consultar un Empleado en la base de datos");
            System.out.println(ex.getMessage());
        }
        return modeloEmpleado;  
    } 
      
    private void cargar_datos_modelo_empleado(ResultSet rs, DefaultTableModel modeloEmpleado){
           
        borrar_modelo_empleado(modeloEmpleado);
        try{
            do{
               Object [] fila = new Object[11];
               for(int i=0;i<fila.length; i++){
               fila[i] = rs.getObject(i+1);
               System.out.println(fila[i]);
               }
               modeloEmpleado.addRow(fila);
            }while (rs.next());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error al cargar el ResultSet al MOdelo");
        }
    }
    
      
    public void borrar_modelo_empleado(DefaultTableModel modeloEmpleado){
        while(modeloEmpleado.getRowCount() >= 1){
            modeloEmpleado.removeRow(modeloEmpleado.getRowCount() -1);
        }
               
    }
        
}
