package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.HashMap;
import java.util.Map;

public class PlayerManagement {

    private final Map<Long, Player> existingPlayers = new HashMap<>();
    private long newID = SlotMachine.STARTING_ID;


    private long generateID() {
        return newID++;
    }

    public void registerPlayer(String fullName, String nickName, String password) {
        long id = generateID();
        Player player = new Player(id, fullName, nickName, password, SlotMachine.PLAYER_STARTING_BALANCE);
        existingPlayers.put(id, player);
    }


    public boolean isPasswordHasInt(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPasswordHasUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPasswordLowerCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPasswordCorrect(String password) {
        return isPasswordHasInt(password) && isPasswordHasUpperCase(password) && isPasswordLowerCase(password);
    }

    public boolean isNickNameExist(String nickname) {
        for (Player player : existingPlayers.values()) {
            if (player.getNickName().equalsIgnoreCase(nickname)) {
                return true;
            }
        }
        return false;
    }

    public Player findPlayerByNickname(String nickname){
        for (Player player : existingPlayers.values()) {
            if (player.getNickName().equalsIgnoreCase(nickname)) {
                return player;
            }
        }
        return null;
    }

}
