import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListProgram {
    public static void main(String[] args) {



    List list=new LinkedList<String>();
    list.add("rajat");
    list.add("rani");
    list.add("adbhut");


    Collections.sort(list);
        //System.out.println(list);
        Iterator iter=list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }



}}
