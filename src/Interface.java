//
//interface OldUser {
//
//    int getUserName(int userId);
//
//}
//
//interface NewUser extends OldUser {
//
//    public int getSalary(int userId);
//    default public int getTax(int userId){
//        return 0;
//    }
//}
//public class Interface  implements NewUser {
//    @Override
//    public int getUserName(int userId) {
//        return 0;
//    }
//}