package backend;

public class Persona {
    //atributos
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private String numDeTelefono;
    private String sexo;
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumDeTelefono() {
        return numDeTelefono;
    }

    public void setNumDeTelefono(String numDeTelefono) {
        this.numDeTelefono = numDeTelefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String mostrar_datos(){
        String datos="";
        
        datos += "Nombre: " + getNombre() + "\n" +
                 "Apellido: " + getApellido() + "\n" +
                 "Email: " + getEmail() + "\n" +
                 "Edad: " + getEdad() + "\n" +
                 "Teléfono: " + getNumDeTelefono() + "\n" +
                 "Sexo: " + getSexo() + "\n";
        return datos;
    }
}
