import java.util.ArrayList;
import java.util.List;

public class listaGiocatori {
    private List<giocatore> players;

    public listaGiocatori() {
            players = new ArrayList<>();
        }

        public void addPlayer(giocatore player) {
            players.add(player);
        }

        public void removePlayer(int playerId) {
            players.removeIf(player -> player.getId() == playerId);
        }

        public giocatore getPlayer(int playerId) {
            for (giocatore player : players) {
                if (player.getId() == playerId) {
                    return player;
                }
            }
            return null;
        }

        public List<giocatore> getPlayers() {
            return new ArrayList<>(players);
        }

        public void printPlayers() {
            for (giocatore player : players) {
                System.out.println(player);
            }
        }

        public static void main(String[] args) {
            listaGiocatori game = new listaGiocatori();
            game.addPlayer(new giocatore("Alice", 1000, 1));
            game.addPlayer(new giocatore("Bob", 1500, 2));
            game.addPlayer(new giocatore("Charlie", 2000, 3));

            game.printPlayers();

            giocatore player = game.getPlayer(2);
            if (player != null) {
                System.out.println("Found player: " + player);
            }

            game.removePlayer(2);
            game.printPlayers();
        }
    }


