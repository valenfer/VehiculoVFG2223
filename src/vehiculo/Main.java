package vehiculo;

/**
 * Clase main del programa.
 *Gestiona la compra y venta de vehículos, modificando el stock
 * 
 * @author Valentin Fernandez Guijarro
 */
public class Main {
    /**
     * Método main.
     * Método principal de ejecución del programa
     */
      public static void main(String[] args) {
        VehiculoFernandezGuijarroValentin2223 miVehiculoFernandezGuijarroValentin2223;
        int stockActual;
        
        miVehiculoFernandezGuijarroValentin2223 = new VehiculoFernandezGuijarroValentin2223("Seat",18000,100);
        operativaVehiculosFernandezGuijarroValentin2223(miVehiculoFernandezGuijarroValentin2223, 50); 
    }
    /**
     *Metodo que gestiona la compra y venta de vehículos y modifica el stock
     *@param miVehículoFernandezGuiajrroValentin2223  Objeto de clase veículo
     * @param cantidad cantidad de vehículos
     */
    private static void operativaVehiculosFernandezGuijarroValentin2223(VehiculoFernandezGuijarroValentin2223 miVehiculoFernandezGuijarroValentin2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoFernandezGuijarroValentin2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoFernandezGuijarroValentin2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoFernandezGuijarroValentin2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}	
