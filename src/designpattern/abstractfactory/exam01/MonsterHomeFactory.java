package designpattern.abstractfactory.exam01;

public class MonsterHomeFactory {
  public Home createHome() {
    Home h = new Home();
    h.image = "monster-home.gif";
    h.defense = 50; 
    h.attack = 90;
    return h;
  }
}
