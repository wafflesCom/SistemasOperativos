/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.operativos.vista;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erickon
 */
public class SleepT implements Runnable {

  int seconds;
  Vista vista;

  public SleepT(int seconds, Vista vista) {
    this.seconds = seconds;
    this.vista = vista;
  }

  @Override
  public void run() {
    System.out.println("Borra");
    try {
      Thread.sleep((seconds-95)*1000);
      vista.borrar();
    } catch (InterruptedException ex) {
    }

    System.out.println("BorraFin");
  }

}
