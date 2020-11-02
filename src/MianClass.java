import java.util.LinkedList;

public class MianClass {

    public static void main(String[] args) {
        LinkedList<String> team = new LinkedList<>();

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
