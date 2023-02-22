
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoBonillaLaraRafael2223 miVehiculoBonillaLaraRafael2223;
        int stockActual;
        
        miVehiculoBonillaLaraRafael2223 = new VehiculoBonillaLaraRafael2223("Seat",18000,100);
        operativaVehiculosBonillaLaraRafael2223(miVehiculoBonillaLaraRafael2223, 50); 
        stockActual = miVehiculoBonillaLaraRafael2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosBonillaLaraRafael2223(VehiculoBonillaLaraRafael2223 miVehiculoBonillaLaraRafael2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoBonillaLaraRafael2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoBonillaLaraRafael2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
