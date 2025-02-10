/* 
*
* Author : Mkrm06
* Email : mohamedmukarram3@gmail.com
* Date : 10/02/2025
*
* Description : Creating Animal Class, Object and Method 
*               Calling the object with method and get the result.
*/




class Animal{
    String Name;
    String Type;
    String Sound;

    public Animal (String Name,String Type,String Sound){
        this.Name = Name;
        this.Type = Type;
        this.Sound = Sound;
    }

    void makingSound(){
        System.out.println("Animal Name:" +Name);
        System.out.println("Type:" +Type);
        System.out.println("Sound it Makes:" +Sound);
    }
}
public class Zoo {
    public static void main(String[] args) {

        Animal Lion = new Animal("Lion","Mammal","roar");
        Animal Parrot = new Animal("Parrot","Bird","Khee Khee");
        Animal Snake = new Animal("Snake","Reptile","hiss");

        Lion.makingSound();
        System.out.println("");
        Parrot.makingSound();
        System.out.println("");
        Snake.makingSound();

    }
}
