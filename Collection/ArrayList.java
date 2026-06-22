public class ArrayList{
    public static void main(String[] args) {
        String[] Student = new String[30];

        Student[0] = "John"; 

        ///
        /// student[1] = "Mary"; .... student[28] = "Peter";
        ///
        Student[29] = "Thanos";
        Student[30] = "Tony";  // This will cause an error because the array only has 30 elements (0-29)
        

    }
}