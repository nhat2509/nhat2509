import java.util.HashMap;
public class App86 {
    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("CSLT", " cơ sở lập trình");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "Java");

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("Các entry có trong setHashMap: ");
        System.ou.println(setHashMap);
        
    }
}
