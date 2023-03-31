package academy.devdojo.maratonajava.GclassesInternas;

public class OuterClassesTest03 {
    private String name= "Mislaine";
    static class Nested{
        private String lastName= "Almeida";

        void print(){
            System.out.println(new OuterClassesTest03().name+ " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
