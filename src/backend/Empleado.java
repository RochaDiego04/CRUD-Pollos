
package backend;


public class Empleado extends Persona {
   //atributos
   double sueldo;
   double pagoPorHora;
   double horasTrabajadasMensuales;
   String numeroDeEmpleado;
   String puesto;
   //setters y getters

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public double getHorasTrabajadasMensuales() {
        return horasTrabajadasMensuales;
    }

    public void setHorasTrabajadasMensuales(double horasTrabajadasMensuales) {
        this.horasTrabajadasMensuales = horasTrabajadasMensuales;
    }

    public String getNumeroDeEmpleado() {
        return numeroDeEmpleado;
    }

    public void setNumeroDeEmpleado(String numeroDeEmpleado) {
        this.numeroDeEmpleado = numeroDeEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public String mostrar_datos(){
        String datos=super.mostrar_datos();
        
        datos+= "Sueldo: " + getSueldo() + "\n" +
                "Pago por Hora: " + getPagoPorHora() + "\n" +
                "Horas Trabajadas Mensuales: " + getPagoPorHora() + "\n" +
                "Numero de Empleado: " + getNumeroDeEmpleado() + "\n" +
                "Puesto: " + getPuesto();
                
        
        return datos;
    }
    
    public Empleado actualizar_empleado(Empleado objEmpleado, 
                                      String nombre, String apellido, String email, 
                                      int edad, String telefono, double horasTrabajadasMensuales,
                                      double pagoPorHora, String puesto)
    {
        objEmpleado.setNombre(nombre);
        objEmpleado.setApellido(apellido);
        objEmpleado.setEmail(email);
        objEmpleado.setEdad(edad);
        objEmpleado.setNumDeTelefono(telefono);
        objEmpleado.setHorasTrabajadasMensuales(horasTrabajadasMensuales);
        objEmpleado.setPagoPorHora(pagoPorHora);
        objEmpleado.setPuesto(puesto);
        return objEmpleado;
    }
    
    public void calcular_salario(){
        setSueldo(( getPagoPorHora() * getHorasTrabajadasMensuales())*.84);
    }
   }
   

