package vladislavs.uhovs.lesson7.selfcheck.task5SlotMachine;

import java.util.Scanner;

public class GameMenu {

    private final SlotMachine slotMachine;
    private final Scanner input;
    private Player player;
    private final PlayerManagement playerManagement;

    public GameMenu(SlotMachine slotMachine, Scanner input, Player player, PlayerManagement playerManagement) {
        this.slotMachine = slotMachine;
        this.input = input;
        this.player = player;
        this.playerManagement = playerManagement;
    }

    public void validateCorrectInput() {
        while (!input.hasNextInt()) {
            input.next();
            System.out.println("Wrong input! Only whole numbers are allowed. Try again.");
        }
    }

    public long depositAmount() {
        long value;
        System.out.println("Deposit amount");
        do {
            validateCorrectInput();
            value = input.nextInt();
            if (value < 0) {
                System.out.println("You can't deposit a negative amount");
            } else if (value == 0) {
                System.out.println("You can't deposit zero");
            }
        } while (value <= 0);
        return value;
    }

    public void depositMenu() {
        System.out.println("Hello: " + player.getFullName());
        boolean continueGame = true;
        String depositChoice;
        do {
            System.out.println("You need a minimum balance of 10 USD to play, press D if you want to deposit more");
            System.out.println("After deposit press Start - S key to play slot machine");
            System.out.println("Your balance: " + slotMachine.centsToUSD(player.getPlayerBalance()) + " USD");
            depositChoice = input.next();
            if (depositChoice.equalsIgnoreCase("D")) {
                player.deposit(depositAmount() * SlotMachine.CENTS_IN_USD);
            } else if (player.getPlayerBalance() >= SlotMachine.MINIMUM_BALANCE_CENTS && depositChoice.equalsIgnoreCase("S")) {
                continueGame = false;
            }
        } while (continueGame);
    }

