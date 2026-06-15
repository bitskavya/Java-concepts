class Animal
{
   public void colour(String clr)
   {
    System.out.println("Its colour is " +clr);
    }
}
class Cat extends Animal
{
   public void shout()
   {
   System.out.println("cat is shouting like meow");
    }
}
class Dog extends Animal
{
   public void bark()
   {
     System.out.println("dog barks like bow bowww");
   }
}
class Hierarchical
{
   public static void main(String args[])
   {
	Cat c=new Cat();
	System.out.println("-----CAT-----");
	c.colour("ash");
	c.shout();
	Dog d=new Dog();
        System.out.println("-----DOG-----");
	d.colour("cream");
	d.bark();
   }
}