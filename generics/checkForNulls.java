import java.util.List;
import java.util.ArrayList;

class checkForNulls {
    public static <T> List<T> withoutNulls(List<T> list){
        List<T> returnList = new ArrayList<T>();

        for(int i = 0; i < list.size(); i ++){
            if(list.get(i) != null){
                returnList.add(list.get(i)); 
            }
        }
        return returnList;
    }

    public static void main(String args[]){
        List<String> stringList = new ArrayList<String>(); 
        stringList.add("Element 1");
        stringList.add(null);
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add(null);

        List<String> newList = withoutNulls(stringList);

        System.out.println(newList);
    }
}