    public void slotDisplay() {
        String[][] result = slotMachine.getResult();
        for (int r = 0; r < SlotMachine.SLOT_ROWS; r++) {
            for (int c = 0; c < SlotMachine.SLOT_COLUMNS; c++) {
                System.out.print(result[r][c]);
                if (c < SlotMachine.SLOT_COLUMNS - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void gameMenuChooseOne() {
        player.spinCostDeduct(slotMachine.getSpinCost());
        long balanceBeforeWin = player.getPlayerBalance();
        slotMachine.spin(player);
        slotDisplay();
        System.out.println("Won: " + (slotMachine.centsToUSD(player.getPlayerBalance() - balanceBeforeWin)) + " USD");
        System.out.println("Balance: " + slotMachine.centsToUSD(player.getPlayerBalance()) + " USD");
    }

    public void gameMenuChooseTwo() {
        System.out.println("Input spin cost");
        int multiply;
        do {
            validateCorrectInput();
            multiply = input.nextInt();
            if (multiply < 0) {
                System.out.println("You can't input a negative number");
            } else if (multiply == 0) {
                System.out.println("You can't input zero");
            } else if (multiply > player.getPlayerBalance() / SlotMachine.CENTS_IN_USD) {
                System.out.println("Spin cost cannot exceed your balance.");
                System.out.println("Your balance: " + slotMachine.centsToUSD(player.getPlayerBalance()) + " USD");
            }
        } while (multiply <= 0 || multiply > player.getPlayerBalance() / SlotMachine.CENTS_IN_USD);
        slotMachine.changeSpinCost(SlotMachine.STARTING_SPIN_COST, multiply);
    }

    public void gameStart() {
        boolean continueGame = true;
        do {
            if (player.getPlayerBalance() < SlotMachine.MINIMUM_BALANCE_CENTS) {
                depositMenu();
            } else {
                System.out.println(player.getFullName() + "You can choose: ");
                System.out.println("Press 1 to SPIN, 2 to CHANGE spin cost, 3 to CASHOUT, 4 to DEPOSIT, 5 to Change PLAYER");
                System.out.println("Spin Cost: " + slotMachine.centsToUSD(slotMachine.getSpinCost()) + " USD");
                validateCorrectInput();
                int menuChoice = input.nextInt();
                if (menuChoice == 1 && player.getPlayerBalance() >= slotMachine.getSpinCost()) {
                    gameMenuChooseOne();
                } else if (menuChoice == 2) {
                    gameMenuChooseTwo();
                } else if (menuChoice == 3) {
                    System.out.println("Thank you for playing");
                    System.out.println("You won: " + slotMachine.centsToUSD(player.getPlayerBalance()) + " USD");
                    continueGame = false;
                } else if (menuChoice == 4) {
                    player.deposit(depositAmount() * SlotMachine.CENTS_IN_USD);
                    System.out.println("Your balance: " + slotMachine.centsToUSD(player.getPlayerBalance()) + " USD");
                } else if (menuChoice == 5) {
                    loginRegistrationMenu();
                } else if (slotMachine.getSpinCost() > player.getPlayerBalance()) {
                    System.out.println("Not enough funds. Your balance: " + slotMachine.centsToUSD(player.getPlayerBalance()) + " USD");
                } else {
                    System.out.println("Wrong input try again");
                }
            }
        } while (continueGame);
    }

    public String playerFullName() {
        boolean valid;
        String fullName;
        System.out.println("Enter Your full name ");
        input.nextLine();
        do {
            fullName = input.nextLine();
            String[] wordsCount = fullName.split("\\s+");
            if (wordsCount.length == 2 && wordsCount[0].length() >= 3 && wordsCount[1].length() >= 3) {
                valid = true;
            } else {
                System.out.println("Enter real full name");
                valid = false;
            }
        } while (!valid);
        return fullName;
    }

    public String playerNickName() {
        boolean valid;
        String nickname;
        System.out.println("Enter Your nickname ");
        do {
            nickname = input.next();
            if (nickname.length() >= 3 && !playerManagement.isNickNameExist(nickname)) {
                valid = true;
            } else if (nickname.length() < 3) {
                System.out.println("Nickname should be at least 3 symbols long");
                valid = false;
            } else {
                System.out.println("This nickname is already taken");
                valid = false;
            }
        } while (!valid);
        return nickname;
    }

    public String playerPassword() {
        boolean valid;
        String password;

        System.out.println("Enter Your new password ");
        do {
            password = input.next();
            if (password.length() >= 8 && playerManagement.isPasswordCorrect(password)) {
                valid = true;
            } else {
                System.out.println("Password should be minimum 8 length, contain at least one number, lower case and upper case char.");
                valid = false;
            }
        } while (!valid);
        return password;
    }

    public boolean login() {
        boolean wrongInput;
        String nickname;
        do {
            System.out.println("To login enter your nickname");
            nickname = input.next();
            if (playerManagement.isNickNameExist(nickname)) {
                loginPassword(nickname);
                player = playerManagement.findPlayerByNickname(nickname);
                return true;
            } else {
                do {
                    System.out.println("Wrong nickname, press 1 to try again or press 2 to return");
                    validateCorrectInput();
                    int menuChoice = input.nextInt();
                    if (menuChoice == 1) {
                        wrongInput = true;
                    } else if (menuChoice == 2) {
                        return false;
                    } else {
                        System.out.println("Wrong input");
                        wrongInput = false;
                    }
                } while (!wrongInput);
            }
        } while (true);

    }

    public void loginPassword(String nickname) {
        boolean valid;
        String password;
        Player player = playerManagement.findPlayerByNickname(nickname);
        System.out.println("To login enter your password");
        do {
            password = input.next();
            if (password.equals(player.getPassword())) {
                valid = true;
            } else {
                System.out.println("Wrong password");
                valid = false;
            }
        } while (!valid);
    }

    public void createNewPlayer() {
        String fullName = playerFullName();
        String nickname = playerNickName();
        String password = playerPassword();
        playerManagement.registerPlayer(fullName, nickname, password);
        System.out.println("Thank you for registration! Your player ID: " + player.getId());
    }


    public void loginRegistrationMenu() {
        boolean choice;
        do {
            System.out.println("To LOGIN press 1, to REGISTER press 2");
            validateCorrectInput();
            int menuChoice = input.nextInt();
            if (menuChoice == 1) {
                choice = login();
            } else if (menuChoice == 2) {
                createNewPlayer();
                choice = false;
            } else {
                System.out.println("Wrong menu input");
                choice = false;
            }
        } while (!choice);
    }

    public void play(){
        loginRegistrationMenu();
        gameStart();
    }



}
