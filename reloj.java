
/**
 * Write a description of class reloj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reloj
{
//entradas//
int tiempo;
//salidas//    
int horas;
int minutos;
int segundos;
int residuo;
void algoritmo()
{ horas=tiempo/3600;
  residuo=tiempo%3600;
  minutos=residuo/60;
  segundos=residuo%60;
  
}
}