package com.misaka.state;

public class Client {
    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(1);
        for (int i = 0; i <10 ; i++) {
            raffleActivity.deduce();
            raffleActivity.reffle();

        }

    }
}
