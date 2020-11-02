import java.util.LinkedList;

public class MianClass {

    public static void main(String[] args) {
        LinkedList<String> team = new LinkedList<>();
        LinkedList<String> test = new LinkedList<>();

        test.push("a");
        test.push("v");
        test.push("a");
        test.push("J");

        System.out.println(test.toString());

        test.forEach(System.out::print);

        System.out.println(" ");

        System.out.println(test.peek());
        test.forEach(System.out::print);

        System.out.println(" ");


        team.add("member_1");
        team.add("member_2");

        for(String member : team){
            System.out.println(member);
        }

        team.addLast("member_3");
        System.out.println(team.getLast());



        team.clear();

        System.out.println(team);



    }
}
