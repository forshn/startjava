public class GuessNumber {
        public static int compNum =  (int) (Math.floor(Math.random()) * 101);
        private int player1Num;
        private int player2Num;
        String result;

        public void setPlayer1Num (int x) {
            player1Num = x;
        }

        public void setPlayer2Num (int y) {
            player2Num = y;
        }

        public int getPlayer1Num() {
            return player1Num;
        }

        public int getPlayer2Num() {
            return player2Num;
        }

        public String finalResultPlayer1(){
            if (player1Num < compNum){
                System.out.println("Введенное вами число меньше того, что загадал комьютер");
                    return result;
            } else if (player1Num > compNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                    return result;
            } else System.out.println("Вы угадали!");
                    return result;
        }

        public String finalResultPlayer2() {
            if (player2Num < compNum){
                System.out.println("Введенное вами число меньше того, что загадал комьютер");
                    return result;
            } else if (player2Num > compNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                    return result;
            } else System.out.println("Вы угадали!");
                    return result;
        }
}





