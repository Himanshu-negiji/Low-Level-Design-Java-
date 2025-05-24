package CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
   List<Store> storeList;
   List<User> userList;

    public VehicleRentalSystem(List<Store> storeList, List<User> userList) {
         this.storeList = storeList;
         this.userList = userList;
    }

   public Store get_store(Location location) {
        return storeList.getFirst();
    }

    public User get_user(int userID) {
        for (User user : userList) {
            if (user.userID == userID) {
                return user;
            }
        }
        return null;
   }
}
