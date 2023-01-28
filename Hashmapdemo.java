import java.util.*;
public class Hashmapdemo {
    public static void main(String[] args) {
        courseDetails d = new courseDetails();
        d.course();
    }
}
 class courseDetails{
    public void course(){
        HashMap<String, Integer> course = new HashMap<>();
        course.put("Java Core" , 4000);
        course.put("J2EE", 8000);
        course.put("Python", 4000);
        course.put("Full Stack Developer" , 12000);
        System.out.println(course);
        System.out.println(course.size());
        course.remove("J2EE");
        for (Map.Entry<String, Integer> i: course.entrySet()){
            System.out.println(i.getKey()+ " " + i.getValue());
        }
        System.out.println("--------------------------------------------------------");
        Iterator<Integer> st = course.values().iterator();
        while (st.hasNext()){
            int n = st.next();
            System.out.println(n);
        }
    }
}
