public class Lab1Stage2 {
    public static void main(String[] args){
        
    Animal kurre = new Cat("Kurre");
    Animal vilma = new Dog("Vilma");
    
    kurre.age = 6;
    vilma.age = 3;
    
    kurre.introduceYourself();
    vilma.introduceYourself();
    }


    private static class Cat extends Animal {

        public Cat(String kurre) {
            name = kurre;
        }
    }

    private static class Dog extends Animal {

        public Dog(String vilma) {
            name = vilma;
        }
    }
} 
