package backend;

public class Cliente extends Persona {
    //atributos
    private String numDeCliente;
    //metodos

    public String getNumDeCliente() {
        return numDeCliente;
    }

    public void setNumDeCliente(String numDeCliente) {
        this.numDeCliente = numDeCliente;
    }
    
    @Override
    public String mostrar_datos() {
        String datos=super.mostrar_datos();
        
        datos +="No. de Cliente  :" + getNumDeCliente(); 
                
              
        return datos;
    }
    
    public Cliente actualizar_cliente(Cliente objCliente, 
                                      String nombre, String apellido, String email, 
                                      int edad, String telefono)
    {
        objCliente.setNombre(nombre);
        objCliente.setApellido(apellido);
        objCliente.setEmail(email);
        objCliente.setEdad(edad);
        objCliente.setNumDeTelefono(telefono);
        
        return objCliente;
    }
}
