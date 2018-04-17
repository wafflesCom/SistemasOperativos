package sistemas.operativos.vista;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilos implements Runnable {

  public Vista vista ;//= new Vista();

  public Hilos(Vista vista) {
    this.vista = vista;
  }
  public void borrar() {
    vista.modelo.removeRow(vista.tmp);
  }

  public Object[] genera(int i, int peso, int id) {
    int proceso = i-95;
    Object datos[] = {id, peso, proceso};
    System.out.println("genera");
    Thread thread = new Thread("Proceso: "+proceso);
    thread.start();
    return datos;
  }
  
    

  public void proceso(int i) {
    int tmp = 0;
    if (i == 96) {
      int peso = (int) (Math.random() * 100) + 1;
      int id = (int) (Math.random() * 100000) + 100;
      vista.modelo.addRow(genera(i,peso,id));
    }
    if (i == 97) {
      int peso = (int) (Math.random() * 201) + 100;
      int id = (int) (Math.random() * 200000) + 2000;
      vista.modelo.addRow(genera(i,peso,id));
    }
    if (i == 98) {
      int peso = (int) (Math.random() * 301) + 200;
      int id = (int) (Math.random() * 300000) + 200;
      vista.modelo.addRow(genera(i,peso,id));
    }
    if (i == 99) {
      int peso = (int) (Math.random() * 401) + 300;
      int id = (int) (Math.random() * 400000) + 400;
      vista.modelo.addRow( genera(i,peso,id));
    }
    if (i == 100) {
      int peso = (int) (Math.random() * 501) + 400;
      int id = (int) (Math.random() * 500000) + 500;
      vista.modelo.addRow( genera(i,peso,id));
    }
    if (i == 101) {
      int peso = (int) (Math.random() * 601) + 500;
      int id = (int) (Math.random() * 600000) + 600;
      vista.modelo.addRow( genera(i,peso,id));
    }

  }
  
  @Override
  public void run() {
    System.out.println("hola");
    try {
      Thread.sleep(4000);
      borrar();
    } catch (InterruptedException ex) {
      Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

}
