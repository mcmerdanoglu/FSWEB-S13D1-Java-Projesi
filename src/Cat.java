public class Cat {

public static boolean isCatPlaying (boolean isSummer, int temp) {
    if(!isSummer && (25<=temp && temp<=35)) {return true;}
    else if (isSummer && (25<=temp && temp<=45)) {return  true;}
    else {return false;}
    }
}

//commit tryout