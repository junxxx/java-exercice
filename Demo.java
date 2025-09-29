import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Demo implements Lab{
    private String name;
    private String[] jobs;

    Demo(String name) {
        this.name = name;
    }

    private void initData() {
        // an string array 
        this.jobs =  new String[]{"init", "pre-check", "run", "done"};
    }

    protected void doStream() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("command", "args", "params"));
        // loop
        for (String e : input) {
            System.out.printf("The length of '%s' is %d\n", e, e.length());
        }
        // lambda 
        System.out.println("Loop arraylist with lambda expression");
        input.forEach(n -> System.out.println(n));
        // stream
        input.stream()
            .filter(e -> e.startsWith("a"))
            .map(String::toUpperCase)
            .forEach(i -> System.out.println(i));
    }

    protected void doHashMap() {
        HashMap<String, Integer> statis = new HashMap<>();

    }


    public void doTask() {
        System.out.println("Do task in " + Demo.class.getName());
        this.initData();
        for (String job : jobs) {
            System.out.println("do " + job);
        }

        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("init");
        tasks.add("check");
        tasks.add("runing");
        //lambda expression
        tasks.forEach(task -> System.out.println(task));

        // hashSet is a Set collection just like Set in python
        // hashMap is a Map, which is a key value dictionary
        this.doStream();
    }

    
}
