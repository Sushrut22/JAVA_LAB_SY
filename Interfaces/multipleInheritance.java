public class multipleInheritance {
    public static void main(String[] args) {
        programmingLanguage java = new javalang();
        java.format(
                "public class HelloWorld { public static void main(String[] args) { System.out.println(\"Hello, World!\"); } }");
        java.compile(
                "public class HelloWorld { public static void main(String[] args) { System.out.println(\"Hello, World!\"); } }");
        java.execute();
        System.out.println(java.debug());

        programmingLanguage python = new pythonlang();
        python.format("print(\"Hello, World!\"");
        python.compile("print(\"Hello, World!\")");
        python.execute();
        System.out.println(python.debug());
    }
}
