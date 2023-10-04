public class Adopcion {
    String nombreAdoptante;
    String direccion;
    long numeroContacto;
    String  preferenciaAdopcion;
    String animalAdoptado;
    String infAdoptante;
    String fechaAdopcion;


    public Adopcion(String nombreAdoptante, String direccion, long numeroContacto, String preferenciaAdopcion, String animalAdoptado, String infAdoptante, String fechaAdopcion) {
        this.nombreAdoptante = nombreAdoptante;
        this.direccion = direccion;
        this.numeroContacto = numeroContacto;
        this.preferenciaAdopcion = preferenciaAdopcion;
        this.animalAdoptado = animalAdoptado;
        this.infAdoptante = infAdoptante;
        this.fechaAdopcion = fechaAdopcion;
    }

    public void mostrarAdopcion(){
        System.out.println("Datos de la adopcion");
        System.out.println("Nombre del adoptante" + nombreAdoptante);
        System.out.println("direccion"+direccion);
        System.out.println("numero de contacto"+numeroContacto);
        System.out.println("prefencia de adopcion"+ preferenciaAdopcion);
        System.out.println("animal adoptado"+animalAdoptado);
        System.out.println("informacion adoptate"+infAdoptante);
        System.out.println("fecha de adopcion"+ fechaAdopcion);

    }

    public String getNombreAdoptante() {
        return nombreAdoptante;
    }

    public void setNombreAdoptante(String nombreAdoptante) {
        this.nombreAdoptante = nombreAdoptante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(long numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getPreferenciaAdopcion() {
        return preferenciaAdopcion;
    }

    public void setPreferenciaAdopcion(String preferenciaAdopcion) {
        this.preferenciaAdopcion = preferenciaAdopcion;
    }

    public String getAnimalAdoptado() {
        return animalAdoptado;
    }

    public void setAnimalAdoptado(String animalAdoptado) {
        this.animalAdoptado = animalAdoptado;
    }

    public String getInfAdoptante() {
        return infAdoptante;
    }

    public void setInfAdoptante(String infAdoptante) {
        this.infAdoptante = infAdoptante;
    }

    public String getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(String fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }
}
