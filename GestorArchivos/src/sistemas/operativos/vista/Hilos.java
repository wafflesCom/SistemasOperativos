package sistemas.operativos.vista;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilos extends Thread implements Runnable{

  public Vista vista;
  int proceso;
  int procesoInt;
  
  
  public Hilos(int procesoInt, Vista vista) {
    this.vista = vista;
    this.procesoInt = procesoInt;
  }


  public Object[] genera(int i, int peso, int id) {
    proceso = i - 95;
    Object datos[] = {id, peso, proceso};
    return datos;
  }

  public void proceso(int i) {
    int tmp = 0;
    int peso = 0;
    int id = 0;
    if (i == 96) {
      peso = (int) (Math.random() * 100) + 1;
      id = (int) (Math.random() * 100000) + 100;
    }
    if (i == 97) {
      peso = (int) (Math.random() * 201) + 100;
      id = (int) (Math.random() * 200000) + 2000;
    }
    if (i == 98) {
      peso = (int) (Math.random() * 301) + 200;
      id = (int) (Math.random() * 300000) + 200;
    }
    if (i == 99) {
      peso = (int) (Math.random() * 401) + 300;
      id = (int) (Math.random() * 400000) + 400;
    }
    if (i == 100) {
      peso = (int) (Math.random() * 501) + 400;
      id = (int) (Math.random() * 500000) + 500;
    }
    if (i == 101) {
      peso = (int) (Math.random() * 601) + 500;
      id = (int) (Math.random() * 600000) + 600;
      
    }
    vista.modelo.addRow(genera(i, peso, id));
   
  }

  @Override
  public void run() {
    System.out.println("genera");
    proceso(procesoInt);
    System.out.println("generaFin");
  }

}
