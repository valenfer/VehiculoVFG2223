
package vehiculo;

/**
 * Clase de objeto vehículo.
 *Define característica de un vehículo. 
 * @author  Valentin Fernandez Guijarro 
 */
public class VehiculoFernandezGuijarroValentin2223 {

    /**
     * Devuelve el nombre del vehículo
     * @return Nombre del vehículo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del vehículo
     * @param nombre Nombre a cambiar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *Informa del precio del vehículo
     * @return precio del vehículo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Pone precio al vehículo
     * @param precio Nuevo precio a poner al vehículo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Informa del precio del vehículo con iva
     * @return the precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     *Modifica precio con IVA
     * @param precioIVA the precioIVA to set
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Informa del estdo del Stock
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Modifica el Stock
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
   
    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     *Contructor sin parámetros
     * 
     */
    public VehiculoFernandezGuijarroValentin2223 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    /**
     *Contructor con tres parámetros
     * @param nom Nombre del vehículo
     * @param precio Precio del vehículo
     * @param stock Stock del vehículo
     */
    public VehiculoFernandezGuijarroValentin2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   // Método para asignar el nombre del vehiculo
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    // Método que me devuelve el nombre del vehiculo
    public String obtenerNombre()
    {
        return getNombre();
    }

    // Método que me devuelve el stock de vehiculos disponible en cada momento
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     * @exception Exception Si se intenta comprar un número negativo 
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

     /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     * @exception Exception Si se intenta vender un número negativo o superior al stock
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    
}  
   
