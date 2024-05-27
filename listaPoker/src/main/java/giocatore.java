public class giocatore {

        private String name;
        private int chips;
        private int id;

        public giocatore(String name, int chips, int id) {
            this.name = name;
            this.chips = chips;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getChips() {
            return chips;
        }

        public void setChips(int chips) {
            this.chips = chips;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "giocatore{" +
                    "name='" + name + '\'' +
                    ", chips=" + chips +
                    ", id=" + id +
                    '}';
        }
    }

