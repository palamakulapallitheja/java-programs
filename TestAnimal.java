class Animal{
public void move(){System.out.println("call from Animals class");}
}
class Wild extends Animal{
public void move(){System.out.println("call from Wild class");}
}
class Pet extends Animal{
public void move(){System.out.println("call from Pet class");}
}
class TestAnimal{
public static void main(String args[]){
Animal a=new Animal();
Animal w=new Wild();
Animal p=new Pet();
a.move();
w.move();
p.move();
}
}