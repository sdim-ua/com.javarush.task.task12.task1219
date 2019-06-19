

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }
    
     public interface CanDrive {
        public void  drive();
    }


    public class Human implements CanRun, CanSwim {
        
        @Override
         public void run() {}
        
        @Override
        public void swim() {}
    }

    public class Duck implements CanRun, CanSwim, CanFly {
        @Override
         public void run() {}
        
        @Override
        public void swim() {}
        
        @Override
        public void fly() {}
    }

    public class Penguin implements CanRun, CanSwim {
        @Override
         public void run() {}
        
        @Override
        public void swim() {}
    }

    public class Airplane implements CanFly, CanDrive,  CanRun {
        @Override
        public void fly() {}
        
        @Override
         public void drive(){}
         
         @Override
         public void run() {}
         
         
    }
}
