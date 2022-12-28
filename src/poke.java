public class poke {
    public static void main(String[] args) {
        int[] poke = new int[52];
        for (int j = 0; j < 52; j++) {         //全家買的全新撲克牌
            poke[j] = j + 1;

//            System.out.println("---");
//            System.out.println(poke[j]);
        }
        for (int i = 0; i < 51; i++) {                   //洗牌囉
            int rand = (int) (Math.random() * 52);
            poke[i] = poke[i] + poke[rand];
            poke[rand] = poke[i] - poke[rand];
            poke[i] = poke[i] - poke[rand];

        }
//        for (int v : poke) {          //  莊家偷看排的順序 測試用
//            System.out.println(v);

    //}
        int player1[] = new int[13];
        int player2[] = new int[13];
        int player3[] = new int[13];
        int player4[] = new int[13];

        for (int b = 0; b < 52; b++) {
            if (b < 13) {
                player1[b] = poke[b];

            } else if (b < 26) {
                player2[b - 13] = poke[b];
            } else if (b < 39) {
                player3[b - 26] = poke[b];
            } else {
                player4[b - 39] = poke[b];
            }
        }
        for (int v : player1) {
            System.out.print(v+ ",");
        }
        System.out.println();
        for (int v : player2) {
            System.out.print(v+ ",");
        }
        System.out.println();
        for (int v : player3) {
            System.out.print(v+ ",");
        }
        System.out.println();
        for (int v : player4) {
            System.out.print(v+ ",");
        }

    }

//        for(int i = 0;i<poke.length;i++) {
//            int rand = (int) (Math.random() * 52);
//            poke[i] = rand;
    //         System.out.println(poke[j]);


}
