import java.util.*;
public class Arraylist {
    void func()
    {
        List ls = new ArrayList();
        ls.add("pepsi");
        ls.add("fruti");
        ls.add("perk");
        System.out.println(ls);

        System.out.println(ls.get(1));
        //ls.add(2,"dairy milk");

        //ls.remove(1);
        //ls.clear();
        System.out.println(ls);
        System.out.println("item:"+ls.size());
    }

    public static void main(String[] args) {
        Arraylist obj = new Arraylist();
        obj.func();
    }
}
