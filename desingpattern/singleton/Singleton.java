package desingpattern.singleton;

// public class Singleton {
//     private static Singleton instance;

//     private Singleton() {}

//     public static synchronized Singleton getSingleton() {
//         if (instance == null){
//             instance = new Singleton();
//         }
//         return instance;
//     }
// }

// public class Singleton {
//     private static Singleton instance;

//     private Singleton() {}

//     public static Singleton getSingleton() {
//         if (instance == null) {
//             synchronized(Singleton.class) {
//                 if (instance == null){
//                     instance = new Singleton();
//                 }
//             }   
//         }
//         return instance;
//     }
// }

// public class Singleton {
//     private static Singleton instance = new Singleton();

//     private Singleton() {}

//     public static Singleton getSingleton() {
//         return instance;
//     }
// }

public class Singleton {
    private Singleton() {
    }

    private static class SingletonHelper {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getSingleton() {
        return SingletonHelper.instance;
    }
}