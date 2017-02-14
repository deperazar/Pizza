package ejerciciopoo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class POO {
   private  Turtle joe;
   
   public POO(){
     this.joe =  new Turtle(); 
   }
   
   public void dibujar(){
       
      joe.setPos(-150, -100);
      
      joe.speed(500);
      
      joe.forward(80);
      joe.right(90);
      joe.forward(120);
      joe.right(90);
      joe.forward(80);
      joe.right(90);
      joe.forward(120);
      joe.left(90);
      joe.forward(25);
      joe.left(90);
      joe.forward(35);
      joe.left(90);
      joe.forward(25);
      joe.right(90);
      joe.forward(50);
      joe.right(90);
      joe.forward(25);
      joe.left(90);
      joe.forward(35);
      joe.left(90);
      joe.forward(95);
      joe.right(90);
      joe.forward(60);
      joe.right(90);
      joe.forward(35);
      joe.right(90);
      joe.forward(60);
      joe.right(90);
      joe.forward(35);
      joe.right(90);
      joe.forward(15);
      joe.left(90);
      joe.forward(15);
      joe.right(90);
      joe.forward(10);
      joe.right(90);
      joe.forward(15);
      joe.penUp();
      joe.forward(10);
      joe.left(90);
      joe.forward(15);
      joe.penDown();
      joe.forward(10);
      joe.right(90);
      joe.forward(5);
      joe.right(90);
      joe.forward(10);
      joe.right(90);
      joe.forward(5);
      joe.penUp();
      joe.left(90);
      joe.forward(80);
      joe.penDown();
      joe.forward(40);
      joe.left(90);
      joe.forward(20);
      joe.left(90);
      joe.forward(40);
      joe.right(90);
      joe.forward(20);
      joe.right(90);
      joe.forward(40);
      joe.penUp();
      joe.right(180);
      joe.forward(180);
      joe.right(90);
      joe.forward(45);
      joe.left(90);
      joe.forward(10);
      joe.penDown(); //Rectángulo exterior
      joe.forward(100);
      joe.left(90);
      joe.forward(70);
      joe.left(90);
      joe.forward(100);
      joe.left(90);
      joe.forward(70);
      joe.penUp();
      joe.left(90);
      joe.forward(10);
      joe.left(90);
      joe.forward(10);
      joe.penDown();
      joe.forward(50);
      joe.right(90);
      joe.forward(80);;
      joe.right(90);
      joe.forward(50);
      joe.right(90);
      joe.forward(80);
      joe.penUp();//Triángulo pequeño
      joe.forward(20);
      joe.penDown();
      joe.forward(20);
      joe.right(120);
      joe.forward(20);
      joe.right(120);
      joe.forward(20);
      joe.left(150);
      joe.penUp();
      joe.forward(30);
      joe.left(90);
      joe.penDown();//Triángulo pequeño 2
      joe.forward(20);
      joe.right(120);
      joe.forward(20);
      joe.right(120);
      joe.forward(20);
      
      joe.left(150);//Triángulo grande
      joe.penUp();
      joe.forward(40);
      joe.right(90);
      joe.forward(25);
      joe.penDown();
      joe.forward(35);
      joe.left(120);
      joe.forward(35);
      joe.left(120);
      joe.forward(35);
      joe.right(150);
      
      joe.penUp();
      joe.forward(130);
      joe.right(90);
      joe.forward(20);
      
      joe.penDown(); //Triangulo y cuadro
      joe.forward(50);
      joe.right(90);
      joe.forward(35);
      joe.right(90);
      joe.forward(50);
      joe.right(90);
      joe.forward(35);
      joe.right(180);
      joe.forward(35);
      joe.left(90);
      joe.forward(10);
      joe.right(60);
      joe.forward(30);
      joe.left(120);
      joe.forward(30);
      joe.right(180);
      joe.forward(30);
      joe.left(30);
      joe.penUp();
      joe.forward(5);
      joe.penDown();
      joe.forward(25);
      joe.penUp();
      joe.forward(5);
      joe.penDown();
      joe.forward(25);
      joe.penUp();
      joe.forward(5);
      joe.forward(45);
    } 
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       POO e = new POO();
       e.dibujar();
    }
    
}
