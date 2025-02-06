import java.util.*;
abstract class Animal{
abstract void Sound();

}
class Lion extends Animal{
public void Sound(){
System.out.println("the lion is roar");
}
}
class Tiger extends Animal{
public void Sound()
{
System.out.println("the tiger is moaning");
}
}

public class Forest1{
public static void main(String[] args){
Animal L1 =new Lion();
L1.Sound();
Animal T1 =new Tiger();
T1.Sound();

}
}