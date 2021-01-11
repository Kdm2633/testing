class Main{
 private String name;
 private int age;
 private boolean isAdult;

 public Main(String name, int age)
        {
            this.name = name;
            isAdult = age >= 18;
        }
        //I did it!

        public String toString()
        {
            return "Name is :" + name + ", Age is :" + ", Is Adult:" + isAdult;
        }

        public static void main (String [] args){
     Main m1 = new Main("Jack", "18");
     System.out.println(m1.toString());
        }
}
