import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfStudentsUnableToEat {

    public static int numberOfStudentsUnableToEat(int[] students, int[] sand){

        Queue<Integer> st = new LinkedList<>();
        Queue<Integer> sd = new LinkedList<>();

        for (int student : students) {
            st.add(student);
        }

        for(int sd1 : sand){
            sd.add(sd1);
        }

        int count = 0;
        while(!sd.isEmpty()) {

            if (count > students.length) {
                break;
            }

            if (sd.peek() == st.peek()) {
                sd.remove();
                st.remove();
                //count = 0;
            } else {
                st.add(st.remove());
                count++;
            }
        }
        return sd.size();

        }

        public static void main(String[] args){
        int[] students = {1,1,1,0,0,1,};
        int[] sand = {1,0,0,0,1,1};

            System.out.println(numberOfStudentsUnableToEat(students,sand));


        }

    }

