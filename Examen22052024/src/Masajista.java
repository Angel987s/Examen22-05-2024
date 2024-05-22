public class Masajista extends Persona {
    private String nombre;
    private int aniosexperencia;
    
    public Masajista(String nombre, int aniosexperencia) {
        this.nombre = nombre;
        this.aniosexperencia = aniosexperencia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAniosexperencia() {
        return aniosexperencia;
    }
    public void setAniosexperencia(int aniosexperencia) {
        this.aniosexperencia = aniosexperencia;
    }
    public Masajista(int id, String nombre, String apellido, int edad, String nombre2, int aniosexperencia) {
        super(id, nombre, apellido, edad);
        nombre = nombre2;
        this.aniosexperencia = aniosexperencia;
    }
}
