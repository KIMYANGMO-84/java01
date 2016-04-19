package designpattern.abstractfactory.exam02;

public class MonsterHomeFactory extends HomeFactory  {
  public Home createHome() {
    Home h = new Home();
    h.image = "monster-home.gif";
    h.defense = 50; 
    h.attack = 90;
    return h;
  }
}
