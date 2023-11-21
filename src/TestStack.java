//import java.util.Stack;

public class TestStack {//CODE BY HUMPHREY MYLES C. LOZANO
    public static void main(String[] args) {
//        Stack<Student> st = new Stack<>();
//    // Pushing Student objects onto the Stack
//        st.push(new Student("1001", "Kelly Bangon", "Male", 20, 1.8));
//        st.push(new Student ("1002", "Bolly Ngon", "Male", 21, 2.6));
//        st.push(new Student ("1003", "Lisa Puton", "Female", 19, 1.5));
//
//        Student student = new Student();
//        student.setStudent("1004","Le Tsu Nin","Male",15,2.0);
//        st.push(student);
//
//          System.out.println("CODE BY HUMPHREY MYLES C. LOZANO");
//          System.out.println("Size\t: "+st.size());
//
//    while (!st.isEmpty()){
//        student = st.pop();
//        System.out.println(student.getStudent());
//    }
//        System.out.println("Size\t: "+st.size());
        Stack st=new Stack(3);
        System.out.println("CODE BY HUMPHREY MYLES C. LOZANO");
        System.out.println("Empty\t\t: "+st.isEmpty());
        System.out.println("Full\t\t: "+st.isFull());
        System.out.println("Capacity\t\t: "+st.getCapacity());
        System.out.println("Elements\t\t: "+st.elements());
        System.out.println("Display\t\t: "+st.display());

        st.push("10");
        st.push("abc");
        st.push("kelsey");

        System.out.println("Empty\t\t: "+st.isEmpty());
        System.out.println("Full\t\t: "+st.isFull());
        System.out.println("Capacity\t\t: "+st.getCapacity());
        System.out.println("Elements\t\t: "+st.elements());
        System.out.println("Display\t\t: "+st.display());
        st.push("Mart");
    } //end of main
} //end of class