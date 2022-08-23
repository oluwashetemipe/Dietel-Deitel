import java.util.Arrays;


public class TicTac {
    private cons[][] space = new cons[3][3];
    private enum cons{X,O,EMPTY}

    public TicTac() {
        for (int i = 0; i < space.length; i++) {
            for (int j = 0; j < space[i].length; j++){
                space[i][j] = cons.EMPTY;
            }
        }
    }
    public void play(int position, int players){
            switch (position){
                case 1:
                    switch(players){
                        case 1:
                            if (space[0][0] == cons.EMPTY){
                                space[0][0] = cons.X;
                            }
                        case 2:
                            if (space[0][0] == cons.EMPTY){
                                space[0][0] = cons.O;
                            }
                        }
                case 2:
                    switch(players){
                        case 1:
                            if (space[0][1] == cons.EMPTY){
                                space[0][1] = cons.X;
                            }
                        case 2:
                            if (space[0][1] == cons.EMPTY){
                                space[0][1] = cons.O;
                            }
                    }
                case 3:
                    switch(players){
                        case 1:
                            if (space[0][2] == cons.EMPTY){
                                space[0][2] = cons.X;
                            }
                        case 2:
                            if (space[0][2] == cons.EMPTY){
                                space[0][2] = cons.O;
                            }
                    }
                case 4:
                    switch(players){
                        case 1:
                            if (space[1][0] == cons.EMPTY){
                                space[1][0] = cons.X;
                            }
                        case 2:
                            if (space[1][0] == cons.EMPTY){
                                space[1][0] = cons.O;
                            }
                    }
                case 5:
                    switch(players){
                        case 1:
                            if (space[1][1] == cons.EMPTY){
                                space[1][1] = cons.X;
                            }
                        case 2:
                            if (space[1][1] == cons.EMPTY){
                                space[1][1] = cons.O;
                            }
                    }
                case 6:
                    switch(players){
                        case 1:
                            if (space[1][2] == cons.EMPTY){
                                space[1][2] = cons.X;
                            }
                        case 2:
                            if (space[1][2] == cons.EMPTY){
                                space[1][2] = cons.O;
                            }
                    }
                case 7:
                    switch(players){
                        case 1:
                            if (space[2][0] == cons.EMPTY){
                                space[2][0] = cons.X;
                            }
                        case 2:
                            if (space[2][0] == cons.EMPTY){
                                space[2][0] = cons.O;
                            }
                    }
                case 8:
                    switch(players){
                        case 1:
                            if (space[2][1] == cons.EMPTY){
                                space[2][1] = cons.X;
                            }
                        case 2:
                            if (space[2][1] == cons.EMPTY){
                                space[2][1] = cons.O;
                            }
                    }
                case 9:
                    switch(players){
                        case 1:
                            if (space[2][2] == cons.EMPTY){
                                space[2][2] = cons.X;
                            }
                        case 2:
                            if (space[2][2] == cons.EMPTY){
                                space[2][2] = cons.O;
                            }
                    }

            }
    }
    public void displayGame(){
        for (cons[] i : space) {
            System.out.println(Arrays.toString(i));
        }
    }
}
