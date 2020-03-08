/**
 * Use los comentarios para explicar el objetivo de este programa MainTienda .
 *
 * @author (Sus Nombres y Apellidos y Su email)
 * @version (un numero de version o fecha, por ejemplo 0.01)
 */
class MainProducto
{
    /**Metodo principal (main) ejecutable*/
    public static void main(String [] args)
    {
        //Crear objeto del modelo "M" o negocio
        reloj reloj = new reloj();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        reloj.tiempo= c.leerEntero("Tiempos en Segundos");
        
        //invocar el algoritmo o los algoritmos, usando el Modelo
        reloj.algoritmo();

        //mostrar / imprimir los datos de salida
        c.imprimir(reloj.horas + ":" + reloj.minutos + ":" + reloj.segundos + ":"); 
        
    } 
    
}//fin class MainTienda
