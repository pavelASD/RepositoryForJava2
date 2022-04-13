package HomeworkThird;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory {

   private List<String> telephoneNumber;
   private Map<String, List<String>> mapDirectory = new HashMap<>();

   public List<String> get(String name) {
      return mapDirectory.get(name);
   }

   public void add(String name, String number){
      if (mapDirectory.containsKey(name)){
         telephoneNumber = mapDirectory.get(name);
         telephoneNumber.add(number);
         mapDirectory.put(name, telephoneNumber);
      }
      else {
         telephoneNumber = new ArrayList<>();
         telephoneNumber.add(number);
         mapDirectory.put(name, telephoneNumber);
      }

   }

}
