package designpattern.abstractfactory.exam02;

public class AlienHomeFactory extends HomeFactory {
  public Home createHome() {
    Home h = new Home();
    h.image = "monster-home.gif";
    h.defense = 70; 
    h.attack = 100;
    return h;
  }
}
