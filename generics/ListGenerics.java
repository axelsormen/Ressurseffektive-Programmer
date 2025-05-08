import java.util.List;
import java.util.ArrayList;

public class ListGenerics{
    public static <T> T singleOrNull(List<T> list){
        if(list.size() == 0){
            return null;
        }

        else if(list.size() == 1){
            return list.get(0);
        }

        else{
            throw new IllegalArgumentException();
        }
    }

    public static void main(String args[]){
        List<String> stringList= new ArrayList<String>();
        stringList.add("hei");
        String text = singleOrNull(stringList);
        System.out.println(text);

        List<Integer> intList= new ArrayList<Integer>();
        intList.add(7474);
        int number = singleOrNull(intList);
        System.out.println(number);

        List<Boolean> boolList= new ArrayList<Boolean>();
        boolList.add(false);
        Boolean boolie = singleOrNull(boolList);
        System.out.println(boolie);
    }
}