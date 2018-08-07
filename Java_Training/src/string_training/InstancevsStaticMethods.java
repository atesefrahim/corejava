package stringexample;

class InstanceMethods{
    // Instance method(s) belong to the
    // Object of the class not to the class i.e. they can be called after creating the Object of the class
    // Every individual Object created from the class has its own copy of the instance method(s) of that class.
    // They can be overridden since they are resolved using dynamic binding at run time

        String name = "";

        public void geek(String name){
            this.name=name;
        }
    }

    class GFG {

        public static void main(String[] args){

            InstanceMethods ob = new InstanceMethods();
            ob.geek("ibrahim ates");
            System.out.println(ob.name);
        }
    }
    class StaticMethods{

     // Static method(s) are associated to the class in which
     // they reside i.e. they can be called even without creating an instance of the class i.e
     // ClassName.methodName(args).
     // They are designed with aim to be shared among all Objects created from the same class.
     // Static methods can not be overridden.s
     // But can be overloaded since they are resolved using static binding by compiler at compile time.


        public static String userName = "";

        public static void usergeek(String name){
            userName = name;
        }
    }

    class GFG2 {
        public static void main(String[] args){

            StaticMethods.usergeek("ibrahim");
            System.out.println(StaticMethods.userName);

            StaticMethods ob = new StaticMethods();
            ob.usergeek("ibrahim ates");
            System.out.println(ob.userName);
        }
    }

